import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

import javax.swing.DefaultComboBoxModel;
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

public class GUI {

	public JFrame frame;
	private JTextField txtSearch;
	private JTextField txtFirstName;
	private JTextField textEmail;
	private JLabel lblPhone;
	private JTextField textPhone;
	private JButton btnSave;
	private JButton btnCancel;
	private JTextField textLastName;
	private JTextField textMiddleInitial;
	private JTextPane txtpnNotes;
	private JList list;
	private JComboBox comboSortBy;
	private JLabel lblSortBy;
	private JLabel lblSearchBy;
	private JButton btnPrintToConsole;

	/**
	 * Create the GUI
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 943, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		btnPrintToConsole = new JButton("Print To Console");
		btnPrintToConsole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			}
		});
		btnPrintToConsole.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnPrintToConsole.setBounds(615, 404, 323, 51);
		frame.getContentPane().add(btnPrintToConsole);
	}
}
