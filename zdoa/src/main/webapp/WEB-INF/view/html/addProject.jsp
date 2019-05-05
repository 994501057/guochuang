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
            <form class="form" id="addproject_table" action="<%-- ${pageContext.request.contextPath }/project/management/save --%>" method="<!-- get -->">
            <div class="input-area">
                    <div class="input-label">项目名称</div>
                    <div class="input-con">
                        <input class="input input-6" name="name" />
                    </div>
                </div>
                <div class="input-area">
                    <div class="input-label">项目类别</div>
                    <div class="input-con">   
                      <input id="dictionary_id" class="input input-1" name="dictionary_id" type="text" />                  
                       <!--  <select class="input input-1" >
                            <option>--</option>
                            <option>外派</option>
                            <option>外派1</option>
                        </select> -->
                    </div>
                </div>
                 <div class="input-area after-input">
                    <div class="input-label">项目类型</div>
                    <div class="input-con">
                        <input id="startdate" class="input input-1" name="type" type="text" />
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">开始日期</div>
                    <div class="input-con">
                        <input id="startdate" class="input input-1" name="startdate" type="text" />
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">结束日期</div>
                    <div class="input-con">
                        <input id="enddate" class="input input-1" name="enddate" />
                    </div>
                </div>
                <div class="input-area">
                    <div class="input-label">客户名称</div>
                    <div class="input-con">
                       <input class="input input-5" name="clientname"/>
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">项目行业</div>
                    <div class="input-con">
                      <input class="input input-5" name="trade"/>
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
                         <input class="input input-2" name="amount" />
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label" style="width: 80px">项目负责人</div>
                    <div class="input-con">
                     <!-- <input class="input input-2" name="user_id"/> -->
                      <select class="input input-2" name="division" id="division">
                            <option>部门</option>
                            <c:forEach items="${findDivisions}" var="findDivision" >
                            <option value="${findDivision.id}">${findDivision.name}</option>
                            </c:forEach>
                        </select>
                        <select class="input input-2" style="margin-left: 10px" name="user" id="getProjectUser">
                            <option value="">成员</option>                            
                           <!--  <option>张三</option>
                            <option>李四</option> -->
                        </select>
                    </div>
                </div>
                <div class="input-area">
                    <div class="input-label">联系人</div>
                    <div class="input-con">
                        <input class="input input-5" name="contact" />
                    </div>
                </div>
                <div class="input-area after-input">
                    <div class="input-label">联系电话</div>
                    <div class="input-con">
                       <input class="input input-5" name="phone" />
                    </div>
                </div>
                <br>
                <div class="input-area" id="pgs">
                    <div class="input-label">开发人员</div>
                    <div class="input-con">
                        <select class="input input-4" id="divisions">
                            <option>部门</option>
                            <c:forEach items="${findDivisions}" var="findDivision">
                            <option value="${findDivision.id}">${findDivision.name}</option>
                            </c:forEach>
                        </select>
                        <select class="input input-4" style="margin-left: 10px" name="users" id="getUser">
                            <option value="">成员</option>                            
                           <!--  <option>张三</option>
                            <option>李四</option> -->
                        </select>
                        <div class="btn btn-addpg">新增人员</div>
                    </div>
                    <!--
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
       			$.ajax({  
       	            type: "POST",   //提交的方法
       	            url:"${pageContext.request.contextPath }/project/management/save", //提交的地址  
       	            data:$('#addproject_table').serialize(),// 序列化表单值  
       	            async: false,  
       	            error: function(request) {  //失败的话
       	                 alert("Connection error");  
       	            },  
       	            success: function(data) {  //成功
       	                 alert(data);  //就将返回的数据显示出来
       	                 window.location.href="/project/management/indexs"  
       	            }  
       	         });
		})
        //新增人员
        $(".btn-addpg").on("click",function () {
            var str = '<div class="input-con pg-add">' +
                '                        <select class="input input-3" name="division">' +
                '                            <option>部门</option>' +
                '							<c:forEach items="${findDivisions}" var="findDivision">'+
             	 '			  				<option value="${findDivision.id}">'+'${findDivision.name}'+'</option>'+
               	 '			 				</c:forEach>'+
               	 '						</select>' +
               	 '						<select class="input input-3" style="margin-left: 10px" name="users">'+																												
               	 '   						<option>成员</option>' +
                '                        </select>' +
                '                        <div class="btn-delpg ub-img"></div>' +
                '                    </div>';
            $("#pgs >.input-con:last-child").after(str);
        });
        //删除人员
        $("#pgs").on("click",".btn-delpg",function () {
            $(this).closest(".pg-add").remove();
        }) 
        $("body").on("change",".input-3",function(){
            var options=$(".input-3 option:selected");  //获取选中的项
            alert(options.val());   //拿到选中项的值
              var division_id= options.val(); //获取选中的值
              var divisionName=options.text();
            //通过 部门 id ，获取部门下的成员
            //$("#getUser").empty(); 
           // $("#getProjectUser").empty(); 
            $.ajax({ 
                async:false,
                url: "${pageContext.request.contextPath}/project/management/selectUser",
                data:{id:division_id},
                type: "GET",
                datatype: "json",
                ///contentType: 'application/json',
                success: function(data){
                	var json= JSON.stringify(data);
                	var jsons=eval(json);                	 
               // alert("Data Loaded: " +json);             
                	$(".input-3").append("<option value=''>"+'--请选择--'+"</option>");
                	$.each(jsons,function(index,value){
                      $(".input-3").append("<option value='"+value.id+"'>"+value.username+"</option>");                       
                    });
                }
            });         	
        })
         $("#divisions").change(function(){
        	 var options=$("#divisions option:selected");  //获取选中的项
        	 var division_id= options.val(); //获取选中的值
             var divisionName=options.text();
        	 $.ajax({
        		 async:false,
                 url: "${pageContext.request.contextPath}/project/management/selectUser",
                 data:{id:division_id},
                 type: "GET",
                 datatype: "json",
                 ///contentType: 'application/json',
                 success: function(data){
                 	var json= JSON.stringify(data);
                 	var jsons=eval(json);
                	$.each(jsons,function(index,value){
                        $("#getUser").append("<option value='"+value.id+"'>"+value.username+"</option>");                      
          		 });           
        		}
			}) 
         })
     $("#division").change(function(){
        	// var myselect=document.getElementById("division");
        	//var index=myselect.selectedIndex ; // selectedIndex代表的是你所选中项的index
        	//myselect.options[index].value;
           // var division_id= $("#division").val(); //获取选中的值
            var options=$("#division option:selected");  //获取选中的项
            //alert(options.val());   //拿到选中项的值
              var division_id= options.val(); //获取选中的值
              var divisionName=options.text();
            //通过 部门 id ，获取部门下的成员
            $("#getProjectUser").empty(); 
            $.ajax({ 
                async:false,
                url: "${pageContext.request.contextPath}/project/management/selectUser",
                data:{id:division_id},
                type: "GET",
                datatype: "json",
                ///contentType: 'application/json',
                success: function(data){
                	var json= JSON.stringify(data);
                	var jsons=eval(json);
                	 //var jsonobj=eval(data);
               // alert("Data Loaded: " +json);
                	/* $("#getUser").append("<option value=''>"+'--请选择--'+"</option>");
                	$.each(jsons,function(index,value){
                		//alert(index);
                		//var ob=jsonobj[index];
                      $("#getUser").append("<option value='"+value.id+"'>"+value.username+"</option>");                       
                    }); */
                	$.each(jsons,function(index,value){
                      $("#getProjectUser").append("<option value='"+value.id+"'>"+value.username+"</option>");                      
                    });                	
                }
            }); 
       });
    })
</script>
</body>
</html>