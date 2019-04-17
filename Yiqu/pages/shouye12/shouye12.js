// pages/shouye12/shouye12.js
var util = require("../../utils/util.js");
var app=getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
     Array:[],
    'discuss':'暂无讨论',
     "annce":'非营利性活动发布平台',
     'src1':"http://594013.freep.cn/594013/30%20(1).jpg",
     'src2': "http://594013.freep.cn/594013/asfqegw.jpg",
     "suggestion":true,
     hasmore:true,
     isBtnClicked: false,
    "arcticle":{
      "content1":[{
        "summary":'关于公益消费的那点事',
        "arctl1":'为支持公益事业而选择的消费，统称为“公益消费”。在日常消费需求的基础上，不增加任何货币负担，只需选择具有“公益消费”的性质的产品和单位，进行消费或购物，均视为公益消费。包含：餐厅就餐、宾馆住宿、商场购物、旅游参观、服务场所、娱乐场所、婚沙影楼、美容美发等一切消费方式。经“公益消费”认可推荐的产品或单位其质量、价格、服务等多方面都是相当的优秀：物美价廉，质量上层，服务周到...',
        "src1":'http://594013.freep.cn/594013/sawe.jpg',
        "arctl2": '\n公益消费，简单的说就是消费者通过消费间接进行了公益活动。广义的来说，凡是直接或间接进行消费而参与了公益活动都可以归入公益消费，如直接购物捐赠。\n\n\xa0\xa0\xa0\xa0\xa0\xa0\xa0公益消费是将公益导入消费的一种新颖消费方式，简单说来就是把人们的日常消费活动赋予一定的公益性质。公益消费的兴起，使更多普通市民有机会通过一次简单的消费过程奉献爱心。\n消费者参与公益消费不需要额外花钱，只要在消费时使用特定的银行公益消费卡、选择指定商家正常刷卡消费，即可实现奉献爱心和获得爱心积分奖励的双重效果。\n\n\xa0\xa0\xa0\xa0\xa0\xa0\xa0公益消费的表现之一是商家联动义卖，消费积分有奖。公益销售商家自愿将公益消费额的一定比例（商家自定）作为捐赠善款；消费者只需在定点商家自然消费，无需多花钱即完成了爱心捐献的心愿。从而形成商家和消费者“双向认捐”的结果。商家参与既树立了企业的社会公益形象，又通过爱心吸引和宣传联动的方式，聚拢消费人气，带动经营效益；消费者参与可通过消费献爱心，又可享受商家特定优惠，还可累计积分，有机会获得积分返奖、抽奖等额外回报。',
        "src2": 'http://594013.freep.cn/594013/thyt.jpg',
        "arctl3": '公益消费活动，从参与群体看，把捐赠者从个别人和个别成功企业扩大到全体消费者和全部消费、服务企业，实现了公益捐赠的社会化，调动全民之力，解决了社会保障的死角问题；从募捐方式看，突破了以往公益组织向成功企业单向募捐的简单做法，实现了公益为企业发展服务、企业为公益募捐服务的双赢局面，有利于形成广大企业踊跃参与公益事业的良好社会风尚。\n就公益消费的社会影响来看，由于参与人、参与企业的数量庞大，多个特定媒体的有效宣传，以及大量的公益消费推介活动，必将引起强烈的社会反响，有利于全社会形成关注公益、参与公益的良好风气和道德取向；从百姓角度看，在正常消费的同时就能实现对公益事业的捐赠，不但奉献了爱心，还能得到加盟商家的积分消费奖励，让人乐于接受。',
        "src3": 'http://594013.freep.cn/594013/sdver.jpg',
        "arctl4": '\n\xa0\xa0\xa0\xa0\xa0\xa0\xa0公益消费为每一个有消费行为的普通大众提供了一个既不增加经济负担，又可以时时处处参与公益、扶弱济困的最为方便的途径，正是所谓的公益平民化、公益日平常化。消费者的每次消费都会根据消费额产生一定的消费积分，在积分达到一定额度时，会得到相应的实惠奖励，从而对消费者形成有效的激励，促使消费者自觉选择指定商家进行长期、定点消费，养成公益生活化、公益长久化的良好习惯。这种既不增加消费者经济负担，又可以通过日常消费行为奉献爱心、扶弱济困并得到爱心回报的科学制度必将吸引广大消费者踊跃参与，有利于实现全民参与公益、人人奉献爱心的良好社会效益。',
        "src4": 'http://594013.freep.cn/594013/ytute.jpg',
        "time":'2017-11-12'
      },
      {
        "summary": '我对公益的那一点感想',
        "arctl1": '公益，和慈善的区别在于公益是大多数人的捐助。虽然公益所带来的帮助不一定大，但公益的社会意义和影响却不是慈善所比拟的。其中的差别，非一字一句能说清楚的。',
        "src1": 'http://pic.58pic.com/58pic/14/25/05/09b58PIC8VC_1024.jpg',
        "arctl2": '慈善的捐赠被大众看作理所当然，种种灾难大事的背后总少不了慈善捐款的身影，但纵使再多的财富大佬的捐赠，也无法改变目前社会阶级固化的现状。大数据和互联网改变了人们的生活方式，导致许多人涌入城市，给大城市带来了巨大的发展，资源也完全倾向这些城市。也就造成了中国目前仅少数几个城市繁荣，城市资源差距以及贫富差距过大的现象。更可怕的这是一种正反馈调节，不是一个组织或者部门能解决的。所以单凭借慈善是无法扭转这种局面的，更需要公益的力量。',
        "src2": 'http://594013.freep.cn/594013/R2115R1.jpg',
        "arctl3": '有个朋友和我说过他的经历，他有次约了一位好友聚餐，约在公交站台见面，无奈好友堵车。那时已经饥肠辘辘，正巧旁边有个大爷在卖烤红薯，当时就想买一个红薯算了。但觉得好不容易和好友聚会，就放弃了买红薯的念头。最后聚会点了一杯饮料、一盘烤肠、一份炒饭、一份金针菇，花费了二百多元。事后朋友感叹，红薯和烧烤同样能解决温饱，为什么不给穷人一点帮助呢。例子简单，意味却深刻无比，当我们进行消费的时候，是否想到过同样可以管饱的楼下的红薯呢。当我们在看电影的时候，是否想到过楼下正在打地铺的流浪者呢。我们所谓的善良和爱心只是体现在看见别人的厄运流露出来的吗？我们消费的过程中又想到过那些生活困难的人呢？',
        "src3": 'http://594013.freep.cn/594013/wdasb.jpg',
        "arctl4": '公益不应该是同情，而是一种自然而然的行为，与正常的消费没有两样。道理简单就是如此简单，那为什么不尝试一下呢',
        "src4": '',
        "time": '2017-11-13'
      },
      {
        "summary": '汤姆鞋的善因营销',
        "arctl1": '汤姆斯鞋是一款价格便宜的布鞋，一双鞋35英镑，穿着舒适，深受大众的喜爱。汤姆斯鞋由美国加州圣摩尼卡的布莱克创办于二零零六年。创办之初，布莱克只是想让世界上没有鞋穿的孩子都有一双自己的鞋，因此，创办的理念很简单：每卖出一双鞋子，就捐赠一双给第三世界的孩子。',
        "src1": 'http://www.zhuwang.cc/uploadfile/2016/1206/20161206025101738.jpg',
        "arctl2": '创办了半年左右，生意不见有多大起色，转机出现在二零零六年的五月二十一日，一家报纸报道了他“卖一双，捐一双”的故事，立刻引起轰动，人们为布莱克的事迹所感动，短短一天之内，他就接到二千多双鞋子的订单。当年暑假结束时，他已经卖出当年暑假结束时，他已经卖出了一万双鞋子，这也就意味着他也捐出了一万双鞋子。布莱克在改变自己命运的同时也改变了别人的命运。他的事迹也越传越广。从来不做广告的汤姆斯鞋，凭着良好的口碑，截止目前已经共卖出约四千万双，这意味着来自非洲、拉丁美洲、亚洲等贫困地区的三千八百万双小脚得以有鞋子的保护。布莱克·麦考斯基的汤姆斯鞋也越做越大。',
        "src2": 'http://594013.freep.cn/594013/abce99e7c9177f.jpg',
        "arctl3": '在做公益的同时，也为自己赢得了发展的空间，让每一个买汤姆斯鞋的人都觉得自己卖的并不仅仅是一双鞋，还送出了自己的一份爱心。利己的同时也利人，这就是汤姆斯鞋成功的密码。',
        "src3": '',
        "arctl4": '',
        "src4": '',
        "time": '2017-11-13'
      }
      ]

    },
    /*---------------------------------------------------------------一级-----------carousel2------------------------------------------*/



    "carousel2": {
      "type": "carousel", "style": "height:351.5625rpx;margin-left:auto;margin-right:auto;margin-top:0;opacity:1;",



      /*----------------二级------------content------------------------------------------*/



      "content":
      [{
        "customFeature": {
          "action": "goods-trade",
          "goods-id": "1006874",
          "goods-name": "\u8c6a\u534e\u5927\u5305\u95f4\u7279\u4ef7\u5566"
        },
        "pic": "http://594013.freep.cn/594013/%E5%A4%A7.jpg", "content": "",
        "parentCompid": "carousel2",
        "style": "",
        "itemType": null, "itemParentType": "carousel", 
        "itemIndex": 0, "eventParams": "{\"goods_id\":\"1006874\",\"goods_type\":null}",
        "eventHandler": "tapGoodsTradeHandler"
      },

      {
        "customFeature": { "action": "inner-link", "page-link": "page10011" },
        "pic": "http://594013.freep.cn/594013/timgGJU21UTP.jpg",
        "content": "",
        "parentCompid": "carousel2",
        "style": "",
        "itemType": null,
        "itemParentType": "carousel",
        "itemIndex": 1,
        "eventParams": "{\"inner_page_link\":\"\\\/pages\\\/page10011\\\/page10011\",\"is_redirect\":0}",
        "eventHandler": "tapInnerLinkHandler"
      }],


      /*----------------二级------------content------------------------------------------*/



      "customFeature": { "autoplay": true, "interval": 4},
      "animations": [],
      "page_form": "",
      "compId": "carousel2"
    },


    /*-----------------------------------------------一级-----------carousel2-------------end-----------------------------*/

    "Suggest_A":{
      "cuss":[]
    },
    "suggestion_a":null
    
    
  
  },

  /**
   * 生命周期函数--监听页面加载
   * 获取论坛信息
   */
  onLoad: function (options) {
    var that = this;
    console.log(app.globalData.locationInfo.longitude)
    wx.request({
      url: 'https://60621316.gyjingling.cn',
      method: 'GET',
      data: {
      },
      header: {
        'content-type': 'application/json'
      },
      success: function (res) {
        var v = res.data.result;
        var j = v.length;
        var an = that.data.Array;
        an.push(res.data.result[j - 1]);
        var local_content = that.data.arcticle.content1;
        var l1 = local_content[0].summary;
        var l2 = local_content[1].summary;
        var l3 = local_content[2].summary;
        var k1 = an.summary;
        if (l1 != k1 && l2 != k1 && l3 != k1) {
          local_content[2]=local_content[1];
          var as1 = local_content[1];

          local_content[1] = local_content[0];
          var as2 = local_content[0];

          local_content[0]=an;
          var c1 = "arcticle.content1[" + 0 + "]";
          var c2 = "arcticle.content1[" + 1 + "]";
          var c3 = "arcticle.content1[" + 2 + "]";
          that.setData({
            [c1]:an,
            [c2]:as2,
            [c3]:as1
          })
          var ary = that.data.Array;
          ary.splice(0, ary.length);
        }
        else{
          var ary = that.data.Array;
          ary.splice(0, ary.length);
        }
      },
      fail: function () {

      }
    })
    wx.request({
      url: 'https://www.qinyu123456.xyz/WX/returnforums.do',
      data: {
        "XX":"jiazai",
        "ID":0
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded;charset=utf-8' 
      },
      success:function(res){

        var v = res.data.test;
        //var query_clone = JSON.parse(decodeURIComponent(JSON.stringify(res.data)));
        //var v = decodeURIComponent(res.data.advinfo);
        var j = v.length;
        var an = that.data.Array;
        var local_content = that.data.Suggest_A.cuss;
        for(var i=0;i<j;i++){
          an.push(res.data.test[i]);
        }
        for (var i = 0; i < j; i++) {
          local_content.push(an[i]);
        }
       for(var i=0;i<j;i++){
         var l = "Suggest_A.cuss[" + i + "]";
         console.log(an[i].suggestime);
         var a = app.DateSelect(an[i].suggestime);
         console.log(a);
         var time = "Suggest_A.cuss[" + i + "].suggestime";
       that.setData({
           [l]:an[i],
           [time]: a
         })
       }
       var ary = that.data.Array;
       ary.splice(0, ary.length);
      },
      fail:function(){
        that.setData({
          suggestion:false
        })
      }
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
   /* var currenttime = new Date(util.formatTime());
    console.log(currenttime);
    var arraydate = new Date(Date.parse(an[i].suggestime));
    console.log(arraydate);
    var iDays = parseInt((currenttime - arraydate) / 1000);
    console.log(iDays);
    var IDate = "0";
    if (iDays < 0) {

    }
    else if (iDays > 0 && iDays < 60) {
      IDays = iDays + "秒前";
      console.log(iDays);
      that.setData({
        [l]: an[i],

        [time]: IDate,
      })
    }
    else if (iDays > 60 && iDays < 3600) {
      IDate = parseInt(iDays / 60)
      IDate = IDate + "分钟前";
      console.log(IDate);
      that.setData({
        [l]: an[i],

        [time]: IDate,
      })
    }
    else if (iDays > 3600 && iDays < 86400) {
      IDate = parseInt(iDays / 3600)
      IDate = IDate + "小时前";
      console.log(IDate);
      that.setData({
        [c1]: an[i],

        [time]: IDate,
      })
    }
    else if (iDays < 2592000 && iDays > 86400) {
      IDate = parseInt(iDays / 86400)
      IDate = IDate + "天前";
      console.log(IDate);
      that.setData({
        [l]: an[i],

        [time]: IDate,
      })
    }
    else if (iDays > 2592000 && iDays < 2592000 * 12) {
      IDate = parseInt(iDays / 2592000)
      IDate = IDate + "月前";
      console.log(IDate);
      that.setData({
        [l]: an[i],

        [time]: IDate,
      })
    }
    else if (iDays > 2592000 * 12) {
      IDate = parseInt(iDays / (2592000 * 12));
      IDate = IDate + "年前";
      console.log(IDate);
      that.setData({
        [l]: an[i],

        [time]: IDate,
      })
    }
    wx.showModal({
      title: 'tishi',
      content: IDate,
    })*/
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
   * 下拉刷新
   */
  lower:function(){

    var that=this;
    if (that.data.hasmore==true) {
    that.data.hasmore = false;
    var content=that.data.Suggest_A.cuss;
    var x=parseInt(content.length);
    var suggestime = content[x - 1].id
    that.setData({
      suggestion_a:false
    })
    wx.request({
  
      url: 'https://www.qinyu123456.xyz/WX/returnforums.do',
     // method: 'GET',
      data: {
        ID: suggestime,
        XX:"shuaxin"
      },
      header: {
        "Content-Type": "multipart/ form - data"
      },
      success:function(res){
        var v = res.data.test;
        var j = parseInt(v.length);
        if(j==3){
        var an = that.data.Array;
        var local_content = that.data.Suggest_A.cuss;
     
        for (var i = 0; i < j; i++) {
          an.push(res.data.test[i]);
        }
        for (var i = 0; i < j; i++) {
          local_content.push(an[i]);
        }
        
        var k = local_content.length;
        var f = 0;
        for(var i=x;i<k;i++){
          var c1 = "Suggest_A.cuss[" + i + "]";
          var time = "Suggest_A.cuss[" + i + "].suggestime_view";

          var IDate=app.DateSelect(an[f].suggestime);
          that.setData({
            [c1]: an[f],
            suggestion: true,
            [time]: IDate,
          })
            if (f < k) {
              f++
            }
          
        }

        console.log(local_content);
      }
        else if (j <3) { 
          that.setData({
            suggestion_a:true
          })
        }
      },
      fail:function(e){
        wx.showLoading({
          title: '网络错误',
        })
        setTimeout(function(){
          wx.hideLoading();
        },1000)
      },
      complete:function(){
        setTimeout(function () {
          that.setData({
            hasmore : true
          })
        }, 1000)
      }
    })
    var ary = that.data.Array;
    ary.splice(0, ary.length);
    }
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
  _bindquan:function(){
    wx.showModal({
      showCancel:false,
      title: '提示',
      content: '请参加相关活动领取',
    })
  },
  /**
   * 文章跳转
   */
  _Arctivlehe:function(e){
    var that=this;
    if (!that.data.isBtnClicked) {
      var navi = "/pages/arcticle/arcticle";
      var en = that.data.arcticle.content1;
      var a = parseInt(e.currentTarget.id);
      var navi2 = navi + "?summary=" + en[a].summary + "&time=" + en[a].time + "&arctl1=" + en[a].arctl1 + "&src1=" + en[a].src1 + "&arctl2=" + en[a].arctl2 + "&src2=" + en[a].src2 + "&arctl3=" + en[a].arctl3 + "&src3=" + en[a].src3 + "&arctl4=" + en[a].arctl4 + "&src4=" + en[a].src4;
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

  },

})
