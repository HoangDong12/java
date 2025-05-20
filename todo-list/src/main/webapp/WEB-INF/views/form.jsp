<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Form công việc</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">

    <h2 class="mb-4">Form công việc</h2>

    <form:form method="POST" modelAttribute="task" action="${pageContext.request.contextPath}/tasks/save" cssClass="needs-validation">
        <form:hidden path="id"/>
        
        <div class="mb-3">
            <label class="form-label">Tiêu đề:</label>
            <form:input path="title" cssClass="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Mô tả:</label>
            <form:input path="description" cssClass="form-control"/>
        </div>

        <div class="form-check mb-3">
            <form:checkbox path="completed" cssClass="form-check-input" id="completedCheck"/>
            <label class="form-check-label" for="completedCheck">Hoàn thành</label>
        </div>

        <div>
            <button type="submit" class="btn btn-success">Lưu</button>
            <a href="${pageContext.request.contextPath}/tasks" class="btn btn-secondary">Hủy</a>
        </div>
    </form:form>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
