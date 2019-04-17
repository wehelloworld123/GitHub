// pages/eventissue/eventissue.js
var app=getApp();
Page({
  /**
   * 页面的初始数据
   */
  data: {
    "pageurl7": {
      "realurl1": "/pages/advertiser/advertiser",
      "realurl2": "/pages/bar/bar",
      "realurl3": "/pages/Jointrelease/Jointrelease"
    },
    "list":{
      "content":[{
        "backcolor":'background-color:#ffff66',
    
        "style":'width: 45px; height: 45px;',
        "src":'/images/fabu.png',
        "atext":"预办活动",
        "style1":'width: 60rpx; height: 60rpx;',
        "src1":'/images/gengduo.png',
        "Lineindex":'4',
        "Itemindex": 'a'
      },
        {
          "backcolor": 'background-color:pink',
  
          "style": 'width: 45px; height: 45px;',
          "src": '/images/jiuba.png',
          "atext": "活动招募",
          "style1": 'width: 60rpx; height: 60rpx;',
          "src1": '/images/gengduo.png',
          "Lineindex": '5',
          "Itemindex":'b'
        },
        {
          "backcolor": 'background-color:#66FFFF',

          "style": 'width: 45px; height: 45px;',
          "src": '/images/book.png',
          "atext": "活动发布",
          "style1": 'width: 60rpx; height: 60rpx;',
          "src1": '/images/gengduo.png',
          "Lineindex": '6',
          "Itemindex": 'c'
        },
      ]
    },
    selectPage:''

  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var b=0;
    this.setData({
      selectPage:options.x
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
  onLoad: function (options) {
    this.setData({
      title: options.title
    })
  },
  _pagenavigatere: function (e) {
    var kind = e.target.id;

    var navi;
    switch (kind) {
      case "0": navi = this.data.pageurl7.realurl1; break;
      case "1": navi = this.data.pageurl7.realurl2; break;
      case "2": navi = this.data.pageurl7.realurl3; break;
      case "4": navi = this.data.pageurl7.realurl1; break;
      case "5": navi = this.data.pageurl7.realurl2; break;
      case "6": navi = this.data.pageurl7.realurl3; break;
      case "a": navi = this.data.pageurl7.realurl1; break;
      case "b": navi = this.data.pageurl7.realurl2; break;
      case "c": navi = this.data.pageurl7.realurl3; break;
      default: break;
    }
    app._pagenavigate(navi);
  }
})