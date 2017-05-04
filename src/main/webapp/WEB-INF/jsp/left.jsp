<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>

<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#f0f9fd;">
	<div class="lefttop"><span></span>功能列表</div>
    
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="images/leftico01.png" /></span>学生信息管理
    </div>
    	<ul class="menuson">
    	<s:iterator value="#part1">
    		  <li><cite></cite><a href="<s:property value="action"/>" target="rightFrame"><s:property value="name"/></a><i></i></li>
    	</s:iterator>
        </ul>    
    </dd>
        
    
    <dd>
    <div class="title">
    <span><img src="images/leftico02.png" /></span>成绩管理
    </div>
    <ul class="menuson">
       <s:iterator value="#part2">
    		  <li><cite></cite><a href="<s:property value="action"/>" target="rightFrame"><s:property value="name"/></a><i></i></li>
    	</s:iterator>
        </ul>     
    </dd> 
    
    
    <dd><div class="title"><span><img src="images/leftico03.png" /></span>创新分管理</div>
    <ul class="menuson">
        <s:iterator value="#part3">
    		  <li><cite></cite><a href="<s:property value="action"/>" target="rightFrame"><s:property value="name"/></a><i></i></li>
    	</s:iterator>
    </ul>    
    </dd>  
    
    
    <dd><div class="title"><span><img src="images/leftico04.png" /></span>活动奖罚管理</div>
    <ul class="menuson">
        <s:iterator value="#part4">
    		  <li><cite></cite><a href="<s:property value="action"/>" target="rightFrame"><s:property value="name"/></a><i></i></li>
    	</s:iterator>
    </ul>
    
    </dd>

        <dd><div class="title"><span><img src="images/leftico04.png" /></span>异常管理</div>
            <ul class="menuson">
               <s:iterator value="#part5">
    		  <li><cite></cite><a href="<s:property value="action"/>" target="rightFrame"><s:property value="name"/></a><i></i></li>
    	</s:iterator>
            </ul>

        </dd>

    </dl>
</body>
</html>
