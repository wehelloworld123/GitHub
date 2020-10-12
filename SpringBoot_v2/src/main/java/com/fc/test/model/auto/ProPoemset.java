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
 * 诗歌作品分集 ProPoemset 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-06 23:32:31
 */
 @ApiModel(value="ProPoemset", description="诗歌作品分集")
public class ProPoemset implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 编号 **/
	@ApiModelProperty(value = "编号")
	private Long id;
		
	/** 题 **/
	@ApiModelProperty(value = "题")
	private String charpter;
		
	/** 章节介绍 **/
	@ApiModelProperty(value = "章节介绍")
	private String description;
		
	/** 图片 **/
	@ApiModelProperty(value = "图片")
	private String pic;
		
	/** 创作要求 **/
	@ApiModelProperty(value = "创作要求")
	private String requirement;
		
	/** 根 **/
	@ApiModelProperty(value = "根")
	private Integer root;
		
	/** 分集编号 **/
	@ApiModelProperty(value = "分集编号")
	private Long rootId;
		
	/** 关联文章编号 **/
	@ApiModelProperty(value = "关联文章编号")
	private Long literId;
		
	/** 关联绘画编号 **/
	@ApiModelProperty(value = "关联绘画编号")
	private Long paintId;
		
	/** 创作人员数 **/
	@ApiModelProperty(value = "创作人员数")
	private Integer creators;
		
	/** 数量 **/
	@ApiModelProperty(value = "数量")
	private Integer number;
		
	/** 根序号 **/
	@ApiModelProperty(value = "根序号")
	private Integer rootOrd;
		
	/** 序号 **/
	@ApiModelProperty(value = "序号")
	private Integer ord;
		
	/** 诗歌集编号 **/
	@ApiModelProperty(value = "诗歌集编号")
	private String poetryId;


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
	 
			
	public String getCharpter() {
        return charpter;
    }

    public void setCharpter(String charpter) {
        this.charpter = charpter;
    }
	 
			
	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
	 
			
	public Long getPaintId() {
        return paintId;
    }

    public void setPaintId(Long paintId) {
        this.paintId = paintId;
    }
	 
			
	public Integer getCreators() {
        return creators;
    }

    public void setCreators(Integer creators) {
        this.creators = creators;
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
	 
			
	public String getPoetryId() {
        return poetryId;
    }

    public void setPoetryId(String poetryId) {
        this.poetryId = poetryId;
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
	 
			
	public ProPoemset() {
        super();
    }
	public ProPoemset(Long id) {
		this.id = id;
	}
																																																																																																	
	public ProPoemset(Long id,String charpter,String description,String pic,String requirement,Integer root,Long rootId,Long literId,Long paintId,Integer creators,Integer number,Integer rootOrd,Integer ord,String poetryId,Integer finish,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.id = id;
		this.charpter = charpter;
		this.description = description;
		this.pic = pic;
		this.requirement = requirement;
		this.root = root;
		this.rootId = rootId;
		this.literId = literId;
		this.paintId = paintId;
		this.creators = creators;
		this.number = number;
		this.rootOrd = rootOrd;
		this.ord = ord;
		this.poetryId = poetryId;
		this.finish = finish;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}

	public List<ProUserAdopt> getProUserAdopts() {
		return proUserAdopts;
	}

	public void setProUserAdopts(List<ProUserAdopt> proUserAdopts) {
		this.proUserAdopts = proUserAdopts;
	}
}