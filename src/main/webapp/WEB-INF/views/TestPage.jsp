<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
    <script type="text/javascript" src="static/echarts/echarts.min.js"></script>

    <script type="text/javascript">
        /*var dom = document.getElementById("chartmain");
        var myChart = echarts.init(dom);*/

        $(function(){
            //ajax调用
            ajaxtest();
            // alert("hahha")
        });

        function ajaxtest() {
            // alert("hahhahaha")
            $.ajax({
                async:false,
                url:'${pageContext.request.contextPath}/testchart',
                type:'POST',
                dataType : 'json',//后台@ResponseBody返回的json数据是一个纯String类型的对象,dataType属性设置为text
                success:function (objects1) {//data是形参，随便取名，data表示的就是服务器返回的json格式的数据
                    // alert(objects1);
                    // $.each(JSON.parse(objects1),function (index , obj) {
                        // alert(obj);
                        /*names.push(obj.department);
                        brower.push({
                            value : obj.num,
                            name : obj.department,
                        });*/
                    // });
                    // var jsonObject = JSON.parse(data);
                    /*for(var i = 0 ; i < objects1.length ; i++){
                        datas.push(objects1[i].smInventory);
                        alert(datas);
                    }*/

                    initChart(objects1);
                }
            });
        }

        function formatData(data) {

            var json = [];
            var datas =[];

            for(var i = 0 ; data.length ; i++){
                json.push(data[i].name || "");
                datas.push({
                    name : data[i].name,
                    value : data[i].value || 0,
                });
            }
            return datas;
        }

        function initChart(objects1) {
            var dom = document.getElementById("chartmain");
            var myChart = echarts.init(dom);

            var option = {
                tooltip: {
                    trigger: 'item',
                    formatter: '{a} <br/>{b}: {c} ({d}%)'
                },
                legend: {
                    orient: 'vertical',
                    left: 10,
                    data: ['直接访问', '邮件营销', '联盟广告', '视频广告', '搜索引擎']
                    // data:datas
                },
                series: [
                    {
                        name: '访问来源',
                        type: 'pie',
                        radius: ['50%', '70%'],
                        avoidLabelOverlap: false,
                        label: {
                            normal: {
                                show: false,
                                position: 'center'
                            },
                            emphasis: {
                                show: true,
                                textStyle: {
                                    fontSize: '30',
                                    fontWeight: 'bold'
                                }
                            }
                        },
                        labelLine: {
                            normal: {
                                show: false
                            }
                        },
                        data: objects1/*[
                    {value: 335, name: '直接访问'},
                    {value: 310, name: '邮件营销'},
                    {value: 234, name: '联盟广告'},
                    {value: 135, name: '视频广告'},
                    {value: 1548, name: '搜索引擎'}
                ]*/
                    }
                ]
            };

            myChart.setOption(option, true);

        };

    </script>

</head>
<body>
<h2>测试页</h2>

<p>${users}</p>



<div style="width: 100%;height: 100%" id="chartmain"></div>


</body>
</html>
