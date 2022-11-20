        <%@ page import="org.hibernate.cache.spi.support.AbstractReadWriteAccess" %>
<%@ page import="org.glassfish.jaxb.core.v2.model.core.ID" %>
<%@ page import="static jakarta.persistence.EntityManager.*" %>
<%@ page import="jakarta.persistence.*" %>
<%@ page import="entity.TodoItemsEntity" %><%--
  Created by IntelliJ IDEA.
  User: Lilliam
  Date: 10/15/2022
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*,java.util.*"%>
        <%@ page import="javax.swing.table.DefaultTableModel" %>
        <html>
<head>
    <title>My Todo List</title>
</head>




<%


    String task = request.getParameter("task");

    int i = 0;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist", "root", "sakuya23");
        Statement st = conn.createStatement();
        i = st.executeUpdate("insert into `Todo Items`(todoItems)values('" + task + "')");
    } catch (Exception e) {
        System.out.print(e);
        e.printStackTrace();
    }
%>
<body>
<h1 align="center">My Todo List</h1>

<table border="1" bgcolor="white" align="center">
    <a href="index.jsp" style="align-content: center">Back</a>
    <tbody>
    <tr>

        <td bgcolor="#00ced1">Item</td>
    </tr>
    <tr>
        <td> <%= task

        %>

        </td> <td> <input type="reset" value="delete " name="Delete"/></td>
    </tr>

    </tbody>
</table>
</body>
</html>