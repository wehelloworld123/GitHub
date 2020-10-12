package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 * 用户创作采纳表 ProUserAdopt 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-30 23:53:45
 */
 @ApiModel(value="ProUserAdopt", description="用户创作采纳表")
public class ProUserAdopt implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private Long id;
		
	/** 创作编号 **/
	@ApiModelProperty(value = "创作编号")
	private String proNo;
		
	/** 标题 **/
	@ApiModelProperty(value = "标题")
	private String title;
		
	/** 内容 **/
	@ApiModelProperty(value = "内容")
	private String content;
		
	/** 图片 **/
	@ApiModelProperty(value = "图片")
	private String picture;
		
	/** 文章 **/
	@ApiModelProperty(value = "文章")
	private String literText;
		
	/** 创作id **/
	@ApiModelProperty(value = "创作id")
	private String creationId;
		
	/** 创作名称 **/
	@ApiModelProperty(value = "创作名称")
	private String creationNm;
		
	/** 章节名称 **/
	@ApiModelProperty(value = "章节名称")
	private String charpNm;
		
	/** 章节id **/
	@ApiModelProperty(value = "章节id")
	private Long charpId;
		
	/** 内容id **/
	@ApiModelProperty(value = "内容id")
	private String contentId;
		
	/** 类型 **/
	@ApiModelProperty(value = "类型")
	private Integer typ;
		
	/** 用户id **/
	@ApiModelProperty(value = "用户id")
	private String userId;
		
	/** 用户名 **/
	@ApiModelProperty(value = "用户名")
	private String nickname;
		
	/** 头像url **/
	@ApiModelProperty(value = "头像url")
	private String avatar;
		
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
		
	/** 是否删除 **/
	@ApiModelProperty(value = "是否删除")
	private Integer isDel;
		
	/**  **/
	@ApiModelProperty(value = "")
	private String seter;
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo;
    }
	 
			
	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
	 
			
	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
	 
			
	public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
	 
			
	public String getLiterText() {
        return literText;
    }

    public void setLiterText(String literText) {
        this.literText = literText;
    }
	 
			
	public String getCreationId() {
        return creationId;
    }

    public void setCreationId(String creationId) {
        this.creationId = creationId;
    }
	 
			
	public String getCreationNm() {
        return creationNm;
    }

    public void setCreationNm(String creationNm) {
        this.creationNm = creationNm;
    }
	 
			
	public String getCharpNm() {
        return charpNm;
    }

    public void setCharpNm(String charpNm) {
        this.charpNm = charpNm;
    }
	 
			
	public Long getCharpId() {
        return charpId;
    }

    public void setCharpId(Long charpId) {
        this.charpId = charpId;
    }
	 
			
	public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
	 
			
	public Integer getTyp() {
        return typ;
    }

    public void setTyp(Integer typ) {
        this.typ = typ;
    }
	 
			
	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
	 
			
	public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
	 
			
	public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
	 
			
	public String getSeter() {
        return seter;
    }

    public void setSeter(String seter) {
        this.seter = seter;
    }
	 
			
	public ProUserAdopt() {
        super();
    }
    
																																																																																																											
	public ProUserAdopt(Long id,String proNo,String title,String content,String picture,String literText,String creationId,String creationNm,String charpNm,Long charpId,String contentId,Integer typ,String userId,String nickname,String avatar,Integer adopt,String createBy,Date createDat,Date lUpdateDat,Integer isDel,String seter) {
	
		this.id = id;
		this.proNo = proNo;
		this.title = title;
		this.content = content;
		this.picture = picture;
		this.literText = literText;
		this.creationId = creationId;
		this.creationNm = creationNm;
		this.charpNm = charpNm;
		this.charpId = charpId;
		this.contentId = contentId;
		this.typ = typ;
		this.userId = userId;
		this.nickname = nickname;
		this.avatar = avatar;
		this.adopt = adopt;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		this.seter = seter;
		
	}
	
}