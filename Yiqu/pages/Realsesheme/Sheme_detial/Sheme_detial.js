// pages/Realsesheme/Sheme_detial/Sheme_detial.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    orderDetailType:2,
    hidden:true,
    nocancel: false,

    "carousel1":{
      "title":'',
      "avarlurl":'',
      "scancode":'',
      "peoNab":'',
      "Etype":'',
      "address":''
    },
    "carousel2":{
      "avarlurl": '',
      "title": '',
      "Etype": '',
      "time1":'',
      "address": '',
      "Contact": '',
      "sposor":'',
      "detail":'',
      hidden:false,
      view_address:'地址',
      view_time: '时间',
      view_Etype:'类型',
      view_sposor:'主办方',
      view_info:'活动信息',
      view_contact:'联系方式'
    },
    "carousel3": {
      "title": '',
      "avarlurl": '',
      "peoNab": '',
      "Etype": '',
      "address": '',
      "sposor":'',
      hidden: true,
      view_address: '地址',
      view_time: '时间',
      view_Etype: '类型',
      view_sposor: '发布方',
      view_info: '详情信息',
      view_contact: '联系方式'
    },
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that=this;
    that.setData({
      orderDetailType: options.orderDetailType
    })
    if (options.orderDetailType=1){
      var content_title = "carousel1.title";
      var content_avarlurl = "carousel1.avarlurl"
      var content_scancode = "carousel1.scancode"
      var content_peoNab = "carousel1.peoNab"
      var content_Etype = "carousel1.Etype"
      var content_address = "carousel1.address"
      that.setData({
        [content_title]: options.iteminput,
        [content_avarlurl]: options.img,
        [content_scancode]: options.scancode,
        [content_peoNab]: options.rollpeople,
        [content_Etype]: options.type,
        [content_address]: options.address,

      })
    }
    else if (options.orderDetailType = 2){
      var content_avarlurl = "carousel1.avarlurl"
      var content_title = "carousel2.title";
      var content_time1 = "carousel2.timeinputone"
      var content_Contact = "carousel2.Contact"
      var content_Etype = "carousel2.Etype"
      var content_address = "carousel2.address"
      var content_detail = "carousel2.detail"
      var content_sposor = "carousel2.sposor"
      that.setData({
        [content_title]: options.iteminput,
        [content_avarlurl]: options.img,
        [content_time1]: options.address,
        [content_Contact]: options.Contact,
        [content_Etype]: options.Etype,
        [content_address]: options.address,
        [content_detail]: options.type,
        [content_sposor]: options.sposor,
      })
    }
    else if (options.orderDetailType = 3) {
      var content_avarlurl = "carousel1.avarlurl"
      var content_title = "carousel2.title";
      var content_time1 = "carousel2.timeinputone"
      var content_Etype = "carousel2.Etype"
      var content_address = "carousel2.address"
      var content_detail = "carousel2.detail"
      var content_sposor = "carousel2.sposor"
      that.setData({
        [content_avarlurl]: options.img,
        [content_title]: options.iteminput,
        [content_avarlurl]: options.img,
        [content_time1]: options.address,
        [content_Contact]: options.Contact,
        [content_Etype]: options.Etype,
        [content_address]: options.address,
        [content_detail]: options.type,
        [content_sposor]: options.sposor,
      })
    }

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
  
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
  
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
  
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
  
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
  
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  },
  modalhidden:function(e){
    var that=this;
    that.setData({
      hidden:false
    })
  },
  couponCancel:function(e){
    var that = this;
    that.setData({
      hidden: true
    })
  },
  couponConfirm:function(e){

  }
})