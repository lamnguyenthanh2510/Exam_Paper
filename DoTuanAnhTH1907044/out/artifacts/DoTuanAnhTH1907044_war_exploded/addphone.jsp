<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 5/11/21
  Time: 3:10 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add product</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <ul class="list-group">
        <li class="list-group-item active">input information</li>
        <li class="list-group-item">
            <form method="post" action="/home">
                <div class="form-group">
                    <label for="namep">Tên sản phẩm:</label>
                    <input type="text" class="form-control" required="true" id="namep" name="namep">
                </div>
                <div class="form-group">
                    <label for="des">Mô tả sản :</label>
                    <input type="text" class="form-control" required="true" id="des" name="des">
                </div>
                <div class="form-group">
                    <label for="sizep">kich cỡ sản phẩm :</label>
                    <input type="text" class="form-control" required="true" id="sizep" name="sizep">
                </div>
                <div class="form-group">
                    <label for="amount">số lượng:</label>
                    <input type="number" class="form-control" required="true" id="amount" name="amount">
                </div>
                <div class="form-group">
                    <label for="price">Giá:</label>
                    <input type="number" class="form-control" required="true" id="price" name="price">
                </div>

                <div class="form-group">
                    <label for="color">Màu sản phẩm:</label>
                    <input type="text" required="true" class="form-control" id="color" name="color">
                </div>
                <button type="submit" class="btn btn-success">ADD PRODUCT</button>
            </form>
        </li>
    </ul>
</div>
</body>
</html>
