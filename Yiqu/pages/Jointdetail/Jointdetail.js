// pages/Jointdetail/Jointdetail.js
var app = getApp();
Page({
  data: {
    "pageurl3": {
      "realurl1": "/pages/Jointsuccess/Jointsuccess",
      "realurl2": ""
    },
    buttonState:true,
    areaIndex: 0,

    area:['线上报名','线下报名'],


  
      "iteminput": '',
      "chengInput":'',
      "maininput": '',
      "placeinput": '',
      "timeinputone": '',
      "timeinputtwo": '',
      "LPhone": '',
      "setType":'线上报名',
      "Etype":'',
      "img": '',
      "address": '',
      "longitude": '',//经度
      "latitude": '',//纬度
      "eventdetail": '',
      "eventwards": '',
      "eventwords": '',
      'minpeo': '',
      'moneyre': '',
      "costre":'无'
  
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      iteminput: options.iteminput,
      maininput: options.maininput,
      chengInput: options.chengInput,
      Etype: options.placeinput,
      timeinputone: options.timeinputone,
      timeinputtwo: options.timeinputtwo,
      LPhone: options.setinput,
      img: options.img,
      name: options.name,
      address: options.address,
      longitude: options.longitude,//经度
      latitude: options.latitude,//纬度
      minpeo: options.minpeo,
      moneyre: options.moneyre
    })
    /*wx.showModal({
      title: '',
      content: "" + this.data.iteminput + this.data.maininput + this.data.placeinput + this.data.timeinputone + this.data.timeinputtwo + this.data.setinput + this.data.eventdetail + this.data.name + this.data.address +"",
    })*/
    },
  success: function (res) {
    console.log(res.data)
  
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
  _pageeventnavigate:function(){
    var that = this 
    var city = app.globalData.currentCity;
    if (that.data.eventdetail != '' && that.data.eventwards != '' && that.data.eventwords != ''){
      var imgurl = that.data.img;
      wx.getStorage({
        key: 'rollkey',
        success: function (res) {
          if (res.data != null) {
            var rollkey = res.data;
            wx.request({
              url: 'https://www.qinyu123456.xyz/WX/selectsameperson.do',
              method: 'POST',
              data: {
                Roll_username: rollkey
              },
              header: { 'content-type': 'application/x-www-form-urlencoded;charset=utf-8' },
              success: function (resp) {
                if (resp.data== 10010) {
                  wx.setStorage({
                    key: 'rollkey',
                    data: res.data.rollkey,
                  })
                  wx.showLoading({
                    title: '正在发布',
                  })
                  wx.uploadFile({
                    url: 'https://www.qinyu123456.xyz/WX/savepicture.do',
                    filePath: imgurl,
                    name: 'file',
                    header: { "Content-Type": "multipart/form-data" },
                    formData: {
                      //和服务器约定的token, 一般也可以放在header中
                      //'session_token': wx.getStorageSync('session_token')
                    },
                    success: function (re) {
                      console.log(re.data);
                      var imgur = re.data;
                      if (re.statusCode != 200) {
                        wx.showModal({
                          title: '提示',
                          content: '上传失败',
                          showCancel: false
                        })
                      }
                      that.setData({
                        img: imgur
                      })
                      wx.request({
                        url: "https://www.qinyu123456.xyz/WX/saveactivity.do",
                        method: 'POST',
                        data: {
                          iteminput: that.data.iteminput,
                          maininput: that.data.maininput,
                          chengInput: that.data.chengInput,
                          Etype: that.data.Etype,
                          timeinputone: that.data.timeinputone,
                          timeinputtwo: that.data.timeinputtwo,
                          LPhone: that.data.LPhone,
                          img: that.data.img,
                          address: that.data.address,
                          longitude: that.data.longitude,//经度
                          latitude: that.data.latitude,//纬度
                          eventdetail: that.data.eventdetail,
                          eventwards: that.data.eventwards,
                          eventwords: that.data.eventwords,
                          minpeo: that.data.minpeo,
                          money: that.data.moneyre,
                          costre: that.data.costre,
                          username: res.data,
                          city: city
                        },
                        header: {
                          'content-type': 'application/x-www-form-urlencoded;charset=utf-8'  //这里注意POST请求content-type是小写，大写会报错
                        },
                        success: function (r) {
                          wx.hideLoading();
                          if(r.data=="10001"){
                          console.log("返回成功的数据:" + r.data) //返回的会是对象，可以用JSON转字符串打印出来方便查看数据
                          console.log("返回成功的数据:" + JSON.stringify(r.data)) //这样就可以愉快的看到后台的数据啦
                          var navi = that.data.pageurl3.realurl1;
                          app._pagenavigate(navi);
                          }
                          else {
                            wx.hideLoading();
                            wx.showLoading({
                              title: '发布失败',
                            })
                            setTimeout(function () {
                              wx.hideLoading()
                            }, 2000)
                          }
                        },
                        fail: function (fail) {
                          wx.hideLoading();
                          wx.showLoading({
                            title: '发布失败',
                          })
                          setTimeout(function () {
                            wx.hideLoading()
                          }, 2000)
                        },
                        complete:function(){
                          setTimeout(function () {
                            that.setData({
                              buttonState: true
                            }, 500)
                          })
                        }
                      })
                    },
                    fail: function (e) {
                      console.log(e);
                      wx.hideLoading();
                      wx.showModal({
                        title: '发布失败',
                        content: '原因：' + e.errMsg,
                        showCancel: false
                      })
                    },
                    complete: function () {
                      setTimeout(function(){
                        that.setData({
                          buttonState:true
                        })
                      })
                    }
                  })



                }
                else {
                  wx.showModal({
                    title: '提示',
                    content: '内容未填写完整',
                    showCancel: false,
                  })
                }
              },
              fail: function (e) {
                wx.showModal({
                  title: '提示',
                  content: '网络错误，请登录后重试',
                  success: function (res) {
                    if (res.confirm) {
                      var a = "/pages/R_roll/R_roll";
                      app._pagenavigate(a);
                    }
                  }
                })
              }
            })
          }
          else {
            wx.showModal({
              title: '提示',
              content: '网络错误，请登录后重试',
              success: function (re) {
                if (re.confirm) {
                  var a = "/pages/R_roll/R_roll";
                  app._pagenavigate(a);
                }
              }
            })
          }
        },
        fail: function (e) {
          wx.showModal({
            title: '提示',
            content: '没有登录信息，请登陆后重试',
            success: function (res) {
              if (res.confirm) {
                var navi = "/pages/R_roll/R_roll";
                app._pagenavigate(navi);
              }
            }
          })
        },
        

      }) 
    
} 

  },
  bindPickerChange: function (e) {
      this.setData({
      areaIndex: e.detail.value  
    })
    var a=this.data.areaIndex;
    this.setData({
      setType:this.data.area[a]
    })
  },

  EventDetail: function (e) {
    this.setData({
      eventdetail: e.detail.value
    })
  },
  EventWards: function (e) {
    this.setData({
      eventwards: e.detail.value
    })
  },
  EventWords: function (e) {
    this.setData({
      eventwords: e.detail.value
    })
  },
  Costre: function (e) {
    this.setData({
      costre: e.detail.value
    })
  }

})