// pages/advertiserdetil/advertiserdetil.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
          "title": "",
          "sponsor": "",
          "money": "",
          "time1": "",
          "time2": "",
          "setup": "",
          "detil": "",
          "pic": "",
          "phone":''
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    // 页面初始化 options为页面跳转所带来的参数
    this.setData({
      title: options.title,
      money: options.money,
      time1: options.time1,
      time2: options.time2,
      setup: options.setup,
      sponsor: options.sponsor,
      detil:options.detil,
      pic: options.pic,
      phone:options.phone
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
  Call_phone:function(){
    wx.makePhoneCall({
      phoneNumber: this.data.phone,
    })
  }
})