package Design;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class Bai22 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai22 frame = new Bai22();
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
	public Bai22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Tạo JLabel để hiển thị lựa chọn
		JLabel lblNewLabel = new JLabel("Bạn chọn: ");
		lblNewLabel.setBounds(31, 84, 200, 14);
		contentPane.add(lblNewLabel);
		
		// Tạo JComboBox với 5 loại trái cây
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {
			"Táo", "Dứa", "Chuối", "Dừa", "Mít"
		}));
		comboBox.setBounds(31, 11, 199, 29);
		contentPane.add(comboBox);

		// Xử lý sự kiện khi người dùng chọn trái cây
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedFruit = (String) comboBox.getSelectedItem();
				lblNewLabel.setText("Bạn chọn: " + selectedFruit);
			}
		});
	}
}
