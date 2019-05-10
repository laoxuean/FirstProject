<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet"><!--引入bootstrapCSS组件-->
    <meta name="viewport" content="width=device-width, initial-scale=1"><!--引入基本的配置信息-->
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script><!--引入jq网页的形式-->
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script><!--引入bootstrap.js文件网页版-->
    <style>
        body{
            padding-top: 50px;
        }
        .padding-ul>li{
            margin-left: 25px;
        }
        .navbar-color{
            background-color: #24292e;
        }
        .ul-color>li>a{
            color: hsla(0,0%,100%,.75);
        }
        .nav-position{
            position: absolute;
            right: 1%;
            bottom: -7%;
        }
        .container-fluid2{
            padding-right: 15px;
            /* padding-left: 15px; */
            margin-right: auto;
            margin-left: auto;
        }
    </style>
</head>
<body>
<!--导航栏-->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <a href="https://github.com/laoxuean/FirstProject" class="navbar-brand">FirstPtoject</a>
            </div>
            <div>
                <ul class="nav navbar-nav padding-ul padding-ul" id="mytab">
                    <li ><a href="#">目的</a></li>
                    <li><a href="#">介绍</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            参与人员
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Git-XianDeLi</a></li>
                            <li><a href="#">huanying123</a></li>
                            <!--<li class="divider"></li>-->
                            <li><a href="#">fhzhong</a></li>
                           <!-- <li class="divider"></li>-->
                            <li><a href="#">immortaljack</a></li>
                            <li><a href="#">aikun1004</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
                <div class="navbar-nav nav navbar-right">
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">提交</button>
                    </form>
                </div>
            </div>
        </div>
    </nav>


<!--竖状导航栏-->
<div class="container-fluid2">
    <div class="col-xs-1 navbar-color" >
        <ul class="nav nav-tab vertical-tab ul-color" role="tablist" id="vtab">
            <li role="presentation" class="active">
                <a href="#tab1" aria-controls="home" role="tab"
                   data-toggle="tab">数据库</a>
            </li>
            <li role="presentation">
                <a href="#tab2" aria-controls="inbox" role="tab"
                   data-toggle="tab">未开发二</a>
            </li>
            <li role="presentation">
                <a href="#tab3" aria-controls="outbox" role="tab"
                   data-toggle="tab">未开发三</a>
            </li>
            <li role="presentation">
                <a href="#tab4" aria-controls="inbox1" role="tab"
                   data-toggle="tab">未开发四</a>
            </li>
            <li role="presentation">
                <a href="#tab5" aria-controls="outbox1" role="tab"
                   data-toggle="tab">未开发五</a>
            </li>
            <li role="presentation">
                <a href="#tab6" aria-controls="outbox1" role="tab"
                   data-toggle="tab">未开发六</a>
            </li>
            <li role="presentation">
                <a href="#tab7" aria-controls="outbox1" role="tab"
                   data-toggle="tab">未开发七</a>
            </li>
            <li role="presentation" class="active">
                <a href="#tab1" aria-controls="home" role="tab"
                   data-toggle="tab">未开发一</a>
            </li>
            <li role="presentation">
                <a href="#tab2" aria-controls="inbox" role="tab"
                   data-toggle="tab">未开发二</a>
            </li>
            <li role="presentation">
                <a href="#tab3" aria-controls="outbox" role="tab"
                   data-toggle="tab">未开发三</a>
            </li>
            <li role="presentation">
                <a href="#tab4" aria-controls="inbox1" role="tab"
                   data-toggle="tab">未开发四</a>
            </li>
            <li role="presentation">
                <a href="#tab5" aria-controls="outbox1" role="tab"
                   data-toggle="tab">未开发五</a>
            </li>
            <li role="presentation">
                <a href="#tab6" aria-controls="outbox1" role="tab"
                   data-toggle="tab">未开发六</a>
            </li>
            <li role="presentation">
                <a href="#tab7" aria-controls="outbox1" role="tab"
                   data-toggle="tab">未开发七</a>
            </li>
        </ul>
    </div>


    <div class="tab-content vertical-tab-content col-xs-11">
        <div role="tabpanel" class="tab-pane active tabpanel-padding" id="tab1">

               <div><!--用来显示增删改查按钮-->
                       <div class="col-md-3 ">
                           <button type="button" class="btn btn-default">增</button>
                       </div>
                       <div class="col-md-3 ">
                           <button type="button" class="btn btn-default">删</button>
                       </div>
                       <div class="col-md-3 ">
                           <button type="button" class="btn btn-default">改</button>
                       </div>
                       <div class="col-md-3 ">
                           <button type="button" class="btn btn-default">查</button>
                       </div>
               </div>

               <div><!--用来显示表格-->
                   <table class="table table-bordered">
                       <thead>
                       <tr>
                           <th>id</th>
                           <th>username</th>
                           <th>password</th>
                       </tr>
                       </thead>
                       <tbody>
                       <tr>
                           <td>Tanmay</td>
                           <td>Bangalore</td>
                           <td>560001</td>
                       </tr>
                       <tr>
                           <td>Sachin</td>
                           <td>Mumbai</td>
                           <td>400003</td>
                       </tr>
                       <tr>
                           <td>Uma</td>
                           <td>Pune</td>
                           <td>411027</td>
                       </tr>
                       <tr>
                           <td>Tanmay</td>
                           <td>Bangalore</td>
                           <td>560001</td>
                       </tr>
                       <tr>
                           <td>Sachin</td>
                           <td>Mumbai</td>
                           <td>400003</td>
                       </tr>
                       <tr>
                           <td>Uma</td>
                           <td>Pune</td>
                           <td>411027</td>
                       </tr>
                       <tr>
                           <td>Tanmay</td>
                           <td>Bangalore</td>
                           <td>560001</td>
                       </tr>
                       <tr>
                           <td>Sachin</td>
                           <td>Mumbai</td>
                           <td>400003</td>
                       </tr>
                       <tr>
                           <td>Uma</td>
                           <td>Pune</td>
                           <td>411027</td>
                       </tr>
                       <tr>
                           <td>Tanmay</td>
                           <td>Bangalore</td>
                           <td>560001</td>
                       </tr>
                       <tr>
                           <td>Sachin</td>
                           <td>Mumbai</td>
                           <td>400003</td>
                       </tr>
                       <tr>
                           <td>Uma</td>
                           <td>Pune</td>
                           <td>411027</td>
                       </tr>
                       </tbody>
                   </table>
               </div>
           <div>
               <div class="nav navbar-nav navbar-left ">
                   <ol class="breadcrumb">
                       <li><span>GitHub</span></li>
                       <li><a href="">Git-XianDeLi</a></li>
                       <li><a href="">huanying123</a></li>
                       <li><a href="">fhzhong</a></li>
                       <li><a>immortaljack</a></li>
                   </ol>
               </div>
               <div class="nav-position"><!--用来显示分页-->
                   <ul class="pagination">
                       <li><a href="#">&laquo;</a></li>
                       <li class="active"><a href="#">1</a></li>
                       <li class="disabled"><a href="#">2</a></li>
                       <li><a href="#">3</a></li>
                       <li><a href="#">4</a></li>
                       <li><a href="#">5</a></li>
                       <li><a href="#">&raquo;</a></li>
                   </ul>
               </div>
           </div>


        </div>
        <div role="tabpanel" class="tab-pane" id="tab2">未开发二</div>
        <div role="tabpanel" class="tab-pane" id="tab3">未开发三</div>
        <div role="tabpanel" class="tab-pane" id="tab4">未开发四</div>
        <div role="tabpanel" class="tab-pane" id="tab5">未开发五</div>
        <div role="tabpanel" class="tab-pane" id="tab6">未开发六</div>
        <div role="tabpanel" class="tab-pane" id="tab7">未开发七</div>
    </div>
</div>
<script>
    $("#mytab a").click(function (e){
        e.preventDefault();
        $(this).tab("show");
    })
</script>
</body>
</html>