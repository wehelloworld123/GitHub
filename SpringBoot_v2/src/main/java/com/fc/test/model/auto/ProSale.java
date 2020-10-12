package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 * 作品上架表 ProSale 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-19 22:31:23
 */
 @ApiModel(value="ProSale", description="作品上架表")
public class ProSale implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private Long id;
		
	/** 作品编号 **/
	@ApiModelProperty(value = "作品编号")
	private String proNo;
		
	/** 作品类型 **/
	@ApiModelProperty(value = "作品类型")
	private Integer typ;
		
	/** 创作类型 **/
	@ApiModelProperty(value = "创作类型")
	private String createTyp;
		
	/** 标题 **/
	@ApiModelProperty(value = "标题")
	private String title;
		
	/** 集 **/
	@ApiModelProperty(value = "集")
	private String seter;
		
	/** 封面 **/
	@ApiModelProperty(value = "封面")
	private String cover;
		
	/** 展示 **/
	@ApiModelProperty(value = "展示")
	private String exhibition;
		
	/** 标签 **/
	@ApiModelProperty(value = "标签")
	private String label;
		
	/** 描述 **/
	@ApiModelProperty(value = "描述")
	private String description;
		
	/** 售价 **/
	@ApiModelProperty(value = "售价")
	private BigDecimal saleAmt;

	/** 截至日期 **/
	@ApiModelProperty(value = "截至日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date deadline;
	/** 状态 **/
	@ApiModelProperty(value = "状态")
	private String saleStatus;
		
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
	 
			
	public Integer getTyp() {
        return typ;
    }

    public void setTyp(Integer typ) {
        this.typ = typ;
    }
	 
			
	public String getCreateTyp() {
        return createTyp;
    }

    public void setCreateTyp(String createTyp) {
        this.createTyp = createTyp;
    }
	 
			
	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
	 
			
	public String getSeter() {
        return seter;
    }

    public void setSeter(String seter) {
        this.seter = seter;
    }
	 
			
	public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
	 
			
	public String getExhibition() {
        return exhibition;
    }

    public void setExhibition(String exhibition) {
        this.exhibition = exhibition;
    }
	 
			
	public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
	 
			
	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
	 
			
	public BigDecimal getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(BigDecimal saleAmt) {
        this.saleAmt = saleAmt;
    }
	 
			
	public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
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

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public ProSale() {
        super();
    }
    
																																																																																		
	public ProSale(Long id,String proNo,Integer typ,String createTyp,String title,String seter,String cover,String exhibition,String label,String description,BigDecimal saleAmt,String saleStatus,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.id = id;
		this.proNo = proNo;
		this.typ = typ;
		this.createTyp = createTyp;
		this.title = title;
		this.seter = seter;
		this.cover = cover;
		this.exhibition = exhibition;
		this.label = label;
		this.description = description;
		this.saleAmt = saleAmt;
		this.saleStatus = saleStatus;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}