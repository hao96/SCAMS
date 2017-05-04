<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>查询学生的基本信息</title>
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
        <li><a href="#">信息查询</a></li>
    </ul>
</div>

<div class="rightinfo">

    <div class="formbody">

        <div class="formtitle"><span>选择查询类型</span></div>

		<form action="admin_tostuselect.action">
        <ul class="forminfo">
            <li><label>学号</label><input name="snum" type="text" class="dfinput1" value=""/><i>12个数字</i></li>
            <li><s:fielderror fieldName="nostu"></s:fielderror></li>
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
            <li><label>姓名</label><input name="sname" type="text" class="dfinput1" /></li>
            <li><label></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <s:submit cssClass="btn" value="查询"></s:submit>
                </li>
        </ul>
		</form>

    </div>


    <table class="tablelist">
        <thead>
        <tr>
        	<th><label>&nbsp;</label></th>
            <th>学号<i class="sort"><img src="images/px.gif" /></i></th>
            <th>姓名</th>
            <th>性别</th>
            <th>系别</th>
            <th>班级</th>
            <th>户籍</th>
            <th>出生日期</th>
            <th>入学日期</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <s:iterator value="stus">
	        <tr>
	        	<td><label>&nbsp;</label></td>
	            <td><s:property value="snum"/></td>
	            <td><s:property value="sname"/></td>
	            <td><s:property value="ssex"/></td>
	            <td><s:property value="sde"/></td>
	            <td><s:property value="sclass"/></td>
	            <td><s:property value="snative"/></td>
	            <td><s:property value="sbor"/></td>
	            <td><s:property value="sschoolday"/></td>
	            <td><s:a action="admin_stualter.action?snum=%{snum}" class="tablelink">查看及修改</s:a></td>
	        </tr>
		</s:iterator>
  
        </tbody>
    </table>


    <div class="pagin">
        <div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
        <ul class="paginList">
            <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
            <li class="paginItem"><a href="javascript:;">1</a></li>
            <li class="paginItem current"><a href="javascript:;">2</a></li>
            <li class="paginItem"><a href="javascript:;">3</a></li>
            <li class="paginItem"><a href="javascript:;">4</a></li>
            <li class="paginItem"><a href="javascript:;">5</a></li>
            <li class="paginItem more"><a href="javascript:;">...</a></li>
            <li class="paginItem"><a href="javascript:;">10</a></li>
            <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
        </ul>
    </div>


    <div class="tip">
        <div class="tiptop"><span>提示信息</span><a></a></div>

        <div class="tipinfo">
            <span><img src="images/ticon.png" /></span>
            <div class="tipright">
                <p>是否确认对信息的修改 ？</p>
                <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
            </div>
        </div>

        <div class="tipbtn">
            <input name="" type="button"  class="sure" value="确定" />&nbsp;
            <input name="" type="button"  class="cancel" value="取消" />
        </div>

    </div>




</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>
</body>
</html>
