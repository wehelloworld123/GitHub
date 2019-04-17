// pages/eventpage/neighbouring/neighbouring.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    markerId: '',
    title:'',
    phone:'',
    address:'',
    timestart:'',
    timeend:'',
    latitude: 23.099998,//选中图标经纬度
    longitude: 113.324520,//选中图标经纬度
    route:'',
    maplongitude:'113.324520',//当前经纬度
    maplatitude:'23.099998',
    mapinfo_info:[
      {
        "content":'',
        "familyicon":'ico-moon',
        "iconfont":'icon-phone'
      }
    ],
    markers:[
      {
        iconPath: "/images/map.png",
        id: 0,
        latitude: 23.099498,
        longitude: 113.325520,
        width: 40,
        height: 40,
        //rotate:180,
        a:'',
        callout: {
          content: '文本1',//文本
          color: "#003333",//文本颜色
          fontSize: 10,//文字大小
          borderRadius: 10,//callout边框圆角
          bgColor: "#FFFF66",//背景色
          padding: 10,//文本边缘留白
          // display: '',//'BYCLICK':点击显示; 'ALWAYS':常显
          textAlign: "center"//文本对齐方式。有效值: left, right, center
        }


      },
      {
        iconPath: "/images/map.png",
        id: 2,
        latitude: 23.099190,
        longitude: 113.424521,
        width: 40,
        height: 40,
        //rotate:180,
        a: '',
        callout: {
          content: '文本2',//文本
          color: "#003333",//文本颜色
          fontSize: 40,//文字大小
          borderRadius: 10,//callout边框圆角
          bgColor: "#FFFF66",//背景色
          padding: 10,//文本边缘留白
          // display: '',//'BYCLICK':点击显示; 'ALWAYS':常显
          textAlign: "center"//文本对齐方式。有效值: left, right, center
        }
      },
      {
        iconPath: "/images/map.png",
        id: 4,
        latitude: 23.099180,
        longitude: 113.323521,
        width: 40,
        height: 40,
        //rotate:180,
        a: '',
        callout: {
          content: '好吃你就来，好多礼品随便拿',//文本
          color: "#003333",//文本颜色
          fontSize: 10,//文字大小
          borderRadius: 10,//callout边框圆角
          bgColor: "#FFFF66",//背景色
          padding: 10,//文本边缘留白
          display: 'ALWAYS',//'BYCLICK':点击显示; 'ALWAYS':常显
          textAlign: "center"//文本对齐方式。有效值: left, right, center
        },

      },
    ],
    circles:{
      latitude: 23.099990,
      longitude: 113.324520,
      color:'#000000AA',
      fillColor:'#ffffff',
      radius:100,
      strokeWidth:2

    }
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    that.setData({
      maplongitude: options.longitude,
      maplatitude: options.latitude
    })
    console.log(options.longitude); console.log(options.latitude);
    wx.request({
     // url: 'https://www.qinyu123456.xyz/WX/returnbars.do',
      method:'GET',
      data:{
        longitude: options.longitude,
        latitude: options.latitude
      },
      header: {
        'content-type': 'application/json'
      },
      success: function (res) {
        var v = res.data.barinfo;
        //var query_clone = JSON.parse(decodeURIComponent(JSON.stringify(res.data)));
        var k = v.length;
        if (k > 0) {
          var content_bar = that.data.list1.content
          var an = that.data.Array;
          for (var j = 0; j < k; j++) {
            content_bar.push(res.data.barinfo[j]);
          }
          for (var j = 0; j < k; j++) {
            an.push(res.data.barinfo[j]);
          }
          for (var i = 0; i < k; i++) {
            var en = "list1.content[" + i + "]";
            that.setData({
              [en]: an[i]
            })
          }
        }
        else {
          that.setData({
            hidden: false
          })
        }
        var ary = that.data.Array;
        ary.splice(0, ary.length);
      },
      fail: function (e) {
        console.log(e);
        wx.showLoading({
          title: '加载失败',
        })
        setTimeout(function () {
          wx.hideLoading();
        }, 1500)
      }
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
  /**
   * 定点信息
   */
  markertap:function(e){
    var id = e.markerId;
    var info = this.data.markers[id];
    this.setData({
      title: info.title,
      phone: info.phone,
      address: info.address,
      timestart: info.timestart,
      timeend: info.timeend,
      markerId: id
    })
  },
  /**
   * 路线
   */
  openRoute:function(){
    var latitude = this.data.latitude;
    var longitude = this.data.longitude;
    wx.openLocation({
      latitude: latitude,
      longitude: longitude,
    })
  },
  /**
   * 信息详情跳转
   */
  navidetail:function(e){
    var that=this;
    var id=that.data.markerId;
    var ai = that.data.markers
    var a = parseInt(id)
    if (!that.data.isBtnClicked) {
      wx.navigateTo({
        url: "/pages/eventdetails/eventdetails?iteminput=" + ai[a].iteminput + "&maininput=" + ai[a].maininput + "&placeinput=" + ai[a].placeinput + "&timeinputone=" + ai[a].timeinputone + "&timeinputtwo=" + ai[a].timeinputtwo + "&setinput=" + ai[a].phone + "&img=" + ai[a].img + "&eventwards=" + ai[a].eventwards + "&address=" + ai[a].address + "&eventdetail=" + ai[a].eventdetail + "&rule=" + ai[a].rule + "" + ai[a].id + "&Requeir_number=" + ai[a].minpeople + "&Roll_number=" + ai[a].joinnumber + "",

        success: function (res) {
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
    that.setData({
      isBtnClicked: true
    })
    setTimeout(function () {
      that.setData({
        isBtnClicked: false
      })
    }, 2000)
  }
})