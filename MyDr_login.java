package layouts;

import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyDr_login {

	private JFrame frame;
	private JTextField userNameField;
	private JPasswordField passwordField;

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
		userNameField.setBounds(262, 209, 200, 20);
		frame.getContentPane().add(userNameField);
		userNameField.setColumns(10);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query = "select * from login where User_Name = ? and Password = ?";
					PreparedStatement pst = Connection.prepareStatement(query);
					pst.setString(1, userNameField.getText());
					pst.setString(2, passwordField.getText());
					
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while(rs.next()){
						count++;
					}
					if(count == 1){
						JOptionPane.showMessageDialog(null, "Username and password corresct");
						frame.dispose();
						MyDr_start_view startview = new MyDr_start_view();
						startview.setVisible(true);
					}else if(count > 1){
						JOptionPane.showMessageDialog(null, "Duplicate username and password");
					}else{
						JOptionPane.showMessageDialog(null, "Incorrect username or password");
					}
					
					rs.close();
					pst.close();
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		loginButton.setBounds(318, 328, 89, 23);
		frame.getContentPane().add(loginButton);
		
		Label loginHeading = new Label("My Dr Demo");
		loginHeading.setBounds(318, 137, 89, 22);
		frame.getContentPane().add(loginHeading);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(262, 265, 200, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("K\u00E4ytt\u00E4j\u00E4tunnus");
		lblNewLabel.setBounds(146, 212, 106, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Salasana");
		lblNewLabel_1.setBounds(175, 268, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
