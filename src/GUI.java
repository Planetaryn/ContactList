import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Defines a reusable class GUI. One object of class GUI contains the graphical
 * user interface for the contact list program.
 * 
 * @author noahgoldsmith
 */
public class GUI {

	/**
	 * Defines a custom cell renderer for a JList
	 * 
	 * @author noahgoldsmith
	 *
	 */
	public class CellRenderer extends JLabel implements ListCellRenderer {

		public CellRenderer() {
			setOpaque(true);
		}

		public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {

			setText(Main.relayGFirstName() + " " + Main.relayGLastName());
			if (isSelected) {
				setBackground(Color.BLUE);
				setForeground(Color.WHITE);
			} else if (index % 2 == 0) {
				setBackground(Color.WHITE);
				setForeground(Color.BLACK);
			} else {
				setBackground(Color.LIGHT_GRAY);
				setForeground(Color.BLACK);
			}
			return this;
		}
	}

	class WindowEventHandler extends WindowAdapter {
		/**
		 * This method instructs the Main to save the list to the disk when the
		 * GUI window is closed.
		 */
		@Override
		public void windowClosing(WindowEvent evt) {

			System.exit(0);
		}
	}

	/**
	 * This method notifies the user that no match was found for their search.
	 * 
	 */
	public static void notifyNoSearchMatch() {
	}

	private JButton btnCancel;
	private JFrame frame;
	private JList<Person> list;
	/**
	 * This establishes a new document listener & the actions that will be
	 * performed when it is triggered
	 */
	DocumentListener listener = new DocumentListener() {

		/**
		 * This method updates a Person Object when a character is changed in a
		 * text field.
		 */
		@Override
		public void changedUpdate(DocumentEvent e) {
			updateAll(e);
		}

		/**
		 * This method updates a Person Object when a character is added to a
		 * text field.
		 */
		@Override
		public void insertUpdate(DocumentEvent e) {
			updateAll(e);
		}

		/**
		 * This method updates a Person Object when a character is removed from
		 * a text field.
		 */
		@Override
		public void removeUpdate(DocumentEvent e) {
			updateAll(e);
		}

		/**
		 * This method instructs the Main to update a specified Person object.
		 * 
		 * @param e
		 */
		private void updateAll(DocumentEvent e) {
			Main.setPerson(list.getSelectedIndex());
			Main.updatePerson(txtFirstName.getText(),
					txtLastName.getText(), txtEmail.getText(),
					txtPhone.getText(), txtpnNotes.getText(),
					txtHouseNumber.getText(), txtStreet.getText(),
					txtZip.getText(), txtCity.getText(), txtState.getText(),
					txtCountry.getText());
		}
	};
	private DefaultListModel<Person> model1 = new DefaultListModel<Person>();
	private JScrollPane scrollPane_1;
	private String searchField;
	private JSeparator separator;
	private String sortField = "lastName";
	private JTextField txtCity;
	private JTextField txtCountry;
	private JTextField txtEmail;
	private JTextField txtFirstName;
	private JTextField txtHouseNumber;
	private JTextField txtLastName;
	private JTextField txtPhone;
	private JTextPane txtpnNotes;
	private JTextField txtSearch;
	private JTextField txtState;
	private JTextField txtStreet;
	private JTextField txtZip;

	/**
	 * This method constructs the GUI.
	 */
	public GUI() {
		// makeList();
		initialize();
		this.frame.setVisible(true); // Must be the last thing done in this
										// method.
	}

	/**
	 * This method fills the data fields in the GUI with the data extracted from
	 * the selected Person object.
	 */
	private void fillData(Person person) {
		updateFields();
	}


	/**
	 * This method returns the value of the variable sortField.
	 */
	public String getSortField() {
		return sortField;
	}

	/**
	 * This method initializes the content of the GUI frame
	 */
	@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
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
		txtSearch.setColumns(10);
		frame.getContentPane().add(txtSearch);

		txtFirstName = new JTextField();
		txtFirstName.setBounds(313, 16, 250, 28);
		txtFirstName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtFirstName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txtFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstName.setText(Main.relayGFirstName());
		txtFirstName.getDocument().addDocumentListener(listener);
		txtFirstName.setColumns(10);
		frame.getContentPane().add(txtFirstName);

		txtLastName = new JTextField();
		txtLastName.setBounds(313, 56, 250, 28);
		txtLastName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtLastName.setText(Main.relayGLastName());
		txtLastName.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txtLastName.setColumns(10);
		txtLastName.getDocument().addDocumentListener(listener);
		frame.getContentPane().add(txtLastName);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(252, 102, 57, 16);
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(313, 96, 250, 28);
		txtEmail.setText(Main.relayGEmail());
		txtEmail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		txtEmail.setBackground(Color.WHITE);
		txtEmail.setColumns(10);
		txtEmail.getDocument().addDocumentListener(listener);
		frame.getContentPane().add(txtEmail);

		JPanel panelAddress = new JPanel();
		panelAddress.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		panelAddress.setBackground(Color.WHITE);
		panelAddress.setBounds(313, 176, 250, 57);
		frame.getContentPane().add(panelAddress);
		panelAddress.setLayout(null);

		txtHouseNumber = new JTextField();
		txtHouseNumber.setText(Main.relayGHouseNumber());
		txtHouseNumber.setBounds(6, 6, 70, 16);
		txtHouseNumber
				.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtHouseNumber.setColumns(10);
		txtHouseNumber.getDocument().addDocumentListener(listener);
		panelAddress.add(txtHouseNumber);

		txtStreet = new JTextField();
		txtStreet.setText(Main.relayGStreet());
		txtStreet.setColumns(10);
		txtStreet.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtStreet.setBounds(75, 6, 169, 16);
		txtStreet.getDocument().addDocumentListener(listener);
		panelAddress.add(txtStreet);

		txtCity = new JTextField();
		txtCity.setText(Main.relayGCity());
		txtCity.setColumns(10);
		txtCity.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtCity.setBounds(6, 21, 122, 16);
		txtCity.getDocument().addDocumentListener(listener);
		panelAddress.add(txtCity);

		txtState = new JTextField();
		txtState.setText(Main.relayGState());
		txtState.setColumns(10);
		txtState.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtState.setBounds(127, 21, 24, 16);
		txtState.getDocument().addDocumentListener(listener);
		panelAddress.add(txtState);

		txtCountry = new JTextField();
		txtCountry.setText(Main.relayGCountry());
		txtCountry.setColumns(10);
		txtCountry.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtCountry.setBounds(6, 36, 238, 16);
		txtCountry.getDocument().addDocumentListener(listener);
		panelAddress.add(txtCountry);

		txtZip = new JTextField();
		txtZip.setText(Main.relayGZip());
		txtZip.setColumns(10);
		txtZip.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtZip.setBounds(150, 21, 94, 16);
		txtZip.getDocument().addDocumentListener(listener);
		panelAddress.add(txtZip);

		txtPhone = new JTextField();
		txtPhone.setBounds(313, 136, 250, 28);
		txtPhone.setText(Main.relayGPhoneNumber());
		txtPhone.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		txtPhone.setColumns(10);
		txtPhone.setBackground(Color.WHITE);
		txtPhone.getDocument().addDocumentListener(listener);
		frame.getContentPane().add(txtPhone);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		scrollPane_1.setBounds(313, 244, 250, 133);
		frame.getContentPane().add(scrollPane_1);

		txtpnNotes = new JTextPane();
		scrollPane_1.setViewportView(txtpnNotes);
		txtpnNotes.setText(Main.relayGNotes());
		txtpnNotes.setBorder(null);

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(252, 142, 57, 16);
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblPhone);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(252, 180, 57, 16);
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblAddress);

		JLabel lblNotes = new JLabel("Notes:");
		lblNotes.setBounds(252, 250, 57, 16);
		lblNotes.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblNotes);

		JLabel lblSearchBy = new JLabel("for");
		lblSearchBy.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblSearchBy.setBounds(89, 57, 19, 16);
		lblSearchBy.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblSearchBy);

		JLabel lblSortBy = new JLabel("Sort by:");
		lblSortBy.setBounds(10, 389, 61, 16);
		lblSortBy.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblSortBy);

		JLabel lblFirst = new JLabel("First:");
		lblFirst.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirst.setBounds(252, 22, 57, 16);
		frame.getContentPane().add(lblFirst);

		JLabel lblLastName = new JLabel("Last:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(252, 64, 57, 16);
		frame.getContentPane().add(lblLastName);

		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(234, 0, 12, 477);
		frame.getContentPane().add(separator);

		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnSearch.setBounds(6, 52, 87, 28);
		btnSearch.addActionListener(new ActionListener() {
			/**
			 * This method instructs the main to search for the text in the
			 * txtSearch field in the field specified by the variable
			 * searchField.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnSearch);

		JButton btnNewContact = new JButton("New Contact");
		btnNewContact.setToolTipText("Creates a new blank contact");
		btnNewContact.addActionListener(new ActionListener() {
			/**
			 * This Method instructs the main to create a new "blank" Person
			 * object and add it to the contactList when the New Contact button
			 * is pressed.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				model1.clear();
				Main.addPerson();
				for (int i = 0; i < Main.getSize(); i++) {
					model1.addElement(Main.getPersonAtIndex(i));
					list.setModel(model1);
				}
			}
		});
		btnNewContact.setForeground(Color.BLACK);
		btnNewContact.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnNewContact.setBounds(313, 384, 127, 28);
		frame.getContentPane().add(btnNewContact);

		JButton btnCancel = new JButton("Discard Changes");
		btnCancel.setBounds(436, 384, 127, 28);
		btnCancel.addActionListener(new ActionListener() {
			/**
			 * This method instructs the main to discard the changes made by the
			 * user to the current Person object, and revert to the last version
			 * of that Person object.
			 * 
			 * (This is a nice to have)
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnCancel.setForeground(Color.BLACK);
		frame.getContentPane().add(btnCancel);

		JComboBox comboSearchBy = new JComboBox<String>();
		comboSearchBy.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboSearchBy.setBounds(108, 53, 118, 27);
		comboSearchBy.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Last Name", "Zip Code" }));
		/**
		 * This method sets the variable searchField to the value displayed in
		 * the JComboBox comboSearchBy
		 */
		comboSearchBy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(comboSearchBy);

		JComboBox comboSortBy = new JComboBox<String>();
		comboSortBy.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboSortBy.setBounds(62, 385, 164, 27);
		comboSortBy.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Last Name" }));
		/**
		 * This method sets the variable sortField to the value displayed in the
		 * JComboBox comboSortBy.
		 */
		comboSortBy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(comboSortBy);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		scrollPane.setBounds(10, 92, 216, 285);
		frame.getContentPane().add(scrollPane);

		list = new JList((Main.getContactList()).toArray());
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setCellRenderer(new CellRenderer());
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				Main.setPerson(list.getSelectedIndex());
				fillData(Main.getPerson());
			}
		});
		scrollPane.setViewportView(list);
		list.setSelectedIndex(0);
		list.setBorder(null);

	}

	/**
	 * This method updates all text fields
	 */
	public void updateFields() {
		txtHouseNumber.setText(Main.relayGHouseNumber());
		txtStreet.setText(Main.relayGStreet());
		txtZip.setText(Main.relayGZip());
		txtCity.setText(Main.relayGCity());
		txtState.setText(Main.relayGState());
		txtCountry.setText(Main.relayGCountry());
		txtFirstName.setText(Main.relayGFirstName());
		txtLastName.setText(Main.relayGLastName());
		txtEmail.setText(Main.relayGEmail());
		txtPhone.setText(Main.relayGPhoneNumber());
		txtpnNotes.setText(Main.relayGNotes());
	}
}