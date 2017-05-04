<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>录入学生的基本信息</title>
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

        <div class="formtitle"><span>录入学生信息</span></div>

		<form action="admin_tostulog.action">
        <ul class="forminfo">
            <li><label>学号</label><input name="snum" type="text" class="dfinput1" /><i>8位学号</i></li>
            <li><s:fielderror fieldName="snum" ></s:fielderror></li>
            <li><label>姓名</label><input name="sname" type="text" class="dfinput1" /></li>
            <li><label>出生日期</label><input name="sbor" type="text" class="dfinput1" /></li>
            <li><label>性别</label><cite><input name="ssex" type="radio" value="男" />男&nbsp;&nbsp;&nbsp;&nbsp;<input name="ssex" type="radio" value="女" />女</cite></li>
            
      
                <li><label>系别及班级</label>

                    <div class="usercity">

                        <div class="cityleft">
                            <select class="select2" name="sde">
                                <option>软件工程</option>
                                <option>网络工程</option>
                                <option>计算机原理</option>
                            </select>
                        </div>

                        <div class="cityright">
                            <select class="select2" name="sclass">
                                <option>15-1</option>
                                <option>15-2</option>
                                <option>15-3</option>
                                <option>15-4</option>
                            </select>
                        </div>

                    </div>
                    </li>
            
            
                <li><label>籍贯</label><input name="snative" type="text" class="dfinput1" /></li>
                <li><label>入学日期</label><input name="sschoolday" type="text" class="dfinput1" /></li>
                <li><label>&nbsp;</label><s:submit cssClass="btn" value="录 入"></s:submit></li>
            </ul>
            </form>

    </div>


</div>
</body>
</html>
