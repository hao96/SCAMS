<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>网站后台管理系统HTML模板--我爱模板网 www.5imoban.net</title>
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
        <li><a href="#">学科成绩录入</a></li>
    </ul>
</div>

<div class="rightinfo">

    <div class="formbody1">
        <div class="formtitle"><span>准备录入学生成绩信息</span></div>
        <form action="kc_kcPrepare.action">
        <ul class="forminfo">
            <li><label>学号</label><input name="snum" type="text" class="dfinput1" /><i>12个数字</i></li>
            <li><label>学期</label>
                    <div class="usercity">
                        <div class="cityleft">
                            <select class="select2" name="term">
                                <option>2015-2016上学期</option>
                                <option>2015-2016下学期</option>
                                <option>2016-2017上学期</option>
                                <option>2016-2017下学期</option>
                            </select>
                        </div>
                    </div>
			</li>
            <li><label>&nbsp;</label><s:submit value="准备学科信息" cssClass="btn"></s:submit></li>
            </ul>
       </form>

        <div class="formtitle"><span>录入学生学科成绩</span></div>
		<form action="kc_tostukclog.action">
        <ul class="forminfo">
        	<s:iterator value="#sclist">
        		 <s:textfield name="course.cname" type="hidden"></s:textfield>
        		<li><label>${course.cname}</label><input name="core" type="text" class="dfinput1" /></li>
			</s:iterator>
            <li><label>&nbsp;</label><s:submit value="录 入" cssClass="btn"></s:submit></li>
        </ul>
		</form>
    </div>

</div>

</body>
</html>
