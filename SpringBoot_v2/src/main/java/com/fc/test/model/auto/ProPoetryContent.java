package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 * 诗歌创作内容 ProPoetryContent 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-09 12:08:33
 */
 @ApiModel(value="ProPoetryContent", description="诗歌创作内容")
public class ProPoetryContent implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private String no;
		
	/** 词名 **/
	@ApiModelProperty(value = "词名")
	private String title;
		
	/** 牌名 **/
	@ApiModelProperty(value = "牌名")
	private String brand;
		
	/** 内容 **/
	@ApiModelProperty(value = "内容")
	private String content;
		
	/** 章节编号 **/
	@ApiModelProperty(value = "章节编号")
	private Long charpId;
		
	/** 章名 **/
	@ApiModelProperty(value = "章名")
	private String charpName;
		
	/** 节名 **/
	@ApiModelProperty(value = "节名")
	private String secName;
		
	/** 作品编号 **/
	@ApiModelProperty(value = "作品编号")
	private String poetryId;
		
	/** 作品名称 **/
	@ApiModelProperty(value = "作品名称")
	private String poetryName;
		
	/** 喜欢 **/
	@ApiModelProperty(value = "喜欢")
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
	 
			
	public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
	 
			
	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
	 
			
	public Long getCharpId() {
        return charpId;
    }

    public void setCharpId(Long charpId) {
        this.charpId = charpId;
    }
	 
			
	public String getCharpName() {
        return charpName;
    }

    public void setCharpName(String charpName) {
        this.charpName = charpName;
    }
	 
			
	public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }
	 
			
	public String getPoetryId() {
        return poetryId;
    }

    public void setPoetryId(String poetryId) {
        this.poetryId = poetryId;
    }
	 
			
	public String getPoetryName() {
        return poetryName;
    }

    public void setPoetryName(String poetryName) {
        this.poetryName = poetryName;
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
	 
			
	public ProPoetryContent() {
        super();
    }
    
																																																																																							
	public ProPoetryContent(String no,String title,String brand,String content,Long charpId,String charpName,String secName,String poetryId,String poetryName,Integer likes,Integer recomNo,Integer adopt,String favorer,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.no = no;
		this.title = title;
		this.brand = brand;
		this.content = content;
		this.charpId = charpId;
		this.charpName = charpName;
		this.secName = secName;
		this.poetryId = poetryId;
		this.poetryName = poetryName;
		this.likes = likes;
		this.recomNo = recomNo;
		this.adopt = adopt;
		this.favorer = favorer;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}