package Design;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class bai81_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai81_1 frame = new bai81_1();
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
	public bai81_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnClick = new JButton("Click");
		contentPane.add(btnClick);
		
		JLabel lbCount = new JLabel("Count :");
		contentPane.add(lbCount);
		
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count ++;
				lbCount.setText("Count :" + count);
			}
		});
		
			
	}

}
