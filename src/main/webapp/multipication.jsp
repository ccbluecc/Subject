<%--
  Created by IntelliJ IDEA.
  User: nitro5
  Date: 19/9/2566
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        td{
            margin: 12px;
            border: darkgoldenrod solid 1px;
            padding: 0px 0px 0px 0px;
            border-spacing: 0px;
            text-align: right;
        }
        table{
            padding: 0px 0px 0px 0px;
            spacing: 0px;
            border-spacing: 0px;

        }
    </style>
</head>
<body>
<c:if test="${message == null}">
        <h3>Mutiple Table ${param.number}</h3>
        <h3>${param.message}</h3>
    <hr>
    <table style="border: 1px solid cadetblue;margin: 30px">
        <tr style="color: black">
            <td colspan="5">Multipication Table of ${param.number} </td>
        </tr>
        <c:forEach begin="1" end="24" var="n">
            <c:choose >
                <c:when test="${n%2 == 0}">
                    <c:set var="bg" scope="page" value="lightgray"/>
                </c:when>
                <c:otherwise>
                    <c:set var="bg" scope="page" value="gray"/>
                </c:otherwise>
            </c:choose>
        <tr style="background-color: ${bg}">
            <td>${param.number}</td>
            <td> x </td>
            <td> </td>
            <td>${n}</td>
            <td> = </td>
            <td> </td>
            <td>${param.number * n} </td>
        </tr>
        </c:forEach>
    </table>
    </c:if>
    <c:if test="${message != null}">
    <h4>Error:: <hr>
        ${requestScope.message} <span style="color: red">(${param.number})</span>
    </h4>
    </c:if>
<hr>
Your Browser : ${header["User-Agent"]}
</body>
</html>
