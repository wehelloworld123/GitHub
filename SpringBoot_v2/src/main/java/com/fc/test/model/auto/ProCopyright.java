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
 * 作品版权分配表 ProCopyright 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-18 00:08:57
 */
 @ApiModel(value="ProCopyright", description="作品版权分配表")
public class ProCopyright implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private Long id;
		
	/** 创作编号 **/
	@ApiModelProperty(value = "创作编号")
	private String proNo;
		
	/** 作品编号 **/
	@ApiModelProperty(value = "作品编号")
	private String creationId;
		
	/** 作品类型 **/
	@ApiModelProperty(value = "作品类型")
	private Integer createTyp;
		
	/** 版权 **/
	@ApiModelProperty(value = "版权")
	private BigDecimal copyright;
		
	/** 作者 **/
	@ApiModelProperty(value = "作者")
	private String author;
		
	/** 作者id **/
	@ApiModelProperty(value = "作者id")
	private String authorId;
		
	/** 材料文件 **/
	@ApiModelProperty(value = "材料文件")
	private String fileStr;
		
	/** 分配方式 **/
	@ApiModelProperty(value = "分配方式")
	private String allotType;
		
	/** 作品角色 **/
	@ApiModelProperty(value = "作品角色")
	private String role;
		
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
	 
			
	public String getCreationId() {
        return creationId;
    }

    public void setCreationId(String creationId) {
        this.creationId = creationId;
    }
	 
			
	public Integer getCreateTyp() {
        return createTyp;
    }

    public void setCreateTyp(Integer createTyp) {
        this.createTyp = createTyp;
    }
	 
			
	public BigDecimal getCopyright() {
        return copyright;
    }

    public void setCopyright(BigDecimal copyright) {
        this.copyright = copyright;
    }
	 
			
	public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
	 
			
	public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }
	 
			
	public String getFileStr() {
        return fileStr;
    }

    public void setFileStr(String fileStr) {
        this.fileStr = fileStr;
    }
	 
			
	public String getAllotType() {
        return allotType;
    }

    public void setAllotType(String allotType) {
        this.allotType = allotType;
    }
	 
			
	public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
	 
			
	public ProCopyright() {
        super();
    }
    
																																																																								
	public ProCopyright(Long id,String proNo,String creationId,Integer createTyp,BigDecimal copyright,String author,String authorId,String fileStr,String allotType,String role,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.id = id;
		this.proNo = proNo;
		this.creationId = creationId;
		this.createTyp = createTyp;
		this.copyright = copyright;
		this.author = author;
		this.authorId = authorId;
		this.fileStr = fileStr;
		this.allotType = allotType;
		this.role = role;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}