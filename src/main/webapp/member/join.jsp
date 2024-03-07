<%--
  Created by IntelliJ IDEA.
  User: FAMILY
  Date: 2024-03-08
  Time: AM 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Join</title>
    <style>
        * {
            padding: 0;
            margin: 0;
            border: none;
        }

        body {
            font-size: 14px;
            font-family: "Roboto Light", sans-serif;
        }

        .login-wrapper {
            width: 400px;
            height: 350px;
            padding: 40px;
            box-sizing: border-box;
        }

        .login-wrapper > h2 {
            font-size: 24px;
            color: #6A24FE;
            margin-bottom: 20px;
        }

        #login-form > input {
            width: 100%;
            height: 48px;
            padding: 0 10px;
            box-sizing: border-box;
            margin-bottom: 16px;
            border-radius: 6px;
            background-color: #F8F8F8;
        }

        #login-form > input[type="submit"] {
            color: #FFFFFF;
            font-size: 16px;
            background-color: #6A24FE;
            margin-top: 20px;
        }
    </style>
</head>
<body>
<header>
    <h2>Join</h2>
</header>
<section>
    <div class="login-wrapper">
        <form action="/memberInsert.do" method="post" id="login-form">
            <input type="text" name="id" placeholder="id">
            <input type="password" name="password" placeholder="password">
            <input type="text" name="nickname" placeholder="nickname">
            <input type="email" name="email" placeholder="email">
            <input type="submit" name="submit" value="join">
        </form>
    </div>
</section>
</body>
</html>
