// pages/E_roll/E_roll.js
var app=getApp();
Page({
 
  data: {
    Submit:true,
    areaIndex: 0,
    area:['','商家','公司','机构'],
    "R_type":null,
    IsProtocol:true,//是否同意协议
    content:[
      { 
        "style": "height:100%",
        "placeholder-value": "常用手机号"
      },
      {
        "style": "height:100%",
        "placeholder-value": "请输入用户名 / 手机号"
      },
      {
        "style": "height:100%",
        "placeholder-value": "请输入用户名 / 手机号"
      },
      {
        "style": "height:100%",
        "placeholder-value": "请输入用户名 / 手机号"
      }
      ],
      "roll_user":'',
      "phone_numb":'',
      "email":'',
      "R_type": '',
      "Type_name":'',
      "type_Address":'',
      "passwords1":'',
      "passwords2":'',
      "annce":null
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
  /**
   * 用户名自动监测
   */
  checkuser:function(){
    var that = this;

    wx.request({
      url: 'https://www.qinyu123456.xyz/WX/selectsameperson.do',
      method: 'POST',
      data: {
        Roll_username: that.data.roll_user
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded;charset=utf-8'  //这里注意POST请求content-type是小写，大写会报错
      },
      success: function (res) {
        console.log("返回成功的数据:" + res.data);
        if (res.data.wx_state == 10010)//用户重复
        {
          that.setData({
            annce: false
          })
        }
        else {
          that.setData({
            annce: true
          })
        }
      },
    })
  },
  Roll_User:function(e){
    this.setData({
      roll_user: e.detail.value
    })
   
  },
  Phone_numb: function (e) {
    var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
    if (e.detail.value == null) {
      wx.showToast({
        title: '未填写手机号',
        icon: "none",
        duration: 1500
      })
    }
    else if (!myreg.test(e.detail.value)) {
      wx.showToast({
        title: '手机号有误',
        icon: "none",
        duration: 1500
      })
    }
    this.setData({
      phone_numb: e.detail.value
    })
  },
  Email: function (e) {
    this.setData({
      email: e.detail.value
    })
  },
  R_Type:function(e){
    this.setData({
      R_type: e.detail.value
    })
  },
  Type_Name: function (e) {
    this.setData({
      Type_name: e.detail.value
    })
  },
  Type_Address:function(e){
    this.setData({
      type_Address: e.detail.value
    })
  },
  Passwords1: function (e) {
    this.setData({
      passwords1: e.detail.value
    })
  },
  Passwords2: function (e) {
    this.setData({
      passwords2: e.detail.value
    })
  },
  checkboxChange:function(e){
    var a=e.detail.value.length;
    if(a==0){
      this.setData({
        Submit:false
      })
      console.log(this.data.Submit);
    }
    
  },

  bindPickerChange: function (e) {//注册类型选择
    var a = parseInt(e.detail.value);
    this.setData({
      areaIndex: a
    })
    if(a!=0){
    this.setData({
      R_type: this.data.area[a]
    })
    }
    else{
  
    }
  },


  bindroll:function(){//注册事件
    var that=this;
    if (IsProtocol){
    if (that.data.roll_user != ''&&that.data.phone_numb != '' && that.data.email != '' && that.data.R_type != '' && that.data.Type_name != '' && that.data.passwords1 != '' && that.data.passwords2 != '') {
      if (that.data.passwords1 != that.data.passwords2) {
        wx.showModal({
          showCancel: false,
          title: '提示',
          content: '密码不匹配',
        })
      }
      else{
        if (that.data.Submit == false) {
          wx.showModal({
            showCancel: false,
            title: '提示',
            content: '无法注册',
            success: function (res) {
              if (res.comfirm) {
                wx.navigateBack({
                  data: 1
                })
              }
            }
          })
        }
        else {
          wx.request({
            url: 'https://www.qinyu123456.xyz/WX/savemanager.do',
            method: 'POST',
            data: {
              Roll_username: that.data.roll_user,
              phone_numb: that.data.phone_numb,
              email: that.data.email,
              R_type: that.data.R_type,
              Type_name: that.data.Type_name,
              Type_Address:that.data.type_Address,
              passwords: that.data.passwords1,
            },
            header: {
              'content-type': 'application/x-www-form-urlencoded;charset=utf-8'  //这里注意POST请求content-type是小写，大写会报错
            },
            success:function(res){
              console.log("返回成功的数据:" + res.data);
              var key=res.data.key
              wx.setStorage({
                key: 'rollkey',
                data: key,
              })
              wx.showToast({
                title: '注册成功',
                icon:'success',
                duration:4000
              })
              wx.navigateBack({
                data:1
              })
            },
            fail: function (e) {
              console.log(e);
              wx.showModal({
                title: '注册失败',
                content: '原因：' + e.errMsg,
                showCancel: false
              })
            },
          })

        }
      }
    }
    else{
      wx.showModal({
        showCancel: false,
        title: '提示',
        content: '内容未填写完整',
    })
    }
    }
    else {
      wx.showModal({
        title: '提示',
        content: '拒绝协议将无法注册',
        showCancel: false
      })
    }
  },
  checkboxChange:function(e){
    var that=this;
    var value=e.detail.value[0];
    if(value=="roll"){
      that.setData({
        IsProtocol:true
      })
    }
    else{
        that.setData({
          IsProtocol: false
        })
    }
  }
})
/**
 * js
 */
function checkboxChange(){

}