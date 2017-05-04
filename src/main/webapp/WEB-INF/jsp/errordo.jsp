<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>异常处理</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <link href="css/select.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
    <script type="text/javascript" src="js/select-ui.min.js"></script>
    <script type="text/javascript" src="editor/kindeditor.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });

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
        <li><a href="#">异常处理</a></li>
    </ul>
</div>

<div class="rightinfo">

    <div class="formbody1">

        <div class="formtitle"><span>异常处理</span></div>
		<form action="error_delete.action">
		<s:textfield name="id" type="hidden" cssClass="dfinput1"></s:textfield>
        <ul class="forminfo">
            <li><label>标题</label><s:textfield name="etitle" cssClass="dfinput1"></s:textfield></li>
            <li><label>日期</label><s:textfield name="eday" readonly="true" cssClass="dfinput1"></s:textfield></li>
            <li><label>异常内容</label>
                <s:textarea name="econ" cssClass="dfinput1"></s:textarea>
            </li>
            <li><label>&nbsp;</label><s:submit value="处 理" cssClass="btn"></s:submit></li>
        </ul>
		</form>
    </div>

</div>

</body>
</html>
