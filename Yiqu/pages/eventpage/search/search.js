// pages/eventpage/search/search.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    "pageurl1": {
      "realurl1": "/pages/bardetil/bardetil",
      "realurl2": "/pages/advertiserdetil/advertiserdetil",
      "realurl3": "/pages/eventdetails/eventdetails",
      "realurl4": "/pages/barrelease/barrelease",
    },
    isBtnClicked: false,
    "carousel1":{
      "isHistory": false,//是否有搜索历史
      "iconcolor":false,
      "searchHistory": [//搜索历史数组
        {
          "keyword": '饭米粒'
        }],
      "hotkey": [//热门推荐数组
        {
          "keywords": '饭米粒去'
        }],
    },
    
    searchinput:'',//是否输入
  
    "carousel2":{
      "backcolor": false,//点击背景色
      "msgList": [//储存文章列表信息
        {
          'word': '哈德大额'
        }
      ]
    }


  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that=this;
    // 页面初始化 options为页面跳转所带来的参数  

    // 如果缓存中有值，先从缓存中读取  
    var info = wx.getStorageSync("searchLog");
    if (info) {
      var searchHistory = "carousel1.searchHistory"
      var isHistory ="carousel1.isHistory";
      that.setData({
        [searchHistory]: info,
        [isHistory]:true
      });
    }

    wx.request({
      url: '',
      method:'GET',
      header: {
        'content-type': 'application/json'
      },
      success:function(res){
        var hotkey = "carousel1.hotkey"
        that.setData({
          [hotkey]:res.data.list
        })
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
  // 显示搜索历史记录  
  searchLogShowed: function () {
    var that = this;
    if ("" != wx.getStorageSync('searchLog')) {
      that.setData({
        searchLogShowed: true,
        searchLogList: wx.getStorageSync('searchLog')
      });
    } else {
      that.setData({
        searchLogShowed: true
      });
    }
  }, 
  /**
   * 搜索词条触摸行为开始
   */
  searchtouchstart:function(e){
    var that = this;
    var arrayindex = e.target.dataset.dataid;
    var backcolor = "array["+arrayindex+"].backcolor"
    that.setData({
      backcolor:true
    })
  },
    /**
   * 搜索词条触摸移动
   */
  searchtouchmove:function(e){
    var that = this;
    var arrayindex = e.target.dataset.dataid;
    var backcolor = "array[" + arrayindex + "].backcolor"
    that.setData({
      backcolor: false
    })
  },
  _pagenavigatereal:function(){
    var that = this;
    var navi = "/pages/eventdetails/eventdetails?iteminput=" + ai[a].iteminput + "&maininput=" + ai[a].maininput + "&placeinput=" + ai[a].placeinput + "&timeinputone=" + ai[a].timeinputone + "&timeinputtwo=" + ai[a].timeinputtwo + "&setinput=" + ai[a].phone + "&img=" + ai[a].img + "&eventwards=" + ai[a].eventwards + "&address=" + ai[a].address + "&eventdetail=" + ai[a].eventdetail + "&rule=" + ai[a].rule + "" + ai[a].id + "&Requeir_number=" + ai[a].minpeople + "&Roll_number=" + ai[a].joinnumber + "";
    app.naviSlect(this, navi);
    setTimeout(function () {
      that.setData({
        backcolor: false
      })
    }, 500)
  },
  /**
   * 搜索输入
   */
  searchinput:function(e){

    var that = this;
    // 如果不做这个if判断，会导致 searchLogList 的数据类型由 list 变为 字符串  
    if ("" != wx.getStorageSync('searchLog')) {
      var searchHistory ="carousel1.searchHistory"
      that.setData({
        searchinput: e.detail.value,
        [searchHistory]: wx.getStorageSync('searchLog')
      });
    } else {
      that.setData({
        searchinput: e.detail.value,
      });
    }
  },
  /**
   * 触摸开始
   */
  touchflash:function(e){
    var that=this;
    var switchdata = e.target.dataset.dataid;
    switch(switchdata){
      case "a": {
        var iconcolor = "carousel1.iconcolor";
        that.setData({
          [iconcolor]: true
        })};break;
        case "b":{
        var backcolor = "carousel2.backcolor";
        that.setData({
          [backcolor]: true
        })
        };break;
        default:break;
    }


  },
  /**
   * 触摸移动
   */
  touchend:function(e){
    var that = this;
    var iconcolor = "carousel1.iconcolor";
    var switchdata = e.target.dataset.dataid;
    switch (switchdata) {
      case "a": {
        that.setData({
          [iconcolor]: false
        })};break;
      case "b":{
        var backcolor = "carousel2.backcolor";
        that.setData({
          [backcolor]: false
        })
      };break;
      default:break;

    }
  },
  /**
   * 清除搜索记录
   */
  _pagenavigatereal:function(){
    var that = this;
    var isHistory ="carousel1.isHistory";
    var iconcolor = "carousel1.iconcolor"
    that.setData({
      [isHistory]: false
    });
    setTimeout(function(){
      that.setData({
        [iconcolor]: true
      })
    },500)
    wx.removeStorageSync("searchLog");
  },
   /**
    * 搜索跳转详情页面
    */
  _pagenavigatereal_detail:function(e){
    var that=this;
    var a = parseInt(e.currentTarget.id)
    var searchinput = that.data.searchinput;
    if (!that.data.isBtnClicked) {
      var navi = "/pages/eventdetails/eventdetails?iteminput=" + ai[a].iteminput + "&maininput=" + ai[a].maininput + "&placeinput=" + ai[a].placeinput + "&timeinputone=" + ai[a].timeinputone + "&timeinputtwo=" + ai[a].timeinputtwo + "&setinput=" + ai[a].phone + "&img=" + ai[a].img + "&eventwards=" + ai[a].eventwards + "&address=" + ai[a].address + "&eventdetail=" + ai[a].eventdetail + "&rule=" + ai[a].rule + "&id=" + ai[a].id + "&Requeir_number=" + ai[a].minpeople + "&Roll_number=" + ai[a].joinnumber + "&id=" + ai[a].id + "";
      app._pagenavigate(navi2);
    }
    that.setData({
      isBtnClicked: true
    })
    setTimeout(function () {
      that.setData({
        isBtnClicked: false
      })
    }, 2000)
    // 搜索后将搜索记录缓存到本地  
    if ("" != searchinput) {
      var searchLogData = that.data.searchLogList;
      searchLogData.push(searchinput);
      wx.setStorageSync('searchLog', searchLogData);
    }  
  },
  /**
   * 搜索页面跳转
   */
  navigate_soso:function(e){
    var switchdata = e.target.dataset.type;
    var a = parseInt(e.currentTarget.id);
    switch (switchdata){
      case 'HS':{
        var Etype = "carousel1.searchHistory[" + a +"].key";
      };break;
      case 'SF':{
        var Etype = "carousel1.hotkey[" + a + "].key";
        if (Etype=="1"){
          if (!that.data.isBtnClicked) {
            var navi = "/pages/eventdetails/eventdetails?iteminput=" + ai[a].iteminput + "&maininput=" + ai[a].maininput + "&placeinput=" + ai[a].placeinput + "&timeinputone=" + ai[a].timeinputone + "&timeinputtwo=" + ai[a].timeinputtwo + "&setinput=" + ai[a].phone + "&img=" + ai[a].img + "&eventwards=" + ai[a].eventwards + "&address=" + ai[a].address + "&eventdetail=" + ai[a].eventdetail + "&rule=" + ai[a].rule + "&id=" + ai[a].id + "&Requeir_number=" + ai[a].minpeople + "&Roll_number=" + ai[a].joinnumber + "&id=" + ai[a].id + "";
            app._pagenavigate(navi2);
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
        else if (Etype == "0"){
    if (!that.data.isBtnClicked) {
      var navi = "/pages/eventdetails/eventdetails?iteminput=" + ai[a].iteminput + "&maininput=" + ai[a].maininput + "&placeinput=" + ai[a].placeinput + "&timeinputone=" + ai[a].timeinputone + "&timeinputtwo=" + ai[a].timeinputtwo + "&setinput=" + ai[a].phone + "&img=" + ai[a].img + "&eventwards=" + ai[a].eventwards + "&address=" + ai[a].address + "&eventdetail=" + ai[a].eventdetail + "&rule=" + ai[a].rule + "&id=" + ai[a].id + "&Requeir_number=" + ai[a].minpeople + "&Roll_number=" + ai[a].joinnumber + "&id=" + ai[a].id + "";
      app._pagenavigate(navi2);
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

        else if (Etype == null){

        }
        else{
          wx.showToast({
            title: '加载错误',
            duration:1000,
          })
        }
      };break;
      default:break;
    }
  },
  searchCancel:function(){
    wx.navigateBack({
      delta: 1,
    })
  }
})