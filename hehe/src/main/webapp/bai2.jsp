<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bảng Sinh Viên</title>
    <!-- Nhúng Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .custom-table {
            color: white; /* Màu chữ */
            background-color: #007BFF; /* Màu nền */
            border: 2px solid black; /* Viền bảng */
        }

        .custom-table th,
        .custom-table td {
            border: 1px solid white; /* Viền ô */
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center text-uppercase">Danh sách sinh viên</h2>
        <table class="table custom-table text-center">
            <thead>
                <tr>
                    <th>STT</th>
                    <th>Mã SV</th>
                    <th>Họ và tên</th>
                    <th>Quê quán</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>SV001</td>
                    <td>Nguyễn Văn A</td>
                    <td>Hà Nội</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>SV002</td>
                    <td>Trần Thị B</td>
                    <td>Đà Nẵng</td>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>
