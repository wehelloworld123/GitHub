package com.fc.test.common.handler;


//import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

import com.fc.test.model.auto.TsysUser;
import com.fc.test.shiro.util.ShiroUtils;
import com.fc.test.util.DateUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class MetaHandler {//implements MetaObjectHandler {
/*
    private static final Logger logger = LoggerFactory.getLogger(MetaHandler.class);

    *//**
     * 新增数据执行
     * @param metaObject
     *//*
    @Override
    public void insertFill(MetaObject metaObject) {
        Date date = DateUtils.getNowDate();
        this.setFieldValByName("createBy", *//*ShiroUtils.getUserId()*//*"488294747442511879", metaObject);
        this.setFieldValByName("createDat",date, metaObject);
        this.setFieldValByName("lUpdateDat", date, metaObject);
    }

    *//**
     * 更新数据执行
     * @param metaObject
     *//*
    @Override
    public void updateFill(MetaObject metaObject) {
        TsysUser userEntity = ShiroUtils.getUser();
        this.setFieldValByName("lUpdateDat", DateUtils.getNowDate(), metaObject);
//        this.setFieldValByName("updateBy", userEntity.getId(), metaObject);
    }*/

}