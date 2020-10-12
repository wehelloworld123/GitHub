package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 * 专题表 ProSubTopic 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-10-11 23:31:49
 */
 @ApiModel(value="ProSubTopic", description="专题表")
public class ProSubTopic implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主题id **/
	@ApiModelProperty(value = "主题id")
	private String topicId;
		
	/** 主题 **/
	@ApiModelProperty(value = "主题")
	private String topic;
		
	/** 创作者数量 **/
	@ApiModelProperty(value = "创作者数量")
	private Integer creator;
		
	/** 用户id **/
	@ApiModelProperty(value = "用户id")
	private String productNm;
		
	/** 描述 **/
	@ApiModelProperty(value = "描述")
	private String description;
		
	/** 等级 **/
	@ApiModelProperty(value = "等级")
	private Integer rank;
		
	/** 分值 **/
	@ApiModelProperty(value = "分值")
	private Integer grade;
		
	/** 标签1 **/
	@ApiModelProperty(value = "标签1")
	private String label1;
		
	/** 标签2 **/
	@ApiModelProperty(value = "标签2")
	private String label2;
		
	/** 标签3 **/
	@ApiModelProperty(value = "标签3")
	private String label3;
		
	/** logo **/
	@ApiModelProperty(value = "logo")
	private String logo;
		
	/** 简称 **/
	@ApiModelProperty(value = "简称")
	private String dn;
		
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
		
		
	public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }
	 
			
	public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
	 
			
	public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }
	 
			
	public String getProductNm() {
        return productNm;
    }

    public void setProductNm(String productNm) {
        this.productNm = productNm;
    }
	 
			
	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
	 
			
	public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
	 
			
	public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
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
	 
			
	public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
	 
			
	public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
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
	 
			
	public ProSubTopic() {
        super();
    }
    
																																																																																		
	public ProSubTopic(String topicId,String topic,Integer creator,String productNm,String description,Integer rank,Integer grade,String label1,String label2,String label3,String logo,String dn,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.topicId = topicId;
		this.topic = topic;
		this.creator = creator;
		this.productNm = productNm;
		this.description = description;
		this.rank = rank;
		this.grade = grade;
		this.label1 = label1;
		this.label2 = label2;
		this.label3 = label3;
		this.logo = logo;
		this.dn = dn;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}