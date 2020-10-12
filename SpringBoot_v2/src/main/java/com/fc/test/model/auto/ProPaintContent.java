package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 * 绘画创作内容 ProPaintContent 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-05 11:59:40
 */
 @ApiModel(value="ProPaintContent", description="绘画创作内容")
public class ProPaintContent implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private String no;
		
	/** 标题 **/
	@ApiModelProperty(value = "标题")
	private String title;
		
	/** 作品链接 **/
	@ApiModelProperty(value = "作品链接")
	private String image;
		
	/** 作品链接1 **/
	@ApiModelProperty(value = "作品链接1")
	private String pic1;
		
	/** 作品链接2 **/
	@ApiModelProperty(value = "作品链接2")
	private String pic2;
		
	/** 作品链接3 **/
	@ApiModelProperty(value = "作品链接3")
	private String pic3;
		
	/** 作品链接4 **/
	@ApiModelProperty(value = "作品链接4")
	private String pic4;
		
	/** 介绍 **/
	@ApiModelProperty(value = "介绍")
	private String content;
		
	/** 分集编号 **/
	@ApiModelProperty(value = "分集编号")
	private Integer partId;
		
	/** 画集编号 **/
	@ApiModelProperty(value = "画集编号")
	private String paintId;
		
	/** 画集名称 **/
	@ApiModelProperty(value = "画集名称")
	private String paintName;
		
	/** 分集名称 **/
	@ApiModelProperty(value = "分集名称")
	private String partName;
		
	/** 画作名称 **/
	@ApiModelProperty(value = "画作名称")
	private String secName;
		
	/** 点赞 **/
	@ApiModelProperty(value = "点赞")
	private Integer likes;
		
	/** 推荐 **/
	@ApiModelProperty(value = "推荐")
	private Integer recomNo;


	/** 可见 **/
	@ApiModelProperty(value = "可见")
	private Integer views;
		
	/** 采纳 **/
	@ApiModelProperty(value = "采纳")
	private Integer adopt;
		
	/** 点赞用户 **/
	@ApiModelProperty(value = "点赞用户")
	private String favorer;
		
	/** 日期 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "日期")
	private Date dat;

	/** 创建人 **/
	@ApiModelProperty(value = "创建人")
	private String creator;

	/** 创建人Id **/
	@ApiModelProperty(value = "创建人Id")
	private String createBy;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date createDat;
		
	/** 最后更新时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "最后更新时间")
	private Date lUpdateDat;
		
	/** 删除 **/
	@ApiModelProperty(value = "删除")
	private Integer isDel;
		
		
	public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
	 
			
	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
	 
			
	public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
	 
			
	public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }
	 
			
	public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }
	 
			
	public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }
	 
			
	public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4;
    }
	 
			
	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
	 
			
	public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }
	 
			
	public String getPaintId() {
        return paintId;
    }

    public void setPaintId(String paintId) {
        this.paintId = paintId;
    }
	 
			
	public String getPaintName() {
        return paintName;
    }

    public void setPaintName(String paintName) {
        this.paintName = paintName;
    }
	 
			
	public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }
	 
			
	public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }
	 
			
	public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
	 
			
	public Integer getRecomNo() {
        return recomNo;
    }

    public void setRecomNo(Integer recomNo) {
        this.recomNo = recomNo;
    }

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}
			
	public Integer getAdopt() {
        return adopt;
    }

    public void setAdopt(Integer adopt) {
        this.adopt = adopt;
    }
	 
			
	public String getFavorer() {
        return favorer;
    }

    public void setFavorer(String favorer) {
        this.favorer = favorer;
    }
	 
			
	public Date getDat() {
        return dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
			
	public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
	 
			
	public Date getCreateDat() {
        return createDat;
    }

    public void setCreateDat(Date createDat) {
        this.createDat = createDat;
    }
	 
			
	public Date getlUpdateDat() {
        return lUpdateDat;
    }

    public void setlUpdateDat(Date lUpdateDat) {
        this.lUpdateDat = lUpdateDat;
    }
	 
			
	public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
	 
			
	public ProPaintContent() {
        super();
    }
    
																																																																																																																
	public ProPaintContent(String no,String title,String image,String pic1,String pic2,String pic3,String pic4,String content,Integer partId,String paintId,String paintName,String partName,String secName,Integer likes,Integer recomNo,Integer adopt,String favorer,Date dat,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.no = no;
		this.title = title;
		this.image = image;
		this.pic1 = pic1;
		this.pic2 = pic2;
		this.pic3 = pic3;
		this.pic4 = pic4;
		this.content = content;
		this.partId = partId;
		this.paintId = paintId;
		this.paintName = paintName;
		this.partName = partName;
		this.secName = secName;
		this.likes = likes;
		this.recomNo = recomNo;
		this.adopt = adopt;
		this.favorer = favorer;
		this.dat = dat;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}