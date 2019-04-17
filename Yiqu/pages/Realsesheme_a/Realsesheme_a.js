// pages/Realsesheme_a/Realsesheme_a.js
var app=getApp();
Page({


    /**
     * 页面的初始数据
     */
    data: {
    Array: [],
      "Hidden":false,
      "iteminput":'',
      isBtnClicked:false,
      "content": [{
      iteminput:'消费助学行动',
      timeinputone: '2018-10-21 8',
        address: '长江大学地球科学学院fsdffwefsgsgesgga',
        canvas_id:'myCanvas',
        envent_state:null,
        joinnumber:"50",
        img:'/images/file.png',


        //"content": "",

        maininput: '湖北省武汉市消防总队',
        placeinput: '丽笙星空酒吧',
        timeinputone: '2016-10-11',
        timeinputtwo: '2016-10-12',
        eventdetail: '本次活动主要为了普及消防知识，提高民众的消防意识，能够加强消防应急管理，增高自救能力，减少人身财产的安全，促进社会的安定、家庭的幸福',
        eventwards: '1.活动期间到达现场的观众均会得到《消防应急处理》书一本2.比赛获得冠军的参与者将会获得精美礼品一份3.现场参与互动的观众将获得消防手册一份',
        minpeople: '',
        rollpeople: '',
        scancode:''
      },
        {
          iteminput: '消费助学行动',
          timeinputone: '2018-10-21 8',
          address: '长江大学地球科学学院',
          canvas_id: 'myCanvas',
          envent_state:true,
          joinnumber: "50",
          img:'/images/house.jpg'
        },
      ],
      show:false,
      l_id:'',//数字下标
      ziti:"",//完成字体颜色
      ziti1: "",//删除字体颜色
      "key":'',
      "target_id": ''

  
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
     var that = this;
      var page = 0;
      var userid;
      wx.getStorage({
        key: 'rollkey',
        success: function(resp) {
          userid = resp.data;
          wx.showNavigationBarLoading();
          wx.request({
           url: 'https://www.qinyu123456.xyz/WX/returnacitivitybymanagerid.do',
            method: "POST",
            data: {
              userid: resp.data
            },
            header: {
              'content-type': 'application/x-www-form-urlencoded;charset=utf-8'   //这里注意POST请求content-type是小写，大写会报错
            },


            success: function (res) {
              var v = res.data.actinfo;
              var j = v.length;
              if (j == 0) {
                that.setData({
                  Hidden: true
                })
              }
              else {
                that.setData({
                  Hidden: false
                })
                var an = that.data.Array;
                var content = that.data.content;
                for (var i = 0; i < j; i++) {
                  an.push(res.data.actinfo[i]);
                }
                //--------------------判断 Array数组的长度
                for (var i = 0; i < j; i++) {
                  content.push(res.data.actinfo[i]);
                }
                for (var i = 0; i < j; i++) {
                  var c = "content[" + i + "]";
                  that.setData({
                    [c]: an[i],
                  })
                }
              }
            }
          })
          var ary = that.data.Array;
          ary.splice(0, ary.length);
          console.log(that.data.content);
          wx.hideNavigationBarLoading() 
        },
        fail:function(e){
          wx.showToast({
            title: '加载失败',
            icon:"loading",
            duration:2000
          })
        }
      })
  

    },


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
    /*  var that = this;
      var page = 0;
      wx.showNavigationBarLoading() //在标题栏中显示加载
      // 获取数据的方法，具体怎么获取列表数据大家自行发挥
      //var GetList = function(that){
      wx.request({
        url: 'http://192.168.1.113:8080/xieru/Search.jsp',
        method: "POST",
        data: {
          iteminput: that.data.iteminput
        },
        header: {
          'content-type': 'application/x-www-form-urlencoded;charset=utf-8'   //这里注意POST请求content-type是小写，大写会报错
        },
        success: function (res) {
          console.log(res);
          wx.request({
            url: 'http://192.168.1.113:8080/xieru/json/xieru.json',
            method: "GET",
            data: {},
            header: {
              'content-type': 'application/json'  //这里注意POST请求content-type是小写，大写会报错
            },
            success: function (r) {
              //var an = that.data.Array;
              var an = that.data.Array;
              an.push(r.data.schemeinfo[0]);
              var arr = that.data.content;
              arr.push(an);
              var k2 = arr.length;
              if (k2 == 0) {
                var a1 = "content[" + 0 + "].title"
                var a2 = "content[" + 0 + "].timestart"
                var a3 = "content[" + 0 + "].place"
              } else {
                var a1 = "content[" + (k2 - 1) + "].title"
                var a2 = "content[" + (k2 - 1) + "].timestart"
                var a3 = "content[" + (k2 - 1) + "].place"
              }
              that.setData({
                [a1]: an[0].iteminput,
                [a2]: an[0].timeinputone,
                [a3]: an[0].address,
                Hidden: false
              })
              var ary = that.data.Array;
              ary.splice(0, ary.length);
              console.log(that.data.content);
              //an1.splice(0, an1.length);
              wx.hideNavigationBarLoading()
            }
          })
        },
        fail: function () {
          setTimeout(function () {
            wx.hideNavigationBarLoading()
          }, 3000)
          wx.showLoading({
            title: '刷新失败',
          })
          setTimeout(function () {
            wx.hideLoading()
          }, 1000)
        }
      });*/
      this.onLoad();

    },

    /**
     * 用户点击右上角分享
     */
    onShareAppMessage: function () {

    },
    touchset:function(e) {
      var messlist = e.currentTarget.id;
      var id = this.data.content[messlist].id;
      console.log(e);
      this.setData({
        show: true,
        l_id: id,
        key: key
      })
    },
    touchset: function (e) {
      var messlist = e.target.dataset.abc;
      var id = this.data.content[messlist].id;
      console.log(e);
      this.setData({
        show: true,
        target_id: messlist,
        l_id: id,
       
      })
    },
    button_compl: function () {
      var result = 'finish';
      var that = this;
      wx.request({
        url: 'https://www.qinyu123456.xyz/WX/changeeventtype.do',
        method: 'POST',
        data: {
          sheme: result,
          id: that.data.l_id,
          key: ""
        },
        header: {
          'content-type': 'application/x-www-form-urlencoded;charset=utf-8'   //这里注意POST请求content-type是小写，大写会报错
        },
        success: function (e) {
          if (e.data == 10001) {
            var id = that.data.target_id
            var envent_state = "content[" + id + "].event_state";
            that.setData({
              [envent_state]: "1",
              show: false
            })
          }
          else {
            that.setData({
              show: false
            })
            wx.showLoading({
              title: '网络延迟',
            })
            setTimeout(function () {
              wx.hideLoading()
            }, 2000)
          }
        },
        fail: function (e) {
          that.setData({
            show: false,
            ziti: false
          })
          wx.showModal({
            title: '修改失败',
            content: '原因：' + e.errMsg,
            showCancel: false
          })
        }
      })
    },
    button_del: function () {
      var result = 'delete';
      var that = this;
      wx.request({
        url: 'https://www.qinyu123456.xyz/WX/changeeventtype.do',
        method: 'POST',
        data: {
          sheme: result,
          id: that.data.l_id,
          key: ""
        },
        header: {
          'content-type': 'application/x-www-form-urlencoded;charset=utf-8'   //这里注意POST请求content-type是小写，大写会报错
        },
        success: function (e) {
          if (e.data == 10001) {
            var id = that.data.target_id
            var envent_state = "content[" + id + "].event_state";
            that.setData({
              [envent_state]: "-1",
              show: false
            })
          }
          else {
            that.setData({
              show: false
            })
            wx.showLoading({
              title: '网络延迟',
            })
            setTimeout(function () {
              wx.hideLoading()
            }, 2000)
          }
        },
        fail: function (e) {
          that.setData({
            show: false
          })
          wx.showModal({
            title: '发布失败',
            content: '原因：' + e.errMsg,
            showCancel: false
          })
        }
      })
    },
    button_cancel:function() {
      this.setData({
        show: false,
        ziti: false
      })
    },
    cartoon:function() {
      this.setData({
        ziti: true
      })
    },
    cartoon2: function () {
      this.setData({
        ziti: false
      })
    },
    cartoon_d: function () {
      this.setData({
        ziti1: true
      })
    },
    cartoon_d2: function () {
      this.setData({
        ziti1: false
      })
    },
    navigateDetail:function(e) {
      var that=this;
      var messlist = parseInt(e.target.dataset.abc);
      var navi = "/pages/Realsesheme/Sheme_detial/Sheme_detial" + "?orderDetailType=1&iteminput" + that.data.content[messlist].iteminput + "&address=" + that.data.content[messlist].address + "&time1=" + that.data.content[messlist].time1 + "&rollpeople=" + that.data.content[messlist].rollpeople + "&type=" + that.data.content[messlist].type + "&img=" + that.data.content[messlist].img + "&scancode=" + that.data.content[messlist].scancode;
      app.naviSlect(that, navi);
    }
})