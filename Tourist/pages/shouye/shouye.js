// pages/shouye/shouye.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    contitem1: [{
        'viewitem': 'width: 360rpx;height: 300rpx;background-color: #92CE6E;',
        
      },
      {
        'viewitem': 'width: 360rpx;height: 300rpx;background-color: #FA6666;',
      },
      {
        'viewitem': 'width: 360rpx;height: 300rpx;background-color: #F7774A;',
      }
    ],
    contitem2: [{
        'viewitem': 'width: 360rpx;height: 300rpx;background-color: #52B8DA;',
      },
      {
        'viewitem': 'width: 360rpx;height: 300rpx;background-color: #F6AC09;',
      }, {
        'viewitem': 'width: 360rpx;height: 300rpx;background-color: #C065A7;',
      }
    ],
    /**功能样式数组 */
    functionitem: [{
      'viewitem1': "width: 62%;height: 94%;background-color: #92CE6E;margin-right: 10rpx;display: flex;flex-direction: row;",
        'viewitem2': "width: 33%;height: 94%;background-color: #52B8DA;",
        'font_class1':"tourist icon-jingdianmenpiao",
        'text1': "景点介绍",
        'font_class2': "tourist icon-emizhifeiji",
        'font2style':"font-size:70rpx",
        'text2': "路线推荐",
      },
      {
        'viewitem1': "width: 30%;height: 94%;background-color: #FA6666;margin-right: 10rpx;",
        'viewitem2': "width: 65%;height: 94%;background-color: #F6AC09;display: flex;flex-direction: row;",
        'font_class1': "tourist icon-zhuanxiangdijia",
        'text1': "低价专享",
        'font_class2': "tourist icon-weibiaoti556",
        'text2': "智能翻译",
      },
      {
        'viewitem1': "width: 65%;height: 94%;background-color: #F7774A;margin-right: 10rpx;display: flex;flex-direction: row;",
        'viewitem2': "width: 30%;height: 94%;background-color: #C065A7;",
        'font_class1': "tourist icon-guoneijiudian",
        'text1': "酒店预定",
        'font1style': "font-size:80rpx",
        'font_class2': "tourist icon-pintuan",
        'font2style': "font-size:70rpx",
        'text2': "拼团",
      },
    ],


    "carousel2": {
      "type": "carousel",
      "style": "height:380rpx;margin-left:auto;margin-right:auto;margin-top:0;opacity:1;",



      /*----------------二级------------content------------------------------------------*/



      "content": [{
          "customFeature": {
            "action": "goods-trade",
            "goods-id": "1006874",
            "goods-name": "\u8c6a\u534e\u5927\u5305\u95f4\u7279\u4ef7\u5566"
          },
          "pic": "https://i03piccdn.sogoucdn.com/aaed81c769c9b865",
          "content": "",
          "parentCompid": "carousel2",
          "style": "",
          "itemType": null,
          "itemParentType": "carousel",
          "itemIndex": 0,
          "eventParams": "{\"goods_id\":\"1006874\",\"goods_type\":null}",
          "eventHandler": "tapGoodsTradeHandler"
        },

        {
          "customFeature": {
            "action": "inner-link",
            "page-link": "page10011"
          },
          "pic": "http://img.mp.sohu.com/upload/20170622/7be767f5d0704db0bfef500f5e14188a_th.png",
          "content": "",
          "parentCompid": "carousel2",
          "style": "",
          "itemType": null,
          "itemParentType": "carousel",
          "itemIndex": 1,
          "eventParams": "{\"inner_page_link\":\"\\\/pages\\\/page10011\\\/page10011\",\"is_redirect\":0}",
          "eventHandler": "tapInnerLinkHandler"
        },
        {
          "customFeature": {
            "action": "inner-link",
            "page-link": "page10011"
          },
          "pic": "http://pic1.win4000.com/wallpaper/7/578f4a9c90455.jpg",
          "content": "",
          "parentCompid": "carousel2",
          "style": "",
          "itemType": null,
          "itemParentType": "carousel",
          "itemIndex": 1,
          "eventParams": "{\"inner_page_link\":\"\\\/pages\\\/page10011\\\/page10011\",\"is_redirect\":0}",
          "eventHandler": "tapInnerLinkHandler"
        }
      ],
      /*----------------二级------------content------------------------------------------*/



      "customFeature": {
        "autoplay": true,
        "interval": 4
      },
      "animations": [],
      "page_form": "",
      "compId": "carousel2"
    },
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {

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

  }
})