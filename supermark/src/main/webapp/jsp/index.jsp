<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
	    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet" />
	    <title></title>
	    <link href="${pageContext.request.contextPath }/css/Common.css" rel="stylesheet" />
	    <link href="${pageContext.request.contextPath }/css/Index.css" rel="stylesheet" />
		<title>超市物资管理系统</title>
	</head>
	<body>
		<div class="header">
			<img class="logo" src="${pageContext.request.contextPath }/images/logo.png" />
			<label class="logo-title">超市物资管理系统</label>
		</div>
		<ul class="inline">
			<li>
				<img src="${pageContext.request.contextPath }/images/32/client.png" />
				&nbsp;&nbsp;欢迎您,${user.username }
			</li>
			<li class="dropdown">
				<a class="dropdown-toggle mymsg" data-toggle="dropdown" href="#"><img src="${pageContext.request.contextPath }/images/32/166.png" />&nbsp;&nbsp;修改个人信息<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="#">修改密码</a></li>
                </ul>
			</li>
			<li>
                <img src="${pageContext.request.contextPath }/images/32/200.png" />&nbsp;&nbsp;<a class="loginout" href="#">退出</a>
            </li>
		</ul>
		
		<div class="nav">

	        <ul class="breadcrumb">
	            <li>
	                <img src="${pageContext.request.contextPath }/images/32/5025_networking.png" />
	            </li>
	            <li><a href="#">首页</a> <span class="divider">>></span></li>
	            <li class="active"></li>
	        </ul>
    	</div>
    	
    	<div class="container-fluid content">
        <div class="row-fluid">
            <div class="span2 content-left">
                <div class="accordion">
                	<!-- 基本信息 -->
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
                                <img class="left-icon" src="${pageContext.request.contextPath }/images/32/8.png" /><span class="left-title">基本档案管理</span>
                            </a>
                        </div>
                        <div id="collapseOne" class="accordion-body collapse in">
                            <div class="accordion-inner">
                                <img class="left-icon-child" src="${pageContext.request.contextPath }/images/32/28.png" /><span class="left-body"> 供应商管理</span>
                            </div>
                            <div class="accordion-inner">
                                <img class="left-icon-child" src="${pageContext.request.contextPath }/images/32/99.png" /><span class="left-body"> 销售商管理</span>

                            </div>
                            <div class="accordion-inner">
                                <img class="left-icon-child" src="${pageContext.request.contextPath }/images/32/4965_archives.png" /><span class="left-body"> 货品档案管理</span>

                            </div>
                            <div class="accordion-inner">
                                <img class="left-icon-child" src="${pageContext.request.contextPath }/images/32/chuku.png" /><span class="left-body"> 仓库管理</span>

                            </div>
                        </div>
                    </div>
                    <!-- 采购订货 -->
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo">
                                <img class="left-icon" src="${pageContext.request.contextPath }/images/32/317.png" /><span class="left-title">采购订货管理</span>
                            </a>
                        </div>
                        <div id="collapseTwo" class="accordion-body collapse in">
                        	<div class="accordion-inner">
                                <a class="lordding" href="#" data-url="${pageContext.request.contextPath }/jsp/stock.jsp">
                                	<img class="left-icon-child" src="${pageContext.request.contextPath }/images/32/317.png" /><span class="left-body"> 采购订货管理</span>
                                </a>
                            </div>
                        </div>
                    </div>
                    <!-- 仓库入库 -->
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseThree">
                                <img class="left-icon" src="${pageContext.request.contextPath }/images/32/50.png" /><span class="left-title">仓库入库管理</span>
                            </a>
                        </div>
                        <div id="collapseThree" class="accordion-body collapse in">
                        	<div class="accordion-inner">
                                <img class="left-icon-child" src="${pageContext.request.contextPath }/images/32/50.png" /><span class="left-body">仓库入库管理</span>
                            </div>
                        </div>
                    </div>
                    <!-- 仓库出库 -->
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseFour">
                                <img class="left-icon" src="${pageContext.request.contextPath }/images/32/52.png" /><span class="left-title">仓库出库管理</span>
                            </a>
                        </div>
                        <div id="collapseFour" class="accordion-body collapse in">
                        	<div class="accordion-inner">
                                <img class="left-icon-child" src="${pageContext.request.contextPath }/images/32/52.png" /><span class="left-body">仓库出库管理</span>
                            </div>
                        </div>
                    </div>
                    
                    <!-- 人员管理 -->
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseFive">
                                <img class="left-icon" src="${pageContext.request.contextPath }/images/32/people.png" /><span class="left-title">人员管理</span>
                            </a>
                        </div>
                        <div id="collapseFive" class="accordion-body collapse in">
                        	<div class="accordion-inner">
                                <img class="left-icon-child" src="${pageContext.request.contextPath }/images/32/people.png" /><span class="left-body">人员管理</span>
                            </div>
                        </div>
                    </div>
                    
                    <!-- 部门管理-->
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseSix">
                                <img class="left-icon" src="${pageContext.request.contextPath }/images/32/557.png" /><span class="left-title">部门管理</span>
                            </a>
                        </div>
                        <div id="collapseSix" class="accordion-body collapse in">
                        	<div class="accordion-inner">
                                <img class="left-icon-child" src="${pageContext.request.contextPath }/images/32/557.png" /><span class="left-body">部门管理</span>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

            <div class="span10 content-right frame">
                <!-- <iframe src="Index2.html" class="iframe"></iframe> -->
            </div>
        </div>
    </div>
    
    <div class="clearfix"></div>
    <div class="foot"></div>
    <script src="${pageContext.request.contextPath }/js/jquery/jquery-1.10.2.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/bootstrap/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/Index.js"></script>
	</body>
</html>