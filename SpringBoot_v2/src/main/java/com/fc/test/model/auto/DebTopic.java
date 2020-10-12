package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Character;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 * 标题信息表 DebTopic 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-10-12 10:26:06
 */
 @ApiModel(value="DebTopic", description="标题信息表")
public class DebTopic implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private String uid;
		
	/** 专栏名 **/
	@ApiModelProperty(value = "专栏名")
	private String subject;
		
	/** 专栏id **/
	@ApiModelProperty(value = "专栏id")
	private String subjectId;
		
	/** 立题 **/
	@ApiModelProperty(value = "立题")
	private String title;
		
	/** 内容 **/
	@ApiModelProperty(value = "内容")
	private String content;
		
	/** 标签1 **/
	@ApiModelProperty(value = "标签1")
	private String label1;
		
	/** 标签2 **/
	@ApiModelProperty(value = "标签2")
	private String label2;
		
	/** 标签3 **/
	@ApiModelProperty(value = "标签3")
	private String label3;
		
	/** 思维度 **/
	@ApiModelProperty(value = "思维度")
	private Integer thinking;
		
	/** 灵活性 **/
	@ApiModelProperty(value = "灵活性")
	private Integer flexibility;
		
	/** 逻辑性 **/
	@ApiModelProperty(value = "逻辑性")
	private Integer logicality;
		
	/** 总难度 **/
	@ApiModelProperty(value = "总难度")
	private Integer totalDiff;
		
	/** 关键字 **/
	@ApiModelProperty(value = "关键字")
	private String keyword;
		
	/** 浏览量 **/
	@ApiModelProperty(value = "浏览量")
	private Integer views;
		
	/** 回答数 **/
	@ApiModelProperty(value = "回答数")
	private Integer answers;
		
	/** 收录书架 **/
	@ApiModelProperty(value = "收录书架")
	private String belongNm;
		
	/** 书架Id **/
	@ApiModelProperty(value = "书架Id")
	private String belongId;
		
	/** 最低喜欢数 **/
	@ApiModelProperty(value = "最低喜欢数")
	private Integer minLike;
		
	/** 最低推荐数 **/
	@ApiModelProperty(value = "最低推荐数")
	private Integer minRecom;
		
	/** 已完成 **/
	@ApiModelProperty(value = "已完成")
	private Integer finish;
		
	/** 期数 **/
	@ApiModelProperty(value = "期数")
	private Integer period;
		
	/** 年度 **/
	@ApiModelProperty(value = "年度")
	private Character year;
		
	/** 状态 **/
	@ApiModelProperty(value = "状态")
	private Integer status;
		
	/** 创建人 **/
	@ApiModelProperty(value = "创建人")
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
		
		
	public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
	 
			
	public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
	 
			
	public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
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
	 
			
	public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }
	 
			
	public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }
	 
			
	public String getLabel3() {
        return label3;
    }

    public void setLabel3(String label3) {
        this.label3 = label3;
    }
	 
			
	public Integer getThinking() {
        return thinking;
    }

    public void setThinking(Integer thinking) {
        this.thinking = thinking;
    }
	 
			
	public Integer getFlexibility() {
        return flexibility;
    }

    public void setFlexibility(Integer flexibility) {
        this.flexibility = flexibility;
    }
	 
			
	public Integer getLogicality() {
        return logicality;
    }

    public void setLogicality(Integer logicality) {
        this.logicality = logicality;
    }
	 
			
	public Integer getTotalDiff() {
        return totalDiff;
    }

    public void setTotalDiff(Integer totalDiff) {
        this.totalDiff = totalDiff;
    }
	 
			
	public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
	 
			
	public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }
	 
			
	public Integer getAnswers() {
        return answers;
    }

    public void setAnswers(Integer answers) {
        this.answers = answers;
    }
	 
			
	public String getBelongNm() {
        return belongNm;
    }

    public void setBelongNm(String belongNm) {
        this.belongNm = belongNm;
    }
	 
			
	public String getBelongId() {
        return belongId;
    }

    public void setBelongId(String belongId) {
        this.belongId = belongId;
    }
	 
			
	public Integer getMinLike() {
        return minLike;
    }

    public void setMinLike(Integer minLike) {
        this.minLike = minLike;
    }
	 
			
	public Integer getMinRecom() {
        return minRecom;
    }

    public void setMinRecom(Integer minRecom) {
        this.minRecom = minRecom;
    }
	 
			
	public Integer getFinish() {
        return finish;
    }

    public void setFinish(Integer finish) {
        this.finish = finish;
    }
	 
			
	public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }
	 
			
	public Character getYear() {
        return year;
    }

    public void setYear(Character year) {
        this.year = year;
    }
	 
			
	public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
	 
			
	public DebTopic() {
        super();
    }
    
																																																																																																																																									
	public DebTopic(String uid,String subject,String subjectId,String title,String content,String label1,String label2,String label3,Integer thinking,Integer flexibility,Integer logicality,Integer totalDiff,String keyword,Integer views,Integer answers,String belongNm,String belongId,Integer minLike,Integer minRecom,Integer finish,Integer period,Character year,Integer status,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.uid = uid;
		this.subject = subject;
		this.subjectId = subjectId;
		this.title = title;
		this.content = content;
		this.label1 = label1;
		this.label2 = label2;
		this.label3 = label3;
		this.thinking = thinking;
		this.flexibility = flexibility;
		this.logicality = logicality;
		this.totalDiff = totalDiff;
		this.keyword = keyword;
		this.views = views;
		this.answers = answers;
		this.belongNm = belongNm;
		this.belongId = belongId;
		this.minLike = minLike;
		this.minRecom = minRecom;
		this.finish = finish;
		this.period = period;
		this.year = year;
		this.status = status;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}