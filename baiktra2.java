package Design;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

public class baiktra2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHoten;
	private JTextField txtQuequan;
	private JTextField txtNgaysinh;
	private JTable table;
	private DefaultTableModel model;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baiktra2 frame = new baiktra2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public baiktra2() {
		setTitle("Quản lý sinh viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtHoten = new JTextField();
		txtHoten.setBounds(144, 20, 120, 25);
		contentPane.add(txtHoten);
		txtHoten.setColumns(10);

		txtNgaysinh = new JTextField();
		txtNgaysinh.setBounds(144, 61, 120, 25);
		contentPane.add(txtNgaysinh);
		txtNgaysinh.setColumns(10);

		txtQuequan = new JTextField();
		txtQuequan.setBounds(144, 98, 120, 25);
		contentPane.add(txtQuequan);
		txtQuequan.setColumns(10);

		JButton btnThem = new JButton("ADD");
		btnThem.setBounds(390, 119, 65, 25);
		contentPane.add(btnThem);
   
		// Khởi tạo bảng với model
		model = new DefaultTableModel();
		model.addColumn("Họ tên");
		model.addColumn("Ngày sinh");
		model.addColumn("Quê quán");

		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 155, 455, 95);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Ho va ten");
		lblNewLabel.setBounds(31, 25, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNgaySinh = new JLabel("Ngay sinh");
		lblNgaySinh.setBounds(31, 66, 76, 14);
		contentPane.add(lblNgaySinh);
		
		JLabel lblQueQuan = new JLabel("Que Quan");
		lblQueQuan.setBounds(31, 103, 76, 14);
		contentPane.add(lblQueQuan);

		// Xử lý sự kiện nút "ADD"
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoten = txtHoten.getText();
				String ngaysinh = txtNgaysinh.getText();
				String quequan = txtQuequan.getText();

				// Thêm vào bảng
				model.addRow(new Object[] { hoten, ngaysinh, quequan });

				// Xóa ô nhập
				txtHoten.setText("");
				txtNgaysinh.setText("");
				txtQuequan.setText("");
			}
		});
	}
}
