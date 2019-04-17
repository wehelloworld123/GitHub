// pages/advertiser/advertiser.js
var app=getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    Array: [],
    "hidden":true,
    "Hidden":true,
    isBtnClicked:false,
    isInfoclick:false,
    "pageurl18": {
      "realurl1": "/pages/advertiserdetil/advertiserdetil",
      "realurl2": "/pages/eventcontenttwo/eventcontenttwo"
    },
    isBtnClicked: false,
    "list1": {
      "type": "list",
      "content": [
        /*{
          "pic": "http://594013.freep.cn/594013/deafwr.jpg",
          "title": "关爱孤独老人活动",
          "sponsor": "城市活动中心",
          "money": "10000元",
          "timeinputone": "2016-11-18 8",
          "timeinputtwo": "2016-11-20 8",
          "setup": "公益型",
          "detil": "为了关爱周围养老院的空巢老人，城市活动中心拟主办一场相关活动，有愿意主动承办活动的组织或单位可联系本中心",
          "phone": '15927306393'
        },
        {
          "pic": "http://pic.58pic.com/58pic/12/71/94/09i58PICGmb.jpg",
          "title": "花样童年，百变人生”活动公告",
          "sponsor": "北京义工联盟",
          "money": "8000元",
          "timeinputone": "2017-5-24 7",
          "timeinputtwo": "2017-11-20 10",
          "setup": "公益型",
          "detil": " 梦想有多重要，现实有多残酷我不想去计较。拟寻找一家活动场地开展本次义工招募活动，有意向者可致电本单位",
          "phone": '133****2491'
        }*/
      ]
    }
  },


  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var city = app.globalData.currentCity;
    var that = this;
    wx.request({
      url: 'https://www.qinyu123456.xyz/WX/returnadvertisers.do',
   
      data:{
        "XX":"jiazai",
        "city": city,
        "ID": 0
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded;charset=utf-8'
      },
      success: function (res) {
        var v = res.data.advinfo;
        //var query_clone = JSON.parse(decodeURIComponent(JSON.stringify(res.data)));
        //var v = decodeURIComponent(res.data.advinfo);
        var j = v.length;
        if(j<=0){
          that.setData({
            hidden: false,
          })
        }else{
        var an = that.data.Array;
        var content_adv = that.data.list1.content;
        for (var i = 0; i < j; i++) {
          an.push(res.data.advinfo[i]);
        }
        for (var i = 0; i < j; i++) {
          content_adv.push(an[i]);
        }
        for (var i = 0; i < j; i++) {
          var en = "list1.content[" + i + "]";
          that.setData({
            [en]: an[i],
          })
        }
        console.log(content_adv)
        var ary = that.data.Array;
        ary.splice(0, ary.length);
      }
      },
      fail: function (e) {
        console.log(e);
        wx.showLoading({
          title: '加载失败',
        })
        setTimeout(function(){
          wx.hideLoading();
        },1500)
      }
      
    })
    if (that.data.list1.content.length == 0) {
      that.setData({
        isInfoclick: true
      })
    }
    else {
      that.setData({
        isInfoclick: false
      })
    }
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    var context = wx.createCanvasContext('firstCanvas')

    context.setStrokeStyle("#00ff00")
    context.setLineWidth(5)
    context.rect(0, 0, 200, 200)
    context.stroke()
    context.setStrokeStyle("#ff0000")
    context.setLineWidth(2)
    context.moveTo(160, 100)
    context.arc(100, 100, 60, 0, 2 * Math.PI, true)
    context.moveTo(140, 100)
    context.arc(100, 100, 40, 0, Math.PI, false)
    context.moveTo(85, 80)
    context.arc(80, 80, 5, 0, 2 * Math.PI, true)
    context.moveTo(125, 80)
    context.arc(120, 80, 5, 0, 2 * Math.PI, true)
    context.stroke()
    context.draw()
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
    var that = this;
    var city = app.globalData.currentCity;
    var content_AS = that.data.list1.content;
    var k_AS =parseInt(content_AS.length);
    var en_AS = content_AS[k_AS-1].id;
    var page=0;
    wx.showNavigationBarLoading() //在标题栏中显示加载
    // 获取数据的方法，具体怎么获取列表数据大家自行发挥
    //var GetList = function(that){
    that.setData({
      hidden: true,
      Hidden:true
    });
    wx.request({
      url:  'https://www.qinyu123456.xyz/WX/returnadvertisers.do',

      data: {
        "XX":"shuaxin",
        "city":city,
        "ID": en_AS
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded;charset=utf-8'
      }, 
      success: function (res) {
        //--------------------将res.data写入Array数组
        var v = res.data.advinfo;
        var query_clone = JSON.parse(decodeURI(JSON.stringify(res.data.advinfo)));
        //var v = decodeURIComponent(res.data.advinfo);
        var j=v.length;
        var an = that.data.Array;
        for(var i=0;i<j;i++){
          an.push(res.data.advinfo[i]);
        }
        //--------------------判断 Array数组的长度
        var an1 = that.data.Array;
        var j = an1.length;

        var content = that.data.list1.content;
        if(j<=0){
          that.setData({
            Hidden:false,
          })
          wx.hideNavigationBarLoading()
        }
        else{
          for (var i = 0; i < j; i++) {
            an.push(res.data.advinfo[i]);
          }
          for (var i = 0; i < j; i++) {
            content.push(an[i]);
          }
          var k = parseInt(content.length);
          var f=0;
          for (var i = j; i < k; i++) {
            var en = "list1.content[" + i + "]";
            that.setData({
              [en]: an[f],
            })
            if(f<k) f++;
          }
          console.log(content)
          var ary = that.data.Array;
          ary.splice(0, ary.length);
          wx.hideNavigationBarLoading()
        }
  },
  fail:function(e){
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
    })
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  },

  _pagenavigateer: function (e) {
    var that = this;
    var messkey;

    var kind = e.target.id;
    if (kind == "bn2") {

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
                      if (!that.data.isBtnClicked) {
                        var navi = that.data.pageurl18.realurl2;
                        app._pagenavigate(navi);
                      }
                      that.setData({
                        isBtnClicked: true
                      })
                      setTimeout(function () {
                        that.setData({
                          isBtnClicked: false
                        })
                      }, 2000)
                    }else{
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
      //var navi = this.data.pageurl18.realurl1;
      if (!that.data.isBtnClicked) {
        var navi = "/pages/advertiserdetil/advertiserdetil"
        var a = parseInt(e.currentTarget.id)
        var navi2 = navi + "?title=" + that.data.list1.content[a].title + "&sponsor=" + that.data.list1.content[a].sponsor + "&time1=" + that.data.list1.content[a].timeinputone + "&time2=" + that.data.list1.content[a].timeinputtwo + "&setup=" + that.data.list1.content[a].setup + "&money=" + that.data.list1.content[a].money + "&detil=" + that.data.list1.content[a].detil + "&pic=" + that.data.list1.content[a].pic + "&phone=" + that.data.list1.content[a].phone;
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
  }
})