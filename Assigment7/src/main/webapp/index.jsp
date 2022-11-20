<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<h1 align="center"><%= "Todo List" %>
</h1>
<body align="center">

        <form method="post" action="results.jsp">
            Item
            <input type="text" name="task">

            <input type="reset" value="Clear" name="clear"/>
            <input type="submit" value="Add" name="addItem"/>

        </form>

 </body>
</html>