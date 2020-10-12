package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Float;
import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 * 绘画创作集 ProPaint 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-29 16:48:18
 */
 @ApiModel(value="ProPaint", description="绘画创作集")
public class ProPaint implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private String uid;
		
	/** 集名 **/
	@ApiModelProperty(value = "集名")
	private String seter;
		
	/** 名称 **/
	@ApiModelProperty(value = "名称")
	private String name;
		
	/** 二维码 **/
	@ApiModelProperty(value = "二维码")
	private String qrCode;
		
	/** 展示图 **/
	@ApiModelProperty(value = "展示图")
	private String exhibition;
		
	/** 封面 **/
	@ApiModelProperty(value = "封面")
	private String cover;
		
	/** 主旨 **/
	@ApiModelProperty(value = "主旨")
	private String topic;
		
	/** 用途 **/
	@ApiModelProperty(value = "用途")
	private String purpose;
		
	/** 描述 **/
	@ApiModelProperty(value = "描述")
	private String description;
		
	/** 评分 **/
	@ApiModelProperty(value = "评分")
	private Float rate;
		
	/** 类别 **/
	@ApiModelProperty(value = "类别")
	private String kind;
		
	/** 分集 **/
	@ApiModelProperty(value = "分集")
	private Integer parts;
		
	/** 画作 **/
	@ApiModelProperty(value = "画作")
	private Integer section;
		
	/** 完成分集 **/
	@ApiModelProperty(value = "完成分集")
	private Integer finPart;
		
	/** 完成画作 **/
	@ApiModelProperty(value = "完成画作")
	private Integer finSection;
		
	/** 形式 **/
	@ApiModelProperty(value = "形式")
	private String form;
		
	/** 创作者 **/
	@ApiModelProperty(value = "创作者")
	private Long partner;
		
	/** 浏览量 **/
	@ApiModelProperty(value = "浏览量")
	private Long views;
		
	/** 版权 **/
	@ApiModelProperty(value = "版权")
	private Integer copyright;
		
	/** 版费 **/
	@ApiModelProperty(value = "版费")
	private String reward;
		
	/** 期限 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "期限")
	private Date deadline;
		
	/** 出品方 **/
	@ApiModelProperty(value = "出品方")
	private String publisher;
		
	/** 置顶 **/
	@ApiModelProperty(value = "置顶")
	private Integer isTop;

	/** 来源 **/
	@ApiModelProperty(value = "来源")
	private String source;

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
		
	/** 是否删除 **/
	@ApiModelProperty(value = "是否删除")
	private Integer isDel;
		
		
	public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
	 
			
	public String getSeter() {
        return seter;
    }

    public void setSeter(String seter) {
        this.seter = seter;
    }
	 
			
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	 
			
	public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
	 
			
	public String getExhibition() {
        return exhibition;
    }

    public void setExhibition(String exhibition) {
        this.exhibition = exhibition;
    }
	 
			
	public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
	 
			
	public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
	 
			
	public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
	 
			
	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
	 
			
	public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
	 
			
	public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
	 
			
	public Integer getParts() {
        return parts;
    }

    public void setParts(Integer parts) {
        this.parts = parts;
    }
	 
			
	public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }
	 
			
	public Integer getFinPart() {
        return finPart;
    }

    public void setFinPart(Integer finPart) {
        this.finPart = finPart;
    }
	 
			
	public Integer getFinSection() {
        return finSection;
    }

    public void setFinSection(Integer finSection) {
        this.finSection = finSection;
    }
	 
			
	public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
	 
			
	public Long getPartner() {
        return partner;
    }

    public void setPartner(Long partner) {
        this.partner = partner;
    }
	 
			
	public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }
	 
			
	public Integer getCopyright() {
        return copyright;
    }

    public void setCopyright(Integer copyright) {
        this.copyright = copyright;
    }
	 
			
	public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }
	 
			
	public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
	 
			
	public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
	 
			
	public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
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
	 
			
	public ProPaint() {
        super();
    }
    
																																																																																																																																														
	public ProPaint(String uid,String seter,String name,String qrCode,String exhibition,String cover,String topic,String purpose,String description,Float rate,String kind,Integer parts,Integer section,Integer finPart,Integer finSection,String form,Long partner,Long views,Integer copyright,String reward,Date deadline,String publisher,Integer isTop,Integer finish,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.uid = uid;
		this.seter = seter;
		this.name = name;
		this.qrCode = qrCode;
		this.exhibition = exhibition;
		this.cover = cover;
		this.topic = topic;
		this.purpose = purpose;
		this.description = description;
		this.rate = rate;
		this.kind = kind;
		this.parts = parts;
		this.section = section;
		this.finPart = finPart;
		this.finSection = finSection;
		this.form = form;
		this.partner = partner;
		this.views = views;
		this.copyright = copyright;
		this.reward = reward;
		this.deadline = deadline;
		this.publisher = publisher;
		this.isTop = isTop;
		this.finish = finish;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}