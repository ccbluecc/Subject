<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nitro5
  Date: 5/9/2566
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Subject List</title>
</head>
<body>
    <div class="flex-content" style="margin: 50px">
        <div style="background-color: beige;color: darkgoldenrod">
            <h>Subject List::</h>
            <div>
                <table>
                    <tr>
                        <td>No</td>
                        <td>Subject code</td>
                        <td>Title</td>
                        <td>Credit</td>
                        <td>Select</td>
                    </tr>
                    <c:forEach items="${subjects}" var="subject" varStatus="vs">
                        <tr>
                            <td>${vs.count}</td>
                            <td>${subject.id}</td>
                            <td>${subject.title}</td>
                            <td>${subject.credit}</td>
                            <td><input type="checkbox" value="${subject.id}" name="subjects" ></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>

</body>
</html>
