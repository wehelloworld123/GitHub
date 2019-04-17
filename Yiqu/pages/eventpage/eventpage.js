// pages/eventpage/eventpage.js
var app = getApp();
Page({
  /**
   * 页面的初始数据
   */
  data: {
    Array:[],
    isBtnClicked: false,
    "pageurl7": {
      "realurl1": "/pages/advertiser/advertiser",
      "realurl2": "/pages/bar/bar",
      "realurl3": "/pages/Jointrelease/Jointrelease",
      "realurl4": "/pages/eventpage/neighbouring/neighbouring"
    },
    city: "",
    selectCity_hidden: true,
    show: false,

//---------透明度改变-----
    
    opacity_a: false,//信息图标透明度
    opacity_b: false,//场地图标透明度
    opacity_1: false,//活动图标透明度
    opacity_2: false,//娱乐图标透明度
    opacity_3: false,//发布图标透明度
    opacity_4: false,//分享图标透明度
    opacity_5: false,//二维码图标透明度
    opacity_6: false,//二维码图标透明度
//---------透明度改变-----

    S_city: '',
    Index: 0,

    country: ['中国'],
    pro: ['安徽', '北京', '重庆', '福建', '甘肃', '广东', '广西', '贵州', '海南', '河北', '河南', '黑龙江', '湖北', '湖南', '吉林', '江苏', '江西', '辽宁', '内蒙古', '宁夏', '青海', '山东', '山西', '陕西', '上海', '四川', '天津', '西藏', '新疆', '云南', '浙江', '港澳台'],
    pro_ah: ['合肥', '芜湖', '蚌埠', '阜阳', '淮南', '安庆', '宿州', '六安', '淮北', '滁州', '马鞍山', '铜陵', '宣城', '亳州', '池州', '黄山'],
    pro_bj: ['北京'],
    pro_cq: ['重庆'],
    pro_fj: ['福州', '厦门', '宁德', '莆田', '泉州', '漳州', '龙岩', '三明', '南平', '钓鱼岛'],
    pro_gs: ['兰州', '嘉峪关', '金昌', '白银', '天水', '武威', '张掖', '酒泉', '平凉', '庆阳', '定西', '陇南', '甘南', '临夏'],
    pro_gd: ['广州', '深圳', '珠海', '汕头', '佛山', '韶关', '湛江', '肇庆', '江门', '茂名', '惠州', '梅州', '汕尾', '河源', '阳江', '清远', '东莞', '中山', '潮州', '揭阳', '云浮'],
    pro_gx: ['南宁', '崇左', '柳州', '来宾', '桂林', '梧州', '贺州', '玉林', '贵港', '百色', '钦州', '河池', '北海', '防城港'],
    pro_gz: ['贵阳', '遵义', '安顺', '六盘水', '铜仁', '毕节', '黔东南', '黔西南', '黔南'],
    pro_hn: ['海口', '三亚', '三沙', '儋州'],
    pro_hb: ['石家庄市', '唐山', '邯郸', '秦皇岛', '保定', '张家口', '承德', '廊坊', '沧州', '衡水', '邢台'],
    pro_hen: ['郑州', '洛阳', '开封', '安阳', '新乡', '濮阳', '焦作', '鹤壁', '三门峡', '商丘', '许昌', '漯河', '平顶山', '驻马店', '周口', '南阳', '信阳', '济源'],
    pro_hlj: ['哈尔滨', '齐齐哈尔', '鸡西', '鹤岗', '双鸭山', '大庆', '伊春', '佳木斯', '七台河', '牡丹江', '黑河', '绥化', '大兴安岭'],
    pro_hub: ['武汉', '宜昌', '襄阳', '荆州', '十堰', '黄石', '孝感', '黄冈', '恩施', '荆门', '咸宁', '鄂州', '随州', '潜江', '天门', '仙桃', '神农架'],
    pro_hun: ['长沙', '岳阳', '常德', '株洲', '湘潭', '衡阳', '益阳', '张家界', '郴州', '娄底', '邵阳', '永州', '怀化', '湘西'],
    pro_jl: ['长春', '吉林', '四平', '辽源', '通化', '白山', '松原', '白城'],
    pro_js: ['南京', '无锡', '徐州', '常州', '苏州', '南通', '连云港', '淮安', '盐城', '扬州', '镇江', '泰州', '宿迁'],
    pro_jx: ['南昌', '景德镇', '萍乡', '九江', '新余', '鹰潭', '赣州', '吉安', '宜春', '抚州', '上饶'],
    pro_ln: ['沈阳', '大连', '鞍山', '抚顺', '本溪', '丹东', '锦州', '营口', '阜新', '辽阳', '盘锦', '铁岭', '朝阳', '葫芦岛'],
    pro_nmg: ['呼和浩特', '包头', '乌海', '赤峰', '通辽', '鄂尔多斯', '呼伦贝尔', '巴彦淖尔', '乌兰擦布'],
    pro_nx: ['银川', '石嘴山', '吴忠', '固原', '中卫'],
    pro_qh: ['西宁', '海东'],
    pro_sd: ['青岛', '济南', '烟台', '潍坊', '临沂', '济宁', '淄博', '威海', '东营', '日照', '泰安', '滨州', '枣庄', '德州', '聊城', '莱芜', '菏泽'],
    pro_sx: ['太原', '大同', '阳泉', '长治', '晋城', '朔州', '晋中', '运城', '忻州', '临汾', '吕梁'],
    pro_shx: ['西安', '铜川', '宝鸡', '咸阳', '渭南', '延安', '汉中', '榆林', '安康', '商洛'],
    pro_sh: ['上海'],
    pro_sc: ['成都', '攀枝花', '绵阳', '自贡', '泸州', '德阳', '广元', '遂宁', '内江', '乐山', '资阳', '宜宾', '南充', '达州', '雅安', '广安', '巴中', '眉山', '阿坝州', '甘孜州', '凉山州'],
    pro_tj: ['天津'],
    pro_xz: ['拉萨', '日喀则', '昌都', '林芝', '山南'],
    pro_xj: ['乌鲁木齐', '克拉玛依', '吐鲁番', '哈密'],
    pro_yn: ['昆明', '曲靖', '玉溪', '保山', '昭通', '丽江', '普洱', '临沧', '安康'],
    pro_zj: ['杭州', '宁波', '温州', '嘉兴', '湖州', '绍兴', '金华', '衢州', '舟山', '台州', '丽水'],
    pro_gat: ['香港', '澳门', '台湾'],


    "pageurl":{
      "url1":"/pages/eventannce/eventannce?title=navigate"
    },
    "eventParams":
    {"inner_page_link": "\/pages\/page10021\/page10021",
     "is_redirect": 0},
    "eventParams":
     {
       "inner_page_link": "\/pages\/page10022\/page10022",
        "is_redirect": 0 
        },
    "list1": {
      "type": "list",
      "style": "background-color:rgba(0, 0, 0, 0);color:rgb(34, 34, 34);font-size:37.5rpx;opacity:1;text-align:left;margin-left:auto;",
      "content": [
        {
          /*"customFeature":
          {
            "action": "inner-link",
            "page-link": "page10021"
          },*/
          "iteminput": "消费助学行动",
          "eventwords": "你的一份消费，也许会有不一样的结果",
          "img": "http://594013.freep.cn/594013/FMS3SDL7VL0PZMB2JI3)EWW.png",
          "content": "",
          "listStyle": "margin-bottom:23.4375rpx;background-color:rgb(255, 255, 255);margin-left:auto;",
   
          "secTitleStyle": "color:rgb(102, 102, 102);font-size:30.46875rpx;text-align:left;margin-left:auto;",
          "titleWidth": "",
          "eventParams": "{\"inner_page_link\":\"\\\/pages\\\/page10021\\\/page10021\",\"is_redirect\":0}",
          "eventHandler": "tapInnerLinkHandler",
          "parentCompid": "list1",
          "style": "",
          "itemType": null,
          "itemParentType": "list",
          "itemIndex": 0,

          "maininput": '关注儿童基金会',
          "placeinput": '啡色酒吧',
          "timeinputone": '2018-5-2',
          "timeinputtwo": '2018-5-3',
          "phone": '188****3474',
          "address": '武汉市汉江大道',
          "eventdetail": '活动主题由儿童基金会提供，根据某小学关于校舍修缮的求助。于啡色酒吧开展公益消费助学活动，活动时间段内消费所得均捐助于该小学。声明活动期间的消费资金由基金会直接接收。',
          "eventwards": '无',
          "rule": '活动期间属正常消费，消费金额由消费者划入指定账户，接收监督',
          "id": '',
          "minpeople": '80人',
          "joinnumber": '0'
        },

        {
          /*"customFeature":
          {
            "action": "inner-link",
            "page-link": "page10026"
          },*/
          "iteminput": "吃芒果大赛",
          "eventwords": "\u80fd\u5403\u4f60\u5c31\u6765\uff0c\u597d\u591a\u5956\u54c1\u968f\u4fbf\u62ff\uff0c\u8981\u5feb\u54e6\uff01",
          "img": "http:\/\/img.weiye.me\/zcimgdir\/thumb\/t_149199004658edf61e151d7.jpg",
          "content": "",
          "listStyle": "margin-bottom:23.4375rpx;background-color:rgb(255, 255, 255);margin-left:auto;",

          "secTitleStyle": "color:rgb(102, 102, 102);font-size:30.46875rpx;text-align:left;margin-left:auto;",
          "titleWidth": "",
          "eventParams": "{\"inner_page_link\":\"\\\/pages\\\/page10026\\\/page10026\",\"is_redirect\":0}", "eventHandler": "tapInnerLinkHandler", "parentCompid": "list1",
          "style": "",
          "itemType": null,
          "itemParentType": "list",
          "itemIndex": 1,


          "maininput": '湖北省农业经济有限责任公司',
          "placeinput": '红海酒吧',
          "timeinputone": '2016-8-3',
          "timeinputtwo": '2016-8-5',
          "phone": '158****5644',
          "address": '武汉市光谷广场',
          "eventdetail": '本次活动旨在帮助果农更好更快销售完水果，由湖北省农业经济有限责任公司主办，红海酒吧提供活动场所。将在3-5号的三天时间的非营业时间里举办吃芒果大赛等多种比赛和游戏，希望各位消费者能够积极参与',
          "eventwards": '1.活动期间的水果价格均会降价出售2.比赛获得冠军的消费者将会获得由主办公司开具的获奖证书3.现场抽奖环节的幸运者将获得水果一箱',
          "rule": '具体比赛规则当天活动现场宣布',
          "id": '',
          "minpeople": '80人',
          "joinnumber": '0'
        },
        {
          //"customFeature":
          //{
          //  "action": "inner-link",
           // "page-link": "page10026"
          //},
          "iteminput": "义拍助学公益活动 ",
          "eventwords": "用您的一点消费额，也许能给另一个他带来光明",
          "img": "http://594013.freep.cn/594013/uygkjhlij.jpg",
          "content": "",
          "listStyle": "margin-bottom:23.4375rpx;background-color:rgb(255, 255, 255);margin-left:auto;",

          "secTitleStyle": "color:rgb(102, 102, 102);font-size:30.46875rpx;text-align:left;margin-left:auto;",
          "titleWidth": "",
          "eventParams": "{\"inner_page_link\":\"\\\/pages\\\/page10026\\\/page10026\",\"is_redirect\":0}", "eventHandler": "tapInnerLinkHandler", "parentCompid": "list1",
          "style": "",
          "itemType": null,
          "itemParentType": "list",
          "itemIndex": 2,


          "maininput": '武汉永辉科技服务有限公司',
          "placeinput": '放学后酒吧',
          "timeinputone": '2017-3-24 20:00',
          "timeinputtwo": '2017-3-24 22:00',
          "phone": '186****2318',
          "address": '武汉市江汉路时尚广场',
          "eventdetail": '因即将到来的销售淡季，武汉永辉科技服务有限公司将主办一场公益拍卖会，本次拍卖会活动场地位于时尚广场放学后酒吧，拍卖所得均捐赠给贫困山区儿童。同时声明与活动场所无任何利益交换',
          "eventwards": '1.若所得拍卖资金超过2000元，活动主办者将额外捐赠50%拍卖额2.若个人拍的金额超过300，活动举办方将赠送消费者公司纪念章一枚',
          "rule": '拍卖由一元起拍，消费者通过举手报价，一次加价十元，限定时间内最高出价者得',
          "id": '',
          "minpeople": '150人',
          "joinnumber": '0'
        }
      ],
      "customFeature":
      {
        "imgHeight": "150",
        "imgWidth": "322",
        "lineBackgroundColor": "rgb(255, 255, 255)",
        "lineBackgroundImage": "",
        "lineHeight": "205",
        "margin": "10",
        "mode": 1,
        "secColor": "rgb(102, 102, 102)",
        "secFontSize": "30.5rpx",
        "secFontStyle": "",
        "secFontWeight": "",
        "secTextAlign": "left",
        "secTextDecoration": "",
        "sec_mode": "sec-mode"
      },

    }
  },
  /**
   onShareAppMessage: function (res) {
    if (res.from === 'button') {
      // 来自页面内转发按钮
      console.log(res.target)
    }
    return {
      title: '公益活动等你参加！',
      path: 'pages/eventpage/eventpage',
    }
  },**/
  /**
   * 生命周期函数--监听页面加载
   * 获取推荐活动信息
   */
  onLoad: function (options) {
    var that =this;
    var city = app.globalData.currentCity;
    wx.request({
      url: 'https://www.lkand.xyz/qin/json/ehuodong.json',
      method: 'GET',
      data: {
      },
      header: {
        'content-type': 'application/json'
      },
      success:function(res){
        var v = res.data.content;
        //var query_clone = JSON.parse(decodeURIComponent(JSON.stringify(res.data)));
        //var v = decodeURIComponent(res.data.advinfo);
        var j = v.length;
        var an = that.data.Array;
        an.push(res.data.content[j-1]);
        var local_content = that.data.list1.content;
        var l1 = local_content[0].iteminput;
        var l2 = local_content[1].iteminput;
        var l3 = local_content[2].iteminput;
        var k1 = an.iteminput;
        if(l1!=k1&&l2!=k1&&l3!=k1){

        local_content[2]=local_content[1];
        var an1 = local_content[1]

        local_content[1]=local_content[0];
        var an2 = local_content[0]

        local_content[0]=an;
        //------------------
        var c1 = "list1.content[" + 1 + "]";
        var c2 = "list1.content[" + 2 + "]";

        var a1 = "list1.content[" + 0 + "].iteminput"
        var a2 = "list1.content[" + 0 + "].eventwords"
        var a3 = "list1.content[" + 0 + "].img"
        var a4 = "list1.content[" + 0 + "].listStyle"
        var a5 = "list1.content[" + 0 + "].eventParams"
        var a6 = "list1.content[" + 0 + "].imgStyle"
        var a7 = "list1.content[" + 0 + "].customFeature"
        var a8 = "list1.content[" + 0 + "].secTitleStyle"
        var a9 = "list1.content[" + 0 + "].itemIndex"
        var a10 = "list1.content[" + 0 + "].maininput"
        var a11 = "list1.content[" + 0 + "].placeinput"
        var a12 = "list1.content[" + 0 + "].timeinputone"
        var a13 = "list1.content[" + 0 + "].timeinputtwo"
        var a14 = "list1.content[" + 0 + "].setinput"
        var a15 = "list1.content[" + 0 + "].address"
        var a16 = "list1.content[" + 0 + "].eventdetail"
        var a17 = "list1.content[" + 0 + "].eventwards"
        var a18 = "list1.content[" + 0 + "].rule"
        var a19 = "list1.content[" + 0 + "].id"
        var a20 = "list1.content[" + 0 + "].minpeople"
        var a21 = "list1.content[" + 0 + "].rollpeople"
        that.setData({
          [a1]: an.iteminput,
          [a2]: an.eventwords,
          [a3]: an.img,
          [a4]: "margin-bottom:23.4375rpx;background-color:rgb(255, 255, 255);height:480.46875rpx;margin-left:auto;",
          [a5]: "{\"inner_page_link\":\"\\\/pages\\\/page10021\\\/page10021\",\"is_redirect\":0}",
          [a6]: "width:100%;height:351.5625rpx;margin-left:auto;",
          //[a7]: an2.detil,
          [a8]: "color:rgb(102, 102, 102);font-size:30.46875rpx;text-align:left;margin-left:auto;",
          [a9]: 0,
          [a10]: an.maininput,
          [a11]: an.chengInput,
          [a12]: an.timeinputone,
          [a13]: an.timeinputtwo,
          [a14]: an.setinput,
          [a15]: an.address,
          [a16]: an.eventdetail,
          [a17]: an.eventwards,
          [a18]: an.rule,
          [a19]: an.id,
          [a20]: an.minpeople,
          [a21]: an.rollpeople,
          //---------------最先推送
          [c1]:an2,
          [c2]:an1
        })
        
        var ary = that.data.Array;
        ary.splice(0, ary.length);
      }
      else{
          var ary = that.data.Array;
          ary.splice(0, ary.length);
      }
      }
    
    })
    that.setData({
      city:city
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
   * 活动信息跳转
   */
  _pagenavigatedetail: function (e) {
    var that = this;
    var ai = that.data.list1.content
    var a = parseInt(e.currentTarget.id)
    console.log(a)
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

  },
  _bindnavi: function () {
    var that=this;
    setTimeout(function () {
      that.setData({
        opacity_4: false
      })
    }, 500)
    wx.showModal({
      showCancel:false,
      title: '提示',
      content: '该功能暂未开放',
    })
  },
  /**
   * 打开城市选择器
   */
  translate: function (e) {
    var that=this;
    var index=that.data.Index;
    this.setData({
      show: true,
    })
  },
  /**
   * 城市选择
   */
  bindChange: function (e) {
    var that = this;
    console.log(e.detail)
    var b = e.detail.value[1]
    that.setData({
      Index: b
    })
    var city;
    switch (b) {
      case 0: city = that.data.pro_ah; break;
      case 1: city = that.data.pro_bj; break;
      case 2: city = that.data.pro_cq; break;
      case 3: city = that.data.pro_fj; break;
      case 4: city = that.data.pro_gs; break;
      case 5: city = that.data.pro_gd; break;
      case 6: city = that.data.pro_gx; break;
      case 7: city = that.data.pro_gz; break;
      case 8: city = that.data.pro_hn; break;
      case 9: city = that.data.pro_hb; break;
      case 10: city = that.data.pro_hen; break;
      case 11: city = that.data.pro_hlj; break;
      case 12: city = that.data.pro_hub; break;
      case 13: city = that.data.pro_hun; break;
      case 14: city = that.data.pro_jl; break;
      case 15: city = that.data.pro_js; break;
      case 16: city = that.data.pro_jx; break;
      case 17: city = that.data.pro_ln; break;
      case 18: city = that.data.pro_nmg; break;
      case 19: city = that.data.pro_nx; break;
      case 20: city = that.data.pro_qh; break;
      case 21: city = that.data.pro_sd; break;
      case 22: city = that.data.pro_sx; break;
      case 23: city = that.data.pro_shx; break;
      case 24: city = that.data.pro_sh; break;
      case 25: city = that.data.pro_sc; break;
      case 26: city = that.data.pro_tj; break;
      case 27: city = that.data.pro_xz; break;
      case 28: city = that.data.pro_xj; break;
      case 29: city = that.data.pro_yn; break;
      case 30: city = that.data.pro_zj; break;
      case 31: city = that.data.pro_gat; break;
      default: break;
    }
    var val = e.detail.value;

    that.setData({
      S_city: city[val[2]],
    })

  },
  hiddenFloatView: function () {
    this.setData({
      show: false,
      opacity_b: false
    })
  },
  /**
   * 切换城市标签隐藏
   */
  hiddenFloatView_T: function () {
    var that = this;
      that.setData({
        opacity_b: false
      })

    var city = this.data.S_city;
    app.globalData.currentCity = this.data.S_city;
    that.setData({
      show: false,
      city: city
    })
    console.log(app.globalData.currentCity)
  },
  /**
   *扫描二维码报名
   */
  scanCode:function(e){
    var that=this;
    setTimeout(function(){
      that.setData({
        opacity_a: false
      })
    },500)
    wx.scanCode({
      onlyFromCamera:true,
      success:function(res){
        console.log(res)
      },
      fail:function(res){
        wx.showModal({
          title: '提示',
          showCancel:false,
          content: '打开相机失败',
        })
      }
    })
  },
  /**
   *图标跳转
   */
  _pagenavigatere: function (e) {
    var kind = e.currentTarget.dataset.eventParams;
    var that = this;
    var navi;
    switch (kind) {
      case "1": {
        setTimeout(function () {
          that.setData({
            opacity_1: false
          })
        }, 500);
        navi = this.data.pageurl7.realurl1;
        } break;

      case "2": {
        setTimeout(function () {
          that.setData({
            opacity_2: false
          })
        }, 500); navi = "/pages/advertiser/advertiser";} break;

      case "3": {
        setTimeout(function () {
          that.setData({
            opacity_3: false
          })
        }, 500); navi = this.data.pageurl.url1;} break;

      case "4": {
        setTimeout(function () {
          that.setData({
            opacity_4: false
          })
        }, 500);navi = this.data.pageurl7.realurl1;} break;

      case "5": {
        setTimeout(function () {
          that.setData({
            opacity_5: false
          })
        }, 500);navi = this.data.pageurl7.realurl3;} break;


     default: break;
    }
    app.naviSlect(that,navi);

  }, 
  /**
   * 附近跳转
   */
  neighbournavi:function(){
    var that=this;
    setTimeout(function () {
      that.setData({
        opacity_6: false
      })
    }, 500);
var longitude;
var latitude;
var navi;
wx.getSetting({//获取用户微信信息
  success: res => {
    if (res.authSetting["scope.userLocation"]) {
      wx.getLocation({
        type: 'wgs84',
        success: function (resp) {
          longitude = resp.longitude
          latitude = resp.latitude
          navi = that.data.pageurl7.realurl4 + "?longitude=" + longitude + "&latitude=" + latitude + "";
          app.naviSlect(that, navi);
          
        },
      })
    }
    else {
      wx.authorize({
        scope: 'scope.userLocation',
        success() {

          wx.getLocation({
            type: 'wgs84',
            success: function (resp) {
              longitude = resp.longitude
              latitude = resp.latitude
              navi = that.data.pageurl7.realurl4 + "?longitude=" + longitude + "&latitude=" + latitude + "";
              app.naviSlect(that, navi);
            },
          })
        }
      })
    }
  }
})

  },
  /**
   * 页面分享
   */
  onShareAppMessa: function (res) {
    var navi = this.data.pageurl7.realurl4;
    if (!that.data.isBtnClicked) {
      app._pagenavigate(navi);
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
  /**_pagenavigatere
   * 更改透明度
   */
  changeOpacity:function(e){
    var kind = e.currentTarget.dataset.opacity;
    var that = this;
    switch (kind) {
      case "a": {
        that.setData({
          opacity_a: true
        })
      }; break;
      case "b": {
        that.setData({
          opacity_b: true
        })
      }; break;
      case "1": {
        that.setData({
          opacity_1: true
        })
      }; break;
      case "2": {
        that.setData({
          opacity_2: true
        })
      }; break;
      case "3": {
        that.setData({
          opacity_3: true
        })
      }; break;
      case "4": {
        that.setData({
          opacity_4: true
        })
      }; break;
      case "5": {
        that.setData({
          opacity_5: true
        })
      }; break;
      case "6": {
        that.setData({
          opacity_6: true
        })
      }; break;
      default: break;
    }
  },
  /**
   * 
   */
  CancelOpacity:function(e){
    var kind = e.currentTarget.dataset.opacity;
    var that = this;
    switch (kind) {
      case "a": {
        that.setData({
          opacity_a: false
        })
      }; break;
      case "b": {
        that.setData({
          opacity_b: false
        })
      }; break;
      case "1": {
        that.setData({
          opacity_1: false
        })
      }; break;
      case "2": {
        that.setData({
          opacity_2: false
        })
      }; break;
      case "3": {
        that.setData({
          opacity_3: false
        })
      }; break;
      case "4": {
        that.setData({
          opacity_4: false
        })
      }; break;
      case "5": {
        that.setData({
          opacity_5: true
        })
      }; break;
      case "6": {
        that.setData({
          opacity_6: false
        })
      }; break;
      default: break;
    }
  },
  /**
   * 跳转搜索
   */
  navigateSearch:function(){
    var that=this;
    var navi = "/pages/eventpage/search/search";
    if (!that.data.isBtnClicked) {
      app._pagenavigate(navi);
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