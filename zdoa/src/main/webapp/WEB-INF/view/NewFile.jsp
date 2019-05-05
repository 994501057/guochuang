<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>查询项目列表</title>

       <meta charset="UTF-8">
		<title>添加人员</title>
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
<form action="${pageContext.request.contextPath }/project/management/indexs" method="get">
	关键字<input type="text" name="name"/>
	<input type="submit" value="查询"><br/>
	</form>
	

<form action="${pageContext.request.contextPath }/project/management/indexs" method="GET">
				<div class="btns ub">                    
                    <div class="btn btn-add" > <a href="${pageContext.request.contextPath }/project/management/add"> <button>新增项目</button></a>
						<button onclick=""> 全部删除</button>	
						<button> 批量删除</button>	
                    </div> 
                  
                                   
                </div>
项目列表：
<table width="100%" border=1>
		
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
			 <c:forEach items="${findProject_table}" varStatus="s" var="findProject_table">
			<tr>
				<td>
					<input type="checkbox" name="chckBox" value="${findProject_table.id}"/>
				</td>
				<td>
					<input type="hidden" name="findProject_table[${s.index}].id" value="${findProject_table.id }"/>
					<input type="text" name="findProject_table[${s.index}].name" value="${findProject_table.name }"/>
				</td>
				
				<td><input type="text" name="findProject_table[${s.index}].dictionary_id" value="${findProject_table.dictionary_id }"/>
				</td>
				<td>
				<input type="text" name="findProject_table[${s.index}].type" value="${findProject_table.type }"/>
				</td>
				<td><input type="text" name="findProject_table[${s.index}].clientname" value="${findProject_table.clientname }"/>
				</td>			
				<td><input type="text" name="findProject_table[${s.index}].startdate" value="<fmt:formatDate value="${findProject_table.startdate}" pattern="yyyy-MM-dd"/>"/>
				</td>
				<td><input type="text" name="findProject_table[${s.index}].enddate" value="<fmt:formatDate value="${findProject_table.enddate}" pattern="yyyy-MM-dd"/>"/>
				</td>
				<td><input type="text" name="findProject_table[${s.index}].user_id" value="${findProject_table.user_id }"/>
				</td>
				<td><input type="text" value="已收"/>
				</td>		
				<td><a href="${pageContext.request.contextPath }/project/management/detail/${findProject_table.id}">修改</a>
				<a href="${pageContext.request.contextPath }/project/management/del/${findProject_table.id}">删除</a>
				</td>			
			</tr>
			</c:forEach>
			</table>
</form>
<script type="text/javascript">  
    function seltAll(){  
        var chckBoxSign = document.getElementById("ckb");       //ckb 全选/反选的选择框id  
        var chckBox = document.getElementsByName("chckBox");    //所有的选择框其那么都是chckBox  
        var num = chckBox.length;  
        if(chckBoxSign.checked){  
            for(var index =0 ; index<num ; index++){  
                chckBox[index].checked = true;  
                }  
        }else{  
            for(var index =0 ; index<num ; index++){  
                chckBox[index].checked = false;  
                }  
            }  
        }  
  
    function deleSeltedRecords(){  
        var chckBox = document.getElementsByName("chckBox");  
        var num = chckBox.length;  
        var ids = "";  
        for(var index =0 ; index<num ; index++){  
            if(chckBox[index].checked){  
                ids += chckBox[index].value + ",";                
            }  
        }  
        if(ids!=""){  
            if(window.confirm("确定删除所选记录？")){  
                $.ajax( {  
                    type : "post",  
                    url : '${pageContext.request.contextPath }/project/management/del?ids=' + ids, //要自行删除的action  
                    dataType : 'json',  
                    success : function(data) {  
                        alert("删除成功");  
                       // window.location.href = "${pageContext.request.contextPath }/project/management/indexs" ;  
                    },  
                    error : function(data) {  
                        alert("系统错误，删除失败");  
                    }  
                });  
            }  
        }else{  
            alert("请选择要删除的记录");  
            }  
        }  
</script> 

</body>

</html>