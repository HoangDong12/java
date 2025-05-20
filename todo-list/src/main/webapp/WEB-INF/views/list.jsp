<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách công việc</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">

    <h2 class="mb-4">Danh sách công việc</h2>
    
    <a href="${pageContext.request.contextPath}/tasks/new" class="btn btn-primary mb-3">Thêm công việc</a>
    
    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Tiêu đề</th>
                <th>Mô tả</th>
                <th>Trạng thái</th>
                <th>Hành động</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${tasks}" var="task">
                <tr>
                    <td>${task.id}</td>
                    <td>${task.title}</td>
                    <td>${task.description}</td>
                    <td>
                        <span class="badge bg-success" 
                              style="font-size: 0.9em;"
                              ><c:if test="${task.completed}">Hoàn thành</c:if></span>
                        <span class="badge bg-secondary" 
                              style="font-size: 0.9em;"
                              ><c:if test="${!task.completed}">Chưa hoàn thành</c:if></span>
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/tasks/edit/${task.id}" class="btn btn-sm btn-warning">Sửa</a>
                        <a href="${pageContext.request.contextPath}/tasks/delete/${task.id}" class="btn btn-sm btn-danger"
                           onclick="return confirm('Bạn có chắc chắn muốn xóa công việc này?');">Xóa</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
