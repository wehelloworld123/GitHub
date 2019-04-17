// pages/A/A.js
//index.js  
2.//获取应用实例  
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    isBtnClicked: false,
    "username":'',
    "passwords":'',
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
  Username:function(e){
    this.setData({
      username: e.detail.value
    })
  },
  Passwords:function(e){
    this.setData({
      passwords: e.detail.value
    })
  },
  E_zhuce:function(){
    var that=this;
    if (!that.data.isBtnClicked) {
      var navi = "/pages/E_roll/E_roll";
      app._pagenavigate(navi);
    }
    that.setData({
      isBtnClicked: true
    })
    setTimeout(function () {
      that.setData({
        isBtnClicked: false
      })
    }, 1000)
  },
  denglu_E:function(){
    var that=this;
    if(that.data.username!=''&&that.data.passwords!=''){
      wx.request({
        url: 'https://www.qinyu123456.xyz/WX/checkmanagerandreturn.do',
        method: 'POST',
        data: {
          username:that.data.username,
          passwords:that.data.passwords
        },
        header: {
          'content-type': 'application/x-www-form-urlencoded;charset=utf-8'  //这里注意POST请求content-type是小写，大写会报错
        },
        success:function(res){
          console.log(res.data);
          if (res.data.message==10001){
            var user_id = res.data.userid;
            var code = res.data.code;
          wx.setStorage({
            key: 'rollkey',
            data: user_id,
          })
          wx.setStorage({
            key: 'messkey',
            data: code,
          })
          wx.navigateBack({
            data:1
          })
          }
          else {
            wx.showModal({
              showCancel: false,
              title: '登录失败',
              content: '密码错误，请重试'
            })
          }
        },
        fail:function(e){
          wx.showModal({
            showCancel:false,
            title: '登录失败',
            content: '原因：' + e.errMsg,
          })
        }
      })
    }
    else{
      wx.showModal({
        showCancel:false,
        title: '提示',
        content: '内容未填写完整',
      })
    }
  },
  Yan_code:function(){
    var that=this;
    if (!that.data.isBtnClicked){
      var navi = "/pages/Yan_code/Yan_code";
      app._pagenavigate(navi);
    }
    that.setData({
      isBtnClicked: true
    })
    setTimeout(function () {
      that.setData({
        isBtnClicked: false
      })
    }, 1000)
  }
})
