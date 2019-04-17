//app.js
App({

  onLaunch: function () {
    var that = this;
    // 展示本地存储能力
    var logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs)
    // 登录
    wx.login({
      success: res => {
        // 发送 res.code 到后台换取 openId, sessionKey, unionId
      }
    })
    // 获取用户信息
    wx.getSetting({
      success: res => {
        if (res.authSetting['scope.userInfo']) {
          // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
          wx.getUserInfo({
            success: res => {
              // 可以将 res 发送给后台解码出 unionId
              this.globalData.userInfo = res.userInfo
              // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
              // 所以此处加入 callback 以防止这种情况
              if (this.userInfoReadyCallback) {
                this.userInfoReadyCallback(res)
              }
            }
          })
        }
        else {
          /** 
          wx.showToast({
            title: '亲，您还没有授权哦！',
            icon: 'none',
            duration: 1500
          })
          **/
        }
        if (res.authSetting['scope.userLocation']) {
          wx.getLocation({
            type: 'wgs84',
            success: function (res) {
              var longitude = res.longitude
              var latitude = res.latitude
              that.globalData.locationInfo.longitude = longitude;
              that.globalData.locationInfo.latitude = latitude;
              that.loadCity(longitude, latitude)
              console.log(that.globalData.currentCity);
            },
          })
        }
        else {
          wx.authorize({
            scope: 'scope.userLocation',
            success() {
              wx.getLocation({
                success: function (res) {
                  var longitude = res.longitude
                  var latitude = res.latitude
                  that.globalData.locationInfo.longitude = longitude;
                  that.globalData.locationInfo.latitude = latitude;
                  that.loadCity(longitude, latitude);
                  console.log(that.globalData.currentCity);
                },
              })
              if (this.userInfoReadyCallback) {
                this.userInfoReadyCallback(res)
              }
            }
          })
        }
      },
      fail: res => {
      }
    })
  },
  /**
  获取用户信息
   */
  getUserinfo: function () {
    var that = this;
    wx.getUserInfo({
      success: res => {
        that.globalData.userInfo = res.userInfo;
      },
      fail: e => {
        wx.showToast({
          title: '亲，你未授权哦',
          icon: 'none',
          duration: 1500
        })
      }
    })
  },
  /**
   * 验证是否授权
   */
  appGetUserInfo: function () {
    var that = this;
    wx.getUserInfo({
      success: res => {
        that.globalData.userInfo = res.userInfo
      },
      fail: function () {
        wx.showModal({
          title: '提示',
          content: '请授权后操作',
          showCancel: false,
          success: function (resp) {
            wx.navigateBack({
              delta: 1
            })
          }
        })

      }
    })
  },
  _pagenavigate: function (navi) {
    wx.navigateTo({
      url: navi,
      success: function (res) {
      },
      fail: function (res) {
        wx.showLoading({
          title: '加载失败',
        }),
          setTimeout(function () {
            wx.hideLoading()
          }, 2000)
      },
      complete: function (res) { },
    })
  },
  /**
   * 页面跳转
   */
  naviSlect: function (that, navi) {
    var page = this;
    if (!that.data.isBtnClicked) {
      page._pagenavigate(navi);
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
  //-------------------------------获取当前用户城市地址------
  loadCity: function (longitude, latitude) {
    var that = this;
    wx.request({
      url: 'https://api.map.baidu.com/geocoder/v2/?ak=34rcqFKYtmrlGuwm7s9zgg0U0eMggjvi&location=' + latitude + ',' + longitude + '&output=json',
      data: {},
      header: {
        'Content-Type': 'application/json'
      },
      success: function (res) {
        if (res.data.status == 0) {
          var city = res.data.result.addressComponent.city;
          var c_length = parseInt(city.length);
          var ci = city.substring(0, c_length - 1);
          that.globalData.currentCity = ci;

        }
      },

      fail: function () {

        //that.globalData.currentCity= "武汉" 

      },

    })
  },
  response: function () {
    wx.showToast({
      title: '请检查网络',
      icon: 'loading',
      duration: 1500
    })
  },
  /**
   * 等待响应
   */
  ResponseResult: function (info, result) {
    wx.hideLoading();
    setTimeout(function () {
      wx.showToast({
        title: info,
        icon: result,
        duration: 2000
      })
      setTimeout(function () {
        wx.hideToast();
      }, 2000)
    }, 0)
  },

  //城市计数
  countcity: function (city) {
    var length = city.length;
    var count = length;
    for (var i = 0; i < length; i++) {
      for (var j = i; j < length; j++) {
        if (city[i] == city[j]) count--;
        j++;
      }
      i++
    }
    if (count < 0) return -1;
    return count;
  },
  globalData: {
    userInfo: {},
    city: '',
    currentCity: '',
    locationInfo: {
      longitude: null,
      latitude: null
    },
  }
})