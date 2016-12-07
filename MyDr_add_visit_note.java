package layouts;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class MyDr_add_visit_note {

	private JFrame frame;
	private JTextField doctorNameField;
	private JTextField locationField;
	private JTextField dateField;
	private JTextField diagnosisField;
	private JTextField clicinalNoteField;
	private JLabel lblNewLabel;
	private JLabel lblSijainti;
	private JLabel lblPivmr;
	private JLabel lblOletettuDiagnoosi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyDr_add_visit_note window = new MyDr_add_visit_note();
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
	public MyDr_add_visit_note() {
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
		
		Button logOutButton = new Button("Kirjaudu ulos");
		logOutButton.setBounds(630, 0, 104, 22);
		frame.getContentPane().add(logOutButton);
		
		JLabel visitNoteLabel = new JLabel("Potilaskertomus");
		visitNoteLabel.setBounds(130, 62, 79, 27);
		frame.getContentPane().add(visitNoteLabel);
		
		doctorNameField = new JTextField();
		doctorNameField.setBounds(130, 125, 123, 20);
		frame.getContentPane().add(doctorNameField);
		doctorNameField.setColumns(10);
		
		locationField = new JTextField();
		locationField.setBounds(291, 125, 123, 20);
		frame.getContentPane().add(locationField);
		locationField.setColumns(10);
		
		dateField = new JTextField();
		dateField.setBounds(456, 125, 123, 20);
		frame.getContentPane().add(dateField);
		dateField.setColumns(10);
		
		diagnosisField = new JTextField();
		diagnosisField.setBounds(130, 181, 123, 20);
		frame.getContentPane().add(diagnosisField);
		diagnosisField.setColumns(10);
		
		clicinalNoteField = new JTextField();
		clicinalNoteField.setBounds(130, 255, 463, 175);
		frame.getContentPane().add(clicinalNoteField);
		clicinalNoteField.setColumns(10);
		
		JButton cancelButton = new JButton("Peruuta");
		cancelButton.setBounds(504, 468, 89, 23);
		frame.getContentPane().add(cancelButton);
		
		JButton saveButton = new JButton("Tallenna");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query = "insert into doctor_visitation_note (doctor_name, location, date, primary_diagnosis, clinical_note) values (?, ?, ?, ?, ?)";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.setString(1,  doctorNameField.getText());
					pst.setString(2,  locationField.getText());
					pst.setString(3,  dateField.getText());
					pst.setString(4,  diagnosisField.getText());
					pst.setString(5,  clicinalNoteField.getText());
					
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Saved");
					
					pst.close();
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		saveButton.setBounds(130, 468, 89, 23);
		frame.getContentPane().add(saveButton);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(576, 255, 17, 175);
		frame.getContentPane().add(scrollBar);
		
		lblNewLabel = new JLabel("L\u00E4\u00E4k\u00E4ri");
		lblNewLabel.setBounds(130, 100, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblSijainti = new JLabel("Sijainti");
		lblSijainti.setBounds(291, 100, 46, 14);
		frame.getContentPane().add(lblSijainti);
		
		lblPivmr = new JLabel("P\u00E4iv\u00E4m\u00E4\u00E4r\u00E4");
		lblPivmr.setBounds(456, 100, 104, 14);
		frame.getContentPane().add(lblPivmr);
		
		lblOletettuDiagnoosi = new JLabel("Oletettu diagnoosi");
		lblOletettuDiagnoosi.setBounds(130, 156, 123, 14);
		frame.getContentPane().add(lblOletettuDiagnoosi);
		
	}
}
