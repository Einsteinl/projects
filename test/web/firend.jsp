<%--
  Created by IntelliJ IDEA.
  User: leishao
  Date: 2018/4/18
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/common.css" />
    <link rel="stylesheet" href="css/container.css" />

    <link rel="stylesheet" href="css/phone-title.css" />

    <link rel="stylesheet" type="text/css" href="css/header.css"/>
    <link rel="stylesheet" type="text/css" href="css/header-menu.css"/>

    <link rel="stylesheet" type="text/css" href="css/wrap-chat.css"/>
    <link rel="stylesheet" type="text/css" href="css/wrap-add-friend.css"/>
    <link rel="stylesheet" type="text/css" href="css/wrap-discovery.css"/>
    <link rel="stylesheet" type="text/css" href="css/wrap-me.css"/>

    <link rel="stylesheet" type="text/css" href="css/moments.css"/>

    <link rel="stylesheet" href="css/menu.css" />

    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.min.css"/>

    <style>

        #container {

            width: 500px;
            height: 600px;
            background-color: whitesmoke;
            overflow: scroll;


        }

        .items {
            width: 400px;
            height: 60px;
            margin: 0 auto;
            margin-top: 10px;
            background-color: lightpink;
        }

        .border {
            border: #F08080 1px solid;
        }

    </style>

</head>
<body>
<div id="container">
    <div class="moment-content">

        <div class="moment-content-left">
            <img src="img/photo/郭德纲.jpg"  />
        </div>

        <div class="moment-content-right">
            <div class="moment-content-username">郭德纲</div>
            <div class="moment-content-text">${s}</div>
            <div class="moment-content-imgs">
                <div class="user-imgs" data-img="img/images/建筑-01.jpg"></div>
                <div class="user-imgs" data-img="img/images/建筑-02.jpg"></div>
                <div class="user-imgs" data-img="img/images/建筑-03.jpg"></div>
            </div>
            <div class="moment-function">
                <div class="moment-function-time">42分钟前</div>
                <div class="moment-function-right">

                    <!-- 弹出层 : 点赞和评论 -->
                    <div class="moment-function-control">
                        <div >
                            <div></div>
                            <div>赞</div>
                        </div>
                        <div>
                            <div></div>
                            <div>评论</div>
                        </div>
                    </div>

                </div>
            </div>

            <div class=""></div>

        </div>

    </div>
    <div class="moment-content">

        <div class="moment-content-left">
            <img src="img/photo/郭德纲.jpg"  />
        </div>

        <div class="moment-content-right">
            <div class="moment-content-username">BootStrap</div>
            <div class="moment-content-text">这个做我们项目的背景图如何? 大家说说</div>
            <div class="moment-content-imgs">
                <div class="user-imgs" data-img="img/images/旅游-01.png" ></div>
            </div>
            <div class="moment-function">
                <div class="moment-function-time">42分钟前</div>
                <div class="moment-function-right">
                    <!-- 弹出层 : 点赞和评论 -->
                    <div class="moment-function-control">
                        <div >
                            <div></div>
                            <div>赞</div>
                        </div>
                        <div>
                            <div></div>
                            <div>评论</div>
                        </div>
                    </div>
                </div>
            </div>

            <div class=""></div>

        </div>

    </div>

    <div class="moment-content">

        <div class="moment-content-left">
            <img src="img/photo/郭德纲.jpg"  />
        </div>

        <div class="moment-content-right">
            <div class="moment-content-username">BootStrap</div>
            <div class="moment-content-text">这个做我们项目的背景图如何? 大家说说</div>
            <div class="moment-content-imgs">
                <div class="user-imgs" data-img="img/images/旅游-01.png" ></div>
            </div>
            <div class="moment-function">
                <div class="moment-function-time">42分钟前</div>
                <div class="moment-function-right">
                    <!-- 弹出层 : 点赞和评论 -->
                    <div class="moment-function-control">
                        <div >
                            <div></div>
                            <div>赞</div>
                        </div>
                        <div>
                            <div></div>
                            <div>评论</div>
                        </div>
                    </div>
                </div>
            </div>

            <div class=""></div>

        </div>

    </div>
    <div class="moment-content">

        <div class="moment-content-left">
            <img src="img/photo/郭德纲.jpg"  />
        </div>

        <div class="moment-content-right">
            <div class="moment-content-username">BootStrap</div>
            <div class="moment-content-text">这个做我们项目的背景图如何? 大家说说</div>
            <div class="moment-content-imgs">
                <div class="user-imgs" data-img="img/images/旅游-01.png" ></div>
            </div>
            <div class="moment-function">
                <div class="moment-function-time">42分钟前</div>
                <div class="moment-function-right">
                    <!-- 弹出层 : 点赞和评论 -->
                    <div class="moment-function-control">
                        <div >
                            <div></div>
                            <div>赞</div>
                        </div>
                        <div>
                            <div></div>
                            <div>评论</div>
                        </div>
                    </div>
                </div>
            </div>

            <div class=""></div>

        </div>

    </div>


</div>

</body>
</html>
<script type="text/javascript" src="js/moments.js" ></script>
