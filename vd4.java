package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class vd4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtMasv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vd4 frame = new vd4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vd4() {
		setForeground(Color.BLACK);
		setTitle("Bai tap 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(3);
		textArea.setBounds(25, 135, 386, 102);
		contentPane.add(textArea);
		JFormattedTextField txtNgaysinh = new JFormattedTextField();
		txtNgaysinh.setBounds(99, 58, 104, 20);
		contentPane.add(txtNgaysinh);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoten=txtName.getText();
				String masv = txtMasv.getText();
				String ns = txtNgaysinh.getText();
				String output = "=================\n"
								+ "Họ và tên : " + hoten +"\n"
								+ "Mã sinh viên : " + masv +"\n" 
								+ "Ngày sinh : " +ns + "\n"+
								"=================";
				textArea.setText(output);
				txtName.setText("");
				txtMasv.setText("");
				txtNgaysinh.setText("");
			}
		});
		btnThem.setBounds(174, 101, 89, 23);
		contentPane.add(btnThem);
		
		txtName = new JTextField();
		txtName = new JTextField("Nhập họ tên...");
		txtName.setForeground(Color.GRAY);
		txtName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtName.getText().equals("Nhập họ tên...")) {
					txtName.setText("");
					txtName.setForeground(Color.BLACK); // Khi người dùng gõ
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtName.getText().isEmpty()) {
					txtName.setText("Nhập họ tên...");
					txtName.setForeground(Color.GRAY); // Quay về gợi ý
				}
			}
			
		});
		
		txtName.setBounds(99, 11, 104, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtMasv = new JTextField();
		txtMasv.setBounds(287, 11, 104, 20);
		contentPane.add(txtMasv);
		txtMasv.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Họ và tên");
		lblNewLabel.setBounds(25, 14, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblLp = new JLabel("Mã sinh viên");
		lblLp.setBounds(213, 14, 64, 14);
		contentPane.add(lblLp);
		
		JLabel lblNewLabel_1 = new JLabel("Ngày sinh");
		lblNewLabel_1.setBounds(25, 61, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		
	
		
		
		
		
	}
}
