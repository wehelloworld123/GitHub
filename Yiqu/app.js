var WxParse = require('components/wxParse/wxParse.js');
var util    = require('utils/util.js');

App({
  onLaunch: function () {
    let userInfo;
    var that=this;
    if (userInfo = wx.getStorageSync('userInfo')) {
      this.globalData.userInfo = userInfo;
    }
    this.appInitial();
    // 获取用户信息
    wx.getSetting({//获取用户微信信息
      success: res => {
        if (res.authSetting['scope.userInfo']) {
          // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
          wx.getUserInfo({
            success: res => {
              // 可以将 res 发送给后台解码出 unionId
              this.globalData.userInfo = res.userInfo
              console.log(res)
              // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
              // 所以此处加入 callback 以防止这种情况
              if (this.userInfoReadyCallback) {
                this.userInfoReadyCallback(res)
              }
            }
          })
        }
        else{
          wx.authorize({
            scope: 'scope.userInfo',
            success(){
              wx.getUserInfo({
                success:function(res){
                  that.globalData.userInfo = res.userInfo
                  that.globalData.nickName = res.userInfo.nickName
                  that.globalData.avatarUrl = res.userInfo.avatarUrl
                }
              })
            }
          })
        }
        if (res.authSetting["scope.userLocation"]){
          wx.getLocation({
            type: 'wgs84',
            success: function(res) {
              var longitude = res.longitude
              var latitude = res.latitude  
              that.globalData.locationInfo.longitude = longitude;
              that.globalData.locationInfo.latitude = latitude;  
              that.loadCity(longitude, latitude)
            },
          })
        }
        else{
          wx.authorize({
            scope: 'scope.userLocation',
            success(){
  
              wx.getLocation({
                type: 'wgs84',
                success: function (res) {
                  var longitude = res.longitude
                  var latitude = res.latitude
                  that.globalData.locationInfo.longitude = longitude;
                  that.globalData.locationInfo.latitude = latitude;
                  that.loadCity(longitude, latitude)
                },
              })
            }
          })
        }
      }
    })
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
        // success    
        console.log(res);
        var city = res.data.result.addressComponent.city;
        var c_length =parseInt(city.length);
        var ci = city.substring(0, c_length - 1)
        that.globalData.currentCity=ci;
      },
      fail: function () {

        //that.globalData.currentCity= "武汉" 
 
      },

    })
  },
//-------------------------------获取当前用户城市地址------

  //周期函数
  appInitial: function () {
    let that = this;

    this._getSystemInfo({
      success: function (res) {
        that.setSystemInfoData(res);
      }
    });

    wx.request({
      url: 'https://www.lkand.xyz',//'this.globalData.siteBaseUrl +'/index.php?r=AppUser/MarkWxXcxStatus'',
      data: {
        app_id: this.getAppId()
      },
      method: 'GET',
      header: {
        'content-type': 'application/json'
      }
    });
  },
 
  //app注册
  onShow: function (options) {
    if( options && options.scene && (options.scene == 1011 || options.scene == 1012 || options.scene == 1013)){
      this.globalData.urlLocationId = options.query.location_id || '';
      if (options.query.user_token) {
        this._getPromotionUserToken({
          user_token: options.query.user_token
        });
      }
      if (options.query.leader_user_token) {
        var that = this;      

      }
    }
    if (options && options.scene && (options.scene == 1007 || options.scene == 1008)){
      if (options.query.user_token) {
        this._getPromotionUserToken({
          user_token: options.query.user_token
        });
      }
    }
  },
  //onshow
  _getPromotionUserToken: function (param) {
    var that = this;
    this.sendRequest({
      hideLoading: true,
      url: '/index.php?r=AppDistribution/userBind',
      method: 'post',
      data: param,
      success: function (res) {
        that.setPageTitle(res.data.nickname + '的小店');
      },
      successStatusAbnormal: function (res) {
        if(res.status == 99){
          let homepageRouter = that.getHomepageRouter();
          that.turnToPage('/pages/' + homepageRouter + '/' + homepageRouter, true);
        }
        if (res.status == 100){
          that.turnToPage('/pages/promotionApply/promotionApply', true);
        }
      }
    });
  },

  /*--------------------------scoll-view 的所有事件*/
  /**
   * 获取屏幕高度
   */
  getwindowHeight:function(windowHeight,that){

    wx.getSystemInfo({
      success: function(res) {
        that.setData({
          windowHeight:res.windowHeight
        })
        console.log("屏幕高度" + that.data.windowHeight);
      },
    })
  },

  scollLower:function(){

  },
  scollUpper: function () {

  },
  /**
   * 滚动开始,获取当前高度，刷新高度
   */
  scollStart: function (e, that, clientY, refreshHeight){
    var startPoint = e.touches[0]
    var clientY = startPoint.clientY;
    that.setData({
      clientY: clientY,
      refreshHeight: 0
    })
  },
    /**
   * 滚动结束,获取改变高度
   */
  scollEnd: function (e, that, refreshHeight) {
    var endPoint = e.changedTouches[0]
    var y = (endPoint.clientY - that.data.clientY) * 6;
    if (y > 50) {
      y = 50;
    }
    that.setData({
      refreshHeight: y
    })
  },

  /**
   * 获取地址
   */
  getLocation:function(){
    wx.getLocation({
      success: function(res) {
        
      },
    })

  },




    /*--------------------------scoll-view 的所有事件*/
//获取会员权限
/*------------------------地图---------------------------------*/
  _Egetmaplocate: function (e, address, longitude,latitude,re) {
    var that = re;
    wx.getSetting({
      success(res) {
        if (!res.authSetting['scope.userLocation']) {
          wx.openSetting({
            success: (res) => {
              res.authSetting = {
                "scope.userLocation": true,
              }
            }
          })
          wx.authorize({
            scope: 'scope.userLocation',
            success() {
              wx.chooseLocation({
                success: function (res) {
                  console.log(res);
                  that.setData({
                    address: res.name,
                    longitude: res.longitude,
                    latitude: res.latitude
                  })
                },
                fail: function (res) {
                  wx.showModal({
                    showCancel:false,
                    title: '提示',
                    content: '调用失败',
                  })
                },
                complete: function () {

                  return locate;

                }
              })
            }
          })
        } else {
          wx.chooseLocation({
            success: function (res) {
              console.log(res);
              that.setData({
                address: res.name,
                longitude: res.longitude,
                latitude: res.latitude
              })
            },
            fail: function (res) {
              wx.showModal({
                showCancel:false,
                title: '提示',
                content: '调用失败',
              })
            },
          })
        }
      }
    })
  },
  /*------------------------地图---------------------------------*/

  upload: function(pag, path) {
    var imge=null;
    wx.uploadFile({
      url: "https://www.lkand.xyz/qin/uploadServlet.do",
      filePath: path[0],
      name: 'file',
      header: { "Content-Type": "multipart/form-data" },
      formData: {
        //和服务器约定的token, 一般也可以放在header中
        //'session_token': wx.getStorageSync('session_token')
      },
      success: function (res) {
        console.log(res.data);
        var imgur=JSON.parse(res.data).url;
        imge=imgur;
        if (res.statusCode != 200) {
          wx.showModal({
            title: '提示',
            content: '上传失败',
            showCancel: false
          })
        }
        pag.setData({
          img:imgur
        })
      },
      fail: function (e) {
        console.log(e);
        wx.showModal({
          title: '提示',
          content: '上传失败',
          showCancel: false
        })
      },
      complete: function () {
      }
    })
    return imge;
  },

/*-------------------------------navigate-----------------------*/

_pagenavigate:function(navi){
  wx.navigateTo({
    url: navi,
    success: function(res) {
    },
    fail: function(res) {
      wx.showLoading({
        title: '加载中',
      }),
      setTimeout(function () {
        wx.hideLoading()
      }, 2000)
    },
    complete: function(res) {},
  })
},


/*-------------------------------navigate---------end-----------*/


  _getSystemInfo: function (options) {
    wx.getSystemInfo({
      success: function (res) {
        typeof options.success === 'function' && options.success(res);
      },
      fail: function (res) {
        typeof options.fail === 'function' && options.fail(res);
      },
      complete: function (res) {
        typeof options.complete === 'function' && options.complete(res);
      }
    });
  },
  //获取系统信息


  reLaunch: function (options) {
    wx.reLaunch({
      url: options.url,
      success: options.success,
      fail: options.fail,
      complete: options.complete
    })
  },
  switchToTab: function (url) {
    wx.switchTab({
      url: url
    });
  },
  turnBack: function (options) {
    options = options || {};
    wx.navigateBack({
      delta: options.delta || 1
    });
  },
  navigateToXcx: function (appid) {
    let that = this;
    if (wx.navigateToMiniProgram) {
      wx.navigateToMiniProgram({
        appId: appid,
      fail: function (res) {
        if (res.errMsg != 'chooseImage:fail cancel'){
          that.showModal({
            content: '' + res.errMsg
          })
        }
      }
      });
    } else {
      this.showUpdateTip();
    }
  },

  
  
 
  chooseVideo: function (callback, maxDuration) {
    wx.chooseVideo({
      sourceType: ['album', 'camera'],
      maxDuration: maxDuration || 60,
      camera: ['front', 'back'],
      success: function (res) {
        typeof callback == 'function' && callback(res.tempFilePaths[0]);
      }
    })
  },
  chooseImage: function (callback, count) {
    var that = this;
    wx.chooseImage({
      count: count || 1,
      sizeType: ['original', 'compressed'],
      sourceType: ['album', 'camera'],
      success: function (res) {
        var tempFilePaths = res.tempFilePaths,
            imageUrls = [];

        that.showToast({
          title: '提交中...',
          icon: 'loading',
          duration: 10000
        });
        for (var i = 0; i < tempFilePaths.length; i++) {
          wx.uploadFile({
            url : that.globalData.siteBaseUrl+ '/index.php?r=AppData/uploadImg',
            filePath: tempFilePaths[i],
            name: 'img_data',
            success: function (res) {
              var data = JSON.parse(res.data);
              if (data.status == 0) {
                imageUrls.push(data.data);
                if (imageUrls.length == tempFilePaths.length) {
                  that.hideToast();
                  typeof callback == 'function' && callback(imageUrls);
                }
              } else {
                that.hideToast();
                that.showModal({
                  content: data.data
                })
              }
            },
            fail: function (res) {
              that.hideToast();
              that.showModal({
                content: '' + res.errMsg
              });
            }
          })
        }
      },
      fail: function (res) {
        if (res.errMsg != 'chooseImage:fail cancel'){
          that.showModal({
            content: '' + res.errMsg
          })
        }
      }
    })
  },
  previewImage: function (options) {
    wx.previewImage({
      current: options.current || '',
      urls: options.urls || [options.current]
    })
  },
  playVoice: function (filePath) {
    wx.playVoice({
      filePath: filePath
    });
  },
  pauseVoice: function () {
    wx.pauseVoice();
  },
  countUserShareApp: function () {
    this.sendRequest({
      url: '/index.php?r=AppShop/UserShareApp'
    });
  },



  scanCode: function (options) {
    options = options || {};
    wx.scanCode({
      onlyFromCamera: options.onlyFromCamera || false,
      success: options.success,
      fail: options.fail,
      complete: options.complete
    })
  },
  pageScrollTo: function (scrollTop) {
    if (wx.pageScrollTo) {
      wx.pageScrollTo({
        scrollTop: scrollTop
      });
    } else {
      this.showUpdateTip();
    }
  },
  getAuthSetting: function () {
    wx.getSetting({
      success: function (res) {
        return res.authSetting;
      },
      fail: function () {
        return {};
      }
    })
  },
  getStorage: function (options) {
    options = options || {};
    wx.getStorage({
      key: options.key || '',
      success: function (res) {
        typeof options.success === 'function' && options.success(res);
      },
      fail: function () {
        typeof options.fail === 'function' && options.fail();
      },
      complete: function () {
        typeof options.complete === 'function' && options.complete();
      }
    })
  },
  setStorage: function (options) {
    options = options || {};
    wx.setStorage({
      key: options.key || '',
      data: options.data || '',
      success: function () {
        typeof options.success === 'function' && options.success();
      },
      fail: function () {
        typeof options.fail === 'function' && options.fail();
      },
      complete: function () {
        typeof options.complete === 'function' && options.complete();
      }
    })
  },
  removeStorage: function (options) {
    options = options || {};
    wx.removeStorage({
      key: options.key || '',
      success: function () {
        typeof options.success === 'function' && options.success();
      },
      fail: function () {
        typeof options.fail === 'function' && options.fail();
      },
      complete: function () {
        typeof options.complete === 'function' && options.complete();
      }
    })
  },
//---------------跳转定时
  naviSlect: function (that,navi) {
    var page=this;
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
  /**
   *  日期选择是否符合要求
   */
  DateJudge: function (optiondate1, optiondate2){
    var arraydate1 = new Date(Date.parse(optiondate1));
    var arraydate2 = new Date(Date.parse(optiondate2));
    var iDays = parseInt(arraydate2 - arraydate1);
    if (iDays<0)return -1;
    else return 0;
  },
/**
 * 判断日期与当前日期的距离
 */
  infodata: function (that, time_view, data) {
    that.setData({
      [time_view]: data
    })
  },

  DateSelect: function (optiondate){
    //callback(that,time_view,IDate);
    var currenttime = new Date(util.formatTime());
    console.log(currenttime);
    var arraydate = new Date(Date.parse(optiondate));
    console.log(arraydate);
    var iDays = parseInt(Math.abs(currenttime - arraydate)/1000);
    console.log(iDays);
   if (iDays<0)
    {
      return -1;
    }
    else if (iDays > 0 && iDays<60){
      var iDays = iDays+"秒前";
      console.log(iDays);
      return IDays;
    }
    else if (iDays > 60 && iDays<3600){
      var IDate = parseInt(iDays/60)
      var IDate = IDate + "分钟前";
      console.log(IDate);
      return IDate;
    }
    else if (iDays > 3600 && iDays<86400){
      var IDate = parseInt(iDays / 3600)
      var IDate = IDate + "小时前";
      console.log(IDate);
      return IDate;
    }
    else if (iDays < 2592000 && iDays > 86400){
      var IDate = parseInt(iDays / 86400)
      var IDate = IDate + "天前";
      console.log(IDate);
      return IDate;
    }
   else if (iDays > 2592000 && iDays < 2592000*12 ){
      var IDate = parseInt(iDays / 2592000)
      var IDate = IDate + "月前";
      console.log(IDate);
      return IDate;
    }
   else if (iDays > 2592000 * 12){
     var IDate = parseInt(iDays / (2592000*12));
     var IDate = IDate + "年前";
     console.log(IDate);
     return IDate;
   }
 
   
  },
  /**
   * 打开地图
   */
  openlocate: function (longitude, latitude){
    wx.openLocation({
      latitude: latitude,
      longitude: longitude,
    })
  },
  _sendSessionKey: function (options) {
    var that = this;
    try {
      var key = wx.getStorageSync('session_key');
    } catch(e) {
      console.log('wx.getStorageSync session_key error');
      console.log(e);
    }

    if (!key) {
      console.log("check login key=====");
      this._login(options);

    } else {
      this.globalData.sessionKey = key;
      this.sendRequest({
        hideLoading: true,
        url: '/index.php?r=AppUser/onLogin',
        success: function (res) {
          if (!res.is_login) {
            that._login(options);
            return;
          } else if (res.is_login == 2) {
            that.globalData.notBindXcxAppId = true;
          }
          that._requestUserInfo(res.is_login, options);
        },
        fail: function (res) {
          console.log('_sendSessionKey fail');
          typeof options.fail == 'function' && options.fail();
        }
      });
    }
  },

  /**
   * 获取登陆态
   */
  _login: function (options) {
    var that = this;

    wx.login({
      success: function (res) {
        if (res.code) {
          that._sendCode(res.code, options);
        } else {
          console.log('获取用户登录态失败！' + res.errMsg)
        }
      },
      fail: function (res) {
        console.log('login fail: ' + res.errMsg);
      }
    })
  },
  getOpenId: function () {
    var that = this;
    wx.login({
      success: function (res) {
        wx.request({
          //获取openid接口  
          url: 'https://api.weixin.qq.com/sns/jscode2session',
          data: {
            appid: that.globalData.appId,
            secret: that.globalData.secret,
            js_code: res.code,
            grant_type: 'authorization_code'
          },

          header: {
            'content-type': 'application/x-www-form-urlencoded;charset=utf-8'
          },
          success: function (res) {
            console.log(res.data)
            var OPEN_ID = res.data.openid;//获取到的openid  
            var SESSION_KEY = res.data.session_key;//获取到session_key  
            console.log(OPEN_ID.length)
            console.log(SESSION_KEY.length)
            wx.setStorage({
              key: 'openid',
              data: res.data.openid,
            })
          },
          fail: function () {
            wx.showToast({
              title: '获取微信id失败',
              icon: "loading",
              duration: 2000
            })
          }
        })
      }
    })
  },
  weixinload: function (page,navi) {
    var that = this;
    wx.getSetting({
      success: res => {
        if (res.authSetting['scope.userInfo']) {
          // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
          if (!page.data.isBtnClicked) {
            that._pagenavigate(navi);
          }
          page.setData({
            isBtnClicked: true
          })
          setTimeout(function () {
            page.setData({
              isBtnClicked: false
            })
          }, 2000)
    
        }
        else {
          wx.showModal({
            title: '提示',
            content: '您尚未微信登录，点击确定即可登录报名',
            success: function (res) {
              if (res.confirm) {
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
                        that.globalData.userInfo = res.userInfo
                        that.globalData.nickName = res.userInfo.nickName
                        that.globalData.avatarUrl = res.userInfo.avatarUrl
                        that._pagenavigate(navi);
                      }
                    })
                  }
                })      
              }
            }
          })
        }
      }
    })
  },

  GetStoragekey:function(page,navi){
    var that=this;
  var messkey;
  wx.getStorage({
    key: 'rollkey',
    success: function (res) {
      wx.getStorage({
        key: 'messkey',
        success: function(r) {
          messkey=r.data;
          if (res.data != null) {
            var rollkey = res.data;
            wx.request({
              url: 'https://www.qinyu123456.xyz/WX/checkdenglutai.do',
              method: 'POST',
              data: {
                userid: rollkey,
                code: messkey
              },
              header: { 'content-type': 'application/x-www-form-urlencoded;charset=utf-8' },
              success: function (re) {
                if (re.data.message == 10010) {
                  that.globalData.sessionKey = re.data.code;
                  wx.setStorage({
                    key: 'messkey',
                    data: re.data.code
                  })

                  var a = 0;
                  if (!page.data.isBtnClicked) {
                    that._pagenavigate(navi);
                  }
                  page.setData({
                    isBtnClicked: true
                  })
                  setTimeout(function () {
                    page.setData({
                      isBtnClicked: false
                    })
                  }, 2000)
                  
                }
                else {
                  wx.showModal({
                    title: '提示',
                    content: '登录失效，请登录后重试',
                    success: function (resp) {
                      if (resp.confirm) {
                        var a = "/pages/R_roll/R_roll";
                        that._pagenavigate(a);
                      }
                    }
                  })
                }
              },
              fail: function (e) {
                wx.showModal({
                  title: '提示',
                  content: '网络错误，请登录后重试',
                  success: function (res) {
                    if (res.confirm) {
                      var a = "/pages/R_roll/R_roll";
                      that._pagenavigate(a);
                    }
                  }
                })
              }
            })
          }
          else {
            wx.showModal({
              title: '提示',
              content: '网络错误，请登录后重试',
              success: function (res) {
                if (res.confirm) {
                  var a = "/pages/R_roll/R_roll";
                  that._pagenavigate(a);
                }
              }
            })
          }
        },
      })

    },
    fail: function (e) {
      wx.showModal({
        title: '提示',
        content: '没有登录信息，请登陆后重试',
        success: function (res) {
          if (res.confirm) {
            var navi = "/pages/R_roll/R_roll";
            that._pagenavigate(navi);
          }
        }
      })
    }

  })
  },
  _sendCode: function (code, options) {
    var that = this;
    this.sendRequest({
      hideLoading: true,
      url: '/index.php?r=AppUser/onLogin',
      data: {
        code: code
      },
      success: function (res) {
        if (res.is_login == 2) {
          that.globalData.notBindXcxAppId = true;
        }
        that.setSessionKey(res.data);
        that._requestUserInfo(res.is_login, options);
      },
      fail: function (res) {
        console.log('_sendCode fail');
      }
    })
  },
  _requestUserInfo: function (is_login, options) {
    if (is_login == 1) {
      this._requestUserXcxInfo(options);
    } else {
      this._requestUserWxInfo(options);
    }
  },
  _requestUserXcxInfo: function (options) {
    var that = this;
    this.sendRequest({
      hideLoading: true,
      url: '/index.php?r=AppData/getXcxUserInfo',
      success: function (res) {
        if (res.data) {
          that.setUserInfoStorage(res.data);
        }
        that.setIsLogin(true);
        typeof options.success === 'function' && options.success();
      },
      fail: function (res) {
        console.log('_requestUserXcxInfo fail');
      }
    })
  },
 


  
 
//---------------------------------------page.eventance------------------------
 

  onPageShow: function () {
    let pageInstance = this.getAppCurrentPage();
    let that         = this;
    if (this.globalData.takeoutRefresh) {
      this.pageDataInitial();
      this.globalData.takeoutRefresh = false;
    } else {
      setTimeout(function () {
        that.setPageUserInfo();
      });
    }

    if (pageInstance.need_login && !this.getUserInfo().phone) {
      this.isLogin() 
      ? this.turnToPage('/pages/bindCellphone/bindCellphone')
      : this.goLogin({ 
          success: function () {
            !that.getUserInfo().phone && that.turnToPage('/pages/bindCellphone/bindCellphone'); 
          }
        });
    }
  },

  _bbsScrollFuc: function (compid) {
    let _this         = this;
    let pageInstance  = this.getAppCurrentPage();
    let bbsData       = pageInstance.data[compid];
    let bbs_idx_value = '';

    if (bbsData.content.isloading || bbsData.content.is_more == 0) {
      return ;
    }
    bbsData.content.isloading = true;

    if (bbsData.customFeature.ifBindPage && bbsData.customFeature.ifBindPage !== 'false') {
      if (pageInstance.page_form && pageInstance.page_form != 'none') {
        bbs_idx_value = pageInstance.page_form + '_' + pageInstance.dataId;
      } else {
        bbs_idx_value = pageInstance.page_router;
      }
    } else {
      bbs_idx_value = _this.getAppId();
    }
    _this.sendRequest({
      url: '/index.php?r=AppData/getFormDataList',
      method: 'post',
      data: {
        form: 'bbs',
        is_count: bbsData.customFeature.ifLike ? 1 : 0,
        page: bbsData.content.current_page + 1,
        idx_arr: {
          idx: 'rel_obj',
          idx_value: bbs_idx_value
        }
      },
      success: function (res) {
        let data = {},
            newData = {};
        data = res;

        data.data = bbsData.content.data.concat(res.data);
        data.isloading = false;

        newData[compid+'.content'] = data;
        pageInstance.setData(newData);
      },
      complete: function () {
        let newData = {};
        newData[compid+'.content.isloading'] = false;
        pageInstance.setData(newData);
      }
    });
  },
  onPageUnload: function () {
    let pageInstance = this.getAppCurrentPage();
    let downcountArr = pageInstance.downcountArr;
    if(downcountArr && downcountArr.length){
      for (var i = 0; i < downcountArr.length; i++) {
        downcountArr[i].clear();
      }
    }
  },
  tapPrevewPictureHandler: function (event) {
    this.previewImage({
      urls: event.currentTarget.dataset.imgarr instanceof Array ? event.currentTarget.dataset.imgarr : [event.currentTarget.dataset.imgarr],
    })
  },

  
 
  franchiseeScrollFunc: function (event) {
    let pageInstance = this.getAppCurrentPage();
    let compid       = event.target.dataset.compid;
    let curpage      = parseInt(event.target.dataset.curpage) + 1;
    let newdata      = {};
    let param        = {};

    if (pageInstance.requesting || !pageInstance.data[compid].is_more) {
      return;
    }
    pageInstance.requesting = true;

    if (pageInstance.franchiseeComps) {
      for (let index in pageInstance.franchiseeComps) {
        if (pageInstance.franchiseeComps[index].compid === compid) {
          param = pageInstance.franchiseeComps[index].param;
          break;
        }
      }
    }
    param.page = curpage;
    this.sendRequest({
      url: '/index.php?r=AppShop/GetAppShopByPage',
      data: param,
      method: 'post',
      success: function (res) {
        for(let index in res.data){
          let distance = res.data[index].distance;
          res.data[index].distance = util.formatDistance(distance);
        }
        newdata = {};
        newdata[compid + '.franchisee_data'] = pageInstance.data[compid].franchisee_data.concat(res.data);
        newdata[compid + '.is_more'] = res.is_more;
        newdata[compid + '.curpage'] = res.current_page;

        pageInstance.setData(newdata);
      },
      complete: function () {
        setTimeout(function () {
          pageInstance.requesting = false;
        }, 300);
      }
    })
  },
  seckillScrollFunc: function (event) {
    let pageInstance = this.getAppCurrentPage();
    let compid       = typeof event == 'object' ? event.currentTarget.dataset.compid : event;
    let compData     = pageInstance.data[compid];
    let curpage      = compData.curpage + 1;
    let customFeature = compData.customFeature;
    let _this        = this;
    let newdata      = {};
    let param        = {};

    if(!compData.is_more && typeof event == 'object' && event.type == 'tap'){
      _this.showModal({
        content: '已经加载到最后了'
      });
    }
    if (pageInstance.requesting || !compData.is_more) {
      return;
    }
    pageInstance.requesting = true;

    if (pageInstance.seckillOnLoadCompidParam) {
      for (let index in pageInstance.seckillOnLoadCompidParam) {
        if (pageInstance.seckillOnLoadCompidParam[index].compid === compid) {
          param = pageInstance.seckillOnLoadCompidParam[index].param;
          break;
        }
      }
    }
    param.page_size = 10;
    if(customFeature.vesselAutoheight == 1 && customFeature.loadingMethod == 1){
      param.page_size = +customFeature.loadingNum || 10;
    }
    param.page = curpage;
    _this.sendRequest({
      url: '/index.php?r=AppShop/GetGoodsList',
      data: param,
      method: 'post',
      success: function (res) {
        newdata = {};
        let rdata = res.data,
            downcountArr = pageInstance.data.downcountArr || [];

        for (let i = 0; i < rdata.length; i++) {
          let f = rdata[i].form_data,
              dc ,
              idx = (curpage-1) * param.page_size + i;

          f.downCount = {
            hours : '00' ,
            minutes : '00' ,
            seconds : '00'
          };
          if(f.seckill_start_state == 0){
            dc = _this.beforeSeckillDownCount(f , pageInstance , compid + '.goods_data[' + idx + '].form_data');
          }else if(f.seckill_start_state == 1){
            dc = _this.duringSeckillDownCount(f , pageInstance , compid + '.goods_data[' + idx + '].form_data');
          }
          downcountArr.push(dc);
        }
        newdata[compid + '.goods_data'] = compData.goods_data.concat(res.data);
        newdata[compid + '.is_more']    = res.is_more;
        newdata[compid + '.curpage']    = res.current_page;
        newdata.downcountArr = downcountArr;

        pageInstance.setData(newdata);
      },
      complete: function () {
        setTimeout(function () {
          pageInstance.requesting = false;
        }, 300);
      }
    })
  },
  changeCountRequert : {},


  clickBbsReplyBtn: function (event) {
    let dataset      = event.currentTarget.dataset;
    let pageInstance = this.getAppCurrentPage();
    let compid       = dataset.compid;
    let index        = dataset.index;
    let data         = {};

    data[compid+'.content.data['+index+'].showReply'] = !pageInstance.data[compid].content.data[index].showReply;
    pageInstance.setData(data);
  },
  
  searchList: function (event) {
    let dataset      = event.currentTarget.dataset;
    let pageInstance = this.getAppCurrentPage();
    let that         = this;
    let compid       = dataset.compid;
    let listid       = dataset.listid;
    let listType     = dataset.listtype;
    let form         = dataset.form;
    let keyword      = pageInstance.keywordList[compid];
    let targetList   = '';
    let index        = '';

    if(listType === 'list-vessel'){
      for (index in pageInstance.list_compids_params) {
        if (pageInstance.list_compids_params[index].param.id === listid) {
          pageInstance.list_compids_params[index].param.page = 1;
          targetList = pageInstance.list_compids_params[index];
          break;
        }
      }
    }

    if(listType === 'goods-list'){
      for (index in pageInstance.goods_compids_params) {
        if (pageInstance.goods_compids_params[index].param.id === listid) {
          pageInstance.goods_compids_params[index].param.page = 1;
          targetList = pageInstance.goods_compids_params[index];
          break;
        }
      }
    }

    if(listType === 'franchisee-list'){
      for (index in pageInstance.franchiseeComps) {
        if (pageInstance.franchiseeComps[index].param.id === listid) {
          pageInstance.franchiseeComps[index].param.page = 1;
          targetList = pageInstance.franchiseeComps[index];
          break;
        }
      }
    }

    let url = '/index.php?r=appData/search';
    let param = {"search":{"data":[{"_allkey":keyword,"form": form}],"app_id":targetList.param.app_id}};

    if(listType === 'franchisee-list'){
      let info = this.getLocationInfo();
      param.search.longitude = info.longitude;
      param.search.latitude = info.latitude;
    }

    this.sendRequest({
      url: url,
      data: param,
      success: function (res) {
        if(res.data.length == 0){
          setTimeout(function () {
            that.showToast({
              title: '没有找到与'+keyword+'相关的内容',
              duration: 2000
            });
          },0)
          return;
        }
        if (res.status == 0) {
          let newdata = {};
          if (listType === "goods-list") {
            newdata[targetList.compid + '.goods_data'] = res.data;
          } else if (listType === 'list-vessel') {
            for (let j in res.data) {
              for (let k in res.data[j].form_data) {
                if (k == 'category') {
                  continue;
                }
                let description = res.data[j].form_data[k];
                if (!description) {
                  continue;
                }
                if (typeof description === 'string' && !/^http:\/\/img/g.test(description)) {
                  res.data[j].form_data[k] = that.getWxParseResult(description);
                }
              }
            }
            newdata[targetList.compid + '.list_data'] = res.data;
          } else if (listType === 'franchisee-list') {
            for(let index in res.data){
              let distance = res.data[index].distance;
              res.data[index].distance = util.formatDistance(distance);
            }
            newdata[targetList.compid + '.franchisee_data'] = res.data;
          }

          newdata[targetList.compid + '.is_more']   = res.is_more;
          newdata[targetList.compid + '.curpage']   = 1;

          pageInstance.setData(newdata);
        }
      },
      fail: function (err) {
        console.log(err);
      }
    })
  },




  //---------------------------------------page.eventance------------------------

 
  getAssessList: function (param) {
    param.url = '/index.php?r=AppShop/GetAssessList';
    this.sendRequest(param);
  },
  getOrderDetail: function (param) {
    param.url = '/index.php?r=AppShop/getOrder';
    this.sendRequest(param);
  },
 











  /**
   *  全局参数get、set部分 start
   *  
   */

  // 获取首页router
  getHomepageRouter: function () {
    return this.globalData.homepageRouter;
  },
  getAppId: function () {
    return this.globalData.appId;
  },
  getDefaultPhoto: function () {
    return this.globalData.defaultPhoto;
  },
  getSessionKey: function () {
    return this.globalData.sessionKey;
  },
  setSessionKey: function (session_key) {
    this.globalData.sessionKey = session_key;
    this.setStorage({
      key: 'session_key',
      data: session_key
    })
  },
  getUserInfo: function () {
    return this.globalData.userInfo;
  },

  setPageUserInfo: function () {
    let currentPage = this.getAppCurrentPage();
    let newdata     = {};

    newdata['userInfo'] = this.getUserInfo();
    currentPage.setData(newdata);
  },
  getAppCurrentPage: function () {
    var pages = getCurrentPages();
    return pages[pages.length - 1];
  },
  getWaimaiTotalPrice: function () {
    return this.globalData.waimaiTotalPrice;
  },
  getTabPagePathArr: function () {
    return JSON.parse(this.globalData.tabBarPagePathArr);
  },
  getWxParseOldPattern: function () {
    return this.globalData.wxParseOldPattern;
  },
  getWxParseResult: function (data, setDataKey) {
    var page = this.getAppCurrentPage();
    return WxParse.wxParse(setDataKey || this.getWxParseOldPattern(),'html', data, page);
  },
  getAppTitle: function () {
    return this.globalData.appTitle;
  },
  getAppDescription: function () {
    return this.globalData.appDescription;
  },
  setLocationInfo: function (info) {
    this.globalData.locationInfo = info;
  },
  getLocationInfo: function () {
    return this.globalData.locationInfo;
  },
  getSiteBaseUrl: function () {
    return this.globalData.siteBaseUrl;
  },
  getUrlLocationId: function () {
    return this.globalData.urlLocationId;
  },
  getPreviewGoodsInfo: function () {
    return this.globalData.previewGoodsOrderGoodsInfo;
  },
  setPreviewGoodsInfo: function (goodsInfoArr) {
    this.globalData.previewGoodsOrderGoodsInfo = goodsInfoArr;
  },
  getGoodsAdditionalInfo: function () {
    return this.globalData.goodsAdditionalInfo;
  },
  setGoodsAdditionalInfo: function (additionalInfo) {
    this.globalData.goodsAdditionalInfo = additionalInfo;
  },
  getIsLogin: function () {
    return this.globalData.isLogin;
  },
  setIsLogin: function (isLogin) {
    this.globalData.isLogin = isLogin;
  },

  setSystemInfoData: function (res) {
    this.globalData.systemInfo = res;
  },

  globalData:{
    appId: 'wx8c8465b0c0b49cbe',
    secret: "a8496788f7bae61665422a3c01c2ade7",
    tabBarPagePathArr: '["/pages/page10000/page10000","/pages/page10017/page10017","/pages/page10020/page10020","/pages/page10002/page10002"]',
    homepageRouter: 'page10000',
    formData: null,
    systemInfo: null,
    sessionKey: '',
    notBindXcxAppId: false,
    waimaiTotalNum: 0,
    waimaiTotalPrice: 0,
    takeoutShopInfo: {},
    takeoutRefresh : false,
    isLogin: false,


    userInfo: {},
    nickName: '',
    avatarUrl: '',
    Rollcode: '',
    phonenumber: null,
    password: null,
    currentCity: '—',
    locationInfo: {
      latitude: '',
      longitude: '',
      address: '',

    PromotionUserToken: '',
    previewGoodsOrderGoodsInfo: [],  
    goodsAdditionalInfo: {},  
    urlLocationId:'',
    wxParseOldPattern: '_listVesselRichText_',
    cdnUrl: 'http://cdn.jisuapp.cn',
   // defaultPhoto: 'http://cdn.jisuapp.cn/zhichi_frontend/static/webapp/images/default_photo.png',
    siteBaseUrl:'',
    appTitle: '新梦想团队',
    appDescription: '我的应用',
  }
  }
})

