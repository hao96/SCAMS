<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="js/select-ui.min.js"></script>
<script type="text/javascript" src="editor/kindeditor.js"></script>

<script type="text/javascript">
    KE.show({
        id : 'content7',
        cssPath : './index.css'
    });
  </script>
  
<script type="text/javascript">
$(document).ready(function(e) {
    $(".select1").uedSelect({
		width : 345			  
	});
	$(".select2").uedSelect({
		width : 167  
	});
	$(".select3").uedSelect({
		width : 100
	});
});
</script>
</head>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">异常申请</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    
    <div id="usual1" class="usual"> 
    
    <div class="itab">
  	<ul> 
    <li><a href="#tab1" class="selected">异常申请</a></li>
  	</ul>
    </div> 
    
  	<div id="tab1" class="tabson">
	<form action="error_toerrorapply.action">    
    <ul class="forminfo">
    <li><label>标题<b>*</b></label><input name="etitle" type="text" class="dfinput" value="请填写标题"  style="width:518px;"/></li>


    <li><label>异常内容<b>*</b></label>
    

    <textarea id="content7" name="econ" style="width:700px;height:250px;visibility:hidden;"></textarea>
    
    </li>
    <li><label>&nbsp;</label><s:submit value="提出异常" cssClass="btn"></s:submit></li>
    </ul>
    </form>
    </div> 
    
    

   
  
    
    </div>  
       
	</div> 


</body>
</html>
