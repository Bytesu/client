<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/25
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <jsp:include page="${ctx}/common/header.jsp"></jsp:include>
  <link rel="stylesheet"  href="${ctx}/assets/css/parent/index.css" />
    <title>client 系统</title>
</head>
<body>

<%--<canvas id="canvas" class="canvas">你的浏览器不支持HTML5画布技术，请使用谷歌浏览器!</canvas>--%>
<header class="header">
  <ul class="nav clearfix">
    <li class="navItem navItem1">
      <a href="javascript:return void(0);" class="current">开发</a>
    </li>
    <li class="navItem navItem2">
      <a href="/focusing/index.jsp">关注ING</a>
    </li>
    <li class="navItem navItem3">
      <a href="business/index.jsp">商业</a>
    </li>
    <li class="navItem navItem3">
      <a href="manage/index.jsp">管理</a>
    </li>
    <li class="navItem navItem3">
      <a href="market/index.jsp">营销</a>
    </li>
    <li class="navItem navItem3">
      <a href="market/index.jsp">工具</a>
    </li>
    <li class="navItem navItem4">
      <a href="about/index.jsp">关于</a>
    </li>
  </ul>
</header>
<section class="body clearfix">
  <%--<section class="right">
      <div>
        文本内容
      </div>
    </section>
      <section class="left">
        <ul class="menu">
          <li><a href="javascript:void(0);">菜单1</a></li>
          <li><a href="javascript:void(0);">菜单2</a></li>
          <li><a href="javascript:void(0);">菜单3</a></li>
          <li><a href="javascript:void(0);">菜单4</a></li>
    </ul>
  </section>--%>
    <ul class="list">
      <li><a href="javascript:void(0);">工具集</a></li>
      <li><a href="javascript:void(0);">创业工具</a></li>
      <li><a href="javascript:void(0);">开发</a></li>
      <li><a href="javascript:void(0);">工具集</a></li>
    </ul>
</section>
<jsp:include page="${ctx}/common/footer.jsp"></jsp:include>
</body>

<script type="text/javascript" src="${ctx}/assets/js/index.js"></script>
</html>
