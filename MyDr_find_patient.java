package layouts;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyDr_find_patient {

	private JFrame frame;
	private JTextField findPatientField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyDr_find_patient window = new MyDr_find_patient();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyDr_find_patient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		findPatientField = new JTextField();
		findPatientField.setText("Etsi henkilötunnuksella tai nimellä");
		findPatientField.setBounds(262, 209, 200, 20);
		frame.getContentPane().add(findPatientField);
		findPatientField.setColumns(10);
		
		JButton searchButton = new JButton("Hae");
		searchButton.setBounds(318, 328, 89, 23);
		frame.getContentPane().add(searchButton);
	}

}
