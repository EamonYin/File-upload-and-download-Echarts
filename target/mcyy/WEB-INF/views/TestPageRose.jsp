<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
    <script type="text/javascript" src="static/echarts/echarts.min.js"></script>
</head>
<body>
<h2>测试页</h2>

<p>${users}</p>


<select value="切换日期" id="changetime" onclick="changetime()">
<%--    <option value="all">选择要查看的日销售量日期：</option>--%>
    <c:forEach items="${seltime}" var="SaleTime">
        <option value="${SaleTime}">${SaleTime}</option>
    </c:forEach>
</select>

<div style="width: 100%;height: 100%" id="chartmain"></div>

<script type="text/javascript">
    /*var dom = document.getElementById("chartmain");
    var myChart = echarts.init(dom);*/



    $(function(){
        //ajax调用
        ajaxtest();
        changetime();
        // alert("hahha")
    });

    function changetime(){

        var change = $("#changetime").val();
        //
        if(change === undefined ){
            alert(change);
            change = "2019-09-01"
        }
        // else {
        //     alert("else" + change);
            ajaxtest(change);
        // }
        // alert(change)
        // ajaxtest(change);

    }


    function ajaxtest(change) {
        // alert("hahhahaha")
        $.ajax({
            async:false,
            url:'${pageContext.request.contextPath}/testchartday?changetime='+change,
            type:'POST',
            dataType : 'json',//后台@ResponseBody返回的json数据是一个纯String类型的对象,dataType属性设置为text
            success:function (data) {//data是形参，随便取名，data表示的就是服务器返回的json格式的数据
                initChart(data);
            }
        });
    }
    function formatData(data) {

        var xAxis = [];
        var serData =[];

        for(var i = 0 ; i < data.length ; i++){
            xAxis.push(data[i].name);
            console.log(xAxis);
            // alert(xAxis);
            /*serData.push({
                name : data[i].name,
                value : data[i].value || 0
            });*/
            serData.push(data[i].sell);
            console.log(serData);
        }
        return {
            xAxis : xAxis,
            serData : serData,
        };
    }

    function initChart(data) {
        var dom = document.getElementById("chartmain");
        var myChart = echarts.init(dom);

        var option = {
            title: {
                text: '某站点用户访问来源',
                subtext: '纯属虚构',
                left: 'center'
            },
            tooltip: {
                trigger: 'item',
                formatter: '{a} <br/>{b} : {c} ({d}%)'
            },
            legend: {
                orient: 'vertical',
                left: 'left',
                data: ['直接访问', '邮件营销', '联盟广告', '视频广告', '搜索引擎']
            },
            series: [
                {
                    name: '访问来源',
                    type: 'pie',
                    radius: '55%',
                    center: ['50%', '60%'],
                    data: data/*[
                            {value: 335, name: '直接访问'},
                            {value: 310, name: '邮件营销'},
                            {value: 234, name: '联盟广告'},
                            {value: 135, name: '视频广告'},
                            {value: 1548, name: '搜索引擎'}
                        ]*/,
                    emphasis: {
                        itemStyle: {
                            shadowBlur: 10,
                            shadowOffsetX: 0,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    }
                }
            ]
        };

        myChart.setOption(option, true);

    };


</script>

</body>
</html>
