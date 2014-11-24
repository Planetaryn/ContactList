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

	public JFrame frame; // How do I make you private?
	private JTextField txtSearch;
	private JTextField txtFirstName;
	private JTextField textEmail;
	private JLabel lblPhone;
	private JTextField textPhone;
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
	private Person[] guiArray; // This is the array displayed in the JList
	private Person displayPerson; // This is the person that is displayed in the
									// GUI

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
			// Close action goes here (save list)
			System.exit(0);
		}
	}

	/**
	 * This method constructs the array guiArray from the array list
	 * contactList. This is necessary for a JList to display an array list.
	 * 
	 * -NoahNote: This method will be passed one of many arrays from the Main,
	 * depending on if the user is searching/sorting.
	 */
	private void makeList() {
		ArrayList<Person> guiList = new ArrayList<Person>();
		guiList.addAll(Main.getContactList());
		guiArray = new Person[(guiList.size())];
		guiArray = guiList.toArray(guiArray);
	}

	/**
	 * This method notifies the user that no match was found for their search.
	 * 
	 */
	public void notifyNoSearchMatch() {

	}

	/**
	 * This method initializes the content of the GUI frame
	 */
	@SuppressWarnings({ "rawtypes", "unchecked", "serial" })
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 576, 443);
		frame.addWindowListener(new WindowEventHandler());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtSearch = new JTextField();
		txtSearch.setBounds(10, 16, 216, 28);
		txtSearch.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtSearch.setHorizontalAlignment(SwingConstants.LEFT);
		txtSearch.setText("Search");
		frame.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);

		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnSearch.setBounds(6, 52, 87, 28);
		btnSearch.addActionListener(new ActionListener() {
			/**
			 * This method performs an action when the search button is pressed
			 */
			public void actionPerformed(ActionEvent e) {
				// Search button action here
			}
		});
		frame.getContentPane().add(btnSearch);

		lblSearchBy = new JLabel("for");
		lblSearchBy.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblSearchBy.setBounds(89, 57, 19, 16);
		lblSearchBy.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblSearchBy);

		/**
		 * Search by combo box
		 */
		JComboBox comboSearchBy = new JComboBox();
		comboSearchBy.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboSearchBy.setBounds(108, 53, 118, 27);
		comboSearchBy.setModel(new DefaultComboBoxModel(new String[] {
				"Last Name", "Zip Code" }));
		frame.getContentPane().add(comboSearchBy);

		lblSortBy = new JLabel("Sort by:");
		lblSortBy.setBounds(10, 389, 61, 16);
		lblSortBy.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblSortBy);

		/**
		 * Sort by combo box
		 */
		comboSortBy = new JComboBox();
		comboSortBy.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboSortBy.setBounds(62, 385, 164, 27);
		comboSortBy.setModel(new DefaultComboBoxModel(new String[] {
				"First Name", "Last Name" }));
		frame.getContentPane().add(comboSortBy);

		/**
		 * First Name text field
		 */
		txtFirstName = new JTextField();
		txtFirstName.setBounds(313, 16, 250, 28);
		txtFirstName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtFirstName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txtFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstName.setText("First"); // First name getter here.
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);

		/**
		 * Last name text field
		 */
		textLastName = new JTextField();
		textLastName.setBounds(313, 56, 250, 28);
		textLastName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textLastName.setText("Last");
		textLastName.setHorizontalAlignment(SwingConstants.LEFT);
		textLastName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		textLastName.setColumns(10);
		frame.getContentPane().add(textLastName);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(252, 102, 57, 16);
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblEmail);

		/**
		 * Email text field
		 */
		textEmail = new JTextField();
		textEmail.setBounds(313, 96, 250, 28);
		textEmail.setText("Foothill@fhda.edu");
		textEmail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textEmail.setBackground(Color.WHITE);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);

		lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(252, 142, 57, 16);
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblPhone);

		/**
		 * Phone number text field
		 */
		textPhone = new JTextField();
		textPhone.setBounds(313, 136, 250, 28);
		textPhone.setText("555-867-5039");
		textPhone.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textPhone.setColumns(10);
		textPhone.setBackground(Color.WHITE);
		frame.getContentPane().add(textPhone);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(252, 180, 57, 16);
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblAddress);

		btnCancel = new JButton("Discard Changes");
		btnCancel.setBounds(436, 384, 127, 28);
		btnCancel.addActionListener(new ActionListener() {
			/**
			 * This method performs an action when the discard changes button is
			 * pressed
			 */
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnCancel.setForeground(Color.BLACK);
		frame.getContentPane().add(btnCancel);

		JLabel lblNotes = new JLabel("Notes:");
		lblNotes.setBounds(252, 250, 57, 16);
		lblNotes.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblNotes);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		scrollPane.setBounds(10, 92, 216, 285);
		frame.getContentPane().add(scrollPane);

		makeList();
		list = new JList(guiArray);
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "Noah Goldsmith", "Homer Simpson" };

			/**
			 * This method returns the index of the element of the array that is
			 * currently selected.
			 */
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
		scrollPane_1.setBounds(313, 244, 250, 133);
		frame.getContentPane().add(scrollPane_1);

		txtpnNotes = new JTextPane();
		scrollPane_1.setViewportView(txtpnNotes);
		txtpnNotes.setBorder(null);

		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(234, 0, 12, 477);
		frame.getContentPane().add(separator);

		JPanel panelAddress = new JPanel();
		panelAddress.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		panelAddress.setBackground(Color.WHITE);
		panelAddress.setBounds(313, 176, 250, 57);
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
		txtElMonteRoad.setBounds(75, 6, 169, 16);
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
		txtUnitedStates.setBounds(6, 36, 238, 16);
		panelAddress.add(txtUnitedStates);

		textField = new JTextField();
		textField.setText("94022");
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0,
				0)));
		textField.setBounds(150, 21, 94, 16);
		panelAddress.add(textField);

		JLabel lblFirst = new JLabel("First:");
		lblFirst.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirst.setBounds(252, 22, 57, 16);
		frame.getContentPane().add(lblFirst);

		JLabel lblLastName = new JLabel("Last:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(252, 64, 57, 16);
		frame.getContentPane().add(lblLastName);

		JButton btnNewContact = new JButton("New Contact");
		btnNewContact.setForeground(Color.BLACK);
		btnNewContact.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnNewContact.setBounds(313, 384, 127, 28);
		frame.getContentPane().add(btnNewContact);
	}
}