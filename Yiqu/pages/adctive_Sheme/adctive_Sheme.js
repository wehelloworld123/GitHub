var app=getApp();
Page({
  data: {
    "pageurl": {
      "realurl1": "/pages/Realsesheme/Realsesheme",
      "realurl2": "/pages/Realsesheme_a/Realsesheme_a",
      "realurl3": "/pages/Realsesheme_b/Realseshenme_b",

    },
    isBtnClicked: false,
    "list": {
      "content": [{
        "backcolor": 'background-color:#ffff66',
        "style": 'width: 45px; height: 45px;',
        "src": '/images/sign.png',
        "atext": "信息管理",
        "style1": 'width: 60rpx; height: 60rpx;',
        "src1": '/images/gengduo.png',
        "Lineindex": '7',
        "Itemindex": 'd'
      },
        {
          "backcolor": 'background-color:pink',
          "style": 'width: 45px; height: 45px;',
          "src": '/images/file.png',
          "atext": "活动管理",
          "style1": 'width: 60rpx; height: 60rpx;',
          "src1": '/images/gengduo.png',
          "Lineindex": '8',
          "Itemindex": 'e'
        },
       /* {
          "backcolor": 'background-color:#66FFFF',

          "style": 'width: 45px; height: 45px;',
          "src": '/images/analysis.png',
          "atext": "活动计划",
          "style1": 'width: 60rpx; height: 60rpx;',
          "src1": '/images/gengduo.png',
          "Lineindex": '9',
          "Itemindex": 'f'
        },*/
      ]
    },

  
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
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
  _pagenavigatere: function (e) {
    var kind = e.target.id;

    var navi;
    switch (kind) {
      case "7": { navi = this.data.pageurl.realurl1;app.GetStoragekey(this,navi);}; break;
      case "8": { navi = this.data.pageurl.realurl2; app.GetStoragekey(this,navi);}; break;
      case "9": { navi = this.data.pageurl.realurl3; app.weixinload(this,navi);}; break;
      case "0": { navi = this.data.pageurl.realurl1; app.GetStoragekey(this,navi);}; break;
      case "1": { navi = this.data.pageurl.realurl2; app.GetStoragekey(this,navi);}; break;
      case "2": { navi = this.data.pageurl.realurl3; app.weixinload(this,navi);}; break;
      case "d": { navi = this.data.pageurl.realurl1; app.GetStoragekey(this,navi);}; break;
      case "e": { navi = this.data.pageurl.realurl2; app.GetStoragekey(this,navi);}; break;
      case "f": { navi = this.data.pageurl.realurl3; app.weixinload(this,navi);}; break;
      default: break;
    }

  }
})