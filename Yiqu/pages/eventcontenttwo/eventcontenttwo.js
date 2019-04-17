// pages/eventcontenttwo/eventcontenttwo.js
var app=getApp();

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
    "pageurl9": {
      "realurl1": "/pages/realsesuccess/realsesuccess",
    },

    buttonState: true,
    showView: false,
    showPhoto: false,
    showValue: false,
    showHello:false,
    isBtnClicked: false,
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
    "img":'',
    "evenitem": '',
    "sponsor": '',
    "Etype":'公益型',
    "cost": '2000以下',
    "bartime": '',
    "bartime2": '',
    "contact": '',
    "introduce": '',
    areaIndex: 0,
    areaIndex1:0,
    area: ['2000以下', '4000-8000', '8000-1万', '1万以上','大型费用'],
    area1: ['公益型'],

  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      showHello:false
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
  _pagenavigatear: function () {
    if (this.data.evenitem != '' && this.data.sponsor != '' && this.data.contact != '' && this.data.introduce != '') {
      var that=this;
      var imgurl = that.data.img;
      var city = app.globalData.currentCity;
      var username;
      //var pic= app.upload(that, imgurl);
      wx.getStorage({
        key: 'rollkey',
        success: function (res) {
          username = res.data;
        },
      })
      wx.showLoading({
        title: '正在发布',
      })
      that.setData({
        buttonState: false,
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
          if (res.statusCode != 200) {
            wx.showModal({
              title: '提示',
              content: '上传失败',
              showCancel: false
            })
          }
          var imgur = res.data;
       
          that.setData({
            img: imgur,
            showHello: false
   
          })
          var bartime = that.data.year + '-' + that.data.month + '-' + that.data.day + ' ' + that.data.hour;
          var bartime2 = that.data.year2 + '-' + that.data.month2 + '-' + that.data.day2 + ' ' + that.data.hour2;
          wx.request({
            url: "https://www.qinyu123456.xyz/WX/saveadvertiser.do",
            method: 'POST',
            data: {
              pic: that.data.img,
              evenitem: that.data.evenitem,
              sponsor: that.data.sponsor,
              Etype: that.data.Etype,
              cost: that.data.cost,
              bartime: bartime,
              bartime2: bartime2,
              contact: that.data.contact,
              introduce: that.data.introduce,
              city:city,
              username: username
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
              setTimeout(function(){
                that.setData({
                  buttonState: true,
                })
              },500)
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
          setTimeout(function () {
            that.setData({
              buttonState: true,
            })
          }, 500)
        }
      })


    }
    else{
      wx.showModal({
        showCancel: false,
        title: '提示',
        content: '内容未填写完整',
      })
    }
  },

  /*--------------------------页面数据-----------------------*/
  Type: function (e) {
    this.setData({
      Etype: e.detail.value
    })
  },
  Evenitem: function (e) {
    this.setData({
      evenitem: e.detail.value
    })
  },
  Sponsor: function (e) {
    this.setData({
      sponsor: e.detail.value
    })
  },
  Cost: function (e) {
    this.setData({
      cost: e.detail.value
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


/*--------------------------页面数据-----------------------*/


  /*----------------------时间轴---------------*/

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
      case "in5": {
        this.setData({
          showView: (!this.data.showView),
          showValue: true
        })
      }; break;
      case "in6": {
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

  bindPickerChange: function (e) {
    this.setData({
      areaIndex: e.detail.value
    })
    var a = this.data.areaIndex;
    this.setData({
      cost: this.data.area[a]
    })
  },
  bindPickerChange1: function (e) {
    this.setData({
      areaIndex1: e.detail.value
    })
    var a = this.data.areaIndex1;
    this.setData({
      Etype: this.data.area1[a]
    })
  },
  /*------------------------取相片-------------------*/
  _photochoose: function () {
    var that = this;
    wx.chooseImage({
      count: 1, // 默认9  
      sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有  
      sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有 
      success: function (res) {
        var tempFilePaths = res.tempFilePaths[0];
        that.setData({
          showHello: true,
          img: res.tempFilePaths
        })

      }
    })
    console.log(that.data.img);
  }
  /*------------------------取相片-------------------*/
})