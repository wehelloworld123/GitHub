// pages/scheme/scheme.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    Array: [],
    "Hidden":true,
    "iteminput":'',
    "src": 'http://img.suiyiyun.cn/595095/house.jpg',
    "content":[

    ]
  
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      iteminput:options.iteminput
      //iteminput:"消费助学行动"
    })
    var list = this.data.content;
    var l=list.length;
    if(l==0){
      this.setData({
        Hidden:true
      })
    }
    else{
      this.setData({
        Hidden:false
      })
    }
    //-------------------
    var that = this;
    var page = 0;
    /*wx.showNavigationBarLoading() //在标题栏中显示加载
    // 获取数据的方法，具体怎么获取列表数据大家自行发挥
    //var GetList = function(that){
    wx.request({
      url: 'https://www.lkand.xyz/qin/WebRoot/Search.jsp',
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
          url: 'https://www.lkand.xyz/qin/WebRoot/json/xieru.json',
          method: "GET",
          data: {},
          header: {
            'content-type': 'application/json'  //这里注意POST请求content-type是小写，大写会报错
          },
          success: function (r) {
            //var an = that.data.Array;
            var an=that.data.Array;                   
            an.push(r.data.schemeinfo[0]);
            var arr = that.data.content;
            arr.push(an);
            var k2 = arr.length;
            if(k2==0){
              var a1 = "content[" + 0 + "].title"
              var a2 = "content[" + 0 + "].timestart"
              var a3 = "content[" + 0 + "].place"
            }else{
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
    var that=this;
    var page=0;
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
    });

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  }
})