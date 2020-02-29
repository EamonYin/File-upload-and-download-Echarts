<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>

    <script type="text/javascript">

        function filename() {
            var file = $("#file").val();
            var parame=encodeURI(file);
            alert(parame)
            $.ajax({
                type:'POST',
                dataType : 'text',
                url:'${pageContext.request.contextPath}/file/filename?filename='+parame,
            });
        }

        function downname(e) {
           var id =  $(e).attr("id");
            var parame=encodeURI(id);
           alert(id);
           window.location.href = "${pageContext.request.contextPath}/file/down?downname="+parame;
        }

    </script>

</head>
<body>
<h2>文件上传下载测试页面</h2>

<form action="/file/upload" method="post" enctype="multipart/form-data">
    选择文件:<input id="file" type="file" name="file" width="120px">
    <input type="submit" value="上传" onclick="filename()">

</form>

<%--<p>${file}</p>--%>

<form action="/file/down" method="GET" id="downnameform">
    <c:forEach items="${file}" var = "filename">
        <a>${filename}</a>
        <input id ="${filename}" class="namelist" type="button" value="下载" onclick="downname(this)">
        <p><%--换行用--%></p>
    </c:forEach>
</form>
<hr>

<script type="text/javascript">

</script>

</body>
</html>


