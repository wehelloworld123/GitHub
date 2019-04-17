// pages/bardetil/bardetil.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    "title": "",
    "address": "",
    "time1": "",
    "time2": "",
    "pic": "",
    "type": "",
    "number": "",
    "phone": "",
    "detil": "",
    "longitude": '',
    "latitude": '',

  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    // 页面初始化 options为页面跳转所带来的参数
       this.setData({
       title: options.ti,
       address: options.address,
       time1:options.time1,
       time2: options.time2,
       type: options.type1,
       number: options.num,
       phone:options.phone,
       detil:options.detil,
       pic:options.pic,
       longitude: options.longitude,
       latitude: options.latitude
    })
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
  /**
   * 手机号码联系
   */
  Call_Phone:function(){
    wx.makePhoneCall({
      phoneNumber: this.data.phone,
    })
  },
  /**
   * 获取信息地址定位
   */
  Get_locate:function(){
    var latitude = this.data.latitude;
    var longitude = this.data.longitude;
    app.openlocate(longitude, latitude);
  }
})