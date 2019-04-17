// pages/eventdetails/eventdetails.js
var app=getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
       "number":'150',
       "number2":'83',
        "iteminput": '',
        "maininput": '',
        "placeinput": '',
        "timeinputone": '',
        "timeinputtwo": '',
        "setinput": '',
        "img": '',
        "name": '',
        "address": '',
        "eventdetail": '',
        "eventwards": '',
        "rule":'',
        "id":''


  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      timeinputone: options.timeinputone,
      timeinputtwo: options.timeinputtwo,
      iteminput: options.iteminput,
      maininput: options.maininput,
      placeinput: options.placeinput,
      rule: options.rule,
      setinput: options.setinput,
      img: options.img,
      address: options.address,
      eventdetail: options.eventdetail,
      eventwards: options.eventwards,
      id:options.id
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
  _pagenavigateroll: function () {
    var that = this
    var navi = "/pages/activeroll/activeroll";
    var navi2 = navi + "?iteminput=" + that.data.iteminput + "&timeinputone=" + that.data.timeinputone + "&timeinputtwo=" + that.data.timeinputtwo + "&eventdetail=" + that.data.eventdetail + "&eventwards=" + that.data.eventwards + "&src=" + that.data.img + "&rule=" + that.data.rule + "&id=" + that.data.id+"";
      app._pagenavigate(navi2);

  }
})  