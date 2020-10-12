package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 * 文学创作内容 ProContent 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-11 13:23:00
 */
 @ApiModel(value="ProContent", description="文学创作内容")
public class ProContent implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private String no;
		
	/** 标题 **/
	@ApiModelProperty(value = "标题")
	private String title;
		
	/** 简述 **/
	@ApiModelProperty(value = "简述")
	private String summary;
		
	/** 内容 **/
	@ApiModelProperty(value = "内容")
	private String content;
		
	/** 图片 **/
	@ApiModelProperty(value = "图片")
	private String pic;
		
	/** 章节编号 **/
	@ApiModelProperty(value = "章节编号")
	private Long charpId;
		
	/** 章节名称 **/
	@ApiModelProperty(value = "章节名称")
	private String charpName;
		
	/** 小节名称 **/
	@ApiModelProperty(value = "小节名称")
	private String secName;
		
	/** 书籍编号 **/
	@ApiModelProperty(value = "书籍编号")
	private String bookId;
		
	/** 书籍名称 **/
	@ApiModelProperty(value = "书籍名称")
	private String bookName;
		
	/** 点赞 **/
	@ApiModelProperty(value = "点赞")
	private Integer likes;
		
	/** 推荐 **/
	@ApiModelProperty(value = "推荐")
	private Integer recomNo;
		
	/** 展示 **/
	@ApiModelProperty(value = "展示")
	private Integer views;
		
	/** 采纳 **/
	@ApiModelProperty(value = "采纳")
	private Integer adopt;
		
	/** 点赞人 **/
	@ApiModelProperty(value = "点赞人")
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
		
	/** 更新时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "更新时间")
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
	 
			
	public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
	 
			
	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
	 
			
	public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
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
	 
			
	public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
	 
			
	public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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
	 
			
	public ProContent() {
        super();
    }
    
																																																																																																						
	public ProContent(String no,String title,String summary,String content,String pic,Long charpId,String charpName,String secName,String bookId,String bookName,Integer likes,Integer recomNo,Integer views,Integer adopt,String favorer,String creator,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.no = no;
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.pic = pic;
		this.charpId = charpId;
		this.charpName = charpName;
		this.secName = secName;
		this.bookId = bookId;
		this.bookName = bookName;
		this.likes = likes;
		this.recomNo = recomNo;
		this.views = views;
		this.adopt = adopt;
		this.favorer = favorer;
		this.creator = creator;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}