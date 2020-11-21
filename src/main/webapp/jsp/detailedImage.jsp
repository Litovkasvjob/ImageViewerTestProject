<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Image</title>
</head>
<body>
<h1>Image</h1>

<br/><br/>
<div>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Author</th>
            <th>Camers</th>
            <th>Tags</th>
            <th>Cropped Picture</th>
            <th>Full Picture</th>
        </tr>
        <tr>
            <td>${image.id}</td>
            <td>${image.author}</td>
            <td>${image.camera}</td>
            <td>${image.tags}</td>
            <td>${image.croppedPicture}</td>
            <td><img src="${image.fullPicture}"></td>
        </tr>
    </table>
</div>
</body>

</html>
