// pages/personcenter/personcenter.js
var app=getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    isBtnClicked: false,
    avatarUrl1: '',
    username1: '',
    isUserinfo1: false,
    avatarUrl2: '',
    username2: '',
    isUserinfo2: false,


    copun_info: [{
      'src': '/images/integration.png',
      'title': '积分',
      'amount': '10',
      'font2': 'icon-rightarrow',
      'style': 'width:90rpx;height:90rpx'
    }, {
      'src': '/images/coupon.png',
      'title': '优惠券',
      'amount': '20',
      'font2': 'icon-rightarrow',
      'style': 'width:90rpx;height:90rpx'
    }],

    pageurl: {
      'realurl1': "/pages/userinfo/calendar/calendar",
      'realurl2': "/pages/tracecalogue/tracecalogue",
      'realurl3': "/pages/userinfo/treasure/treasure"
    },
    optional: [{
        'src': '/images/calendar.png',
        'content': '我的订单',
        'colorstyle':'color:rgb(50,50,50);',
        'font1_class': 'tourist icon-wodedingdan',
        'font2_class': 'ico-moon icon-rightarrow',
        'style': 'width:90rpx;height:90rpx'
      },
      {
        'src': '/images/linetrace.png',
        'content': '我的拼团',
        'colorstyle':'color:rgb(50,50,50);',
        'font1_class': 'tourist icon-pintuan',
        'font2_class': 'ico-moon icon-rightarrow',
      },
      {
        'src': '/images/zuanshi.png',
        'content': '我的日程',
        'colorstyle':'color:rgb(50,50,50);',
        'font1_class': 'tourist icon-riqi',
        'font2_class': 'ico-moon icon-rightarrow',
      },
      {
        'src': '/images/zuanshi.png',
        'content': '足迹记录',
        'colorstyle':'color:rgb(50,50,50);',
        'font1_class': 'tourist icon-zuji',
        'font2_class': 'ico-moon icon-rightarrow',
      },
      {
        'selectinfostyle':"margin-top:20rpx",
        'src': '/images/zuanshi.png',
        'content': '我的评价',
        'colorstyle':'color:rgb(50,50,50);',
        'font1_class': 'tourist icon-pingjia',
        'font2_class': 'ico-moon icon-rightarrow',
      },
      {
        'src': '/images/zuanshi.png',
        'content': '我的收藏',
        'colorstyle':'color:rgb(50,50,50);',
        'font1_class': 'tourist icon-shoucangfill',
        'font2_class': 'ico-moon icon-rightarrow',
      },
      /** 
      {
        'src': '/images/contact.png',
        'content': '联系客服',
        'colorstyle':'color:rgb(50,50,50);',
        'font1': 'ico-moon',
        'font2': 'icon-rightarrow',
      },
      */
    ]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    var that = this;
    wx.getUserInfo({
      success: res => {
        app.globalData.userInfo = res.userInfo;
        that.setData({

        })
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
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function() {

  },
  /**获取用户信息 */
  _getUserInfo: function (e) {
    var that = this;
    if (e.detail.errMsg == "getUserInfo:ok") {
      app.globalData.userInfo = e.detail.userInfo
      console.log(e);
      that.setData({
        avatarUrl1: e.detail.userInfo.avatarUrl,
        username1: e.detail.userInfo.nickName,
        isUserinfo1: true,
      })
    } else if (e.detail.errMsg == "getUserInfo:fail auth deny") {
      wx.showModal({
        title: '提示',
        content: '未授权将导致功能限制',
        showCancel: false
      })
    }
  },
})