// pages/eventdetails/eventdetails.js
var app=getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    isBtnClicked:false,
       "Requeir_number":'',
       "Roll_number":'',
        "iteminput": '',
        "maininput": '',
        //"chenginput":'',
        "placeinput": '',
        "timeinputone": '',
        "timeinputtwo": '',
        "setinput": '',
        "img": '',
        "name": '',
        "address": '',
        "longitude": '',
        "latitude": '',
        "eventdetail": '',
        "eventwards": '',
        "rule":'',
        "id":'',
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
      longitude: options.longitude,
      latitude: options.latitude,
      eventdetail: options.eventdetail,
      eventwards: options.eventwards,
      Roll_number: options.Roll_number,
      Requeir_number: options.Requeir_number,
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
      var that = this;
      if (!that.data.isBtnClicked) {
        var navi = "/pages/activeroll/activeroll";
        var navi2 = navi + "?iteminput=" + that.data.iteminput + "&timeinputone=" + that.data.timeinputone + "&timeinputtwo=" + that.data.timeinputtwo + "&eventdetail=" + that.data.eventdetail + "&eventwards=" + that.data.eventwards + "&src=" + that.data.img + "&rule=" + that.data.rule + "&id=" + that.data.id;
        app._pagenavigate(navi2);
      }
      that.setData({
        isBtnClicked: true
      })
      setTimeout(function () {
        that.setData({
          isBtnClicked: false
        })
      }, 2000)
  },
  Openlocate:function(){
    var latitude = this.data.latitude;
    var longitude = this.data.longitude;
    app.openlocate(longitude, latitude);
  }
})  