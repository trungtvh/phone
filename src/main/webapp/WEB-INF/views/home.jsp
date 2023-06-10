<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/6/2023
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Hello</p>
<h1>Sandwich Condiments</h1>
<form action="save" method="post">
    <input name="condiments" type="checkbox" id="lettuce" value="lettuce">
    <label for="lettuce">lettuce</label>
    <input name="condiments" type="checkbox" id="tomato" value="tomato">
    <label for="tomato">tomato</label>
    <input name="condiments" type="checkbox" id="mustard" value="mustard">
    <label for="mustard">mustard</label>
    <input name="condiments" type="checkbox" id="sprouts" value="sprouts">
    <label for="sprouts">sprouts</label>
    <button type="submit">Save</button>
</form>

</body>
</html>
