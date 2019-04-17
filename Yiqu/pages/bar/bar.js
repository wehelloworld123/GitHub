// pages/mokuaibar/mokuaibar.js
var app=getApp();
var util = require("../../utils/util.js");
Page({
  /**
   * 页面的初始数据
   */
  data: {
    Array: [],
    windowHeight: 0,//获取屏幕高度  
    refreshHeight: 0,//获取高度  
    refreshing: false,//是否在刷新中  
    refreshAnimation: {}, //加载更多旋转动画数据  
    refreshAnimation_button:{},//发布信息按钮动画
    clientY: 0,//触摸时Y轴坐标 ,
    isModal:false,
   'b':'1',
   hidden:true,
   showTishi:false,
   isBtnClicked:false,//定时跳转
   isInfoclick:false,

    "pageurl17": {
      "realurl1": "/pages/bardetil/bardetil",
      "realurl2": "/pages/barrelease/barrelease"
    },
    "list1": {
      "type": "list",
    content: [{
        "title": "丽笙星空酒吧免费承办",
        "address": "上海黄浦区南京西路88号新世界丽笙大酒店47楼",
        "longitude": '',
        "latitude": '',
        "time1": "2016-11-6 8",
        "time2": "2016-11-8 10",
        "pic": "http://594013.freep.cn/594013/timg.jpg",
        "type": "公益型",
        "number": "150人",
        "phone": "13986741806",
        "detil": "本吧占地300平方，内部设备齐备，人流量足。能够承担相关的公益活动，如有需要可联系本酒吧",
        "id":''
      },
       {
        "title": "外滩18号可预约场地",
        "address": "黄浦区中山东一路18号外滩18号1楼",
        "longitude": '',
        "latitude": '',
        "time1": "2017-10-17 4",
        "time2": "2017-10-18 10",
        "pic": "http://594013.freep.cn/594013/dadaada.jpg",
        "type": "公益型",
        "number": "50人",
        "phone": "18186428511",
        "detil": "场地面积大约100平，内部装修以典雅，清幽为主，是一所小型酒吧，十分愿意在非经营时间段承办各位公益活动",
        "id": ''
      },
    {
        "title": "外滩18号可预约场地",
        "address": "黄浦区中山东一路18号外滩18号1楼",
         "longitude": '',
        "latitude": '',
        "time1": "2017-10-17",
        "time2": "2017-10-18",
        "pic": "http://594013.freep.cn/594013/dadaada.jpg",
        "type": "公益型",
        "number": "50人",
        "phone": "18186428511",
        "detil": "场地面积大约100平，内部装修以典雅，清幽为主，是一所小型酒吧，十分愿意在非经营时间段承办各位公益活动",
        "id": ''
      }
      ]
    }
  
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that =this;
   /* wx.getSystemInfo({
      success: function(res) {
        that.setData({
          windowHeight:res.windowHeight
        })
        console.log("屏幕高度" + res.windowHeight);
      },
    })*/
    
    app.getwindowHeight(that.data.windowHeight,that);
    var city = app.globalData.currentCity;
   wx.request({
     //url: 'https://www.qinyu123456.xyz/WX/returnbars.do',
      data:{
        "XX":"jiazai",
        "city": city,
        "ID":"0"
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded;charset=utf-8'
      },
      success:function(res){
        var v = res.data.barinfo;
        //var query_clone = JSON.parse(decodeURIComponent(JSON.stringify(res.data)));
        var k=v.length;
        if(k>0){
        var content_bar = that.data.list1.content
        var an = that.data.Array;
        for (var j = 0; j < k; j++) {
          content_bar.push(res.data.barinfo[j]);
        }
        for (var j = 0; j < k; j++) {
          an.push(res.data.barinfo[j]);
        }
        for(var i=0;i<k;i++){
          var en = "list1.content[" + i + "]";
          that.setData({
            [en]: an[i]
          })
        }
        }
        else{
          that.setData({
            hidden: false,
            isInfoclick: true,
          })
        }
        var ary = that.data.Array;
        ary.splice(0, ary.length);
      },
      fail: function (e) {
        console.log(e);
        wx.showLoading({
          title: '加载失败',
        })
        setTimeout(function () {
          wx.hideLoading();
        }, 1500)
      }
    })
   if (that.data.list1.content.length==0){
     that.setData({
       isInfoclick: true
     })
   }
   else{
     that.setData({
       isInfoclick: false
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
   /* var that = this;
    var content = that.data.list1.content;
    var k = k = parseInt(content.length);
    var k1 = content[k - 1].id;
    var page = 0;
    var city = app.globalData.currentCity;
    wx.showNavigationBarLoading() //在标题栏中显示加载
    // 获取数据的方法，具体怎么获取列表数据大家自行发挥
    //var GetList = function(that){
    that.setData({
      hidden: true
    });
    wx.request({
      url: 'https://www.qinyu123456.xyz/WX/returnbars.do',

      data: {
        "XX":"shuaxin",
        "city":"武汉市",
        "ID":k1
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded;charset=utf-8'
      },
      success: function (res) {
        //--------------------将res.data写入Array数组
        var v = res.data.barinfo;
        //var query_clone = JSON.parse(decodeURIComponent(JSON.stringify(res.data)));
        //var v = decodeURIComponent(res.data.advinfo);
        var j = v.length;
        if (j<= 0) {
          that.setData({
            hidden: false
          })
        }
        //----------------------将Array放入循环数组
        else {
          var an = that.data.Array;
          content = that.data.list1.content;
          var content_length=content.length;
      
          for (var i = 0; i < j; i++) {
            an.push(res.data.barinfo[i]);
          }
          for (var i = 0; i < j; i++) {
            content.push(res.data.barinfo[i]);
          }
          var k = parseInt(content.length);
          var f = 0;
          for (var i = content_length; i < k; i++) {
            var en = "list1.content[" + i + "]";
            that.setData({
              [en]: an[f],
            })
            if (f < k) f++;
          }
          console.log(content)

        }
      },
      fail: function () {
        setTimeout(function () {
          wx.hideNavigationBarLoading()
        }, 4000);

        setTimeout(function () {
          wx.showLoading({
            title: '刷新失败',
          })
        }, 3000)

        setTimeout(function () {
          wx.hideLoading()
        }, 5000)
      }

    });
    var ary = that.data.Array;
    ary.splice(0, ary.length);
    wx.hideNavigationBarLoading()*/
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  },
  flash_tishi:function(e){
    this.setData({
      showTishi:true
    })
  },
  _pagenavigateer: function (e) {
    var that = this
    var kind = e.target.id;
    var messkey;
    if(kind=="bn2"){
      wx.getStorage({
        key: 'rollkey',
        success: function (res) {
          wx.getStorage({
            key: 'messkey',
            success: function (re) {
              messkey = re.data;
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
                  success: function (r) {
                    if (r.data.message == 10010) {
                      wx.setStorage({
                        key: 'messkey',
                        data: r.data.code,
                      })
                      if (!that.data.isBtnClicked){
                      var navi = that.data.pageurl17.realurl2;
                      app._pagenavigate(navi);
                      }
                      that.setData({
                        isBtnClicked:true
                      })
                      setTimeout(function(){
                        that.setData({
                          isBtnClicked: false
                        })
                      },2000)
                    } else {
                      wx.showModal({
                        title: '提示',
                        content: '网络错误，请登录后重试',
                        success: function (res) {
                          if (res.confirm) {
                            var navi = "/pages/R_roll/R_roll";
                            app._pagenavigate(navi);
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
                          var navi = "/pages/R_roll/R_roll";
                          app._pagenavigate(navi);
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
                      var navi = "/pages/R_roll/R_roll";
                      app._pagenavigate(navi);
                    }
                  }
                })
              }
            },
            fail: function (e) {
              console.log(e);
              wx.showModal({
                title: '提示',
                content: '网络错误，请登录后重试',
                success: function (res) {
                  if (res.confirm) {
                    var navi = "/pages/R_roll/R_roll";
                    app._pagenavigate(navi);
                  }
                }
              })
            }
          })

        },
        fail: function (e) {
          wx.showModal({
            title: '提示',
            content: '没有登录信息，请登陆后重试',
            success: function (res) {
              if (res.confirm) {
                var navi = "/pages/R_roll/R_roll";
                app._pagenavigate(navi);
              }
            }
          })
        }

      })
    }
    else{
     if (!that.data.isBtnClicked) {
       var navi = this.data.pageurl17.realurl1;
       var a = parseInt(e.currentTarget.id)
       var navi2 = navi + "?ti=" + that.data.list1.content[a].title + "&address=" + that.data.list1.content[a].address + "&time1=" + that.data.list1.content[a].time1 + "&time2=" + that.data.list1.content[a].time2 + "&type1=" + that.data.list1.content[a].type + "&num=" + that.data.list1.content[a].number + "&phone=" + that.data.list1.content[a].phone + "&detil=" + that.data.list1.content[a].detil + "&pic=" + that.data.list1.content[a].pic + "&latitude=" + that.data.list1.content[a].latitude + "&longitude=" + that.data.list1.content[a].longitude;
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
    }
  },
/**
 * 滚动开始
 */
  scollStart: function (e) {
    var that=this;
    app.scollStart(e, that, that.data.clientY, that.data.refreshHeight);
},
  /**
   * 滚动结束
   */
  scollEnd: function (e) {
    var that=this;
    app.scollEnd(e, that, that.data.refreshHeight);
  },
  /**
 * 滚动结束
 */
  scollLower: function (e) {
    var that = this;
    var content = that.data.list1.content;
    var k = k = parseInt(content.length);
    var k1 = content[k - 1].id;
    var page = 0;
    var city = app.globalData.currentCity;
    if (that.data.refreshing) return;
    that.setData({
      refreshing: true,
      hidden: true
    });
    updateRefreshIcon.call(this);
    wx.request({
     // url: 'https://www.qinyu123456.xyz/WX/returnbars.do',

      data: {
        "XX": "shuaxin",
        "city": city,
        "ID": k1
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded;charset=utf-8'
      },
      success: function (res) {
        //--------------------将res.data写入Array数组
        var v = res.data.barinfo;
        //var query_clone = JSON.parse(decodeURIComponent(JSON.stringify(res.data)));
        //var v = decodeURIComponent(res.data.advinfo);
        var j = v.length;
        if (j <= 0) {
          wx.showToast({
            title: '已全部加载',
            icon: 'none',
            duration: 1000
          })
          that.setData({
            hidden: false
          })
        }
        //----------------------将Array放入循环数组
        else {
          var an = that.data.Array;
          content = that.data.list1.content;
          var content_length = content.length;

          for (var i = 0; i < j; i++) {
            an.push(res.data.barinfo[i]);
          }
          for (var i = 0; i < j; i++) {
            content.push(res.data.barinfo[i]);
          }
          var k = parseInt(content.length);
          var f = 0;
          for (var i = content_length; i < k; i++) {
            var en = "list1.content[" + i + "]";
            that.setData({
              [en]: an[f],
            })
            if (f < k) f++;
          }
          console.log(content)

        }
      },
      fail: function () {
        setTimeout(function () {
          wx.hideNavigationBarLoading()
        }, 4000);

        setTimeout(function () {
          wx.showLoading({
            title: '刷新失败',
          })
        }, 3000)

        setTimeout(function () {
          wx.hideLoading()
        }, 5000)
      },
      complete:function(){
        setTimeout(function () {
          that.setData({
            refreshing: true
          })
        }, 2500)
      }

    });
    var ary = that.data.Array;
    ary.splice(0, ary.length);

  }

})
/** 
 * 旋转上拉加载图标 
 */
function updateRefreshIcon() {
  var deg = 0;
  var that = this;
  console.log('旋转开始了.....')
  var animation = wx.createAnimation({
    duration: 1000,
  });

  var timer = setInterval(function () {
   if (!that.data.refreshing)
    clearInterval(timer);
    animation.rotateZ(deg).step();//在Z轴旋转一个deg角度  
    deg += 360;
    that.setData({
      refreshAnimation: animation.export()
    })
  }, 1000);

}

/** 
 * 旋转上拉加载图标 
 */
function updateInfoIcon() {
  var deg = 0;
  var that = this;
  console.log('旋转开始了.....')
  var animation = wx.createAnimation({
    duration: 1000
  });

  var timer = setInterval(function () {
    if (!that.data.refreshing)
      clearInterval(timer);
    animation.rotateZ(deg).step();//在Z轴旋转一个deg角度  
    deg += 360;
    that.setData({
      refreshAnimation_button: animation.export()
    })
  }, 1000);

}