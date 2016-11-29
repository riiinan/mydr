package layouts;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Label;

public class MyDr_login {

	private JFrame frame;
	private JTextField userNameField;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyDr_login window = new MyDr_login();
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
	public MyDr_login() {
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
		
		userNameField = new JTextField();
		userNameField.setText("User Name");
		userNameField.setBounds(262, 209, 200, 20);
		frame.getContentPane().add(userNameField);
		userNameField.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setText("Password");
		passwordField.setBounds(262, 271, 200, 20);
		frame.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(318, 328, 89, 23);
		frame.getContentPane().add(loginButton);
		
		Label loginHeading = new Label("My Dr Demo");
		loginHeading.setBounds(318, 137, 89, 22);
		frame.getContentPane().add(loginHeading);
	}
}
