import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
/**
 * This class creates a reusable object frame.......
 * @author noahgoldsmith
 * File History:
 * Version 1: 
 * 	Author: noahgoldsmith 	Date: 11/13/2014 
 * 	Content: GUI infrastructure and a GUI screen 
 * Version 2: 
 * 	Author: Shmuel Shaffer 	Date: 11/14/2014
 *  Content: Four screen GUI framework accompanied with explanatory power point
 

 * 
 *
 */
public class GUIs {

	public JFrame frame; //Make a setter and getter for this, rather than making it public
	
	private JTextField txtSearch;
	private JTextField txtFirstName;
	private JTextField textEmail;
	private JLabel lblPhone;
	private JTextField textPhone;
	private JButton btnSave;
	private JButton btnAddNewPerson;
	private JButton btnPrintList;
	private JButton btnRetrievePerson;
	private JButton btnCancel;
	private JButton btnExit;
	private JTextField textLastName;
	private JTextField textMiddleInitial;
	private JTextPane txtpnNotes;
	private JList list;
	private JComboBox comboSortBy;
	private JLabel lblSortBy;
	private JLabel lblWelcome;
	private JLabel lblSearchBy;
	final int MENU_FROM_TOP =390;

	/**
	 * Create the application.
	 */
	public GUIs() {
		VeryFirstScreen(); // Used only first time when there is no disk file or it is empty 
		welcomeScreen();   // Used when user invokes application and there are names in the file
		addContactScreen(); // Used to add a person to the list
		RetrieveContactScreen();   // Used when user invokes application and there are names in the file

	}

	/** This screen is shown the very first time when the user invokes the application
	 * and the application cannot retrieve a list from the disk.
	 */
	private void VeryFirstScreen() {
		frame = new JFrame();
		frame.setBounds(100, 100, 943, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Team 7 Directory");
		frame.getContentPane().setLayout(null);
		
	    lblWelcome = new JLabel("Welcome to Team 7 Directory");
	    
		lblWelcome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWelcome.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblWelcome.setBounds(10, 50, 422, 50);
		frame.getContentPane().add(lblWelcome);
		

	    lblWelcome = new JLabel("To add contacts, press Add Contact");
	    
		lblWelcome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWelcome.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblWelcome.setBounds(10, 150, 470, 50);
		frame.getContentPane().add(lblWelcome);
		
		btnAddNewPerson = new JButton("Add Contact");
		btnAddNewPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnAddNewPerson.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnAddNewPerson.setForeground(new Color(0, 128, 0));
		btnAddNewPerson.setBounds(50, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnAddNewPerson);
		

		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save button action here
			}
		});
		btnExit.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setBounds(250, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnExit);
	
	}
	
	/** This screen is shown whenever the user invokes the application
	 * and the application can retrieve a non-empty list from the disk.
	 */
	private void welcomeScreen() {
		frame = new JFrame();
		frame.setBounds(100, 100, 943, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Team 7 Directory");
		frame.getContentPane().setLayout(null);
		
	    lblWelcome = new JLabel("Welcome to Team 7 Directory");
	    
		lblWelcome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWelcome.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblWelcome.setBounds(10, 50, 422, 50);
		frame.getContentPane().add(lblWelcome);
		

	    lblWelcome = new JLabel("Please select from the list below");
	    
		lblWelcome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWelcome.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblWelcome.setBounds(10, 150, 470, 50);
		frame.getContentPane().add(lblWelcome);
		
		
		btnAddNewPerson = new JButton("Add Contacts");
		btnAddNewPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnAddNewPerson.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnAddNewPerson.setForeground(new Color(0, 128, 0));
		btnAddNewPerson.setBounds(50, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnAddNewPerson);
		
		
		btnPrintList = new JButton("Print List");
		btnPrintList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnPrintList.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnPrintList.setForeground(new Color(0, 128, 0));
		btnPrintList.setBounds(250, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnPrintList);
		
		
		btnRetrievePerson = new JButton("Retrieve Contact");
		btnRetrievePerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnRetrievePerson.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnRetrievePerson.setForeground(new Color(0, 128, 0));
		btnRetrievePerson.setBounds(450, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnRetrievePerson);
	
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save button action here
			}
		});
		btnExit.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setBounds(650, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnExit);
		
		
	}
	
	/**
	 * This is the screen used to add contact to the directory
	 */
	private void addContactScreen() {
		int leftTab =150;
		int topTab = 60;
		int tabDelta =30;
		int boxHeieght =24;
		final int MENU_FROM_TOP =390;
		frame = new JFrame();
		frame.setBounds(100, 100, 943, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Team 7 Directory -> Add a Contact");
		frame.getContentPane().setLayout(null);

	    JLabel lblAddPerson = new JLabel("Please add Contact info and press Save");
	    
	    lblAddPerson.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblAddPerson.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
	    lblAddPerson.setBounds(100, 5, 370, 50);
		frame.getContentPane().add(lblAddPerson);
		
	    JLabel lblMandatory = new JLabel("* Denotes mandatiory field");
	    
	    lblMandatory.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblMandatory.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
	    lblMandatory.setBounds(30, 345, 320, 50);
		frame.getContentPane().add(lblMandatory);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(leftTab-35, topTab+2, 81, 16);
		frame.getContentPane().add(lblFirstName);

		JTextField textFirstName = new JTextField();
		textFirstName.setText("e.g., John");
		textFirstName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textFirstName.setBackground(Color.WHITE);
		textFirstName.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textFirstName);
		textFirstName.setColumns(10);
		
		topTab+=tabDelta;
		
		JLabel lblMidName = new JLabel("Mid Name:");
		lblMidName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMidName.setBounds(leftTab-35, topTab+2, 81, 16);
		frame.getContentPane().add(lblMidName);

		JTextField textmidName = new JTextField();
		textmidName.setText("e.g., Paul");
		textmidName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textmidName.setBackground(Color.WHITE);
		textmidName.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textmidName);
		textmidName.setColumns(10); 

		topTab+=tabDelta;
		
		JLabel lbLastName = new JLabel("* Last Name:");
		lbLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lbLastName.setBounds(leftTab-35, topTab+2, 81, 16);
		frame.getContentPane().add(lbLastName);

		JTextField textLastName = new JTextField();
		textLastName.setText("e.g., Smith");
		textLastName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textLastName.setBackground(Color.WHITE);
		textLastName.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textLastName);
		textLastName.setColumns(10);
		
		topTab+=tabDelta;
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(leftTab-15, topTab+2, 61, 16);
		frame.getContentPane().add(lblEmail);

		textEmail = new JTextField();
		textEmail.setText("e.g., Foothill@fhda.edu");
		textEmail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textEmail.setBackground(Color.WHITE);
		textEmail.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		topTab+=tabDelta;
		
		lblPhone = new JLabel("Phone:");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setBounds(leftTab-15, topTab+2, 61, 16);
		frame.getContentPane().add(lblPhone);

		textPhone = new JTextField();
		textPhone.setText("e.g., 555-867-5039");
		textPhone.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textPhone.setColumns(10);
		textPhone.setBackground(Color.WHITE);
		textPhone.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textPhone);
// Address
		
		topTab+=tabDelta;
		
		JLabel lblAddress1 = new JLabel("Address 1:");
		lblAddress1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress1.setBounds(leftTab-35, topTab+2, 81, 16);
		frame.getContentPane().add(lblAddress1);

		JTextField textAddress1 = new JTextField();
		textAddress1.setText("e.g., 1234 Main St.");
		textAddress1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textAddress1.setBackground(Color.WHITE);
		textAddress1.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textAddress1);
		textAddress1.setColumns(10);
		
		topTab+=tabDelta;
		JLabel lblAddr2 = new JLabel("Address 2:");
		lblAddr2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddr2.setBounds(leftTab-35, topTab+2, 81, 16);
		frame.getContentPane().add(lblAddr2);


		JTextField textAddress2 = new JTextField();
		textAddress2.setText("e.g., Appartment 301");
		textAddress2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textAddress2.setBackground(Color.WHITE);
		textAddress2.setBounds(leftTab+50, topTab+2, 246, boxHeieght);
		frame.getContentPane().add(textAddress2);
		textAddress2.setColumns(10);
		
		topTab+=tabDelta;
		JLabel lblCity = new JLabel("City:");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(leftTab-15, topTab+2, 61, 16);
		frame.getContentPane().add(lblCity);

		JTextField textCity = new JTextField();
		textCity.setText("e.g., New York");
		textCity.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textCity.setBackground(Color.WHITE);
		textCity.setBounds(leftTab+50, topTab+2, 246, boxHeieght);
		frame.getContentPane().add(textCity);
		textCity.setColumns(10);
				
		topTab+=tabDelta;
		// State
		JLabel lblState = new JLabel("State:");
		lblState.setHorizontalAlignment(SwingConstants.RIGHT);
		lblState.setBounds(leftTab-15, topTab+2, 61, 16);
		frame.getContentPane().add(lblState);

		JTextField textState = new JTextField();
		textState.setText("e.g., NY");
		textState.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textState.setBackground(Color.WHITE);
		textState.setBounds(leftTab+50, topTab+2, 246, boxHeieght);
		frame.getContentPane().add(textState);
		textCity.setColumns(10);
		topTab+=tabDelta;
		// ZIP Code
		JLabel lblZip = new JLabel("Zip Code:");
		lblZip.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZip.setBounds(leftTab-15, topTab+2, 61, 16);
		frame.getContentPane().add(lblZip);

		JTextField textZip = new JTextField();
		textZip.setText("e.g., 00123");
		textZip.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textZip.setBackground(Color.WHITE);
		textZip.setBounds(leftTab+50, topTab+2, 246, boxHeieght);
		frame.getContentPane().add(textZip);
		textZip.setColumns(10);


		JLabel lblNotes = new JLabel("Notes:");
		lblNotes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNotes.setBounds(508, 80, 61, 16);
		frame.getContentPane().add(lblNotes);
		
		txtpnNotes = new JTextPane();
		txtpnNotes
				.setText("NotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes");
		txtpnNotes.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtpnNotes.setBounds(581, 78, 246, 132);
		frame.getContentPane().add(txtpnNotes);

		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save button action here
			}
		});
		btnSave.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnSave.setForeground(new Color(0, 128, 0));
		btnSave.setBounds(550, 250, 155, 50);
		frame.getContentPane().add(btnSave);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnCancel.setForeground(new Color(255, 0, 0));
		btnCancel.setBounds(717, 250, 155, 50);
		frame.getContentPane().add(btnCancel);

		
		// Menu buttons
		
		
		btnPrintList = new JButton("Print List");
		btnPrintList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnPrintList.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnPrintList.setForeground(new Color(0, 128, 0));
		btnPrintList.setBounds(250, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnPrintList);
		
		
		btnRetrievePerson = new JButton("Retrieve Contact");
		btnRetrievePerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnRetrievePerson.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnRetrievePerson.setForeground(new Color(0, 128, 0));
		btnRetrievePerson.setBounds(450, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnRetrievePerson);
	
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save button action here
			}
		});
		btnExit.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setBounds(650, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnExit);

	}
	/** Retrieve screen
	 * 
	 * 	
	/**
	 * This is the screen used to Retrieve contact to the directory
	 */
	private void RetrieveContactScreen() {
		int leftTab =150;
		int topTab = 60;
		int tabDelta =30;
		int boxHeieght =24;
		final int MENU_FROM_TOP =390;
		final int checkBoxOffset = 310;
		frame = new JFrame();
		frame.setBounds(100, 100, 943, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Add a Contact");
		frame.getContentPane().setLayout(null);

	    JLabel lblAddRetrieve = new JLabel("Select field, enter search data, and press Search");
	    
	    lblAddRetrieve.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblAddRetrieve.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
	    lblAddRetrieve.setBounds(20, 5, 470, 50);
		frame.getContentPane().add(lblAddRetrieve);
		
	 /*   JLabel lblMandatory = new JLabel("* Denotes supported search field");
	    
	    lblMandatory.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblMandatory.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
	    lblMandatory.setBounds(30, 315, 320, 50);
		frame.getContentPane().add(lblMandatory);
	*/	
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(leftTab-35, topTab+2, 81, 16);
		frame.getContentPane().add(lblFirstName);

		JTextField textFirstName = new JTextField();
		textFirstName.setText("e.g., John");
		textFirstName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textFirstName.setBackground(Color.WHITE);
		textFirstName.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textFirstName);
		textFirstName.setColumns(10); 
		// Check Box
		JTextField textCheckFirstName = new JTextField();
		textCheckFirstName.setText(" ");
		textCheckFirstName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textCheckFirstName.setBackground(Color.WHITE);
		textCheckFirstName.setBounds(leftTab+checkBoxOffset, topTab, 24, boxHeieght);
		frame.getContentPane().add(textCheckFirstName);
		
		topTab+=tabDelta;
		
		JLabel lblMidName = new JLabel("Middle Name:");
		lblMidName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMidName.setBounds(leftTab-35, topTab+2, 81, 16);
		frame.getContentPane().add(lblMidName);

		JTextField textmidName = new JTextField();
		textmidName.setText("e.g., Paul");
		textmidName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textmidName.setBackground(Color.WHITE);
		textmidName.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textmidName);
		textmidName.setColumns(10); 
		// Check Box
		JTextField textCheckMidName = new JTextField();
		textCheckMidName.setText(" ");
		textCheckMidName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textCheckMidName.setBackground(Color.WHITE);
		textCheckMidName.setBounds(leftTab+checkBoxOffset, topTab, 24, boxHeieght);
		frame.getContentPane().add(textCheckMidName);
		
		topTab+=tabDelta;
		
		JLabel lbLastName = new JLabel("* Last Name:");
		lbLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lbLastName.setBounds(leftTab-35, topTab+2, 81, 16);
		frame.getContentPane().add(lbLastName);

		JTextField textLastName = new JTextField();
		textLastName.setText("e.g., Smith");
		textLastName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textLastName.setBackground(Color.WHITE);
		textLastName.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textLastName);
		textLastName.setColumns(10);
		// Check Box
		JTextField textCheckLasttName = new JTextField();
		textCheckLasttName.setText(" X");
		textCheckLasttName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textCheckLasttName.setBackground(Color.WHITE);
		textCheckLasttName.setBounds(leftTab+checkBoxOffset, topTab, 24, boxHeieght);
		frame.getContentPane().add(textCheckLasttName);
		topTab+=tabDelta;
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(leftTab-15, topTab+2, 61, 16);
		frame.getContentPane().add(lblEmail);

		textEmail = new JTextField();
		textEmail.setText("e.g., Foothill@fhda.edu");
		textEmail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textEmail.setBackground(Color.WHITE);
		textEmail.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		// Check Box
		JTextField textCheckEmail = new JTextField();
		textCheckEmail.setText(" ");
		textCheckEmail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
						null, null, null));
		textCheckEmail.setBackground(Color.WHITE);
		textCheckEmail.setBounds(leftTab+checkBoxOffset, topTab, 24, boxHeieght);
				frame.getContentPane().add(textCheckEmail);
		topTab+=tabDelta;
		
		lblPhone = new JLabel("Phone:");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setBounds(leftTab-15, topTab+2, 61, 16);
		frame.getContentPane().add(lblPhone);

		textPhone = new JTextField();
		textPhone.setText("e.g., 555-867-5039");
		textPhone.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textPhone.setColumns(10);
		textPhone.setBackground(Color.WHITE);
		textPhone.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textPhone);
		
		// Check Box
		JTextField textCheckPhone = new JTextField();
		textCheckPhone.setText(" ");
		textCheckPhone.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
						null, null, null));
		textCheckPhone.setBackground(Color.WHITE);
		textCheckPhone.setBounds(leftTab+checkBoxOffset, topTab, 24, boxHeieght);
				frame.getContentPane().add(textCheckPhone);
// Address
		
		topTab+=tabDelta;
		
		JLabel lblAddress1 = new JLabel("Address 1:");
		lblAddress1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress1.setBounds(leftTab-35, topTab+2, 81, 16);
		frame.getContentPane().add(lblAddress1);

		JTextField textAddress1 = new JTextField();
		textAddress1.setText("e.g., 1234 Main St.");
		textAddress1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textAddress1.setBackground(Color.WHITE);
		textAddress1.setBounds(leftTab+50, topTab, 246, boxHeieght);
		frame.getContentPane().add(textAddress1);
		textAddress1.setColumns(10);
		// Check Box
		JTextField textCheckAddress = new JTextField();
		textCheckAddress.setText(" ");
		textCheckAddress.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
								null, null, null));
		textCheckAddress.setBackground(Color.WHITE);
		textCheckAddress.setBounds(leftTab+checkBoxOffset, topTab, 24, boxHeieght);
		frame.getContentPane().add(textCheckAddress);
		
		topTab+=tabDelta;
		JLabel lblAddr2 = new JLabel("Address 2:");
		lblAddr2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddr2.setBounds(leftTab-35, topTab+2, 81, 16);
		frame.getContentPane().add(lblAddr2);


		JTextField textAddress2 = new JTextField();
		textAddress2.setText("e.g., Appartment 301");
		textAddress2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textAddress2.setBackground(Color.WHITE);
		textAddress2.setBounds(leftTab+50, topTab+2, 246, boxHeieght);
		frame.getContentPane().add(textAddress2);
		textAddress2.setColumns(10);
		
		topTab+=tabDelta;
		JLabel lblCity = new JLabel("City:");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(leftTab-15, topTab+2, 61, 16);
		frame.getContentPane().add(lblCity);

		JTextField textCity = new JTextField();
		textCity.setText("e.g., New York");
		textCity.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textCity.setBackground(Color.WHITE);
		textCity.setBounds(leftTab+50, topTab+2, 246, boxHeieght);
		frame.getContentPane().add(textCity);
		textCity.setColumns(10);
		// Check Box
		JTextField textCheckCity = new JTextField();
		textCheckCity.setText(" ");
		textCheckCity.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
								null, null, null));
		textCheckCity.setBackground(Color.WHITE);
		textCheckCity.setBounds(leftTab+checkBoxOffset, topTab, 24, boxHeieght);
		frame.getContentPane().add(textCheckCity);
		topTab+=tabDelta;
		// State
		JLabel lblState = new JLabel("State:");
		lblState.setHorizontalAlignment(SwingConstants.RIGHT);
		lblState.setBounds(leftTab-15, topTab+2, 61, 16);
		frame.getContentPane().add(lblState);

		JTextField textState = new JTextField();
		textState.setText("e.g., NY");
		textState.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textState.setBackground(Color.WHITE);
		textState.setBounds(leftTab+50, topTab+2, 246, boxHeieght);
		frame.getContentPane().add(textState);
		textCity.setColumns(10);
		// Check Box
		JTextField textCheckState = new JTextField();
		textCheckState.setText(" ");
		textCheckState.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
								null, null, null));
		textCheckState.setBackground(Color.WHITE);
		textCheckState.setBounds(leftTab+checkBoxOffset, topTab, 24, boxHeieght);
		frame.getContentPane().add(textCheckState);
		
		topTab+=tabDelta;
		// ZIP Code
		JLabel lblZip = new JLabel("Zip Code:");
		lblZip.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZip.setBounds(leftTab-15, topTab+2, 61, 16);
		frame.getContentPane().add(lblZip);

		JTextField textZip = new JTextField();
		textZip.setText("e.g., 00123");
		textZip.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textZip.setBackground(Color.WHITE);
		textZip.setBounds(leftTab+50, topTab+2, 246, boxHeieght);
		frame.getContentPane().add(textZip);
		textZip.setColumns(10);
		// Check Box
		JTextField textCheckZIP = new JTextField();
		textCheckZIP.setText(" ");
		textCheckZIP.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
								null, null, null));
		textCheckZIP.setBackground(Color.WHITE);
		textCheckZIP.setBounds(leftTab+checkBoxOffset, topTab, 24, boxHeieght);
		frame.getContentPane().add(textCheckZIP);
		

		JLabel lblNotes = new JLabel("Contact(s):");
		lblNotes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNotes.setBounds(508, 70, 71, 16);
		frame.getContentPane().add(lblNotes);
		
		txtpnNotes = new JTextPane();
		txtpnNotes
				.setText("John Paul Smith\n555-234-2345\njohn.smith@gmail.com\n12345 El Monte Road\nLos Altos Hills, CA 94022");
		txtpnNotes.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtpnNotes.setBounds(581, 72, 266, 152);
		frame.getContentPane().add(txtpnNotes);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save button action here
			}
		});
		btnSearch.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnSearch.setForeground(new Color(0, 128, 0));
		btnSearch.setBounds(550, 250, 155, 50);
		frame.getContentPane().add(btnSearch);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnCancel.setForeground(new Color(255, 0, 0));
		btnCancel.setBounds(717, 250, 155, 50);
		frame.getContentPane().add(btnCancel);

		
		// Menu buttons
		
		
		btnAddNewPerson = new JButton("Add Contacts");
		btnAddNewPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnAddNewPerson.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnAddNewPerson.setForeground(new Color(0, 128, 0));
		btnAddNewPerson.setBounds(50, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnAddNewPerson);
	
		btnPrintList = new JButton("Print List");
		btnPrintList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnPrintList.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnPrintList.setForeground(new Color(0, 128, 0));
		btnPrintList.setBounds(250, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnPrintList);
		
/*		
		btnRetrievePerson = new JButton("Retrieve Contact");
		btnRetrievePerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnRetrievePerson.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnRetrievePerson.setForeground(new Color(0, 128, 0));
		btnRetrievePerson.setBounds(450, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnRetrievePerson);
	
*/		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save button action here
			}
		});
		btnExit.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setBounds(650, MENU_FROM_TOP, 155, 50);
		frame.getContentPane().add(btnExit);

	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 943, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("***REPLACE WITH FRAME TITLE****");
		frame.getContentPane().setLayout(null);

		txtSearch = new JTextField();
		txtSearch.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtSearch.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearch.setText("Search");
		txtSearch.setBounds(10, 16, 155, 28);
		frame.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Search button action here
			}
		});
		btnSearch.setBounds(167, 17, 87, 28);
		frame.getContentPane().add(btnSearch);

		lblSearchBy = new JLabel("by:");
		lblSearchBy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearchBy.setBounds(250, 22, 19, 16);
		frame.getContentPane().add(lblSearchBy);

		JComboBox comboSearchBy = new JComboBox();
		comboSearchBy.setModel(new DefaultComboBoxModel(new String[] {
				"First Name", "Middle Initial", "Last Name", "Email", "Phone",
				"Address" }));
		comboSearchBy.setBounds(269, 18, 118, 27);
		frame.getContentPane().add(comboSearchBy);

		lblSortBy = new JLabel("Sort by:");
		lblSortBy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSortBy.setBounds(6, 66, 61, 16);
		frame.getContentPane().add(lblSortBy);

		comboSortBy = new JComboBox();
		comboSortBy.setModel(new DefaultComboBoxModel(new String[] {
				"First Name", "Last Name" }));
		comboSortBy.setBounds(67, 62, 118, 27);
		frame.getContentPane().add(comboSortBy);

		list = new JList();
		list.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		list.setBounds(10, 94, 273, 371);
		frame.getContentPane().add(list);

		txtFirstName = new JTextField();
		txtFirstName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtFirstName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txtFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirstName.setText("First");
		txtFirstName.setBounds(492, 16, 200, 24);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);

		textMiddleInitial = new JTextField();
		textMiddleInitial.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				null, null, null, null));
		textMiddleInitial.setText("M.I.");
		textMiddleInitial.setHorizontalAlignment(SwingConstants.CENTER);
		textMiddleInitial.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		textMiddleInitial.setColumns(10);
		textMiddleInitial.setBounds(691, 16, 47, 24);
		frame.getContentPane().add(textMiddleInitial);

		textLastName = new JTextField();
		textLastName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textLastName.setText("Last");
		textLastName.setHorizontalAlignment(SwingConstants.CENTER);
		textLastName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		textLastName.setColumns(10);
		textLastName.setBounds(737, 16, 200, 24);
		frame.getContentPane().add(textLastName);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(618, 58, 61, 16);
		frame.getContentPane().add(lblEmail);

		textEmail = new JTextField();
		textEmail.setText("Foothill@fhda.edu");
		textEmail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textEmail.setBackground(Color.WHITE);
		textEmail.setBounds(691, 52, 246, 28);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);

		lblPhone = new JLabel("Phone:");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setBounds(618, 98, 61, 16);
		frame.getContentPane().add(lblPhone);

		textPhone = new JTextField();
		textPhone.setText("555-867-5039");
		textPhone.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textPhone.setColumns(10);
		textPhone.setBackground(Color.WHITE);
		textPhone.setBounds(691, 92, 246, 28);
		frame.getContentPane().add(textPhone);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setBounds(618, 134, 61, 16);
		frame.getContentPane().add(lblAddress);

		JTextPane textpnAddress = new JTextPane();
		textpnAddress.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textpnAddress
				.setText("12345 El Monte Road\nLos Altos Hills, CA 94022\nUnited States");
		textpnAddress.setBounds(691, 132, 246, 54);
		frame.getContentPane().add(textpnAddress);

		txtpnNotes = new JTextPane();
		txtpnNotes
				.setText("NotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes");
		txtpnNotes.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtpnNotes.setBounds(691, 198, 246, 132);
		frame.getContentPane().add(txtpnNotes);

		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save button action here
			}
		});
		btnSave.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnSave.setForeground(new Color(0, 128, 0));
		btnSave.setBounds(615, 342, 155, 50);
		frame.getContentPane().add(btnSave);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnCancel.setForeground(new Color(255, 0, 0));
		btnCancel.setBounds(782, 342, 155, 50);
		frame.getContentPane().add(btnCancel);

		JLabel lblNotes = new JLabel("Notes:");
		lblNotes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNotes.setBounds(618, 200, 61, 16);
		frame.getContentPane().add(lblNotes);
		
		JButton btnPrintToConsole = new JButton("Print to Console");
		btnPrintToConsole.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnPrintToConsole.setBounds(615, 398, 322, 50);
		frame.getContentPane().add(btnPrintToConsole);
	}
}
