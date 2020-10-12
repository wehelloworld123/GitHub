package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 * 创作推荐表 ProRecom 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-12 17:17:42
 */
 @ApiModel(value="ProRecom", description="创作推荐表")
public class ProRecom implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private Long id;
		
	/** 内容 **/
	@ApiModelProperty(value = "内容")
	private String content;
		
	/** 章节Id **/
	@ApiModelProperty(value = "章节Id")
	private String contentId;
		
	/** 标题 **/
	@ApiModelProperty(value = "标题")
	private String title;
		
	/** 摘要 **/
	@ApiModelProperty(value = "摘要")
	private String summary;
		
	/** 类型 **/
	@ApiModelProperty(value = "类型")
	private Integer typ;
		
	/** 点赞 **/
	@ApiModelProperty(value = "点赞")
	private Integer likes;
		
	/** 点赞用户字串 **/
	@ApiModelProperty(value = "点赞用户字串")
	private String favorer;
		
	/** 推荐人 **/
	@ApiModelProperty(value = "推荐人")
	private String creator;
		
	/** 推荐人头像 **/
	@ApiModelProperty(value = "推荐人头像")
	private String createAvat;
		
	/** 性别 **/
	@ApiModelProperty(value = "性别")
	private Integer createSex;
		
	/** 采纳 **/
	@ApiModelProperty(value = "采纳")
	private Integer adopt;
		
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
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
	 
			
	public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
	 
			
	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
	 
			
	public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
	 
			
	public Integer getTyp() {
        return typ;
    }

    public void setTyp(Integer typ) {
        this.typ = typ;
    }
	 
			
	public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
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
	 
			
	public String getCreateAvat() {
        return createAvat;
    }

    public void setCreateAvat(String createAvat) {
        this.createAvat = createAvat;
    }
	 
			
	public Integer getCreateSex() {
        return createSex;
    }

    public void setCreateSex(Integer createSex) {
        this.createSex = createSex;
    }
	 
			
	public Integer getAdopt() {
        return adopt;
    }

    public void setAdopt(Integer adopt) {
        this.adopt = adopt;
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
	 
			
	public ProRecom() {
        super();
    }
    
																																																																																		
	public ProRecom(Long id,String content,String contentId,String title,String summary,Integer typ,Integer likes,String favorer,String creator,String createAvat,Integer createSex,Integer adopt,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.id = id;
		this.content = content;
		this.contentId = contentId;
		this.title = title;
		this.summary = summary;
		this.typ = typ;
		this.likes = likes;
		this.favorer = favorer;
		this.creator = creator;
		this.createAvat = createAvat;
		this.createSex = createSex;
		this.adopt = adopt;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}