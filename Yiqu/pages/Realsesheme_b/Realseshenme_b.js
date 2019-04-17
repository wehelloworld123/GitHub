// pages/Realsesheme_b/Realseshenme_b.js
var app=getApp();
Page({


  /**
   * 页面的初始数据
   */
  data: {
    Array: [],
    "Hidden": false,
    "iteminput": '',


    "content": [{
    
      
      
      canvas_id: 'myCanvas',
      envent_state: null, 
      img: '/images/file.png',
      iteminput: '消费助学行动',
      Etype: '',
      timeinputone: '2018-10-21 8',
      address: '长江大学地球科学学院',
      peoNab: '',
      sposor: '',
      detail: '',
    },
    {
      iteminput: '消费助学行动',
      timeinputone: '2018-10-21 8',
      address: '长江大学地球科学学院地信系办',
      canvas_id: 'myCanvas',
      envent_state: true,
      joinnumber: "50",
      img: '/images/house.jpg'
    },
    ],
    show: false,
    l_id: '',//数字下标
    ziti: "",//完成字体颜色
    ziti1: "",//删除字体颜色
    "key": '',
    "target_id": ''

  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    var page = 0;
    app.getOpenId();
    wx.getStorage({
      key: 'openid',
      success: function (res) {
        wx.request({
         // url: 'https://www.qinyu123456.xyz/WX/selectactivitybuopenid.do',
          method: "GET",
          data: {
            openid: res.data
          },
          header: {
            'content-type': 'application/json'  //这里注意POST请求content-type是小写，大写会报错
          },
          success: function (r) {
            var an = that.data.Array;
            var arr = that.data.content;
            var j = r.data.openid.length;
            if (j <= 0) {
              that.setData({
                Hidden: true
              })
            }
            else {
              that.setData({
                Hidden: false
              })

              for (var i = 0; i < j; i++) {
                an.push(r.data.openid[i]);
                arr.push(r.data.openid[i]);
              }
              //arr.push(an)
              for (i = 0; i < j; i++) {
                var a1 = "content[" + i + "]";

                that.setData({
                  [a1]: an[i],

                })
              }

              var ary = that.data.Array;
              ary.splice(0, ary.length);
              console.log(that.data.content);
              //an1.splice(0, an1.length);
              wx.hideNavigationBarLoading()
            }
          }
        })
      },
      fail: function () {
        setTimeout(function () {
          wx.hideNavigationBarLoading()
        }, 3000)
        wx.showLoading({
          title: '刷新失败',
        })
        setTimeout(function () {
          wx.hideLoading()
        }, 1000)
      }
    })
    var list = this.data.content;
    //-------------------
    wx.showNavigationBarLoading() //在标题栏中显示加载
    // 获取数据的方法，具体怎么获取列表数据大家自行发挥
    //var GetList = function(that){*/
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
    /*var that = this;
    var page = 0;
    wx.showNavigationBarLoading() //在标题栏中显示加载
    // 获取数据的方法，具体怎么获取列表数据大家自行发挥
    //var GetList = function(that){
    wx.request({
      url: 'http://192.168.1.113:8080/xieru/Search.jsp',
      method: "POST",
      data: {
        iteminput: that.data.iteminput
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded;charset=utf-8'   //这里注意POST请求content-type是小写，大写会报错
      },
      success: function (res) {
        console.log(res);
        wx.request({
          url: 'http://192.168.1.113:8080/xieru/json/xieru.json',
          method: "GET",
          data: {},
          header: {
            'content-type': 'application/json'  //这里注意POST请求content-type是小写，大写会报错
          },
          success: function (r) {
            //var an = that.data.Array;
            var an = that.data.Array;
            an.push(r.data.schemeinfo[0]);
            var arr = that.data.content;
            arr.push(an);
            var k2 = arr.length;
            if (k2 == 0) {
              var a1 = "content[" + 0 + "].title"
              var a2 = "content[" + 0 + "].timestart"
              var a3 = "content[" + 0 + "].place"
            } else {
              var a1 = "content[" + (k2 - 1) + "].title"
              var a2 = "content[" + (k2 - 1) + "].timestart"
              var a3 = "content[" + (k2 - 1) + "].place"
            }
            that.setData({
              [a1]: an[0].iteminput,
              [a2]: an[0].timeinputone,
              [a3]: an[0].address,
              Hidden: false
            })
            var ary = that.data.Array;
            ary.splice(0, ary.length);
            console.log(that.data.content);
            //an1.splice(0, an1.length);
            wx.hideNavigationBarLoading()
          }
        })
      },
      fail: function () {
        setTimeout(function () {
          wx.hideNavigationBarLoading()
        }, 3000)
        wx.showLoading({
          title: '刷新失败',
        })
        setTimeout(function () {
          wx.hideLoading()
        }, 1000)
      }
    });*/

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },
  touchset: function (e) {
    var messlist = e.target.dataset.abc;
    var id = this.data.content[messlist].canvas_id;
    var key = this.data.content[messlist].eventkey;
    console.log(e);
    this.setData({
      show: true,
      target_id: messlist,
      l_id: id,
      key: key
    })
  },
  button_compl: function () {
    var result = 'finish';
    var that = this;
    wx.request({
      url: 'https://www.qinyu123456.xyz/WX/changeeventtype.do',
      method: 'POST',
      data: {
        sheme: result,
        id: that.data.l_id,
        key: that.data.key
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded;charset=utf-8'   //这里注意POST请求content-type是小写，大写会报错
      },
      success: function (e) {
        if (e.data == 10001) {
          var id = that.data.target_id
          var envent_state = "content[" + id + "].eventstate";
          that.setData({
            [envent_state]: "1",
            show: false
          })
        }
        else {
          that.setData({
            show: false
          })
          wx.showLoading({
            title: '网络延迟',
          })
          setTimeout(function () {
            wx.hideLoading()
          }, 2000)
        }
      },
      fail: function (e) {
        that.setData({
          show: false,
          ziti: false
        })
        wx.showModal({
          title: '修改失败',
          content: '原因：' + e.errMsg,
          showCancel: false
        })
      }
    })
  },

  button_cancel: function () {
    this.setData({
      show: false,
      ziti: false
    })
  },
  cartoon: function () {
    this.setData({
      ziti: true
    })
  },
  cartoon2: function () {
    this.setData({
      ziti: false
    })
  },
  cartoon_d: function () {
    this.setData({
      ziti1: true
    })
  },
  cartoon_d2: function () {
    this.setData({
      ziti1: false
    })
  },
  navigateDetail: function (e) {
    var that = this;
    var messlist =parseInt(e.target.dataset.abc);
    var navi = "/pages/Realsesheme/Sheme_detial/Sheme_detial" + "?orderDetailType=2&iteminput" + that.data.content[messlist].iteminput + "&address=" + that.data.content[messlist].address + "&time1=" + that.data.content[messlist].timeinputone + "&Contact=" + that.data.content[messlist].Contact + "&Etype=" + that.data.content[messlist].Etype + "&img=" + that.data.content[messlist].img + "&peoNab=" + that.data.content[messlist].peoNab + "&sposor=" + that.data.content[messlist].sposor + "&detail=" + that.data.content[messlist].detail;
    app.naviSlect(that, navi);
  }
})