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
 * 文学作品章节 ProCharpt 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-30 16:41:40
 */
 @ApiModel(value="ProCharpt", description="文学作品章节")
public class ProCharpt implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private Long id;
		
	/** 标题 **/
	@ApiModelProperty(value = "标题")
	private String title;
		
	/** 介绍 **/
	@ApiModelProperty(value = "介绍")
	private String introduce;
		
	/** 图片 **/
	@ApiModelProperty(value = "图片")
	private String pic;
		
	/** 创作要求 **/
	@ApiModelProperty(value = "创作要求")
	private String requirement;
		
	/** 类型 **/
	@ApiModelProperty(value = "类型")
	private Integer chapType;
		
	/** 标签 **/
	@ApiModelProperty(value = "标签")
	private String label;
		
	/** 创作人员数 **/
	@ApiModelProperty(value = "创作人员数")
	private Integer creators;
		
	/** 章 **/
	@ApiModelProperty(value = "章")
	private Integer root;
		
	/** 主编号 **/
	@ApiModelProperty(value = "主编号")
	private Long rootId;
		
	/** 作品编号 **/
	@ApiModelProperty(value = "作品编号")
	private String bookId;
		
	/** 关联绘画编号 **/
	@ApiModelProperty(value = "关联绘画编号")
	private Long paintId;
		
	/** 关联诗歌编号 **/
	@ApiModelProperty(value = "关联诗歌编号")
	private Long poemId;
		
	/** 主序号 **/
	@ApiModelProperty(value = "主序号")
	private Integer rootOrd;
		
	/** 序号 **/
	@ApiModelProperty(value = "序号")
	private Integer ord;
		
	/** 上锁 **/
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
	 
			
	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
	 
			
	public Integer getChapType() {
        return chapType;
    }

    public void setChapType(Integer chapType) {
        this.chapType = chapType;
    }
	 
			
	public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
	 
			
	public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
	 
			
	public Long getPaintId() {
        return paintId;
    }

    public void setPaintId(Long paintId) {
        this.paintId = paintId;
    }
	 
			
	public Long getPoemId() {
        return poemId;
    }

    public void setPoemId(Long poemId) {
        this.poemId = poemId;
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
	 
			
	public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
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

	public List<ProUserAdopt> getProUserAdopts() {
		return proUserAdopts;
	}

	public void setProUserAdopts(List<ProUserAdopt> proUserAdopts) {
		this.proUserAdopts = proUserAdopts;
	}

	public ProCharpt() {
        super();
    }

	public ProCharpt(Long id) {
		this.id = id;
	}
	public ProCharpt(Long id,String title,String introduce,String pic,String requirement,Integer chapType,String label,Integer creators,Integer root,Long rootId,String bookId,Long paintId,Long poemId,Integer rootOrd,Integer ord,Integer isLock,Integer finish,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.id = id;
		this.title = title;
		this.introduce = introduce;
		this.pic = pic;
		this.requirement = requirement;
		this.chapType = chapType;
		this.label = label;
		this.creators = creators;
		this.root = root;
		this.rootId = rootId;
		this.bookId = bookId;
		this.paintId = paintId;
		this.poemId = poemId;
		this.rootOrd = rootOrd;
		this.ord = ord;
		this.isLock = isLock;
		this.finish = finish;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}