<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String giatrinhietdo = request.getParameter("temperature");
    String loai = request.getParameter("type");
    String ketqua = null; // Biến chứa kết quả chuyển đổi để hiển thị

    if (giatrinhietdo != null && loai != null) {
        try {
            double temp = Double.parseDouble(giatrinhietdo);

            if (loai.equals("CtoF")) { // Chuyển từ Celsius sang Fahrenheit
                double f = (temp * 9 / 5) + 32;
                ketqua = temp + " °C = " + String.format("%.2f", f) + " °F";
            } else if (loai.equals("FtoC")) { // Chuyển từ Fahrenheit sang Celsius
                double c = (temp - 32) * 5 / 9;
                ketqua = temp + " °F = " + String.format("%.2f", c) + " °C";
            }

        } catch (NumberFormatException e) {
            ketqua = "Nhiệt độ không hợp lệ!";
        }
    }
%>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chuyển đổi nhiệt độ</title>
</head>
<body>
    <!-- Form chuyển đổi nhiệt độ -->
    <div class="container">
        <form class="form-box mt-5" method="post">
            <h4 class="text-center mb-4">🌡️ Chuyển đổi nhiệt độ</h4>
            <div class="form-group">
                <label for="temperature">Nhập nhiệt độ</label>
                <input type="text" class="form-control" id="temperature" name="temperature" required placeholder="Nhập số (VD: 25)">
            </div>
            <div class="form-group">
                <label for="type">Chọn loại chuyển đổi</label>
                <select class="form-control" id="type" name="type">
                    <option value="CtoF">Celsius → Fahrenheit</option>
                    <option value="FtoC">Fahrenheit → Celsius</option>
                </select>
            </div>
            <button type="submit" class="btn btn-success btn-block">Chuyển đổi</button>
        </form>

        <% if (ketqua != null) { %>
            <div class="alert alert-info mt-4">
                <strong>Kết quả:</strong> <%= ketqua %>
            </div>
        <% } %>
    </div>
</body>
</html>
