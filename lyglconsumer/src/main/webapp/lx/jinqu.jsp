<%--
  Created by IntelliJ IDEA.
  User: SunC
  Date: 2018/7/23
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dealers</title>
    <link href="<%=request.getContextPath()%>/lygl/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="<%=request.getContextPath()%>/lygl/js/jquery.min.js"></script>
    <!-- Custom Theme files -->
    <!--menu-->
    <script src="<%=request.getContextPath()%>/lygl/js/scripts.js"></script>
    <link href="<%=request.getContextPath()%>/lygl/css/styles.css" rel="stylesheet">
    <!--//menu-->
    <!--theme-style-->
    <link href="<%=request.getContextPath()%>/lygl/css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!--//theme-style-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Real Home  Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</head>
<body>
<!--header-->
<div class="navigation">
    <div class="container-fluid">
        <nav class="pull">
            <ul>
                <li><a  href="index.html">Home</a></li>
                <li><a  href="about.html">About Us</a></li>
                <li><a  href="blog.html">Blog</a></li>
                <li><a  href="terms.html">Terms</a></li>
                <li><a  href="privacy.html">Privacy</a></li>
                <li><a  href="contact.html">Contact</a></li>
            </ul>
        </nav>
    </div>
</div>

<div class="header">
    <div class="container">
        <!--logo-->
        <div class="logo">
            <h1><a href="index.html">猫途鹰</a></h1>
        </div>
        <!--//logo-->
        <div class="top-nav">
            <ul class="right-icons">
                <li><a href="shoucahng.jsp" class="hvr-sweep-to-right more">查看收藏</a></li>
                <li><a href="login.html" class="hvr-sweep-to-right more">登录</a></li>
                <li><a href="login.html" class="hvr-sweep-to-right more">注册</a></li>


            </ul>
            <div class="nav-icon">
                <div class="hero fa-navicon fa-2x nav_slide_button" id="hero">

                </div>
                <!---
                <a href="#" class="right_bt" id="activator"><i class="glyphicon glyphicon-menu-hamburger"></i>  </a>
            --->
            </div>
            <div class="clearfix"> </div>
            <!---pop-up-box---->

            <link href="<%=request.getContextPath()%>/lygl/css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
            <script src="<%=request.getContextPath()%>/lygl/js/jquery.magnific-popup.js" type="text/javascript"></script>
            <!---//pop-up-box---->
            <div id="small-dialog" class="mfp-hide">
                <!----- tabs-box ---->
                <div class="sap_tabs">
                    <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
                        <ul class="resp-tabs-list">
                            <li class="resp-tab-item " aria-controls="tab_item-0" role="tab"><span>All Homes</span></li>
                            <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>For Sale</span></li>
                            <li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>For Rent</span></li>
                            <div class="clearfix"></div>
                        </ul>
                        <div class="resp-tabs-container">
                            <h2 class="resp-accordion resp-tab-active" role="tab" aria-controls="tab_item-0"><span class="resp-arrow"></span>All Homes</h2><div class="tab-1 resp-tab-content resp-tab-content-active" aria-labelledby="tab_item-0" style="display:block">
                            <div class="facts">
                                <div class="login">
                                    <input type="text" value="Search Address, Neighborhood, City or Zip" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search Address, Neighborhood, City or Zip';}">
                                    <input type="submit" value="">
                                </div>
                            </div>
                        </div>
                            <h2 class="resp-accordion" role="tab" aria-controls="tab_item-1"><span class="resp-arrow"></span>For Sale</h2><div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
                            <div class="facts">
                                <div class="login">
                                    <input type="text" value="Search Address, Neighborhood, City or Zip" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search Address, Neighborhood, City or Zip';}">
                                    <input type="submit" value="">
                                </div>
                            </div>
                        </div>
                            <h2 class="resp-accordion" role="tab" aria-controls="tab_item-2"><span class="resp-arrow"></span>For Rent</h2><div class="tab-1 resp-tab-content" aria-labelledby="tab_item-2">
                            <div class="facts">
                                <div class="login">
                                    <input type="text" value="Search Address, Neighborhood, City or Zip" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search Address, Neighborhood, City or Zip';}">
                                    <input type="submit" value="">
                                </div>
                            </div>
                        </div>
                        </div>
                    </div>
                    <script src="<%=request.getContextPath()%>/lygl/js/easyResponsiveTabs.js" type="text/javascript"></script>
                    <script type="text/javascript">
                        $(document).ready(function () {
                            $('#horizontalTab').easyResponsiveTabs({
                                type: 'default', //Types: default, vertical, accordion
                                width: 'auto', //auto or any width like 600px
                                fit: true   // 100% fit in a container
                            });
                        });
                    </script>
                </div>
            </div>
            <script>
                $(document).ready(function() {
                    $('.popup-with-zoom-anim').magnificPopup({
                        type: 'inline',
                        fixedContentPos: false,
                        fixedBgPos: true,
                        overflowY: 'auto',
                        closeBtnInside: true,
                        preloader: false,
                        midClick: true,
                        removalDelay: 300,
                        mainClass: 'my-mfp-zoom-in'
                    });

                });
            </script>


        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!--//-->
<div class=" banner-buying">
    <div class=" container">
        <h3><span>猫途鹰</span>旅途网</h3>
        <!---->

        <div class="clearfix"> </div>
        <!--initiate accordion-->
        <script type="text/javascript">
            $(function() {
                var menu_ul = $('.menu > li > ul'),
                    menu_a  = $('.menu > li > a');
                menu_ul.hide();
                menu_a.click(function(e) {
                    e.preventDefault();
                    if(!$(this).hasClass('active')) {
                        menu_a.removeClass('active');
                        menu_ul.filter(':visible').slideUp('normal');
                        $(this).addClass('active').next().stop(true,true).slideDown('normal');
                    } else {
                        $(this).removeClass('active');
                        $(this).next().stop(true,true).slideUp('normal');
                    }
                });

            });
        </script>

    </div>
</div>
<!--//header-->
<!--Dealers-->


<div class="dealer-top" name="aaaaa">

</div>
</div>
</div>

<script>
    $(function(){

        $.ajax({
            type : 'post',
            url : "<%=request.getContextPath()%>/DubboController/query.do",
            dataType : 'json',
            async:false,
            success:function(datas){

                 var divid='';
                for (var i = 0; i < datas.length; i++) {

                    divid+='<div class="deal-top-top">';
                    divid+='<div class="col-md-3 top-deal-top">';
                    divid+='<div class=" top-deal">';
                    divid+='<a href="single.html" class="mask"><img src="images/de.jpg" class="img-responsive zoom-img" alt=""></a>';
                    divid+='<div class="deal-bottom">';
                    divid+='<div class="top-deal1">';
                    divid+='<h5><a href="single.html"> '+datas[i].scenicname+'</a></h5>';
                    divid+='<p>时间:'+datas[i].kaishidate+'</p>';
                    divid+='<p>价格:'+datas[i].jiage+'美元</p>';
                    divid+='</div>';
                    divid+='<div class="top-deal2">';
                    divid+='<a href="single.html" class="hvr-sweep-to-right more">查看</a>';
                             if(datas[i].shouchang==1){

                    divid+='<a class="hvr-sweep-to-right more" onclick="shoucheng('+datas[i].scenicid+')">收藏景点</a>';

                             }else{
                    divid+='<a class="hvr-sweep-to-right more" onclick="shoucheng('+datas[i].scenicid+')">已收藏</a>';
                             }


                    divid+='</div>';//
                    divid+='<div class="clearfix"> </div>';
                    divid+='</div>';
                    divid+='</div>';
                    divid+='</div>';

                }
                $("[name='aaaaa']").html(divid);
                //回显
//
                $("[name='aaaaa']").selectpicker('refresh');
            }


        })





    })





</script>

<script>

    function shoucheng(scenicid){
        alert(scenicid)
        $.ajax({
            url:"<%=request.getContextPath()%>/DubboController/updataid.do",
            data:{"scenicid":scenicid},
            type:"post",
            dataType:"text",
            success:function (result){

                alert("收藏成功")
                window.location.reload()//刷新当前页面

            },
            erro:function(){

            }

        })

    }

</script>

</body>
</html>