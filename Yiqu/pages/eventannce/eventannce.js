var app      = getApp();

Page({
  data: {
    "pageurl4": {
      "realurl1": "/pages/eventdetails/eventdetails",
      "realurl2": ""
    },
    Array: [],
    area:0,
    isBtnClicked:false,
    'reachBottomFuc': [],
    "list1":{
      "type":"list",
      "style":"background-color:rgba(0, 0, 0, 0);color:rgb(34, 34, 34);font-size:37.5rpx;opacity:1;text-align:left;margin-left:auto;",
      "content":[
        /*{
          "iteminput":"消费助学行动",
          "eventwords":"你的一份消费，也许会有不一样的结果",
          "img": "http://594013.freep.cn/594013/FMS3SDL7VL0PZMB2JI3)EWW.png",
          //"content":"",
          "listStyle":"margin-bottom:23.4375rpx;background-color:rgb(255, 255, 255);height:480.46875rpx;margin-left:auto;",
          "imgStyle":"width:100%;height:351.5625rpx;margin-left:auto;",
          "secTitleStyle":"color:rgb(102, 102, 102);font-size:30.46875rpx;text-align:left;margin-left:auto;",
          //"titleWidth":"",
          "eventParams":"{\"inner_page_link\":\"\\\/pages\\\/page10021\\\/page10021\",\"is_redirect\":0}",
          //"eventHandler":"tapInnerLinkHandler",
          //"parentCompid":"list1",
          //"style":"",
          //"itemType":null,
          //"itemParentType":"list",
          "itemIndex":0,

          "maininput": '关注儿童基金会',
          "placeinput": '啡色酒吧',
          "timeinputone": '2018-5-1 8',
          "timeinputtwo": '2018-5-3 8',
          "setinput": '188****3474',
          "address": '武汉市汉江大道',
          "eventdetail": '活动主题由儿童基金会提供，根据某小学关于校舍修缮的求助。于啡色酒吧开展公益消费助学活动，活动时间段内消费所得均捐助于该小学。声明活动期间的消费资金由基金会直接接收。',
          "eventwards": '无',
          "rule": '活动期间属正常消费，消费金额由消费者划入指定账户，接收监督',
          "id":'',
          "minpeople": '',
          "rollpeople": ''
        },
        
        {
     
            "iteminput":"吃芒果大赛",
            "eventwords":"\u80fd\u5403\u4f60\u5c31\u6765\uff0c\u597d\u591a\u5956\u54c1\u968f\u4fbf\u62ff\uff0c\u8981\u5feb\u54e6\uff01",
            "img":"http:\/\/img.weiye.me\/zcimgdir\/thumb\/t_149199004658edf61e151d7.jpg",
            //"content":"",
            "listStyle":"margin-bottom:23.4375rpx;background-color:rgb(255, 255, 255);height:480.46875rpx;margin-left:auto;",
            "imgStyle":"width:100%;height:351.5625rpx;margin-left:auto;",
            "secTitleStyle":"color:rgb(102, 102, 102);font-size:30.46875rpx;text-align:left;margin-left:auto;",
            //"titleWidth":"",
            "eventParams":"{\"inner_page_link\":\"\\\/pages\\\/page10026\\\/page10026\",\"is_redirect\":0}","eventHandler":"tapInnerLinkHandler","parentCompid":"list1",
            //"style":"",
            //"itemType":null,
            //"itemParentType":"list",
            "itemIndex":1,


            "maininput": '湖北省农业经济有限责任公司',
            "placeinput": '红海酒吧',
            "timeinputone": '2016-8-3',
            "timeinputtwo": '2016-8-5',
            "setinput": '158****5644',
            "address": '武汉市光谷广场',
            "eventdetail": '本次活动旨在帮助果农更好更快销售完水果，由湖北省农业经济有限责任公司主办，红海酒吧提供活动场所。将在3-5号的三天时间的非营业时间里举办吃芒果大赛等多种比赛和游戏，希望各位消费者能够积极参与',
            "eventwards": '1.活动期间的水果价格均会降价出售2.比赛获得冠军的消费者将会获得由主办公司开具的获奖证书3.现场抽奖环节的幸运者将获得水果一箱',
            "rule": '具体比赛规则当天活动现场宣布',
            "id": '',
            "minpeople": '',
            "rollpeople": ''
          },
        {
   
          "iteminput": "义拍助学公益活动 ",
          "eventwords":"用您的一点消费额，也许能给另一个他带来光明",
          "img": "http://594013.freep.cn/594013/uygkjhlij.jpg",
          //"content": "",
          "listStyle": "margin-bottom:23.4375rpx;background-color:rgb(255, 255, 255);height:480.46875rpx;margin-left:auto;",
          "imgStyle": "width:100%;height:351.5625rpx;margin-left:auto;",
          "secTitleStyle": "color:rgb(102, 102, 102);font-size:30.46875rpx;text-align:left;margin-left:auto;",
          //"titleWidth": "",
          "eventParams": "{\"inner_page_link\":\"\\\/pages\\\/page10026\\\/page10026\",\"is_redirect\":0}", "eventHandler": "tapInnerLinkHandler", "parentCompid": "list1",
          //"style": "",
          //"itemType": null,
          //"itemParentType": "list",
          "itemIndex": 2,


          "maininput": '武汉永辉科技服务有限公司',
          "placeinput": '放学后酒吧',
          "timeinputone": '2018-3-24 20:00',
          "timeinputtwo": '2018-3-24 22:00',
          "setinput": '186****2318',
          "address": '武汉市江汉路商业街',
          "eventdetail": '因即将到来的销售淡季，武汉永辉科技服务有限公司将主办一场公益拍卖会，本次拍卖会活动场地位于时尚广场放学后酒吧，拍卖所得均捐赠给贫困山区儿童。同时声明与活动场所无任何利益交换',
          "eventwards": '1.若所得拍卖资金超过2000元，活动主办者将额外捐赠50%拍卖额2.若个人拍的金额超过300，活动举办方将赠送消费者公司纪念章一枚',
          "rule": '拍卖由一元起拍，消费者通过举手报价，一次加价十元，限定时间内最高出价者得',
          "id": '',
          "minpeople":'',
          "rollpeople":''
        },
        {

          "iteminput": "消防知识讲演活动",
          "eventwords": "别把生命当玩笑，感谢您的参与",
          "img": "http://594013.freep.cn/594013/qhfeq.jpg",
          //"content": "",
          "listStyle": "margin-bottom:23.4375rpx;background-color:rgb(255, 255, 255);height:480.46875rpx;margin-left:auto;",
          "imgStyle": "width:100%;height:351.5625rpx;margin-left:auto;",
          "secTitleStyle": "color:rgb(102, 102, 102);font-size:30.46875rpx;text-align:left;margin-left:auto;",
          //"titleWidth": "",
          "eventParams": "{\"inner_page_link\":\"\\\/pages\\\/page10021\\\/page10021\",\"is_redirect\":0}",
          //"eventHandler": "tapInnerLinkHandler",
          //"parentCompid": "list1",
          //"style": "",
          //"itemType": null,
          //"itemParentType": "list",
          "itemIndex": 3,

          "maininput": '湖北省武汉市消防总队',
          "placeinput": '丽笙星空酒吧',
          "timeinputone": '2016-10-11',
          "timeinputtwo": '2016-10-12',
          "setinput": '139****1805',
          "address": '武汉市后官湖绿荫大道',
          "eventdetail": '本次活动主要为了普及消防知识，提高民众的消防意识，能够加强消防应急管理，增高自救能力，减少人身财产的安全，促进社会的安定、家庭的幸福',
          "eventwards": '1.活动期间到达现场的观众均会得到《消防应急处理》书一本2.比赛获得冠军的参与者将会获得精美礼品一份3.现场参与互动的观众将获得消防手册一份',
          "rule": '1、各参赛队以赛前抽签结果决定竞答顺序2、到场观众在观看竞赛是保持会场安静3、竞赛结束离场时带走随身垃圾，保持会场整洁',
          "id": '',
          "minpeople": '',
          "rollpeople": ''
        },*/

 
          ],
      "customFeature":
      {
        "imgHeight":"150",
        "imgWidth":"322",
        "lineBackgroundColor":"rgb(255, 255, 255)",
        "lineBackgroundImage":"",
        "lineHeight":"205",
        "margin":"10",
        "mode":1,
        "secColor":"rgb(102, 102, 102)",
        "secFontSize":"30.5rpx",
        "secFontStyle":"",
        "secFontWeight":"",
        "secTextAlign":"left",
        "secTextDecoration":"",
        "sec_mode":"sec-mode"
      },
      "animations":[],
      "page_form":"",
      "compId":"list1",
      "itemType":"list",
      "itemParentType":null,
      "itemIndex":"list1"
    },
    "has_tabbar":0,
    "page_hidden":true,
    "page_form":""
    },

  onLoad: function (e) {
    var city = app.globalData.currentCity;
  console.log(city);
    var that=this;
    wx.request({
      url: 'https://www.qinyu123456.xyz/WX/returnactivitys.do',
      method: 'GET',
      data:{
        "XX":"jiazai",
        "city":city,
        "ID":"0"
      },
      header: {
        'content-type': 'application/json'
      },
      success:function(res){
        var v = res.data.actinfo;
        var an = that.data.Array;
        var j=v.length;
        var content_l = that.data.list1.content;
        for (var i = 0; i < j; i++) {
          an.push(res.data.actinfo[i]);
        }
        for (var i = 0; i < j; i++) {
          content_l.push(res.data.actinfo[i]);
        }
        for(var i=0;i<j;i++){
          var a1 = "list1.content[" + i + "]"
          that.setData({
            [a1]:an[i]
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


  
  onReachBottom: function () {
   
  },

  activelower:function(e){
    var that = this;
    var city = app.globalData.currentCity;
    var id_n = that.data.list1.content;
    var k = parseInt(id_n.length);
    var id_S = id_n[k - 1].id;
    wx.showNavigationBarLoading()
    console.log('--------下拉刷新-------')
    wx.request({
      url: 'https://www.qinyu123456.xyz/WX/returnactivitys.do',
      data: {
        "XX": "shuaxin",
        "city": city,
        "ID": id_S
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded;charset=utf-8'
      },
      success: function (res) {
        //--------------------将res.data写入Array数组
        var v = res.data.actinfo;
        var j = v.length;;
        if (j <= 0) {

        }

        else {
          var an = that.data.Array;
          var content = that.data.list1.content;
          var content_length = content.length;
          for (var i = 0; i < j; i++) {
            an.push(res.data.actinfo[i]);
          }
          //--------------------判断 Array数组的长度
          for (var i = 0; i < j; i++) {
            content.push(res.data.actinfo[i]);
          }
          var f = 0;
          for (var i = content_length; i < content.length; i++) {
            var c = "list1.content[" + (i - 1) + "]";
            that.setData({
              [c]: an[i]
            })
            if (f < k) f++;
          }
          var ary = that.data.Array;
          ary.splice(0, ary.length);
          console.log(that.data.list1.content);
          wx.hideNavigationBarLoading()
        }
      },
      fail: function () {
        wx.hideNavigationBarLoading()
        wx.showToast({
          title: '刷新失败',
          icon: 'loading',
          duration: 2000
        })

      }
    })
  },
 




  _pagenavigatedetail: function (e) {
    var that = this;
    if (!that.data.isBtnClicked) {
      var ai = that.data.list1.content
      var a = parseInt(e.currentTarget.id)
      console.log(a)
      wx.navigateTo({
        url: "/pages/eventdetails/eventdetails?iteminput=" + ai[a].iteminput + "&maininput=" + ai[a].maininput + "&placeinput=" + ai[a].placeinput + "&timeinputone=" + ai[a].timeinputone + "&timeinputtwo=" + ai[a].timeinputtwo + "&setinput=" + ai[a].phone + "&img=" + ai[a].img + "&eventwards=" + ai[a].eventwards + "&address=" + ai[a].address + "&eventdetail=" + ai[a].eventdetail + "&rule=" + ai[a].rule + "&id=" + ai[a].id + "&Requeir_number=" + ai[a].minpeople + "&Roll_number=" + ai[a].joinnumber + "&id=" + ai[a].id + "&Requeir_number=" + ai[a].minpeople + "&latitude=" + ai[a].latitude + "&longitude=" + ai[a].longitude,

        success: function (res) {
          console.log(ai[a]);
        },
        fail: function (res) {
          wx.showLoading({
            title: '加载失败',
          })
          setTimeout(function () {
            wx.hideLoading()
          }, 1000)
        },
        complete: function (res) { 
          that.setData({
            isBtnClicked: true
          })
          setTimeout(function () {
            that.setData({
              isBtnClicked: false
            })
          }, 2000)
        },
      })
    }

  
  }

})

          
