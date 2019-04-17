// pages/eventsuggest/eventsuggest.js
var app=getApp();
var util = require("../../utils/util.js");
const date=new Date();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    years:date.getFullYear(),
    months:date.getMonth(),
    days:date.getDate(),
    hours:date.getHours(),
    minutes:date.getMinutes(),
    seconds:date.getSeconds(),
    "Input1": {
      "iteminput": ''
    },
    "commicate":''
  
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
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
  Commicate:function(e){
    this.setData({
      commicate: e.detail.value
    })
  },
  _successsubmit:function(){
    if (this.data.commicate!=null){
      var that=this;
      var UserName=null;
      var currenttime = new Date(util.formatTime());/* + "-" + that.data.seconds;*/
      //------------------------获取用户信息---------------------
      wx.getSetting({
        success: res => {
          if (res.authSetting['scope.userInfo']) {
            // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
            wx.getUserInfo({
              success: res => {
                app.globalData.nickName = res.userInfo.nickName;
                app.globalData.avatarUrl = res.userInfo.avatarUrl;
              }
            })
          }
          else {
            wx.openSetting({
              success: (res) => {
                res.authSetting = {
                  "scope.userInfo": true,
                }
              }

            })
            wx.authorize({
              scope: 'scope.userInfo',
              success() {
                wx.getUserInfo({
                  success: function (res) {
                    app.globalData.nickName = res.userInfo.nickName;
                    app.globalData.avatarUrl = res.userInfo.avatarUrl;
                  }
                })
              }
            })
          }
        }
      })
    //------------------------获取用户信息 end---------------------
      console.log(app.globalData);
      wx.request({
        url: 'https://www.qinyu123456.xyz/WX/saveforum.do',
        method:'POST',
        data:{
          commicate: that.data.commicate,
          currentdate: currenttime,
          username: app.globalData.userInfo.nickName,
          User_photo: app.globalData.userInfo.avatarUrl
        },
        header: {
          'content-type': 'application/x-www-form-urlencoded;charset=utf-8'  //这里注意POST请求content-type是小写，大写会报错
        },
        success: function (res) {
          console.log("返回成功的数据:" + res.data) //返回的会是对象，可以用JSON转字符串打印出来方便查看数据
          console.log("返回成功的数据:" + JSON.stringify(res.data)) //这样就可以愉快的看到后台的数据啦
          wx.showToast({
            icon: 'success',
            title: '提交成功',
          })
          setTimeout(function(){
            wx.navigateBack({
              delta: 1
            })
          },1000)  
        },
        fail: function (fail) {
          wx.showLoading({
            title: '提交失败',
          })
          setTimeout(function(){
            wx.hideLoading()
          },1000)
        }
      })
    }
    else{
      wx.showModal({
        title: '提示',
        content: '未填写内容',
        success: function (res) {
          if (res.confirm) {
            console.log('用户点击确定')
          } else if (res.cancel) {
            console.log('用户点击取消')
          }
        }
      })
    }
  }
})