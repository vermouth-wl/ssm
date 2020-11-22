<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-11-22
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <form action="userinfo/login" method="post">
        <table>
            <tr>
                <td>用户名: </td>
                <td><input type="text" name="userCode"/></td>
            </tr>

            <tr>
                <td>密 码: </td>
                <td><input type="password" name="password"/></td>
            </tr>

            <tr>
                <td><input type="submit" value="登录"/></td>
                <td></td>
            </tr>
        </table>
    </form>
</body>
</html>
