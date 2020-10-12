package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 * 用户设备表 UserClient 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-19 11:34:21
 */
 @ApiModel(value="UserClient", description="用户设备表")
public class UserClient implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private String id;
		
	/** appid **/
	@ApiModelProperty(value = "appid")
	private String appid;
		
	/** appkey **/
	@ApiModelProperty(value = "appkey")
	private String appkey;
		
	/** 设备号 **/
	@ApiModelProperty(value = "设备号")
	private String clientid;
		
	/** 用户id **/
	@ApiModelProperty(value = "用户id")
	private String userId;
		
	/** 角色 **/
	@ApiModelProperty(value = "角色")
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
		
		
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
	 
			
	public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }
	 
			
	public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }
	 
			
	public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }
	 
			
	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
	 
			
	public UserClient() {
        super();
    }
    
																																																				
	public UserClient(String id,String appid,String appkey,String clientid,String userId,String role,String createBy,Date createDat,Date lUpdateDat,Integer isDel) {
	
		this.id = id;
		this.appid = appid;
		this.appkey = appkey;
		this.clientid = clientid;
		this.userId = userId;
		this.role = role;
		this.createBy = createBy;
		this.createDat = createDat;
		this.lUpdateDat = lUpdateDat;
		this.isDel = isDel;
		
	}
	
}