// pages/Jointrelease/Jointrelease.js
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
    /*---------------------详情数据-----------------*/
   /**
    * 活动信息
    */
      "iteminput":'',//活动主题
      "maininput": '',//主办方
      "chengInput": '',//承办方
      "timeinputone": '',//开始时间
      "timeinputtwo": '',//结束时间
      "setinput": '',//报名设置
      "name": '',//
      "address": '',//活动场地地址
      "longitude": '',//经度
      "latitude": '',//纬度
      'img':'',//图片
      "Etype":'公益型',//活动类型
      'tempFilePath': '',
      "minpeo": '无要求',
      "moneyre": '无要求',
   /**
    * 选择器参数
    */
   areaIndex1: 0,
   area1: ['公益型'],
   areaIndex2: 0,
   areaIndex3: 0,
   area2: ['无要求', '50人', '80人', '100人', '150人', '200人以上'],
   area3: ['无要求', '2000-4000元', '4000-8000元', '10000元'],
    "pageurl2": {
      "realurl1": "/pages/Jointdetail/Jointdetail",
      "realurl2":""
    },
    showView: false ,
    showPhoto:false,
    showValue:false,
    disablestate:true,
    "value":"",
 
    /*---------------------详情数据-----------------*/
    /*---------------------时间数据-----------------*/
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
/*---------------------时间数据-----------------*/
    "carousel2": {
      "type": "carousel",
      "style": "height:351.5625rpx;margin-left:auto;margin-right:auto;margin-top:0;opacity:1;",



      /*----------------二级------------content------------------------------------------*/



      "content":
      [{
        "customFeature": {
          "action": "goods-trade",
          "goods-id": "1006874",
          "goods-name": "\u8c6a\u534e\u5927\u5305\u95f4\u7279\u4ef7\u5566"
        },
        "pic": "", "content": "",
        "parentCompid": "carousel2",
        "style": "",
        "itemType": null, "itemParentType": "carousel", "itemIndex": 0, "eventParams": "{\"goods_id\":\"1006874\",\"goods_type\":null}",
        "eventHandler": "tapGoodsTradeHandler"
      },

      {
        "customFeature": { "action": "inner-link", "page-link": "page10011" },
        "pic": "",
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



      "customFeature": { "autoplay": true, "interval": 2 },
      "animations": [],
      "page_form": "",
      "compId": "carousel2"
    },
    
  
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    showView: (options.showView == "true" ? true : false)  
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
  bindPickerChange1: function (e) {
    this.setData({
      areaIndex1: e.detail.value
    })
    var a=this.data.areaIndex1;
    this.setData({
      Etype: this.data.area1[a]
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


  bindPickerChange2: function (e) {
    this.setData({
      areaIndex2: e.detail.value
    })
    var a = this.data.areaIndex2;
    this.setData({
      minpeo: this.data.area1[a]
    })
  },
  bindPickerChange3: function (e) {
    this.setData({
      areaIndex3: e.detail.value
    })
    var a = this.data.areaIndex3;
    this.setData({
      moneyre: this.data.area3[a]
    })
  },
  onChangeShowState: function (e) {
      //var that = this;
    var kind = e.target.id;

    var navi;
    switch (kind) {
      case "in1": {
        this.setData({
          showView: (!this.data.showView),
          showValue: true
        })  
        } ;break;
      case "in2": {
        this.setData({
        showView: (!this.data.showView),
        showValue: false
      })
      }; break;
      default: break;
    }

 } ,
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
    var bartime = this.data.year + '-' + this.data.month + '-' + this.data.day + ' ' + this.data.hour;
    var bartime2 = this.data.year2 + '-' + this.data.month2 + '-' + this.data.day2 + ' ' + this.data.hour2;
    this.setData({
      timeinputone:bartime,
      timeinputtwo:bartime2,
      showView: (!this.data.showView)
    })
    console.log(this.data.timeinputone + this.data.timeinputtwo);
  },
 /*---------------------Input语句赋值--------------------*/
  ItemInput:function(e){
    this.setData({
      iteminput:e.detail.value
    })
  },
  MainInput: function (e) {
    this.setData({
      maininput: e.detail.value
    })
  },
  PlaceInput: function (e) {
    this.setData({
     placeinput: e.detail.value
    })
  },
  SetInput:function(e){
    this.setData({
      setinput:e.detail.value
    })
  },

  Address: function (e) {
    this.setData({
      name: e.detail.value
    })
  },
  ChengInput:function(e){
    this.setData({
      chengInput: e.detail.value
    })
  },
  /*---------------------Input语句赋值--------------------*/
  bindevent2: function () {
    var that=this;
    var bartime = this.data.year + '-' + this.data.month + '-' + this.data.day + ' ' + this.data.hour;
    var bartime2 = this.data.year2 + '-' + this.data.month2 + '-' + this.data.day2 + ' ' + this.data.hour2;
    that.setData({
      timeinputone: bartime,
      timeinputtwo: bartime2,

    })
    if (this.data.iteminput != '' && this.data.maininput != '' && this.data.setinput != '' && this.data.address != '' && this.data.chengInput!=''){

      wx.navigateTo({
        url: "/pages/Jointdetail/Jointdetail?iteminput=" + this.data.iteminput + "&maininput=" + this.data.maininput + "&placeinput=" + this.data.Etype + "&timeinputone=" + this.data.timeinputone + "&timeinputtwo=" + this.data.timeinputtwo + "&setinput=" + this.data.setinput + "&img=" + this.data.img + "&name=" + this.data.name + "&address=" + this.data.address + "&longitude=" + this.data.longitude + "&latitude=" + this.data.latitude+ "&chengInput=" + this.data.chengInput + "&minpeo=" + this.data.minpeo + "&moneyre=" + this.data.moneyre + "",
        success: function (res) {
          /*that.setData({
            showPhoto:false
          })*/
          console.log(that.data.timeinputone + that.data.timeinputtwo);
        },
        fail: function (res) {
          wx.showLoading({
            title: '加载失败',
          })
          setTimeout(function () {
            wx.hideLoading()
          }, 1000)
        },
        complete: function (res) { },
      })
   
    }
    else{
      wx.showModal({
        title: '提示',
        content: '内容未填写完整',
        showCancel:false
      })
    }
  },

  /**
 * 调用地址
 */
  _getmaplocate: function (e){
   var that =this;
   var add = this.data.address;
   var longitude = this.data.longitude;
   var latitude = this.data.latitude;
   app._Egetmaplocate(e, add, longitude, latitude, this);
  },
/**
 * 照片选择
 */
_photochoose:function(){
  var that=this;
    wx.chooseImage({
      count: 1, // 默认9  
      sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有  
      sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有 
      success: function(res) {
        var tempFilePaths = res.tempFilePaths;
        var a = that.data.carousel2.content;
        that.setData({
          showPhoto: true,
          img: res.tempFilePaths,
          tempFilePath: res.tempFilePaths
        })
       /* wx.uploadFile({
          url: 'https://414495385.gyjingling.cn', 
          filePath: tempFilePaths[0],
          name: 'file',
          formData: {
            'user': 'active'
          },
          success: function (res) {
            var data = res.data
          }
        })  */

  }
})

},
/**
 * 防止时间选择器蒙层穿透
 */
  preventD:function(){

  }
})