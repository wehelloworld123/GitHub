// pages/personcenter/personcenter.js
var app=getApp();
Page({
  /**
   * 页面的初始数据
   */
  data: {
    "src":'http://img.zhichiwangluo.com/zc_app_default_photo.png',
    "uername":'用户名',
    "pageurl6": {
      "realurl1": "/pages/eventissue/eventissue",
      "realurl_sce": "/pages/adctive_Sheme/adctive_Sheme",
      "realurl2": "/pages/eventsuggest/eventsuggest",
      "realurl3": "/pages/scheme/scheme",
      "realurl4": "/pages/coupon/coupon",
    },
    isBtnClicked: false,
    userInfor: {},
    nickName: '用户名',
    avatarUrl: 'http://img.zhichiwangluo.com/zc_app_default_photo.png',
    hasUserInfo: true,
    canIUse: wx.canIUse('image.open-type.getUserInfo'),
    city:"",
    backcolor:false,
    backcolor_a: false,
    backcolor_b: false,
    backcolor_c: false,
    backcolor_d: false,
    backcolor_e: false,
    data_stroage:'1kb'//数据缓存

  },

  /**
   * 生命周期函数--监听页面加载
   * 获取微信用户信息
   */
  onLoad: function () {
    var city = app.globalData.currentCity
    var that=this;
    if (app.globalData.userInfo != null) {
      that.setData({
        userInfor: app.globalData.userInfo,
        nickName: app.globalData.userInfo.nickName,
        avatarUrl: app.globalData.userInfo.avatarUrl,
        hasUserInfo: true,
        city: city
      })
    }  else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          that.setData({
            userInfor: app.globalData.userInfo,
            nickName: userInfor.nickName,
            avatarUrl: userInfor.avatarUrl,
            hasUserInfo: true,
            city: city
          })
        }
        
      })

    }
    wx.getStorageInfo({
      success: function (res) {
        that.setData({
          data_stroage: res.currentSize + 'kb'
        })
      },
    })
    console.log(app.globalData.currentCity)
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   * 
   */
  onReady: function () {
    var that=this;
    var city = app.globalData.currentCity; 
    var length = parseInt(city.length);
    var ci = city.substring(0, length - 1);

    wx.getUserInfo({
      success: res => {
        app.globalData.userInfo = res.userInfo
        that.setData({
          nickName: app.globalData.userInfo.nickName,
          avatarUrl: app.globalData.userInfo.avatarUrl,
          hasUserInfo: true,
          city: city
        })
      },
      fail: res => {
        wx.openSetting({
          success: (res) => {
       
            if (res.authSetting['scope.userInfo']){
              wx.getUserInfo({
                success: res => {
                  app.globalData.userInfo = res.userInfo
                  app.globalData.nickName = res.userInfo.nickName
                  app.globalData.avatarUrl = res.userInfo.avatarUrl
                  that.setData({
                    userInfo: app.globalData.userInfo,
                    nickName: app.globalData.userInfo.nickName,
                    avatarUrl: app.globalData.userInfo.avatarUrl,
                    hasUserInfo: true,
                    city: city
                  })
                }

              })
            }
            else if(!res.authSetting['scope.userInfo']){
              that.onReady();
            }
          },
          fail: (res) => {
            that.onReady();
          }
        })

      }
    })
    console.log(app.globalData.currentCity)
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
   * 获取微信用户信息api
   */
  getUserInfo: function (e) {
    console.log(e)
    wx.getSetting({
      success: res => {
        if (res.authSetting['scope.userInfo']) {
          // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
          wx.getUserInfo({
            success: res => {
              app.globalData.userInfo = res.userInfo
              this.setData({
                userInfo: app.globalData.userInfo,
                nickName: app.globalData.userInfo.nickName,
                avatarUrl: app.globalData.userInfo.avatarUrl,
                hasUserInfo: true
              })
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
                  app.globalData.userInfo = res.userInfo
                  app.globalData.nickName = res.userInfo.nickName
                  app.globalData.avatarUrl = res.userInfo.avatarUrl
                }
              })
            }
          })
        }
      }
    })
    this.setData({
      userInfo: app.globalData.userInfo,
      nickName: app.globalData.nickName,
      avatarUrl: app.globalData.avatarUrl,
    })
  },
  CancelUerInfo:function(){
    wx.showModal({
      title: '提示',
      content: '您要取消登录吗',
      success: function (res) {
        if (res.confirm) {
          wx.openSetting({
            success: (res) => {
              
               res.authSetting = {
                "scope.userInfo": false,
               }
               }
            
          })
        } else if (res.cancel) {
          console.log('用户点击取消')
        }
      }
    })
  },



  _pagenavigatereal: function () {
    var that=this;
    var navi = this.data.pageurl6.realurl_sce;
    //ar url_a = navi + "?x=1"
    app.naviSlect(this,navi);
    setTimeout(function(){
      that.setData({
        backcolor: false
      })
    },500)
  },
  _pagenavigatereal2:function(){
    var that = this;
    var navi = this.data.pageurl6.realurl2;
    app.naviSlect(this,navi);
    setTimeout(function () {
      that.setData({
        backcolor_e: false
      })
    }, 500)
  },
  _pagenavigatereal3: function () {
    var that=this;
    var navi = "/pages/Realsesheme_b/Realseshenme_b";
    app.naviSlect(this,navi);
    setTimeout(function () {
      that.setData({
        backcolor_a: false
      })
    }, 500)
  },
  _pagenavigatereal4: function () {
   // var navi = this.data.pageurl6.realurl4;
   // app._pagenavigate(navi);
    var that = this;
    wx.showModal({
      showCancel: false,
      title: '提示',
      content: '该功能暂未开放',
    })
    setTimeout(function () {
      that.setData({
        backcolor_c: false
      })
    }, 500)
  },
  /**
   * 清理缓存
   */
  _pagenavigatereal5: function () {
    var that = this;

        wx.showModal({
          title: '提示',
          content: '可能会出现数据丢失',
          success(res) {
            if (res.confirm) {
              wx.clearStorage()
              wx.showToast({
                title: '缓存已清理',
                icon: 'success',
                duration: 1500
              })
              wx.getStorageInfo({
                success: function(res) {
                  that.setData({
                    data_stroage: res.currentSize + 'kb'
                  })
                },
              })
            }
     
      },
    })


      that.setData({
        backcolor_d: false
      })
   
  },
  _bindnavi:function(){
    var that = this;
    wx.showModal({
      showCancel: false,
      title: '提示',
      content: '该功能暂未开放',
    })
        setTimeout(function () {
      that.setData({
        backcolor_b: false
      })
    }, 500)
  },
  selectCity:function(){//切换城市
   this.setData({
     selectCity_hidden:false
   })
  },
  _Arctivlehe: function (e) {
      app.globalData.currentCity=e.target.value;
      this.setData({
        city: app.globalData.currentCity
      })
  },

  /**
   * 动画效果
   */
  touchflash:function(e){
    var that=this;
    var backSwitch = e.target.dataset.dataid;
    var backgroundcolor;
    switch(backSwitch){
      case "0": {
        that.setData({
          backcolor: true
        })};break;
      case "1": {
        that.setData({
          backcolor_a: true
        })}; break;
      case "2": {
        that.setData({
          backcolor_b: true
        })}; break;
      case "3": {
        that.setData({
          backcolor_c: true
        })}; break;
      case "4": {
        that.setData({
          backcolor_d: true
        })}; break;
      case "5": {
        that.setData({
          backcolor_e: true
        })
      }; break;
        default:break;
    }

  },
  /**
   * 触摸移动
   */
  touchend:function(e){
    var that = this;
    var backSwitch = e.target.dataset.dataid;
    var backgroundcolor;
    switch (backSwitch) {
      case "0": {
        that.setData({
          backcolor: false
        })
      }; break;
      case "1": {
        that.setData({
          backcolor_a: false
        })
      }; break;
      case "2": {
        that.setData({
          backcolor_b: false
        })
      }; break;
      case "3": {
        that.setData({
          backcolor_c: false
        })
      }; break;
      case "4": {
        that.setData({
          backcolor_d: false
        })
      }; break;
      case "5": {
        that.setData({
          backcolor_e: false
        })
      }; break;
      default: break;

    }
  }
})