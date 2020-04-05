<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title> Exam 2</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }
        img {
            border: 1px solid #ddd;
            border-radius: 4px;
            padding: 5px;
            width: 120px;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>Virus Table</h2>

<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>description</th>
        <th>symptoms</th>
        <th>duration (days)</th>
        <th>mortality rate (%)</th>
        <th>image</th>
    </tr>
    <c:forEach var = "listitem" items = "${viruslist}">
        <tr>
            <td>${listitem.id}</td>
            <td>${listitem.name}</td>
            <td>${listitem.description}</td>
            <td>${listitem.symptoms}</td>
            <td>${listitem.duration}</td>
            <td>${listitem.mortalityrate}</td>
            <td> <img src=${listitem.image}> </td>
            <td></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>