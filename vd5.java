package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class vd5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vd5 frame = new vd5();
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
	public vd5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 30, 335, 204);
		contentPane.add(scrollPane);
		
		JTextArea txtrTrngQuChiu = new JTextArea();
		txtrTrngQuChiu.setText("Trăng Quê\n\nChiều về gió thoảng qua sông,\nCon đò lặng lẽ, bến không đợi người.\nKhói lam phủ nhẹ chân trời,\nGiếng làng còn đọng tiếng cười năm xưa.\n\nĐêm lên trăng ngả bóng dừa,\nLúa thơm đầu vụ đong đưa giữa đồng.\nLòng quê mộc mạc mà nồng,\nDẫu đi muôn nẻo vẫn mong quay về.\r\nTrăng Quê\n\nChiều về gió thoảng qua sông,\nCon đò lặng lẽ, bến không đợi người.\nKhói lam phủ nhẹ chân trời,\nGiếng làng còn đọng tiếng cười năm xưa.\n\nĐêm lên trăng ngả bóng dừa,\nLúa thơm đầu vụ đong đưa giữa đồng.\nLòng quê mộc mạc mà nồng,\nDẫu đi muôn nẻo vẫn mong quay về.");
		scrollPane.getVerticalScrollBar().setValue(0);
		scrollPane.setViewportView(txtrTrngQuChiu);
		

		
	}
}
