package Design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai81 extends JFrame {
    private JButton clickButton;
    private JLabel countLabel;
    private int count = 0; // Model: biến đếm

    public bai81() {
        // Thiết lập giao diện
        setTitle("Counter MVC");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Khởi tạo các thành phần giao diện
        clickButton = new JButton("Click");
        countLabel = new JLabel("Count: 0");

        add(clickButton);
        add(countLabel);

        // Controller: Xử lý sự kiện nút click
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++; // Tăng đếm
                countLabel.setText("Count: " + count); // Cập nhật giao diện
            }
        });
    }

    public static void main(String[] args) {
        bai81 frame = new bai81();
        frame.setVisible(true);
    }
}
