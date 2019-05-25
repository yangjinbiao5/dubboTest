<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 4/9/2019
  Time: 8:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>你好这世界</title>
  </head>
  <body  >

        <br/>

        <hr width="360">
        <div style="height: 250px">

        </div>
        <h1 align="center"><div id = "clock"> </div></h1>
        <h1 align="center">${name}</h1>
        <h1 align="center">远洋深处崇明落，碧波万顷映余晖</h1>

  </body>

  <script type="text/javascript">

    function realSysTime(clock){
      var now=new Date();            //创建Date对象
      var year=now.getFullYear();    //获取年份
      var month=now.getMonth();    //获取月份
      var date=now.getDate();        //获取日期
      var day=now.getDay();        //获取星期
      var hour=now.getHours();    //获取小时
      var minu=now.getMinutes();    //获取分钟
      var sec=now.getSeconds();    //获取秒钟
      month=month+1;
      var arr_week=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
      var week=arr_week[day];        //获取中文的星期
      var time=year+"年"+month+"月"+date+"日 "+week+" "+hour+":"+minu+":"+sec;    //组合系统时间
      clock.innerHTML=time;    //显示系统时间
    }
    window.onload=function(){
      window.setInterval("realSysTime(clock)",1000);    //实时获取并显示系统时间
    }

  </script>

  <style type="text/css">
      html{
        height: 100%;
      }
      body{
        background-image: url(/images/timg.jpg);
        background-size:100% 100% ;
        padding: 0;
        margin: 0;
      }
  </style>

</html>
