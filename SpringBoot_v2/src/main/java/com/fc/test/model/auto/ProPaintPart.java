package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;
import java.util.List;

/**
 * 绘画作品分集 ProPaintPart 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-30 18:43:45
 */
 @ApiModel(value="ProPaintPart", description="绘画作品分集")
public class ProPaintPart implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private Long id;
		
	/** 主题 **/
	@ApiModelProperty(value = "主题")
	private String subject;
		
	/** 章节介绍 **/
	@ApiModelProperty(value = "章节介绍")
	private String introduce;
		
	/** 图片 **/
	@ApiModelProperty(value = "图片")
	private String pic;
		
	/** 创作要求 **/
	@ApiModelProperty(value = "创作要求")
	private String requirement;
		
	/** 类型 **/
	@ApiModelProperty(value = "类型")
	private String partType;
		
	/** 创作者 **/
	@ApiModelProperty(value = "创作者")
	private Integer creators;
		
	/** 父节点 **/
	@ApiModelProperty(value = "父节点")
	private Integer root;
		
	/** 分集编号 **/
	@ApiModelProperty(value = "分集编号")
	private Long rootId;
		
	/** 关联文章编号 **/
	@ApiModelProperty(value = "关联文章编号")
	private Long literId;
		
	/** 关联诗歌编号 **/
	@ApiModelProperty(value = "关联诗歌编号")
	private Long poemId;
		
	/** 数量 **/
	@ApiModelProperty(value = "数量")
	private Integer number;
		
	/** 主序号 **/
	@ApiModelProperty(value = "主序号")
	private Integer rootOrd;
		
	/** 序号 **/
	@ApiModelProperty(value = "序号")
	private Integer ord;
		
	/** 画集编号 **/
	@ApiModelProperty(value = "画集编号")
	private String paintId;

	/** 锁 **/
	@ApiModelProperty(value = "上锁")
	private Integer isLock;

	/** 完成 **/
	@ApiModelProperty(value = "完成")
	private Integer finish;
		
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

	/** 采纳创作 **/
	@ApiModelProperty(value = "采纳创作")
	private List<ProUserAdopt> proUserAdopts;
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
	 
			
	public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
	 
			
	public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
	 
			
	public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
	 
			
	public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }
	 
			
	public Integer getCreators() {
        return creators;
    }

    public void setCreators(Integer creators) {
        this.creators = creators;
    }
	 
			
	public Integer getRoot() {
        return root;
    }

    public void setRoot(Integer root) {
        this.root = root;
    }
	 
			
	public Long getRootId() {
        return rootId;
    }

    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }
	 
			
	public Long getLiterId() {
        return literId;
    }

    public void setLiterId(Long literId) {
        this.literId = literId;
    }
	 
			
	public Long getPoemId() {
        return poemId;
    }

    public void setPoemId(Long poemId) {
        this.poemId = poemId;
    }
	 
			
	public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
	 
			
	public Integer getRootOrd() {
        return rootOrd;
    }

    public void setRootOrd(Integer rootOrd) {
        this.rootOrd = rootOrd;
    }
	 
			
	public Integer getOrd() {
        return ord;
    }

    public void setOrd(Integer ord) {
        this.ord = ord;
    }
	 
			
	public String getPaintId() {
        return paintId;
    }

    public void setPaintId(String paintId) {
        this.paintId = paintId;
    }
	 
			
	public Integer getFinish() {
        return finish;
    }

    public void setFinish(Integer finish) {
        this.finish = finish;
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
	 
			
	public ProPaintPart() {
        super();
    }

	public ProPaintPart(Long id) {
		this.id = id;
	}
	public ProPaintPart(Long id,String subject,String introduce,String pic,String requirement,String partType,Integer creators,Integer root,Long rootId,Long literId,Long poemId,Integer number,Integer rootOrd,Integer ord,String paintId,Integer finish,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.id = id;
		this.subject = subject;
		this.introduce = introduce;
		this.pic = pic;
		this.requirement = requirement;
		this.partType = partType;
		this.creators = creators;
		this.root = root;
		this.rootId = rootId;
		this.literId = literId;
		this.poemId = poemId;
		this.number = number;
		this.rootOrd = rootOrd;
		this.ord = ord;
		this.paintId = paintId;
		this.finish = finish;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}

	public Integer getLock() {
		return isLock;
	}

	public void setLock(Integer lock) {
		this.isLock = lock;
	}

	public List<ProUserAdopt> getProUserAdopts() {
		return proUserAdopts;
	}

	public void setProUserAdopts(List<ProUserAdopt> proUserAdopts) {
		this.proUserAdopts = proUserAdopts;
	}
}