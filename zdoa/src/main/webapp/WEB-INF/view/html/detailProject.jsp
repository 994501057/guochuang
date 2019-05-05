<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
String path = request.getContextPath(); 
// 获得项目完全路径
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>项目管理</title>
    <link rel="stylesheet"  type="text/css" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css">
    <link rel="stylesheet"  type="text/css" href="${pageContext.request.contextPath}/static/css/bootstrap-datepicker.min.css">
    <link rel="stylesheet"  type="text/css" href="${pageContext.request.contextPath}/static/css/ui-box.css">
    <link rel="stylesheet"  type="text/css" href="${pageContext.request.contextPath}/static/css/app.css">
    <link rel="stylesheet"  type="text/css" href="${pageContext.request.contextPath}/static/css/form.css">
    <style>
        .checkbox{
            margin: 0 0 0 18px;
            display: inline-block;
            font-size: 16px;
        }
        .form .input-area .pg-add{
            margin-left: 85px;
            margin-top: 10px;
        }
        .form{
            font-size: 0;
        }
        .btn-addpg{
            height: 30px;
            line-height: 30px;
            font-size: 14px;
            border: 1px solid #E6E6E6;
            padding: 0 20px;
            color: #ffffff;
            background-color: #6CDF97;
            margin-left: 20px;
            position: relative;
            top: -4px;
        }
        .btn-delpg{
            width: 20px;
            height: 20px;
            background-image: url("${pageContext.request.contextPath}/static/images/icon/shanchu.png");
            display: inline-block;
            margin-left: 20px;
            position: relative;
            top: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body class="ub">
<div class="left-menu ub ub-ver">
    <div class="user ub ub-pc ub-ac">
        <div class="head ub-img"></div>
        <span class="name">admin</span>
    </div>
    <ul class="tree-menu ub-f1">
        <li>
            <div class="menu ub ub-ac">
                <div class="icon"><img src="${pageContext.request.contextPath}/static/images/icon/guanli.png"></div>
                <div class="text text-c">项目管理</div>
                <div class="right"><img src="${pageContext.request.contextPath}/static/images/icon/xiala.png"></div>
            </div>
            <ul class="sub-menu">
                <li>
                    <div class="menu ub ub-ac">
                        <div class="icon"></div>
                        <div class="text text-c">收支管理</div>
                        <div class="right"></div>
                    </div>
                </li>
                <li>
                    <div class="menu ub ub-ac">
                        <div class="icon"></div>
                        <div class="text text-c">项目损益</div>
                        <div class="right"></div>
                    </div>
                </li>
                <li>
                    <div class="menu ub ub-ac">
                        <div class="icon"></div>
                        <div class="text text-c">周报管理</div>
                        <div class="right"></div>
                    </div>
                </li>
            </ul>
        </li>
        <li>
            <div class="menu ub ub-ac">
                <div class="icon"><img src="${pageContext.request.contextPath}/static/images/icon/guanli.png"></div>
                <div class="text text-c">人员管理</div>
                <div class="right"><img src="${pageContext.request.contextPath}/static/images/icon/xiala.png"></div>
            </div>
            <ul class="sub-menu">
                <li>
                    <div class="menu ub ub-ac">
                        <div class="icon"></div>
                        <div class="text text-c">请假管理</div>
                        <div class="right"></div>
                    </div>
                </li>
            </ul>
        </li>
        <li>
            <div class="menu ub ub-ac">
                <div class="icon"><img src="${pageContext.request.contextPath}/static/images/icon/baoxiao.png"></div>
                <div class="text text-c">报销管理</div>
                <div class="right"></div>
            </div>
        </li>
        <li>
            <div class="menu ub ub-ac">
                <div class="icon"><img src="${pageContext.request.contextPath}/static/images/icon/caiwu.png"></div>
                <div class="text text-c">财务管理</div>
                <div class="right"><img src="${pageContext.request.contextPath}/static/images/icon/xiala.png"></div>
            </div>
            <ul class="sub-menu">
                <li>
                    <div class="menu ub ub-ac">
                        <div class="icon"></div>
                        <div class="text text-c">智代信息</div>
                        <div class="right"></div>
                    </div>
                </li>
                <li>
                    <div class="menu ub ub-ac">
                        <div class="icon"></div>
                        <div class="text text-c">斑目信息</div>
                        <div class="right"></div>
                    </div>
                </li>
            </ul>
        </li>
        <li>
            <div class="menu ub ub-ac">
                <div class="icon"><img src="${pageContext.request.contextPath}/static/images/icon/shezhi.png"></div>
                <div class="text text-c">权限设置</div>
                <div class="right"><img src="${pageContext.request.contextPath}/static/images/icon/xiala.png"></div>
            </div>
            <ul class="sub-menu">
                <li>
                    <div class="menu ub ub-ac">
                        <div class="icon"></div>
                        <div class="text text-c">客户权限</div>
                        <div class="right"></div>
                    </div>
                </li>
                <li>
                    <div class="menu ub ub-ac">
                        <div class="icon"></div>
                        <div class="text text-c">权限分配</div>
                        <div class="right"></div>
                    </div>
                </li>
            </ul>
        </li>
    </ul>
    <div class="login-out ub ub-ac">
        <div class="icon"><img src="${pageContext.request.contextPath}/static/images/icon/tuichu.png"></div>
        <span>退出</span>
    </div>
</div>
<div class="ub ub-f1 ub-ver right-con">
    <div class="oa-title ub ub-pc">智代恒通OA管理系统</div>
    <div class="main ub-f1">
        <div class="main-con">
            <div class="page-title ub ub-ac ub-pc">新增项目</div>
            <form class="form" id="editProject_table" action="${pageContext.request.contextPath }/project/management/update" method="get">
            <input type="hidden" class="input input-6" name="id" value="${findProject_tableById.id}"/> 
            <div class="input-area">
                    <div class="input-label">项目名称</div>
                    <div class="input-con">
                        <input class="input input-6" type="text"  value="${findProject_tableById.name}" />
                    </div>
                </div>
                <div class="input-area">
                    <div class="input-label">项目类别</div>
                    <div class="input-con">   
                      <input id="dictionary_id" class="input input-1" name="dictionary_id" type="text" value="${findProject_tableById.dictionary_id}"/>                  
                       <!--  <select class="input input-1" >
                            <option>--</option>
                            <option>外派</option>
                            <option>外派1</option>
                        </select> -->
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">开始日期</div>
                    <div class="input-con">
                        <input id="startdate" class="input input-1" name="startdate" type="text" value="<fmt:formatDate value="${findProject_tableById.startdate}" pattern="yyyy-MM-dd hh:mm:ss"/>"/>
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">结束日期</div>
                    <div class="input-con">
                        <input id="enddate" class="input input-1" name="enddate" value="<fmt:formatDate value="${findProject_tableById.enddate}" pattern="yyyy-MM-dd hh:mm:ss" type="both"/>"/>
                    </div>
                </div>
                <div class="input-area">
                    <div class="input-label">客户名称</div>
                    <div class="input-con">
                       <input class="input input-5" name="clientname" value="${findProject_tableById.clientname }"/>
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">项目行业</div>
                    <div class="input-con">
                      <input class="input input-5" name="trade" value="${findProject_tableById.trade }"/>
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
                         <input class="input input-2" name="amount" value="${findProject_tableById.amount }"/>
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label" style="width: 80px">项目负责人</div>
                    <div class="input-con">
                      <input class="input input-2" name="user_id" value="${findProject_tableById.user_id }"/>
                      <!--   <select class="input input-2">
                            <option>部门</option>
                            <option>信息技术部</option>
                            <option>行政部</option>
                        </select>
                        <select class="input input-2" style="margin-left: 10px">
                            <option>负责人</option>
                            <option>张三</option>
                            <option>李四</option>
                        </select> -->
                    </div>
                </div>
                <div class="input-area">
                    <div class="input-label">联系人</div>
                    <div class="input-con">
                        <input class="input input-5" name="contact" value="${findProject_tableById.contact }"/>
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">联系电话</div>
                    <div class="input-con">
                       <input class="input input-5" name="phone" value="${findProject_tableById.phone }"/>
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
                    <div class="btn btn-cancle">取消</div>
                    <div class="btn  btn-save" id="btn-save">保存</div>
                </div>
            </form>
        </div>
    </div>
</div>


<script src="${pageContext.request.contextPath}/static/js/jquery.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap-paginator.min.js" type="text/javascript"></script>
<script>
    $(function () {
        $(".menu").on("click",function () {
            if($(this).parent().find(".sub-menu").length){
                if($(this).hasClass("open")){
                    $(this).removeClass("open");
                }else{
                    $(this).addClass("open");
                }
            }else{
                //跳转到模块
            }
        });
         $('#startDate,#endDate').datepicker({
            format: 'yyyy-mm-dd',
            minViewMode: 0,
            autoclose: true
        });
        //取消
        $(".btn-cancle").on("click",function () {
            location.href = '/project/management/indexs';
        })
       		$("#btn-save").click(function(){
			$("#editProject_table").submit();
		})
        //新增人员
        $(".btn-addpg").on("click",function () {
            var str = '<div class="input-con pg-add">' +
                '                        <select class="input input-2">' +
                '                            <option>部门</option>' +
                '                            <option>信息技术部</option>' +
                '                            <option>行政部</option>' +
                '                        </select>' +
                '                        <select class="input input-2" style="margin-left: 10px">' +
                '                            <option>成员</option>' +
                '                            <option>张三</option>' +
                '                            <option>李四</option>' +
                '                        </select>' +
                '                        <div class="btn-delpg ub-img"></div>' +
                '                    </div>';
            $("#pgs >.input-con:last-child").after(str);

        });
        //删除人员
        $("#pgs").on("click",".btn-delpg",function () {
            $(this).closest(".pg-add").remove();
        })
        


    })
</script>
</body>
</html>