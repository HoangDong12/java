package Design;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class bai42 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai42 frame = new bai42();
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
	public bai42() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox <String> comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Red", "Blue", "Green", "Yellow", "Black"}));
		comboBox.setBounds(56, 10, 157, 22);
		contentPane.add(comboBox);
		
		comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String slcl =(String) comboBox.getSelectedItem();
               // JOptionPane.showMessageDialog(null, "Bạn đã chọn màu: " + slcl);
                switch(slcl) {
                case "Red":
                	contentPane.setBackground(Color.RED);
                	break;
                case "Blue":
                	contentPane.setBackground(Color.BLUE);
                	break;
                case "Green":
                	contentPane.setBackground(Color.GREEN);
                	break;
                case "Yellow":
                	contentPane.setBackground(Color.YELLOW);
                	break;
                case "Black":
                	contentPane.setBackground(Color.BLACK);
                	break;
                	
                }
                }
                	
		});
	}
}


