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
 * 文学创作信息表 ProLiter 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-10 23:23:09
 */
 @ApiModel(value="ProLiter", description="文学创作信息表")
public class ProLiter implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private String uid;
		
	/** 书名 **/
	@ApiModelProperty(value = "书名")
	private String name;
		
	/** 封面 **/
	@ApiModelProperty(value = "封面")
	private String cover;
		
	/** 二维码 **/
	@ApiModelProperty(value = "二维码")
	private String qrCode;
		
	/** 展示图 **/
	@ApiModelProperty(value = "展示图")
	private String exhibition;
		
	/** 类型 **/
	@ApiModelProperty(value = "类型")
	private String typ;
		
	/** 标签 **/
	@ApiModelProperty(value = "标签")
	private String label;
		
	/** 介绍 **/
	@ApiModelProperty(value = "介绍")
	private String introduce;
		
	/** 描述 **/
	@ApiModelProperty(value = "描述")
	private String describe;
		
	/** 评分 **/
	@ApiModelProperty(value = "评分")
	private Float rate;
		
	/** 类别 **/
	@ApiModelProperty(value = "类别")
	private Integer kind;
		
	/** 章节 **/
	@ApiModelProperty(value = "章节")
	private Integer charpter;
		
	/** 小节 **/
	@ApiModelProperty(value = "小节")
	private Integer section;
		
	/** 完成章节 **/
	@ApiModelProperty(value = "完成章节")
	private Integer finCharp;
		
	/** 完成小节 **/
	@ApiModelProperty(value = "完成小节")
	private Integer finSection;
		
	/** 创作形式 **/
	@ApiModelProperty(value = "创作形式")
	private Integer form;
		
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
		
	/** 出版方 **/
	@ApiModelProperty(value = "出版方")
	private String publisher;
		
	/** 置顶 **/
	@ApiModelProperty(value = "置顶")
	private Integer isTop;

	/** 来源 **/
	@ApiModelProperty(value = "来源")
	private String source;

	/** 创作者 **/
	@ApiModelProperty(value = "创作者")
	private Integer partner;
		
	/** 浏览量 **/
	@ApiModelProperty(value = "浏览量")
	private Long views;
		
	/** 完成 **/
	@ApiModelProperty(value = "完成")
	private Integer finish;
		
	/** 创建人 **/
	@ApiModelProperty(value = "创建人")
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
		
		
	public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
	 
			
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	 
			
	public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
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
	 
			
	public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
	 
			
	public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
	 
			
	public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
	 
			
	public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
	 
			
	public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
	 
			
	public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }
	 
			
	public Integer getCharpter() {
        return charpter;
    }

    public void setCharpter(Integer charpter) {
        this.charpter = charpter;
    }
	 
			
	public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }
	 
			
	public Integer getFinCharp() {
        return finCharp;
    }

    public void setFinCharp(Integer finCharp) {
        this.finCharp = finCharp;
    }
	 
			
	public Integer getFinSection() {
        return finSection;
    }

    public void setFinSection(Integer finSection) {
        this.finSection = finSection;
    }
	 
			
	public Integer getForm() {
        return form;
    }

    public void setForm(Integer form) {
        this.form = form;
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

	public Integer getPartner() {
        return partner;
    }

    public void setPartner(Integer partner) {
        this.partner = partner;
    }
	 
			
	public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
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
	 
			
	public ProLiter() {
        super();
    }
    
																																																																																																																																														
	public ProLiter(String uid,String name,String cover,String qrCode,String exhibition,String typ,String label,String introduce,String describe,Float rate,Integer kind,Integer charpter,Integer section,Integer finCharp,Integer finSection,Integer form,Integer copyright,String reward,Date deadline,String publisher,Integer isTop,Integer partner,Long views,Integer finish,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.uid = uid;
		this.name = name;
		this.cover = cover;
		this.qrCode = qrCode;
		this.exhibition = exhibition;
		this.typ = typ;
		this.label = label;
		this.introduce = introduce;
		this.describe = describe;
		this.rate = rate;
		this.kind = kind;
		this.charpter = charpter;
		this.section = section;
		this.finCharp = finCharp;
		this.finSection = finSection;
		this.form = form;
		this.copyright = copyright;
		this.reward = reward;
		this.deadline = deadline;
		this.publisher = publisher;
		this.isTop = isTop;
		this.partner = partner;
		this.views = views;
		this.finish = finish;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}