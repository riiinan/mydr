package layouts;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;

public class MyDr_patient_view {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyDr_patient_view window = new MyDr_patient_view();
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
	public MyDr_patient_view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 750, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Button logOutButton = new Button("Log Out");
		logOutButton.setBounds(630, 0, 104, 22);
		frame.getContentPane().add(logOutButton);
		
		Button findPatientButton = new Button("Find Patient Record");
		findPatientButton.setBounds(102, 231, 105, 80);
		frame.getContentPane().add(findPatientButton);
		
		Button registerPatientButton = new Button("Register Patient");
		registerPatientButton.setBounds(310, 231, 105, 80);
		frame.getContentPane().add(registerPatientButton);
		
	}
}
