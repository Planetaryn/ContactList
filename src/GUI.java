import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

/**
 * Defines a reusable class GUI. One object of class GUI contains the graphical
 * user interface for the contact list program.
 * 
 * @author noahgoldsmith
 */
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
	private JTextPane txtpnNotes;
	@SuppressWarnings("rawtypes")
	private JList list;
	@SuppressWarnings("rawtypes")
	private JComboBox comboSortBy;
	private JLabel lblSortBy;
	private JLabel lblSearchBy;
	private JScrollPane scrollPane_1;
	private JSeparator separator;
	private JTextField txtHouseNumber;
	private JTextField txtElMonteRoad;
	private JTextField txtLosAltosHills;
	private JTextField txtCa;
	private JTextField txtUnitedStates;
	private JTextField textField;
	private Person[] guiArray;

	/**
	 * This method constructs the GUI.
	 */
	public GUI() {
		initialize();
	}

	class WindowEventHandler extends WindowAdapter {
		/**
		 * This method performs an action when the GUI window is closed.
		 */
		public void windowClosing(WindowEvent evt) {
			// Close action goes here
			System.exit(0);
		}
	}

	/**
	 * This list constructs the array guiArray from the arrayList contactList. 
	 * 
	 * -NoahNote: This method will be passed one of many arrays from the Main, depending on if the user is searching/sorting.
	 */
	private void makeList() {
		ArrayList<Person> guiList = new ArrayList<Person>();
		guiList.addAll(Main.getContactList());
		guiArray = new Person[(guiList.size())];
		guiArray = guiList.toArray(guiArray);
	}

	/**
	 * This method notifies the user that no match was found for their search.
	 */
	public void notifyNoSearchMatch(){
		
	}
	
	/**
	 * This method initializes the content of the GUI frame
	 */
	@SuppressWarnings({ "rawtypes", "unchecked", "serial" })
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 700, 499);
		frame.addWindowListener(new WindowEventHandler());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtSearch = new JTextField();
		txtSearch.setBounds(10, 16, 216, 28);
		txtSearch.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtSearch.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearch.setText("Search");
		frame.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);

		/**
		 * Search Button Method
		 */
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(6, 52, 87, 28);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Search button action here
			}
		});
		frame.getContentPane().add(btnSearch);

		lblSearchBy = new JLabel("by:");
		lblSearchBy.setBounds(89, 57, 19, 16);
		lblSearchBy.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblSearchBy);

		/**
		 * Search by combo box
		 */
		JComboBox comboSearchBy = new JComboBox();
		comboSearchBy.setBounds(108, 53, 118, 27);
		comboSearchBy.setModel(new DefaultComboBoxModel(new String[] {
				"Last Name", "Zip Code" }));
		frame.getContentPane().add(comboSearchBy);

		lblSortBy = new JLabel("Sort by:");
		lblSortBy.setBounds(10, 448, 61, 16);
		lblSortBy.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblSortBy);

		/**
		 * Sort by combo box
		 */
		comboSortBy = new JComboBox();
		comboSortBy.setBounds(62, 444, 164, 27);
		comboSortBy.setModel(new DefaultComboBoxModel(new String[] {
				"First Name", "Last Name" }));
		frame.getContentPane().add(comboSortBy);

		/**
		 * First Name text field
		 */
		txtFirstName = new JTextField();
		txtFirstName.setBounds(252, 16, 216, 28);
		txtFirstName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtFirstName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txtFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirstName.setText("First");
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);

		/**
		 * Last name text field
		 */
		textLastName = new JTextField();
		textLastName.setBounds(469, 16, 225, 28);
		textLastName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textLastName.setText("Last");
		textLastName.setHorizontalAlignment(SwingConstants.CENTER);
		textLastName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		textLastName.setColumns(10);
		frame.getContentPane().add(textLastName);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(252, 58, 61, 16);
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblEmail);

		/**
		 * Email text field
		 */
		textEmail = new JTextField();
		textEmail.setBounds(325, 52, 369, 28);
		textEmail.setText("Foothill@fhda.edu");
		textEmail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textEmail.setBackground(Color.WHITE);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);

		lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(252, 98, 61, 16);
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblPhone);

		/**
		 * Phone number text field
		 */
		textPhone = new JTextField();
		textPhone.setBounds(325, 92, 369, 28);
		textPhone.setText("555-867-5039");
		textPhone.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textPhone.setColumns(10);
		textPhone.setBackground(Color.WHITE);
		frame.getContentPane().add(textPhone);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(252, 134, 61, 16);
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblAddress);

		/**
		 * Save Button
		 */
		btnSave = new JButton("<html><center>Save<br />Person<center></html>");
		btnSave.setBounds(325, 342, 173, 122);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save button action here
			}
		});
		btnSave.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		btnSave.setForeground(new Color(0, 128, 0));
		frame.getContentPane().add(btnSave);

		/**
		 * Cancel Button
		 */
		btnCancel = new JButton(
				"<html><center>Discard<br />Changes<center></html>");
		btnCancel.setBounds(521, 342, 173, 122);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		btnCancel.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(btnCancel);

		JLabel lblNotes = new JLabel("Notes:");
		lblNotes.setBounds(252, 200, 61, 16);
		lblNotes.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblNotes);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		scrollPane.setBounds(10, 92, 216, 340);
		frame.getContentPane().add(scrollPane);

		/**
		 * This method(?) calls the method to create the array used for display. It then displays that array in a JList.
		 * It has submethods(?) to return a selected element in the array, return the size of the array.
		 * 
		 * -NoahNote: The guiArray will be rewritten/changed when the user searches or sorts the list. If they search, the guiArray will contain only
		 * the names that match the search. If they sort, it will display the names given by the sorting order. These methods will be written in 
		 * class ContactList, and relayed to class GUI through the main.
		 */
		makeList();
		list = new JList(guiArray);
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Noah Goldsmith", "Homer Simpson"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBorder(null);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		scrollPane_1.setBounds(325, 200, 369, 130);
		frame.getContentPane().add(scrollPane_1);

		txtpnNotes = new JTextPane();
		scrollPane_1.setViewportView(txtpnNotes);
		txtpnNotes
				.setText("NotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes");
		txtpnNotes.setBorder(null);

		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(234, 0, 12, 477);
		frame.getContentPane().add(separator);

		JPanel panelAddress = new JPanel();
		panelAddress.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		panelAddress.setBackground(Color.WHITE);
		panelAddress.setBounds(325, 132, 369, 57);
		frame.getContentPane().add(panelAddress);
		panelAddress.setLayout(null);

		txtHouseNumber = new JTextField();
		txtHouseNumber.setText("12345");
		txtHouseNumber.setBounds(6, 6, 70, 16);
		txtHouseNumber.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(
				0, 0, 0)));
		panelAddress.add(txtHouseNumber);
		txtHouseNumber.setColumns(10);

		txtElMonteRoad = new JTextField();
		txtElMonteRoad.setText("El Monte Road");
		txtElMonteRoad.setColumns(10);
		txtElMonteRoad.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(
				0, 0, 0)));
		txtElMonteRoad.setBounds(75, 6, 288, 16);
		panelAddress.add(txtElMonteRoad);

		txtLosAltosHills = new JTextField();
		txtLosAltosHills.setText("Los Altos Hills");
		txtLosAltosHills.setColumns(10);
		txtLosAltosHills.setBorder(new MatteBorder(1, 1, 1, 1,
				(Color) new Color(0, 0, 0)));
		txtLosAltosHills.setBounds(6, 21, 122, 16);
		panelAddress.add(txtLosAltosHills);

		txtCa = new JTextField();
		txtCa.setText("CA");
		txtCa.setColumns(10);
		txtCa.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtCa.setBounds(127, 21, 24, 16);
		panelAddress.add(txtCa);

		txtUnitedStates = new JTextField();
		txtUnitedStates.setText("United States");
		txtUnitedStates.setColumns(10);
		txtUnitedStates.setBorder(new MatteBorder(1, 1, 1, 1,
				(Color) new Color(0, 0, 0)));
		txtUnitedStates.setBounds(6, 36, 357, 16);
		panelAddress.add(txtUnitedStates);

		textField = new JTextField();
		textField.setText("94022");
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0,
				0)));
		textField.setBounds(150, 21, 213, 16);
		panelAddress.add(textField);
	}
}
