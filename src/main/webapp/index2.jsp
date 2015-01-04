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
  <div class="pad5">

    <nav class="navSite">
      <ul class="siteList nav ulItem">
        <li class="item siteitem">前端研究</li>
        <li class="item siteitem">股票研究</li>
      </ul>
    </nav>
    <div class="waterfall">
      <div class="col-item col-item-0">
        <div class="one-item one-item0">BootStrap1</div>
        <div class="one-item one-item0">BootStrap1</div>
        <div class="one-item one-item0">BootStrap1</div>
        <div class="one-item one-item0">BootStrap1</div>
        <div class="one-item one-item0">BootStrap1</div>
      </div>
      <div class="col-item col-item-1">
        <div class="one-item">
          BootStrap2
          BootStrap2
          BootStrap2
          BootStrap2
        </div>
      </div>
      <div class="col-item col-item-2">
        <div class="one-item">BootStrap3</div>
        <div class="one-item">BootStrap3</div>
        <div class="one-item">BootStrap3</div>
      </div>
      <div class="col-item col-item-3">
        <div class="one-item">BootStrap4</div>
        <div class="one-item">BootStrap4</div>
        <div class="one-item">BootStrap4</div>
      </div>
      </div>
  </div>
</section>
<jsp:include page="${ctx}/common/footer.jsp"></jsp:include>
</body>

<script type="text/javascript" src="${ctx}/assets/js/index.js"></script>
</html>
