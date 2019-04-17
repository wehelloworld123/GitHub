// pages/barrelease/barrelease.js

var app = getApp();

const date = new Date()
const years = []
const months = []
const days = []
const hours = []

for (let i = 2017; i <= date.getFullYear() + 4; i++) {
  years.push(i)
}

for (let i = 1; i <= 12; i++) {
  months.push(i)
}

for (let i = 1; i <= 31; i++) {
  days.push(i)
}
for (let i = 1; i <= 24; i++) {
  hours.push(i)
}
Page({

  /**
   * 页面的初始数据
   */
  data: {
    "pageurl12": {
      "realurl1": "/pages/realsesuccess/realsesuccess",
    },
    
    areaIndex: 0,
    areaIndex1: 0,
    areaIndex2: 0,
    area: ['公益型','半公益型','非盈利性'],
    area1: ['50人以下', '50-80人', '80-100人', '100-120人', '150人以上'],
    area2: ['无要求', '可容纳50人', '可容纳100人', '可容纳150人以上', '活动可持续', '其他'],
    //判断参数
    buttonState:true,//按钮判断
    showView: false,
    showPhoto: false,//图片显示判断
    showValue: false,
    showHello: false,
    years: years,
    year: date.getFullYear(),
    year2: date.getFullYear(),
    months: months,
    month: date.getMonth(),
    month2: date.getMonth(),
    days: days,
    day: date.getDate(),
    day2: date.getDate(),
    hours: hours,
    hour: date.getHours(),
    hour2: date.getHours(),
    value: [9999, 1, 1],
    "title":'',
    "cam_name":'',
    "eventype":'公益型',
    "address": '',
    "longitude": '',
    "latitude": '',
    "Pnumber":'50人以下',
    "bartime":'',
    "bartime2": '',
    "contact": '',
    "introduce": '',
    "img":'',
    "Undertaker":'',
    
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

  /*--------------------------页面数据-----------------------*/
  /*EvenType:function(e){
    this.setData({
      eventype: e.detail.value
    })
  },*/
  Title:function(e){
    this.setData({
      title: e.detail.value
    })
  },
  Address:function(e){
    this.setData({
     address: e.detail.value
    })
  },
  /*Number: function(e){
    this.setData({
      number: e.detail.value
    })
  }, */
  Bartime: function (e) {
    this.setData({
      bartime: e.detail.value
    })
  }, 
  Bartime2: function (e) {
    this.setData({
      bartime2: e.detail.value
    })
  }, 
  Contact: function (e) {
    this.setData({
      contact: e.detail.value
    })
  },
  IntroDuce: function (e) {
    this.setData({
      introduce: e.detail.value
    })
  },
  Com_name:function(e){
    this.setData({
      Undertaker: e.detail.value
    })
  },


/*--------------------------页面数据-----------------------*/

  onShareAppMessage: function () {
  
  },



  _pagenavigatehr: function () {
    var that=this;
    if (that.data.address != '' && that.data.contact != '' && that.data.introduce != '' && that.data.title != '' && that.data.Undertaker != '' && that.data.latitude != '' && that.data.longitude != '')
    {
      //-------------------------------图片上传-------------------
      var imgurl=that.data.img;
      var city = app.globalData.currentCity;
      var username;
      //var pic= app.upload(that, imgurl);
      wx.getStorage({
        key: 'rollkey',
        success: function(res) {
          username=res.data;
        },
      })
      console.log(username);
      wx.showLoading({
        title: '正在发布',
      })
      that.setData({
        buttonState:false
      })
      wx.uploadFile({
        url: "https://www.qinyu123456.xyz/WX/savepicture.do",
        filePath: imgurl[0],
        name: 'file',
        header: { "Content-Type": "multipart/form-data" },
        formData: {
          //和服务器约定的token, 一般也可以放在header中
          //'session_token': wx.getStorageSync('session_token')
        },
        success: function (res) {
          console.log(res.data);
          var imgur = res.data;
          if (res.statusCode != 200) {
            wx.showModal({
              title: '提示',
              content: '发布失败',
              showCancel: false
            })
          }
          that.setData({
            img: imgur,
            showHello:false
          })
          var bartime = that.data.year + '-' + that.data.month + '-' + that.data.day + ' ' + that.data.hour;
          var bartime2 = that.data.year2 + '-' + that.data.month2 + '-' + that.data.day2 + ' ' + that.data.hour2;
          var a=app.DateJudge(bartime, bartime2);
          if(a==-1){
            wx.showModal({
              title: '提示',
              content: '日期不符合要求',
              showCancel:false
            })
          }
          else{
          wx.request({
            url: "https://www.qinyu123456.xyz/WX/savebar.do",
            method: 'POST',
            data: {
              pic: that.data.img,
              undertaker: that.data.Undertaker,
              eventype: that.data.eventype,
              address: that.data.address,
              longitude: that.data.longitude,
              latitude: that.data.latitude,
              cnumber: that.data.Pnumber,
              bartime: bartime,
              bartime2: bartime2,
              contact: that.data.contact,
              introduce: that.data.introduce,
              title: that.data.title,
              username: username,
              city: city
            },
            header: {
              'content-type': 'application/x-www-form-urlencoded;charset=utf-8'  //这里注意POST请求content-type是小写，大写会报错
            },
            success: function (res) {
              wx.hideLoading();
              console.log("返回成功的数据:" + res.data) //返回的会是对象，可以用JSON转字符串打印出来方便查看数据           
              if(res.data==10001){
              console.log("返回成功的数据:" + JSON.stringify(res.data)) //这样就可以愉快的看到后台的数据啦
              var navi = "/pages/realsesuccess/realsesuccess";
              app._pagenavigate(navi);
              }
              else{
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
          }
        },
        fail: function (e) {
          console.log(e);
          wx.hideLoading();
          wx.showModal({
            title: '发布失败',
            content: '原因：'+e.errMsg,
            showCancel: false
          })
        },
        complete: function () {
          setTimeout(function(){
            that.setData({
              buttonState: true
            },500)
          })
        }
      })
      //-------------------------------图片上传-------------------
      //-------------------------------数据上传-------------------

    //-------------------------------数据上传-------------------
    }
    else{
      wx.showModal({
        showCancel: false,
        title: '提示',
        content: '内容未填写完整',
      })
    }
  },
  bindPickerChange: function (e) {
    this.setData({
      areaIndex: e.detail.value
    })
    var a = this.data.areaIndex;
    this.setData({
      eventype: this.data.area[a]
    })
    console.log(this.data.eventype);
  },
  /*----------------------时间轴---------------*/
  bindPickerChange1: function (e) {
    this.setData({
      areaIndex1: e.detail.value
    })
    var a=this.data.areaIndex1;
    this.setData({
      Pnumber: this.data.area1[a]
    })
  },
  bindChange: function (e) {
    const val = e.detail.value
    this.setData({
      year: this.data.years[val[0]],
      month: this.data.months[val[1]],
      day: this.data.days[val[2]],
      hour: this.data.hours[val[3]],
    })
  },
  bindChange2: function (e) {
    const val = e.detail.value
    this.setData({
      year2: this.data.years[val[0]],
      month2: this.data.months[val[1]],
      day2: this.data.days[val[2]],
      hour2: this.data.hours[val[3]],
    })
  },
  onChangeShowState: function (e) {
    //var that = this;
    var kind = e.target.id;
    switch (kind) {
      case "in3": {
        this.setData({
          showView: (!this.data.showView),
          showValue: true
        })
      }; break;
      case "in4": {
        this.setData({
          showView: (!this.data.showView),
          showValue: false
        })
      }; break;
      default: break;
    }

  },
  onChangeShowStatem: function () {
    //var that = this;

    this.setData({
      year: date.getFullYear(),
      month: date.getMonth(),
      day: date.getDate(),
      hour: date.getHours(),
      showView: (!this.data.showView),
      showValue: false
    })
  },
  onChangeShowStatel: function () {

    this.setData({
      showView: (!this.data.showView)
    })
  },
  /*----------------------时间轴------------------*/
  _getLocatewie:function(e){
    var add = this.data.address;
    var longitude = this.data.longitude;
    var latitude = this.data.latitude;
    app._Egetmaplocate(e, add, longitude, latitude,this);
    
  },
  /*------------------------取相片-------------------*/
  _photochoose: function () {
    var that = this;
    wx.chooseImage({
      count: 1, // 默认9  
      sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有  
      sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有 
      success: function (res) {
        var tempFilePaths = res.tempFilePaths;
        that.setData({
          showHello: true,
          img: res.tempFilePaths,
        })
      }
    })
  },
  /*------------------------取相片-------------------*/
  /*------------------------网页请求-------------------*/




  
   /*------------------------网页请求-------------------*/
    })