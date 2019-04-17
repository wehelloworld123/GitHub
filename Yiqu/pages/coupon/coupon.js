// pages/scheme/scheme.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    "i":0,
    "k":'',
    "panduan":true,
    "list":{
      "content": [{
        "src": 'http://594013.freep.cn/594013/youhui.jpg'}, ]
    }
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    wx.navigateToMiniProgram({
      appId: 'wxeb490c6f9b154ef9', //固定为此 appid，不可改动
      extraData: data, // 包括 encrypt_card_id, outer_str, biz三个字段，须从 step3 中获得的链接中获取参数
      success: function () {
      },
      fail: function () {
      },
      complete: function () {
      }
    })
    var that=this;
    var j=this.data.i;
    if(j==0){
    that.setData({
      k:0,
      panduan:false
    })
    }
   
    else {
      that.setData({
        K: 0,
      })
    }
    wx.showModal({
      showCancel:false,
      title: '提示',
      content: '恭喜获得一张公益优惠卷',
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
    wx.showNavigationBarLoading() //在标题栏中显示加载
    // 获取数据的方法，具体怎么获取列表数据大家自行发挥
    //var GetList = function(that){
    that.setData({
      hidden: false
    });
    wx.request({
      url: 'https://414495385.gyjingling.cn',
      data: {
        iteminput: iteminput,
        maininput: maininput,
        placeinput: iteminput,
        timeinputone: timeinputone,
        timeinputtwo: timeinputtwo,
        setinput: setinput,
        img: img,
        address: address,
        eventdetail: eventdetail,
        eventwards: eventwards,
        eventwords: eventwords
      },
      success: function (res) {
        //console.info(that.data.list);
        var list = this.data.list1.content;
        var l = list.length;
        for (var i = 0; i < res.data.list.length; i++) {
          list[l + 1].push(res.data.list[i]);
        }
        that.setData({
          list: list
        });
        page++;
        that.setData({
          hidden: true
        });
      }
    });
    //}

    //模拟加载
    setTimeout(function () {
      // complete
      wx.hideNavigationBarLoading() //完成停止加载
      wx.stopPullDownRefresh() //停止下拉刷新
    }, 1500);
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  }
})