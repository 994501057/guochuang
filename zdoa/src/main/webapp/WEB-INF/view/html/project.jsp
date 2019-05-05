<%@ page language="java" contentType="text/html; charset=utf-8"
   pageEncoding="utf-8"%>
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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/bootstrap-datepicker.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/ui-box.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/app.css">
    <style>
        .search-area{
            height: 100px;
            padding-right: 30px;
        }
        .search-area .item{
            margin-left: 20px;
        }
        .search-area .item-title{
            color: #4D4D4D;
        }
        .search-area .item-input{
            margin-left: 15px;
        }
        .search-area .item-input input,.search-area .item-input select{
            width: 130px;
            height: 30px;
            border: 1px solid #E6E6E6;
            padding: 0 8px;
            background-color: #ffffff;
        }
        .btn{
            border-radius: 4px;
            padding: 8px 15px;
            font-size: 14px;
            color: #ffffff;
        }
        .btn:active,.btn:hover{
            color: #ffffff;
        }
        .btn-search{
            background-color: #FFBD56;
        }
        .btn-add{
            background-color: #3F68E0;
        }
        .btns >.btn:not(:first-child){
            margin-left: 20px;
        }

        .main-con{
            overflow-x: scroll;
        }
        .table{
            table-layout: fixed;
        }
        /*表格*/
        /*项目编号*/
        .table tr >th:nth-child(1),.table tr >td:nth-child(1){
            width: 100px;
        }
        /*项目名称*/
        .table tr >th:nth-child(2),.table tr >td:nth-child(2){
            width: 200px;
        }
        /*项目类别*/
        .table tr >th:nth-child(3),.table tr >td:nth-child(3){
            width: 88px;
        }
        /*项目类型*/
        .table tr >th:nth-child(4),.table tr >td:nth-child(4){
            width: 88px;
        }
        /*客户名称*/
        .table tr >th:nth-child(5),.table tr >td:nth-child(5){
            width: 200px;
        }
        /*开始时间*/
        .table tr >th:nth-child(6),.table tr >td:nth-child(6){
            width: 100px;
        }
        /*结束时间*/
        .table tr >th:nth-child(7),.table tr >td:nth-child(7){
            width: 100px;
        }
        /*项目负责人*/
        .table tr >th:nth-child(8),table .tr >td:nth-child(8){
            width: 100px;
        }
        /*收款状态*/
        .table tr >th:nth-child(9),.table tr >td:nth-child(9){
            width: 130px;
        }
        /*操作*/
        .table tr >th:nth-child(10),.table tr >td:nth-child(10){
            width: 120px;
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
    <form id="searchProject" action="${pageContext.request.contextPath }/project/management/indexs" method="get">
        <div class="search-area ub ub-pc ub-ver">
            <div class="ub">
                <div class="items ub ub-f1">
                    <div class="item ub ub-ac">
                        <div class="item-title">开始时间</div>
                        <div class="item-input">
                            <input id="startDate" style="width: 120px">
                        </div>
                    </div>
                    <div class="item ub ub-ac">
                        <div class="item-title">关键字</div>
                        <div class="item-input">
                           <input type="text" name="name"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="ub" style="margin-top: 10px">
                <div class="items ub ub-f1">
                    <div class="item ub ub-ac">
                        <div class="item-title">结束时间</div>
                        <div class="item-input">
                            <input id="endDate" style="width: 120px">
                        </div>
                    </div>
                    <div class="item ub ub-ac">
                        <div class="item-title">项目负责人</div>
                        <div class="item-input">           
 							 <select>
                                <option>--</option>
                                <option>张三</option>
                                <option>里斯</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="btns ub">
                    <div class="btn btn-search" id="btn-search">查询</div>
                    <div class="btn btn-add">新增项目</div>
                </div>
            </div>
        </div>
        </form>
        <div class="main-con">
            <table class="table table-responsive table-striped">
                <tr>
                    <th>项目编号</th>
                    <th>项目名称</th>
                    <th>项目类别</th>
                    <th>项目类型</th>
                    <th>客户名称</th>
                    <th>开始时间</th>
                    <th>结束时间</th>
                    <th>项目负责人</th>
                    <th>收款状态(已收)</th>
                    <th>操作</th>
                </tr>
                 <c:forEach items="${findProject_table.project_table}"  var="findProject_table">
			<tr>
				<td>
					${findProject_table.id }
				</td>
				<td>
					${findProject_table.name }
				</td>				
				<td>
					${findProject_table.dictionary_id }
				</td>
				<td>
				${findProject_table.type }
				</td>
				<td>
					${findProject_table.clientname }
				</td>			
				<td>
					<fmt:formatDate value="${findProject_table.startdate}" pattern="yyyy-MM-dd"/>
				</td>
				<td>
					<fmt:formatDate value="${findProject_table.enddate}" pattern="yyyy-MM-dd"/>
				</td>
				<td>
					${findProject_table.user_id }
				</td>
				<td>
					<input type="text" readonly="readonly" value="已收" style="border: 0px;outline:none;cursor: pointer; text-align:center"/>
				</td>		
				<td>
				 <div class="operates ub ub-ac ub-pc">		
                          <div style="margin-left:5px"><a href="${pageContext.request.contextPath }/project/management/detail/${findProject_table.id}"><div class="icon-operate icon-detail">
                          </div></a> </div>
                           <div style="margin-left:5px"><a href="${pageContext.request.contextPath }/project/management/edit/${findProject_table.id}"><div class="icon-operate icon-detail">
                          </div></a> </div>
                          <div style="margin-left:15px"> <a href="${pageContext.request.contextPath }/project/management/del/${findProject_table.id}"><div class="icon-operate icon-edit">
                          </div></a></div>
                          </div>				
				
				</td>			
			</tr>
			</c:forEach>             
            </table>
        </div>
        <!--翻页-->
        <div class="text-c"> <ul id="pageLimit"></ul> </div>
    </div>
</div>


<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap-paginator.min.js"></script>
<script>
    $(function () {
        $('#startDate,#endDate').datepicker({
            format: 'yyyy-mm-dd',
            minViewMode: 0,
            autoclose: true
        });
 

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
        })       
        $(".btn-add").on("click",function(){
        	 location.href = '/project/management/add';
        })
       $("#btn-search").on("click",function(){
    	   $("#searchProject").submit();
        })
        // 翻页
        var currentPage=${findProject_table.currentPage};
        var totalNum=${findProject_table.totalNum};
        $('#pageLimit').bootstrapPaginator({
            currentPage:currentPage ,//当前的请求页面。
            totalPages: totalNum,//一共多少页。
            size: "normal",//页眉的大小。
            bootstrapMajorVersion: 3,//bootstrap的版本要求。
            alignment: "right",
            numberOfPages: 5,//一页列出多少数据。
            itemTexts: function (type, page, current) {//如下的代码是将页眉显示的中文显示我们自定义的中文。
                switch (type) {
                    case "first":
                        return "首页";
                    case "prev":
                        return "上一页";
                    case "next":
                        return "下一页";
                    case "last":
                        return "末页";
                    case "page":
                        return page;
                }
            },
            onPageClicked:function(event, originalEvent, type,page){            	
            	location.href = '/project/management/index'+page;
            }
            
        });
    })
</script>
</body>
</html>