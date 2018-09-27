<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>朋友圈</title>
  <style>
    #container{
      width: 400px;
      height: 300px;

    }
    .borer{
      border: 1px red solid;
    }
    #sendarea{
      width: 100%;
      height: 10%;
      position: relative;
    }
    #send{
      position: absolute;
      right: 1px;
    }
    #return{
      position: absolute;
      left: 1px;
    }


    #text{
      width: 100%;
      height: 70%;
    }
    #ideas{
      width: 100%;
      height: 100%;
      font-size:12px;
    }
    #photo{
      width: 100%;
      height:20%;
      display: flex;
      flex-flow: row nowrap;
      align-content: space-around;
      align-items: center;
    }
    #url{
      width: 80%;
      height: 80%;

      font-size:12px;
      border: 1px solid #E7EAEC;

      line-height: 30px;
      border-left: 3px solid #3FB7EB;
      background: #FAFAFB;
      border-radius: 5px;
    }
    #add{
      width: 20%;
      height: 100%;
      display: flex;
      align-content: center;
      align-items: center;
      position: relative;

    }

    #add img{
      width: 50px;
      height: 50px;
      position: absolute;
      right: 5px;
    }
    input[type='file'] {
      border: 0px;
      display: none;
    }
  </style>
</head>
<body>
<!--<a href="friend.html"><img src="../img/朋友圈.png"></a>-->
<form method="post" action="go.do" enctype="multipart/form-data">
  <div id="container" class="border">
    <div id="sendarea">

      <div class="border" id="return"><input type="button" value="返回"></div>
      <div class="border" id="send"><input type="submit" value="发送"></div>
    </div>
    <div id="text" class="border">
      <input type="text" name="ideas" id="ideas" >
    </div>
    <div id="photo" class="border">
      <div id="url"></div>
      <input type="file" id="files" name="files">
      <div id="add"><img src="img/add.png"> </div>

    </div>
  </div>
</form>
</body>
</html>
<script src="js/jquery.js"></script>
<script>
$(function () {
    $("#add").click(function() {
        $("input[type='file']").trigger('click');
    });
    $("#url").click(function() {
        $("input[type='file']").trigger('click');
    });
    $("input[type='file']").change(function() {
        $("#url").html($(this).val());
    });
    
})
</script>