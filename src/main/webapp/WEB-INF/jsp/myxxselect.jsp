<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>我的基本信息</title>
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
        <li><a href="#">信息录入</a></li>
    </ul>
</div>

<div class="rightinfo">

    <div class="formbody1">

        <div class="formtitle"><span>我的信息</span></div>

        <ul class="forminfo">
            <li><label>学号</label><s:textfield name="snum" cssClass="dfinput1"></s:textfield></li>
            <li><label>姓名</label><s:textfield name="sname" cssClass="dfinput1"></s:textfield></li>
            <li><label>出生日期</label><s:textfield name="sbor" cssClass="dfinput1"></s:textfield></li>
            <li><label>性别</label><cite><s:radio list="#{'男':'男','女':'女' }" name="ssex"></s:radio></cite></li>
            <li><label>系别及班级</label>

                <div class="usercity">

                    <div class="cityleft">
                    	<s:select list="#sdes" name="sde" key="key" value="value"></s:select>
                    </div>

                    <div class="cityright">
                        <s:select list="#sclasses" name="sde" key="key" value="value"></s:select>
                    </div>

                </div>
			</li>
            <li><label>籍贯</label><s:textfield name="snative" cssClass="dfinput1"></s:textfield></li>
            <li><label>入学日期</label><s:textfield name="sschoolday" cssClass="dfinput1"></s:textfield></li>
        </ul>

    </div>

</div>

</body>
</html>
