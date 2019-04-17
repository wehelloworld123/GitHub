// pages/Yan_code/Yan_code.js
var app = getApp() ;
var maxTime = 60;
var currentTime = maxTime //倒计时的事件（单位：s）  
var interval = null
var hintMsg = null // 提示 
Page({

  /**
   * 页面的初始数据
   */
  data: {
    time: currentTime,
    Visiable:false,
    phoneNumber:null,
    passcode:null,
    date: '请选择日期',
    fun_id: 2,
    time: '获取验证码', //倒计时 
    currentTime: 61
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      Visiable:false
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
  getCode: function (options) {
    var that = this;
    var currentTime = that.data.currentTime
    interval = setInterval(function () {
      currentTime--;
      that.setData({
        time: currentTime + '秒'
      })
      if (currentTime <= 0) {
        clearInterval(interval)
        that.setData({
          time: '重新发送',
          currentTime: 61,
          disabled: false
        })
      }
    }, 1000)
  },
  getVerificationCode() {
    var that = this
    that.code_send();

  },


  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  },
  PhoneNumber:function(e){
    this.setData({
      phoneNumber:e.detail.value
    })
  },
  Passcode:function(e){
    this.setData({
      passcode:e.detail.value
    })

  },
  code_send:function(){
    var that=this;
    var tel = that.data.phoneNumber
    var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/; 
    if (tel==null){
      wx.showToast({
        title: '未填写手机号',
        icon:"none",
        duration:1500
      })
    }
    else if(!myreg.test(tel)){
      wx.showToast({
        title: '手机号有误',
        icon: "none",
        duration: 1500
      })
    }
    else{ 
      var page = that;
      console.log("手机号是" + that.data.phoneNumber) // 网络请求 
      wx.request({
        url: 'https://www.qinyu123456.xyz/WX/getcode.do',
        method: 'POST',
        data: {
          phone: that.data.phoneNumber
        },
        header: {
          'content-type': 'application/x-www-form-urlencoded;charset=utf-8'  //这里注意POST请求content-type是小写，大写会报错
        },
        success: function (res) {
          if (res.statusCode == 200) {
            console.log("yes");
            that.setData({
              Visiable: true
            })
          }
          else {
            wx.showLoading({
              title: '发送失败，请稍后重试',
            })
            setTimeout(function () {
              wx.hideLoading()
            }, 2000)
          }
          that.getCode();
          that.setData({
            disabled: true
          })
        }

      })
     /* wx.request({
      url: 'http://apis.juhe.cn/mobile/get', // 接口地址 
      data: { // 参数 phone: this.data.phoneNumber,
        key: '自己申请key(用的聚合数据)'
    },
     header: {
    'Content-Type': 'application/json',
  },
  success: function (res) { // 成功回调函数 
  var result = res.data;
  console.log(res.data);
  if(result.error_code == 201101) {
    page.setData({
      message: '手机号不能为空'
    })
  } else if(result.error_code == 201102) {
    page.setData({
      message: '错误的手机号码'
    })
  } else if(result.error_code == 201103) {
    page.setData({
      message: '查询无结果'
    })
  } else {
    page.setData({ // 组合结果 
    message: result.province + " " + result.city + " " + result.company
    })
    wx.request({
      url: 'http://192.168.1.111:8080/QinPlus/getcode.do',
      method:'POST',
      data:{
        phonenumber: that.data.phonenumber
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded;charset=utf-8'  //这里注意POST请求content-type是小写，大写会报错
      },
      success:function(res){
        if(res.statusCode==200){
          console.log("yes");
          that.setData({
            Visiable: true
          })
        }
        else{
          wx.showLoading({
            title: '发送失败，请稍后重试',
          })
          setTimeout(function () {
            wx.hideLoading()
          }, 2000)
        }
        that.getCode();
        that.setData({
          disabled: true
        })
      }

    })

  }
}
    })*/
    }
  },
  code_send_ag:function(){
 
    if (currentTime<0){
      var that = this;
      currentTime = maxTime;
      that.code_send();
    }
  },
  
  denglu_E:function(){
    var that=this;
    var phonenumber = that.data.phoneNumber;
    var passcode=that.data.passcode;
    if(phonenumber!=null&&passcode!=null){
      wx.request({
        url: 'https://www.qinyu123456.xyz/WX/checkcode.do',
        method: 'POST',
        data:{
          phone: phonenumber,
          code: passcode
        },
        header: {
          'content-type': 'application/x-www-form-urlencoded;charset=utf-8'  //这里注意POST请求content-type是小写，大写会报错
        },
        success:function(res){
          if (res.data.message==10001){
            var key = res.data.user_id;
            wx.setStorage({
              key: 'rollkey',
              data: key,
            })           
             wx.setStorage({
              key: 'messkey',
              data: res.data.code,
            })
            wx.navigateBack({
              delta:2
            })
          }
          else if(res.data.message!=10001){
            wx.showLoading({
              title: '验证失败',
            })
            setTimeout(function(){
              wx.hideLoading()
            },2000)
          }
          else{
            wx.showLoading({
              title: '网络延迟，请稍后重试',
            })
            setTimeout(function () {
              wx.hideLoading()
            }, 2000)
          }
        }
      })
    }
    else{
      wx.showToast({
        title: '内容未填写完整',
        icon:"none",
        duration:1500

      })
    }
  }

 
  
})