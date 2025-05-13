<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kết quả đăng nhập</title>

    <!-- Nhúng Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="container mt-5">

    <div class="card shadow p-4">
        <c:choose>
            <c:when test="${not empty message}">
                <h3 class="text-success"><c:out value="${message}" /></h3>
            </c:when>
            <c:otherwise>
                <h3 class="text-danger">Không có thông báo.</h3>
            </c:otherwise>
        </c:choose>
    </div>

</body>
</html>
