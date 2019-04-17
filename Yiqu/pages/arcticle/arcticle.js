// pages/arcticle/arcticle.js
Page({

  /**
   * 页面的初始数据
   */
  data: {                                                                            
    "summary":'',
    "time":'',
    "arcticle":'',
    "list":{
      "content":[
        {                                                                               
          "arcticle": '',
          "src":''
        },
        {                                                                         
          "arcticle": '',
          "src": ''
        },
        {                                                                          
          "arcticle": '',
          "src": ''
        },
]
    }
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var a1 = "list.content[" + 0 + "].arcticle";
    var b1 = "list.content[" + 0 + "].src";
    var a2 = "list.content[" + 1 + "].arcticle";
    var b2 = "list.content[" + 1 + "].src";
    var a3 = "list.content[" + 2 + "].arcticle";
    var b3 = "list.content[" + 2 + "].src";
    var a4 = "list.content[" + 3 + "].arcticle";
    var b4 = "list.content[" + 3 + "].src";
    this.setData({
    summary: options.summary,
    time: options.time,
    [a1]: options.arctl1,
    [b1]: options.src1,
    [a2]: options.arctl2,
    [b2]: options.src2,
    [a3]: options.arctl3,
    [b3]: options.src3,
    [a4]: options.arctl4,
    [b4]: options.src4
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
  
  }
})