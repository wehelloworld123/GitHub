// pages/activeroll/activeroll.js
var app=getApp();
const date = new Date()
Page({
  /**
   * 页面的初始数据
   */
  data: {
    year: date.getFullYear(),
    month: date.getMonth(),
    day: date.getDate(),
    hour: date.getHours(),
    minute:date.getMinutes(),
    "openid":'',
    "iteminput": "",
    "rule": "",
    "reward":"",
    "time1":'',
    "time2":'',
    "src":'',
     "name":null,
     "mphone":null,
     "id":"",
   
   showView: false,
   showRhoto: true,
   showValue: false,
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that =this;
    wx.getSetting({
      success: res => {
        if (res.authSetting['scope.userInfo']) {
          // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
    var y = that.data.year;
    var m = that.data.month;
    var d = that.data.day;
    var h = that.data.hour;
    var tr = y+m+d+h;
    var ti = that.data.time2;
    that.setData({
      iteminput: options.iteminput,
      time1: options.timeinputone,
      time2: options.timeinputtwo,
      src: options.src,
      rule: options.rule,
      id:options.id,
      reward: options.eventwards,
    })
    var curTime=new Date;
    var startTime = new Date(Date.parse(that.data.time1))
    if (curTime>=startTime) {
      that.setData({
        showRhoto: false
      })
    }
    else{
      showRhoto: true;
    }
    }
    else{
      wx.showModal({
        title: '提示',
        content: '您尚未登录，点击确定即可登录报名',
        success:function(res){
          if(res.confirm){
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
                    app.globalData.userInfo = res.userInfo
                    app.globalData.nickName = res.userInfo.nickName
                    app.globalData.avatarUrl = res.userInfo.avatarUrl
                  }
                })
              }
            })
            var y = that.data.year;
            var m = that.data.month;
            var d = that.data.day;
            var h = that.data.hour;
            var tr = y + "-" + m + "-" + d + ' ' + h;
            var ti = that.data.time2;
            that.setData({
              iteminput: options.iteminput,
              time1: options.timeinputone,
              time2: options.timeinputtwo,
              src: options.src,
              rule: options.rule,
              reward: options.eventwards,
            })
            var curTime = new Date;
            var startTime = new Date(Date.parse(that.data.time1))
            if (curTime >= startTime) {
              that.setData({
                showRhoto: false
              })
            }
          }
          else{
              wx.navigateBack({
                data: 1
              })
          }
        }
      })
    }
  }
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
  InforInput1:function(e){
    this.setData({
      name: e.detail.value
    })
  },
  InforInput2: function (e) {
    this.setData({
      mphone: e.detail.value
    })
  },
  onsuceessroll:function(){
    var that=this;
    if (this.data.name!=null && this.data.mphone != null){
      var currentime = that.data.year + "-" + that.data.month+"-"+that.data.day+' '+that.data.hour+'-'+that.data.minute;
      that.getOpenIdTap();
      wx.getStorage({
        key: 'openid',
        success: function(re) {
      wx.request({
        url: "https://www.qinyu123456.xyz/WX/usersignup.do",
        method: 'POST',
        data: {
          openid: re.data,
          name: that.data.name,
          phone: that.data.mphone,
          Roll_id: that.data.id,
          CurrentTime: currentime
        },
        header: {
          'content-type': 'application/x-www-form-urlencoded;charset=utf-8'  //这里注意POST请求content-type是小写，大写会报错
        },
        success: function (res) {
          console.log("返回成功的数据:" + res.data) //返回的会是对象，可以用JSON转字符串打印出来方便查看数据
          console.log("返回成功的数据:" + JSON.stringify(res.data)) //这样就可以愉快的看到后台的数据啦
          if (res.data == 10001){
            wx.showToast({
              title: '报名成功',
              icon: 'success',
              duration: 2000
            })
            
          }
          else if (res.data == 10010)
          {
            wx.showToast({
              title: '不可重复报名',
              icon: 'loading',
              duration: 2000
            })
          }
 
          /*var navi = "/pages/scheme/scheme"
          var navi2 = navi + "?iteminput=" + that.data.iteminput;
          app._pagenavigate(navi2);
          wx.showModal({
            showCancel:false,
            title: '提示',
            content: '活动不存在，请参加其他活动',
          })*/
        },
        fail: function (fail) {
          wx.showLoading({
            title: '报名失败',
          })
          setTimeout(function () {
            wx.hideLoading()
          }, 2000)
        },
      })
      }
      })
    }
  else{
      wx.showModal({
        showCancel: false,
        title: '提示',
        content: '内容未填写完整',
        success: function (res) {
          if (res.confirm) {
            console.log('用户点击确定')
          } else if (res.cancel) {
            console.log('用户点击取消')
          }
        }
      })
  }
  },
  getOpenIdTap: function () {
    var that = this;
    wx.login({
      success: function (res) {
        wx.request({
          //获取openid接口  
          url: 'https://api.weixin.qq.com/sns/jscode2session',
          data: {
            appid:app.globalData.appId,
            secret: app.globalData.secret,
            js_code: res.code,
            grant_type: 'authorization_code'
          },

          header:{
            'content-type': 'application/x-www-form-urlencoded;charset=utf-8'
          },
          success: function (res) {
            console.log(res.data)
            var OPEN_ID = res.data.openid;//获取到的openid  
            var SESSION_KEY = res.data.session_key;//获取到session_key  
            console.log(OPEN_ID.length)
            console.log(SESSION_KEY.length)
            that.setData({
              openid: res.data.openid.substr(0, 10) + '********' + res.data.openid.substr(res.data.openid.length - 8, res.data.openid.length),
              session_key: res.data.session_key.substr(0, 8) + '********' + res.data.session_key.substr(res.data.session_key.length - 6, res.data.session_key.length)
            })
            wx.setStorage({
              key: 'openid',
              data: res.data.openid,
            })
          },
          fail:function(){
            wx.showToast({
              title: '获取微信id失败',
              icon:"loading",
              duration:2000
            })
          }
        })
      }
    })
  }  
})