<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Image List</title>
</head>
<body>
<h1>Image List</h1>

<br/><br/>
<div>
    <table border="1">
        <tr>
            <th>Image List</th>
            <th>Detailed</th>
        </tr>
        <c:forEach items="${images.imageList}" var="image">
            <tr>
                <td><img src="${image.croppedPicture}"></td>
                <td>
                    <a href="${pageContext.request.contextPath}/images/${image.id}?token=${token}">Detail</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>

</html>
