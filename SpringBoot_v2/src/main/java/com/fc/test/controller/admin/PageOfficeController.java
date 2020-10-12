package com.fc.test.controller.admin;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.*;
import com.deepoove.poi.util.BytePictureUtils;
import com.fc.test.common.conf.V2Config;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.common.enums.CreateEnum;
import com.fc.test.common.enums.CreateKind;
import com.fc.test.constant.ProjectConstant;
import com.fc.test.model.auto.*;
import com.fc.test.model.poiData.SegmentData;
import com.fc.test.service.*;
import com.fc.test.util.DateUtils;
import com.fc.test.util.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

/**
 * 权限Controller
 * @author fuce
 * @date: 2018年9月2日 下午8:08:21
 */
@Api(value = "office")
@Controller
@RequestMapping("/pageoffice")
public class PageOfficeController {
    @Autowired
    private ProCharptService proCharptService;
    @Autowired
    private ProLiterService proLiterService;
    @Autowired
    private ProPaintPartService proPaintPartService;
    @Autowired
    private ProPaintService proPaintService;
    @Autowired
    private ProPoemsetService proPoemsetService;
    @Autowired
    private ProPoetryService proPoetryService;
/*    @ApiOperation(value = "word模板生成", notes = "word模板生成")
    @GetMapping("/word")
    //@RequiresPermissions("system:permission:word")
    public String showWord(HttpServletRequest request, Map<String,Object> map){


  *//*      PageOfficeCtrl poCtrl = new PageOfficeCtrl(request);
        //设置授权程序servlet
        poCtrl.setServerPage("/poserver.zz");
        //添加自定义按钮
        poCtrl.addCustomToolButton("保存", "Save", 1);
        //保存按钮接口地址
        poCtrl.setSaveFilePage("/save");
        //打开文件(打开的文件类型由OpenModeType决定，docAdmin是一个word，并且是管理员权限，如果是xls文件，则使用openModeType.xls开头的,其他的office格式同等)，最后一个参数是作者
        // TODO 这里有个坑，这里打开的文件是本地的，地址如果写成/结构的路径，页面就会找不到文件，会从http://xxxxx/G/id...去找，写成\\就是从本地找
        poCtrl.webOpen("d:\\test.doc", OpenModeType.docAdmin,"张三");
        //pageoffice 是文件的变量，前端页面通过这个变量加载出文件
        map.put("pageoffice", poCtrl.getHtmlCode("PageOfficeCtrl1"));*//*


        //创建PageOffice的WordDocument对象，操作Word文件
        WordDocument doc = new WordDocument();
        //创建PageOfficeCtrl对象打开文件
        //doc.openDataRegion("PO_PRONAME").setValue("美丽人生");
        PageOfficeCtrl poCtrl1 = new PageOfficeCtrl(request);
        poCtrl1.setServerPage("/poserver.zz"); //此行必须
        //添加自定义按钮
        poCtrl1.addCustomToolButton("保存", "Save", 1);
        //保存按钮接口地址
        poCtrl1.setSaveFilePage("/save");
        //获取数据对象
        //poCtrl1.setWriter(doc);
        // 打开文档
        poCtrl1.webOpen("d:\\test.doc", OpenModeType.docReadOnly, "Tom");
//跳转到word.html
        return "word";

    }*/
    @ApiOperation(value = "word模板生成", notes = "word模板生成")
    @GetMapping("/exportLiterature")
    @ResponseBody
    //@RequiresPermissions("system:permission:word")
    public Object exportLiterature(String id) throws Exception {
        ProLiter proLiter = proLiterService.selectByPrimaryKey(id);
        if(proLiter==null){
            return AjaxResult.error("提交数据错误");
        }else if(proLiter.getFinish()!=1){
            return AjaxResult.error("作品还未完成");
        }
        int startIndex = 0;
        int pageSize = 50;
        ProCharpt proCharpt = new ProCharpt();
        proCharpt.setBookId(proLiter.getUid());
        proCharpt.setFinish(1);
        proCharpt.setIsDel(0);

        List<SegmentData> subData = new ArrayList<>();//具体内容
        RowRenderData header = RowRenderData.build(new TextRenderData("00CC33", "作者"), new TextRenderData("00CC33", "作品"));//作者表格

        List<RowRenderData> rowData = new ArrayList<>();//具体表格内容
        List<ProCharpt> proCharpts = new ArrayList<>();
        do {
            if(proCharpt==null){
                proCharpts = new ArrayList<>();
            }
            if(proCharpts.size()>0){
                proCharpts.clear();
            }
            proCharpts = proCharptService.queryAdoptContentByProId(proCharpt, startIndex, pageSize).getList();
            if (proCharpts != null && proCharpts.size() > 0) {
                for (ProCharpt proCharpt1 : proCharpts) {
                    List<ProUserAdopt> proUserAdopts = proCharpt1.getProUserAdopts();
                    if (proUserAdopts != null && proUserAdopts.size() > 0) {
                        for (ProUserAdopt proUserAdopt : proUserAdopts) {
                            RowRenderData row = RowRenderData.build(proUserAdopt.getNickname(), proUserAdopt.getTitle());
                            rowData.add(row);
                            SegmentData s1 = new SegmentData();
                            s1.setTitle(proUserAdopt.getTitle());
                            s1.setContent(proUserAdopt.getLiterText());
                            if (!StringUtils.isEmpty(proUserAdopt.getPicture())) {
                                s1.setPicture(new PictureRenderData(100, 100, ".png", BytePictureUtils.getUrlBufferedImage(proUserAdopt.getPicture())));
                            }
                            subData.add(s1);
                        }
                    }
                }
            }
            startIndex += pageSize;
        }while (proCharpts.size()>=pageSize);
        String templatePath = V2Config.getPro_template_dir()+ ProjectConstant.LITERATURETEMPLATE;
        String segmentPath = V2Config.getPro_template_dir()+ ProjectConstant.LITERATURESEGMENT;
        XWPFTemplate template= XWPFTemplate.compile(templatePath).
                render(new HashMap<String,Object>(){{

                    if(subData.size()>0) {
                        put("segment", new DocxRenderData(new File(segmentPath), subData));
                    }
            /* 文字 */
                    put("title",proLiter.getName());

                    put("name",proLiter.getPublisher());

                    put("label",proLiter.getLabel());

                    put("type", CreateKind.valueOfName(proLiter.getKind()));

                    put("curdate", DateUtils.dateTimeNow("yyyy-MM-dd"));

            /* 图片 */
                    //put("image",new PictureRenderData(100,100,".png", BytePictureUtils.getUrlBufferedImage("https://img-blog.csdnimg.cn/20190627130806508.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM3MTI4MDQ5,size_16,color_FFFFFF,t_70")));

            /* 表格 */
                   if(rowData.size()>0) {
                       put("author_table", new MiniTableRenderData(header, rowData));
                   }
                }});
        //生成报告
        String literatureDocPath = V2Config.getPro_template_dir()+ proLiter.getName()+System.currentTimeMillis()+"docx";

        FileOutputStream out=new FileOutputStream(literatureDocPath);
        template.write(out);
        out.flush();
        out.close();
        template.close();
        return  export(new File(literatureDocPath));
    }

    @ApiOperation(value = "word模板生成", notes = "word模板生成")
    @GetMapping("/exportPaint")
    @ResponseBody
    //@RequiresPermissions("system:permission:word")
    public Object exportPaint(String id) throws Exception {
        ProPaint proPaint = proPaintService.selectByPrimaryKey(id);
        if(proPaint==null){
            return AjaxResult.error("提交数据错误");
        }else if(proPaint.getFinish()!=1){
            return AjaxResult.error("作品还未完成");
        }
        int startIndex = 0;
        int pageSize = 50;
        ProPaintPart proPaintPart = new ProPaintPart();
        proPaintPart.setPaintId(proPaint.getUid());
        proPaintPart.setFinish(1);
        proPaintPart.setIsDel(0);

        List<SegmentData> subData = new ArrayList<>();//具体内容
        RowRenderData header = RowRenderData.build(new TextRenderData("00CC33", "作者"), new TextRenderData("00CC33", "作品"));//作者表格

        List<RowRenderData> rowData = new ArrayList<>();//具体表格内容
        List<ProPaintPart> proPaintParts = new ArrayList<>();
        do {
            if(proPaintPart==null){
                proPaintParts = new ArrayList<>();
            }
            if(proPaintParts.size()>0){
                proPaintParts.clear();
            }
            proPaintParts = proPaintPartService.queryAdoptContentByProId(proPaintPart, startIndex, pageSize).getList();
            if (proPaintParts != null && proPaintParts.size() > 0) {
                for (ProPaintPart proPaintPart1 : proPaintParts) {
                    List<ProUserAdopt> proUserAdopts = proPaintPart1.getProUserAdopts();
                    if (proUserAdopts != null && proUserAdopts.size() > 0) {
                        for (ProUserAdopt proUserAdopt : proUserAdopts) {
                            RowRenderData row = RowRenderData.build(proUserAdopt.getNickname(), proUserAdopt.getTitle());
                            rowData.add(row);
                            SegmentData s1 = new SegmentData();
                            s1.setTitle(proUserAdopt.getTitle());
                            s1.setContent(proUserAdopt.getLiterText());
                            if (!StringUtils.isEmpty(proUserAdopt.getPicture())) {
                                s1.setPicture(new PictureRenderData(100, 100, ".png", BytePictureUtils.getUrlBufferedImage(proUserAdopt.getPicture())));
                            }
                            subData.add(s1);
                        }
                    }
                }
            }
            startIndex += pageSize;
        }while (proPaintParts.size()>=pageSize);
        String templatePath = V2Config.getPro_template_dir()+ ProjectConstant.PAINTTEMPLATE;
        String segmentPath = V2Config.getPro_template_dir()+ ProjectConstant.PAINTSEGMENT;
        XWPFTemplate template= XWPFTemplate.compile(templatePath).
                render(new HashMap<String,Object>(){{

                    if(subData.size()>0) {
                        put("segment", new DocxRenderData(new File(segmentPath), subData));
                    }
            /* 文字 */
                    put("title",proPaint.getSeter()+"-"+proPaint.getName());

                    put("name",proPaint.getPublisher());

                    put("label",proPaint.getPurpose());

                    put("type", CreateEnum.valueOfName(proPaint.getKind()));

                    put("curdate", DateUtils.dateTimeNow("yyyy-MM-dd"));

            /* 图片 */
                    //put("image",new PictureRenderData(100,100,".png", BytePictureUtils.getUrlBufferedImage("https://img-blog.csdnimg.cn/20190627130806508.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM3MTI4MDQ5,size_16,color_FFFFFF,t_70")));

            /* 表格 */
                    if(rowData.size()>0) {
                        put("author_table", new MiniTableRenderData(header, rowData));
                    }
                }});
        //生成报告
        String literatureDocPath = V2Config.getPro_template_dir()+proPaint.getSeter()+"-"+ proPaint.getName()+System.currentTimeMillis()+"docx";

        FileOutputStream out=new FileOutputStream(literatureDocPath);
        template.write(out);
        out.flush();
        out.close();
        template.close();
        return  export(new File(literatureDocPath));
    }

    @ApiOperation(value = "word模板生成", notes = "word模板生成")
    @GetMapping("/exportPoetry")
    @ResponseBody
    //@RequiresPermissions("system:permission:word")
    public Object exportPoetry(String id) throws Exception {
        ProPoetry proPoetry = proPoetryService.selectByPrimaryKey(id);
        if(proPoetry==null){
            return AjaxResult.error("提交数据错误");
        }else if(proPoetry.getFinish()!=1){
            return AjaxResult.error("作品还未完成");
        }
        int startIndex = 0;
        int pageSize = 50;
        ProPoemset proPoemset = new ProPoemset();
        proPoemset.setPoetryId(proPoetry.getUid());
        proPoemset.setFinish(1);
        proPoemset.setIsDel(0);

        List<SegmentData> subData = new ArrayList<>();//具体内容
        RowRenderData header = RowRenderData.build(new TextRenderData("00CC33", "作者"), new TextRenderData("00CC33", "作品"));//作者表格

        List<RowRenderData> rowData = new ArrayList<>();//具体表格内容
        List<ProPoemset> proPoemsets = new ArrayList<>();
        do {
            if(proPoemsets==null){
                proPoemsets = new ArrayList<>();
            }
            if(proPoemsets.size()>0){
                proPoemsets.clear();
            }
            proPoemsets = proPoemsetService.queryAdoptContentByProId(proPoemset, startIndex, pageSize).getList();
            if (proPoemsets != null && proPoemsets.size() > 0) {
                for (ProPoemset proPoemset1 : proPoemsets) {
                    List<ProUserAdopt> proUserAdopts = proPoemset1.getProUserAdopts();
                    if (proUserAdopts != null && proUserAdopts.size() > 0) {
                        for (ProUserAdopt proUserAdopt : proUserAdopts) {
                            RowRenderData row = RowRenderData.build(proUserAdopt.getNickname(), proUserAdopt.getTitle());
                            rowData.add(row);
                            SegmentData s1 = new SegmentData();
                            s1.setTitle(proUserAdopt.getTitle());
                            s1.setContent(proUserAdopt.getLiterText());
                            if (!StringUtils.isEmpty(proUserAdopt.getPicture())) {
                                s1.setPicture(new PictureRenderData(100, 100, ".png", BytePictureUtils.getUrlBufferedImage(proUserAdopt.getPicture())));
                            }
                            subData.add(s1);
                        }
                    }
                }
            }
            startIndex += pageSize;
        }while (proPoemsets.size()>=pageSize);
        String templatePath = V2Config.getPro_template_dir()+ ProjectConstant.POETRYTEMPLATE;
        String segmentPath = V2Config.getPro_template_dir()+ ProjectConstant.POETRYSEGMENT;
        XWPFTemplate template= XWPFTemplate.compile(templatePath).
                render(new HashMap<String,Object>(){{

                    if(subData.size()>0) {
                        put("segment", new DocxRenderData(new File(segmentPath), subData));
                    }
            /* 文字 */
                    put("title",proPoetry.getSeter()+"-"+proPoetry.getName());

                    put("name",proPoetry.getPublisher());

                    put("label",proPoetry.getPurpose());

                    put("type", CreateEnum.valueOfName(proPoetry.getKind()));

                    put("curdate", DateUtils.dateTimeNow("yyyy-MM-dd"));

            /* 图片 */
                    //put("image",new PictureRenderData(100,100,".png", BytePictureUtils.getUrlBufferedImage("https://img-blog.csdnimg.cn/20190627130806508.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM3MTI4MDQ5,size_16,color_FFFFFF,t_70")));

            /* 表格 */
                    if(rowData.size()>0) {
                        put("author_table", new MiniTableRenderData(header, rowData));
                    }
                }});
        //生成报告
        String literatureDocPath = V2Config.getPro_template_dir()+ proPoetry.getSeter()+"-"+proPoetry.getName()+System.currentTimeMillis()+"docx";

        FileOutputStream out=new FileOutputStream(literatureDocPath);
        template.write(out);
        out.flush();
        out.close();
        template.close();
        return  export(new File(literatureDocPath));
    }
  /*  @RequestMapping("/save")

    public void saveFile(HttpServletRequest request, HttpServletResponse response) {

        FileSaver fs = new FileSaver(request, response);

        fs.saveToFile("d:\\" + fs.getFileName());

        fs.close();
    }*/

    public ResponseEntity<FileSystemResource> export(File file) {
        if (file == null) {
            return null;
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", "attachment; filename=" + System.currentTimeMillis() + ".docx");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        headers.add("Last-Modified", new Date().toString());
        headers.add("ETag", String.valueOf(System.currentTimeMillis()));

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(new FileSystemResource(file));
    }
}
