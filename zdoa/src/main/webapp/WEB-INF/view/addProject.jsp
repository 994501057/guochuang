<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
       <meta charset="UTF-8">
		<title>添加项目</title>
		<style type="text/css">
			body {
				/*添加一张背景图片*/
				background-image: url(rl(bg.jpg);
	);
			}
			tr {
				height: 35px;
			}
			.in {
				width: 300px;
				height: 25px;
			}
			#formDiv {
				width: 500px;
				height: 570px;
				border: 5px solid #ccc;
				background-color: #fff;
				/*让div在浏览器里面居中
				 margin: 50px auto;  第一个值： 50px 优先于 上面  auto 
				 * */
				margin: 80px auto;
				padding: 30px 60px;
			}
		</style>
    </head>
<body> 
	<!-- 上传图片是需要指定属性 enctype="multipart/form-data" -->
	<!-- <form id="itemForm" action="" method="post" enctype="multipart/form-data"> -->	
	<div id="formDiv">
	<div class="ub ub-f1 ub-ver right-con">
    <div class="oa-title ub ub-pc">智代恒通OA管理系统</div>
    <div class="main ub-f1">
        <div class="main-con">
            <div class="page-title ub ub-ac ub-pc">新增项目</div>
            <form id="itemForm"	action="${pageContext.request.contextPath }/project/management/save" method="get">
            <input type="hidden" class="input input-6" value="${findProject_tableById.id}"/>
           
                <div class="input-area">
                    <div class="input-label">项目名称</div>
                    <div class="input-con">
                        <input class="input input-6" name="name">
                    </div>
                </div>
                <div class="input-area">
                    <div class="input-label">项目类别</div>
                    <div class="input-con">
                    <input id="dictionary_id" type="text" class="input input-1" name="dictionary_id"/>
                       <!--  <select class="input input-1" name="dictionary_id">
                            <option>--</option>
                            <option>外派</option>
                            <option>外派1</option>
                        </select> -->
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">开始日期</div>
                    <div class="input-con">
                        <input id="startDate" type="date" class="input input-1" name="startdate"/>
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">结束日期</div>
                    <div class="input-con">
                        <input id="endDate" class="input input-1" type="date" name="enddate"/>
                    </div>
                </div>
                <div class="input-area">
                    <div class="input-label">客户名称</div>
                    <div class="input-con">
                        <input class="input input-5" name="clientname">
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">项目行业</div>
                    <div class="input-con">
                     <input class="input input-5" name="trade">
                       <!--  <select class="input input-5">
                            <option>--</option>
                            <option>外派</option>
                            <option>外派1</option>
                        </select> -->
                    </div>
                </div>
                <div class="input-area">
                    <div class="input-label">项目类型</div>
                    <div class="input-con">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox"> WEB
                            </label>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox"> IOS
                            </label>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox"> 安卓
                            </label>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox"> API
                            </label>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox"> 小程序
                            </label>
                        </div>
                    </div>
                </div>
                <br>
                <div class="input-area">
                    <div class="input-label">项目金额</div>
                    <div class="input-con">
                        <input class="input input-2" value="${findProject_tableById.amount }">
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label" style="width: 80px">项目负责人</div>
                    <div class="input-con">
                     <input class="input input-2" value="${findProject_tableById.user_id }">
                        <!-- <select class="input input-2">
                            <option>部门</option>
                            <option>信息技术部</option>
                            <option>行政部</option>
                        </select> -->
                       <!--  <select class="input input-2" style="margin-left: 10px">
                            <option>负责人</option>
                            <option>张三</option>
                            <option>李四</option>
                        </select> -->
                    </div>
                </div>
                <div class="input-area">
                    <div class="input-label">联系人</div>
                    <div class="input-con">
                        <input class="input input-5" name="contact">
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">联系电话</div>
                    <div class="input-con">
                        <input class="input input-5" name="phone">
                    </div>
                </div>
                <br>
                <div class="input-area" id="pgs">
                    <div class="input-label">开发人员</div>
                    <div class="input-con">
                        <select class="input input-2">
                            <option>部门</option>
                            <option>信息技术部</option>
                            <option>行政部</option>
                        </select>
                        <select class="input input-2" style="margin-left: 10px">
                            <option>成员</option>
                            <option>张三</option>
                            <option>李四</option>
                        </select>
                        <div class="btn btn-addpg">新增人员</div>
                    </div>
                    <!--<div class="input-con pg-add">-->
                        <!--<select class="input input-2">-->
                            <!--<option>部门</option>-->
                            <!--<option>信息技术部</option>-->
                            <!--<option>行政部</option>-->
                        <!--</select>-->
                        <!--<select class="input input-2" style="margin-left: 10px">-->
                            <!--<option>成员</option>-->
                            <!--<option>张三</option>-->
                            <!--<option>李四</option>-->
                        <!--</select>-->
                        <!--<div class="btn-delpg ub-img"></div>-->
                    <!--</div>-->
                </div>

                <div class="btns ub ub-pc">
                    <input type="button" /><a href="${pageContext.request.contextPath }/project/management/indexs" name="取消"></a>
                   <input type="submit"/>
                </div>
            </form>
        </div>
    </div>
</div>
</div>
</body>

</html>