<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
String path = request.getContextPath(); 
// 获得项目完全路径
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>智代OA</title>
    <base href="<%=basePath%>"></base>
    <link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="static/css/ui-box.css">
    <link rel="stylesheet" type="text/css" href="static/css/app.css">
    <style>
        /*index*/
        .label-title{
            height: 50px;
            line-height: 50px;
            position: relative;
            padding-left: 45px;
            border-bottom: 1px solid #DBDBDB;
        }
        .label-title:before{
            position: absolute;
            left: 20px;
            top: 4px;
        }
        .my-news{
            box-shadow:0px 4px 24px 0px rgba(179,179,179,0.25);
            padding-bottom: 40px;
        }
        .my-news .label-title{
            color: #FF7070;
        }
        .my-news .label-title:before{
            content: url("static/images/icon/xiaoxi.png");
        }
        .latest-news .label-title{
            color: #3EDA79;
        }
        .latest-news .label-title:before{
            content: url("static/images/icon/xiaoxi1.png");
        }
        .schedule .label-title{
            color: #FFB034;
        }
        .schedule .label-title:before{
            content: url("static/images/icon/daiban.png");
        }
        .projects .label-title{
            color: #3E66DA;
        }
        .projects .label-title:before{
            content: url("static/images/icon/jindu.png");
        }
        .my-news .item{
            color: #4D4D4D;
            padding: 30px 0 0 30px;
        }

        .my-news .item .img{
            width: 60px;
            height: 60px;
            margin-right: 14px;
        }
        .my-news .item span{
            display: block;
        }
        .my-news .item .item-name{
            font-size: 18px;
        }
        .my-news .item .item-count{
            font-size: 24px;
        }
        .my-news .gsxm .img{
            background-image: url("static/images/icon/gongsixiangmu.png");
        }
        .my-news .qjdwsp .img{
            background-image: url("static/images/icon/qingjia.png");
        }
        .my-news .wdqj .img{
            background-image: url("static/images/icon/qingjia1.png");
        }
        .my-news .bxdwsp .img{
            background-image: url("static/images/icon/shehe.png");
        }
        .my-news .wdbx .img{
            background-image: url("static/images/icon/baoxiao2.png");
        }
        .latest-news >div:not(:first-child),.schedule >div:not(:first-child){
            padding: 0 19px;
            line-height: 32px;
        }
        .latest-news .list-title,.schedule .list-title{
            font-size: 18px;
            color: #4D4D4D;
        }
        .latest-news .items,.schedule .items{
            color: #666666;
            height: 230px;
        }
        .latest-news .item,.schedule .item{
            cursor: pointer;
        }
        .latest-news .item >div:first-child, .schedule .item >div:first-child{
            overflow: hidden;
            white-space: nowrap;
            text-overflow: ellipsis;
        }
        .schedule,.latest-news{
            padding: 0;
            box-shadow:2px 3px 6px 0px rgba(179,179,179,0.25);
        }
        table tr th{
            font-size: 16px;
            color: #4D4D4D;
        }
        table tr td{
            font-size: 16px;
            color: #4D4D4D;
        }
        table tr th,table tr td{
            padding: 0 8px !important;
            line-height: 50px !important;
            border: none !important;
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
                    <div class="icon"><img src="static/images/icon/guanli.png"></div>
                    <div class="text text-c">项目管理</div>
                    <div class="right"><img src="static/images/icon/xiala.png"></div>
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
                            <div class="ProjectList">项目列表</div>
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
                    <div class="icon"><img src="static/images/icon/guanli.png"></div>
                    <div class="text text-c">人员管理</div>
                    <div class="right"><img src="static/images/icon/xiala.png"></div>
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
                    <div class="icon"><img src="static/images/icon/baoxiao.png"></div>
                    <div class="text text-c">报销管理</div>
                    <div class="right"></div>
                </div>
            </li>
            <li>
                <div class="menu ub ub-ac">
                    <div class="icon"><img src="static/images/icon/caiwu.png"></div>
                    <div class="text text-c">财务管理</div>
                    <div class="right"><img src="static/images/icon/xiala.png"></div>
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
                    <div class="icon"><img src="static/images/icon/shezhi.png"></div>
                    <div class="text text-c">权限设置</div>
                    <div class="right"><img src="static/images/icon/xiala.png"></div>
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
            <div class="icon"><img src="static/images/icon/tuichu.png"></div>
            <span>退出</span>
        </div>
    </div>
    <div class="ub ub-f1 ub-ver right-con">
        <div class="oa-title ub ub-pc">智代恒通OA管理系统</div>
        <div class="main ub-f1">
            <div class="row my-news">
                <div class="label-title">我的消息</div>
                <div class="col-md-4 item gsxm ub ub-ac">
                    <div class="img ub-img"></div>
                    <div class="ub ub-f1 ub-ver">
                        <span class="item-name">公司项目</span>
                        <span class="item-count">6</span>
                    </div>
                </div>
                <div class="col-md-4 item bxdwsp ub ub-ac">
                    <div class="img ub-img"></div>
                    <div class="ub ub-f1 ub-ver">
                        <span class="item-name">报销待我审批</span>
                        <span class="item-count">6</span>
                    </div>
                </div>
                <div class="col-md-4 item wdbx ub ub-ac">
                    <div class="img ub-img"></div>
                    <div class="ub ub-f1 ub-ver">
                        <span class="item-name">我的报销</span>
                        <span class="item-count">6</span>
                    </div>
                </div>
                <div class="col-md-4 item qjdwsp ub ub-ac">
                    <div class="img ub-img"></div>
                    <div class="ub ub-f1 ub-ver">
                        <span class="item-name">请假待我审批</span>
                        <span class="item-count">6</span>
                    </div>
                </div>
                <div class="col-md-4 item wdqj ub ub-ac">
                    <div class="img ub-img"></div>
                    <div class="ub ub-f1 ub-ver">
                        <span class="item-name">我的请假</span>
                        <span class="item-count">6</span>
                    </div>
                </div>
            </div>

            <div class="row" style="margin-top: 20px">
                <div class="col-md-6 latest-news">
                    <div class="label-title">最新消息</div>
                    <div class="ub list-title">
                        <div class="ub ub-f1">事项</div>
                        <div class="">日期</div>
                    </div>
                    <div class="items">
                        <div class="item ub">
                            <div class="ub-f1">XXX提交了日报XXX提交了日报XXX提交了日报XXX提交了日报</div>
                            <div>2018-04-02 14:00</div>
                        </div>
                        <div class="item ub">
                            <div class="ub ub-f1">XXX提交了日报</div>
                            <div>2018-04-02 14:00</div>
                        </div>
                        <div class="item ub">
                            <div class="ub ub-f1">XXX提交了日报</div>
                            <div>2018-04-02 14:00</div>
                        </div>
                        <div class="item ub">
                            <div class="ub ub-f1">XXX提交了日报</div>
                            <div>2018-04-02 14:00</div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6" style="padding-left: 20px;padding-right: 0">
                    <div class="schedule">
                        <div class="label-title">我的待办</div>
                        <div class="ub list-title">
                            <div class="ub ub-f1">事项</div>
                            <div class="">日期</div>
                        </div>
                        <div class="items">
                            <div class="item ub">
                                <div class="ub-f1">XXX提交了日报XXX提交了日报XXX提交了日报XXX提交了日报</div>
                                <div>2018-04-02 14:00</div>
                            </div>
                            <div class="item ub">
                                <div class="ub ub-f1">XXX提交了日报</div>
                                <div>2018-04-02 14:00</div>
                            </div>
                            <div class="item ub">
                                <div class="ub ub-f1">XXX提交了日报</div>
                                <div>2018-04-02 14:00</div>
                            </div>
                            <div class="item ub">
                                <div class="ub ub-f1">XXX提交了日报</div>
                                <div>2018-04-02 14:00</div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

            <div class="row projects" style="margin-top: 20px">
                <div class="label-title">项目进度</div>
                <table class="table table-striped">
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
                    </tr>
                    <tr>
                        <td>xxxxx</td>
                        <td>xxxxx</td>
                        <td>外派</td>
                        <td>外派</td>
                        <td>xxxxx</td>
                        <td>xxxxx</td>
                        <td>xxxxx</td>
                        <td>xxxxx</td>
                        <td>xxxxx</td>
                    </tr>
                    <tr>
                        <td>xxxxx</td>
                        <td>xxxxx</td>
                        <td>外派</td>
                        <td>外派</td>
                        <td>xxxxx</td>
                        <td>xxxxx</td>
                        <td>xxxxx</td>
                        <td>xxxxx</td>
                        <td>xxxxx</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>


<script src="static/js/jquery.min.js"></script>
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
        })
           $(".ProjectList").on("click",function () {
            location.href = 'project/management/indexs';
        })
    })
</script>
</body>
</html>