package Design;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class bai22_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai22_1 frame = new bai22_1();
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
	public bai22_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox cbdoinen = new JCheckBox("Enable Background");
		cbdoinen.setBounds(68, 32, 138, 23);
		contentPane.add(cbdoinen);
		
		cbdoinen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbdoinen.isSelected()) {
					contentPane.setBackground(Color.GREEN);
				}
				else {
					contentPane.setBackground(null);
				}
			}
		});
		
		
		
	}
}
