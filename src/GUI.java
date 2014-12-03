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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;

/**
 * Defines a reusable class GUI. One object of class GUI contains the graphical
 * user interface for the contact list program.
 * 
 * @author noahgoldsmith
 */
public class GUI {

	@SuppressWarnings("rawtypes")
	private DefaultListModel model = new DefaultListModel();
	private JScrollPane scrollPane_1;
	@SuppressWarnings("unused")
	private JSeparator separator;
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
	private JComboBox comboShow;
	private JComboBox comboSortBy;
	private JComboBox comboSearchBy;
	private JFrame frame;
	private JList<Person> list = new JList<Person>();
	private DocumentListener listener;
	private int index = -1;
	private String shownList;
	private String searchField = "Last Name";
	private String sortField = "Name";

	/**
	 * This method constructs the GUI.
	 */
	public GUI() {
		initialize();
		if(Main.getSize("Contact List") == 0){
			Main.addPerson();
		}
		updateModel();
		this.frame.setVisible(true);
		listener = new DocumentListener(this);
	}

	/**
	 * This method initializes the content of the GUI frame
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
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
		txtFirstName.setText("");
		txtFirstName.getDocument().addDocumentListener(listener);

		txtFirstName.setColumns(10);
		frame.getContentPane().add(txtFirstName);

		txtLastName = new JTextField();
		txtLastName.setBounds(313, 56, 250, 28);
		txtLastName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtLastName.setText("");
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
		txtEmail.setText("");
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
		txtHouseNumber.setText("House #");
		txtHouseNumber.setBounds(6, 6, 70, 16);
		txtHouseNumber
				.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtHouseNumber.setColumns(10);
		txtHouseNumber.getDocument().addDocumentListener(listener);
		panelAddress.add(txtHouseNumber);

		txtStreet = new JTextField();
		txtStreet.setText("Street");
		txtStreet.setColumns(10);
		txtStreet.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtStreet.setBounds(75, 6, 169, 16);
		txtStreet.getDocument().addDocumentListener(listener);
		panelAddress.add(txtStreet);

		txtCity = new JTextField();
		txtCity.setText("City");
		txtCity.setColumns(10);
		txtCity.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtCity.setBounds(6, 21, 122, 16);
		txtCity.getDocument().addDocumentListener(listener);
		panelAddress.add(txtCity);

		txtState = new JTextField();
		txtState.setText("State");
		txtState.setColumns(10);
		txtState.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtState.setBounds(127, 21, 59, 16);
		txtState.getDocument().addDocumentListener(listener);
		panelAddress.add(txtState);

		txtCountry = new JTextField();
		txtCountry.setText("Country");
		txtCountry.setColumns(10);
		txtCountry.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtCountry.setBounds(6, 36, 238, 16);
		txtCountry.getDocument().addDocumentListener(listener);
		panelAddress.add(txtCountry);

		txtZip = new JTextField();
		txtZip.setText("ZIP code");
		txtZip.setColumns(10);
		txtZip.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		txtZip.setBounds(185, 21, 59, 16);
		txtZip.getDocument().addDocumentListener(listener);
		panelAddress.add(txtZip);

		txtPhone = new JTextField();
		txtPhone.setBounds(313, 136, 250, 28);
		txtPhone.setText("");
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
		txtpnNotes.setText("");
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

		JLabel lblSearchBy = new JLabel("by");
		lblSearchBy.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblSearchBy.setBounds(88, 57, 19, 16);
		lblSearchBy.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblSearchBy);

		JLabel lblSortBy = new JLabel("Sort by:");
		lblSortBy.setBounds(10, 389, 50, 16);
		lblSortBy.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblSortBy);

		JLabel lblFirst = new JLabel("First:");
		lblFirst.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirst.setBounds(252, 22, 57, 16);
		frame.getContentPane().add(lblFirst);

		JLabel lblLastName = new JLabel("Last:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(252, 64, 57, 16);
		frame.getContentPane().add(lblLastName);

		JLabel lblShow = new JLabel("Show:");
		lblShow.setHorizontalAlignment(SwingConstants.RIGHT);
		lblShow.setBounds(10, 361, 50, 16);
		frame.getContentPane().add(lblShow);

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
			 * searchField when the search button is pressed. It then updates
			 * the GUI to show the search matches.
			 * 
			 * @param e
			 * @author noahgoldsmith
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.searchList(searchField, txtSearch.getText());
				shownList = "Search Results";
				updateModel();
				comboShow.setSelectedIndex(1);

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
			 * 
			 * @param e
			 * @author noahgoldsmith
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtLastName.getText().isEmpty() == false) {
					updatePerson();
					Main.addPerson();
					updateFields();
					updateModel();

				} else {
					try {
						@SuppressWarnings("unused")
						GUINotification dialog = new GUINotification(
								"Error: No last name!",
								"You must enter a last name for this person.");
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewContact.setForeground(Color.BLACK);
		btnNewContact.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnNewContact.setBounds(313, 384, 127, 28);
		frame.getContentPane().add(btnNewContact);

		JButton btnSave = new JButton("Save Contact");
		btnSave.setBounds(436, 384, 127, 28);
		btnSave.addActionListener(new ActionListener() {
			/**
			 * This method updates the currently selected person object, then
			 * updates the list model to reflect any changes when the Save
			 * Contact button is pressed.
			 *
			 * @param e
			 * @author noahgoldsmith
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				int selection = list.getSelectedIndex();
				updatePerson();
				updateFields();
				Main.sortList(sortField);
				updateModel();
				list.setSelectedIndex(selection);
			}
		});
		btnSave.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnSave.setForeground(Color.BLACK);
		frame.getContentPane().add(btnSave);

		comboSearchBy = new JComboBox<String>();
		comboSearchBy.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboSearchBy.setBounds(108, 53, 118, 27);
		comboSearchBy.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Last Name", "ZIP code", "Email" }));
		comboSearchBy.addActionListener(new ActionListener() {
			/**
			 * This method sets the variable searchField to the value displayed
			 * in the JComboBox comboSearchBy.
			 * 
			 * @param e
			 * @author noahgoldsmith
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				searchField = comboSearchBy.getSelectedItem().toString();
			}
		});
		frame.getContentPane().add(comboSearchBy);

		comboSortBy = new JComboBox<String>();
		comboSortBy.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboSortBy.setBounds(62, 385, 164, 27);
		comboSortBy.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Name" }));
		comboSortBy.addActionListener(new ActionListener() {
			/**
			 * This method sets the variable sortField to the value displayed in
			 * the JComboBox comboSortBy.
			 * 
			 * @param e
			 * @author noahgoldsmith
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				sortField = comboSortBy.getSelectedItem().toString();
			}
		});
		frame.getContentPane().add(comboSortBy);

		comboShow = new JComboBox();
		comboShow.addActionListener(new ActionListener() {
			/**
			 * This method sets the variable shownList to the value displayed in
			 * the JComboBox comboShow.
			 * 
			 * @param e
			 * @author noahgoldsmith
			 */
			public void actionPerformed(ActionEvent e) {
				shownList = comboShow.getSelectedItem().toString();
				updateModel();
				if (Main.getSize(shownList) != 0) {
					list.setSelectedIndex(0);
				}
			}
		});
		comboShow.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboShow.setModel(new DefaultComboBoxModel(new String[] {
				"Contact List", "Search Results" }));
		comboShow.setBounds(62, 357, 164, 27);
		frame.getContentPane().add(comboShow);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		scrollPane.setBounds(10, 85, 216, 256);
		frame.getContentPane().add(scrollPane);

		list = new JList(model);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setCellRenderer(new CellRenderer());
		list.addListSelectionListener(new ListSelectionListener() {

			/**
			 * This method updates the variable index so that it reflects the
			 * currently selected index in the JList whenever the user selects a
			 * different index in the JList.
			 * 
			 * @param le
			 * @author noahgoldsmith
			 */
			@Override
			public void valueChanged(ListSelectionEvent le) {
				index = list.getSelectedIndex();
				updateFields();
			}
		});
		scrollPane.setViewportView(list);
		list.setSelectedIndex(0);
		list.setBorder(null);

	}

	/**
	 * Defines class CellRenderer. Class CellRenderer controls how a JList is
	 * displayed.
	 * 
	 * @author noahgoldsmith
	 *
	 */
	@SuppressWarnings({ "serial", "rawtypes" })
	public class CellRenderer extends JLabel implements ListCellRenderer {

		/**
		 * Class CellRenderer constructor
		 * 
		 * @author noahgoldsmith
		 */
		public CellRenderer() {
			setOpaque(true);
		}

		/**
		 * This component sets the background and foreground colors of a JList
		 * to different colors so that the colors alternate, and so that a
		 * selected index becomes a different color.
		 * 
		 * @return
		 * @author noahgoldsmith
		 */
		@Override
		public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {

			setText((Main.getPersonAtIndex(index, shownList)).getFirstName()
					+ " "
					+ (Main.getPersonAtIndex(index, shownList)).getLastName());
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

	/**
	 * Defines class WindowEventHandler. WindowEventHandler initiates actions
	 * when the GUI window is closed.
	 * 
	 * @author noahgoldsmith
	 *
	 */
	class WindowEventHandler extends WindowAdapter {
		/**
		 * This method instructs the Main to save the list to the disk when the
		 * GUI window is closed.
		 */
		@Override
		public void windowClosing(WindowEvent evt) {
			Main.saveList();
			System.exit(0);
		}
	}

	/**
	 * Defines class DocumentListener. DocumentListener sets up a document
	 * listener that updates a person object and the list model when a document
	 * is changed in any way.
	 * 
	 * @author noahgoldsmith
	 *
	 */
	class DocumentListener implements javax.swing.event.DocumentListener {

		private GUI gui;

		/**
		 * Constructor for class DocumentListener
		 * 
		 * @param gui
		 */
		DocumentListener(GUI gui) {
			this.gui = gui;
		}

		/**
		 * This method updates a Person Object when a character is changed in a
		 * text field.
		 * 
		 * @author noahgoldsmith
		 */
		@Override
		public void changedUpdate(DocumentEvent e) {
			updateAll(e);
		}

		/**
		 * This method updates a Person Object when a character is added to a
		 * text field.
		 * 
		 * @author noahgoldsmith
		 */
		@Override
		public void insertUpdate(DocumentEvent e) {
			updateAll(e);
		}

		/**
		 * This method updates a Person Object when a character is removed from
		 * a text field.
		 * 
		 * @author noahgoldsmith
		 */
		@Override
		public void removeUpdate(DocumentEvent e) {
			updateAll(e);
		}

		/**
		 * This method instructs the Main to update a specified Person object.
		 *
		 * @param e
		 * @author noahgoldsmith
		 */
		private void updateAll(DocumentEvent e) {
			gui.updatePerson();
			gui.updateModel();
		}
	};

	/**
	 * This method returns the value of the variable sortField. (In this version
	 * of the program, the sortfield is always Name)
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public String getSortField() {
		sortField = "Name";
		return sortField;
	}

	/**
	 * This method returns the index of the currently selected person in the
	 * JList
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public int getPersonIndex() {
		return index;
	}

	/**
	 * This method updates the current person object so that the data in the
	 * person object matches the data displayed in text fields. The current
	 * person object is the object currently selected in the JList.
	 * 
	 * @author noahgoldsmith
	 */
	public void updatePerson() {
		if (list.getSelectedIndex() != -1) {
			Main.updatePerson(txtFirstName.getText(), txtLastName.getText(),
					txtEmail.getText(), txtPhone.getText(),
					txtpnNotes.getText(), txtHouseNumber.getText(),
					txtStreet.getText(), txtZip.getText(), txtCity.getText(),
					txtState.getText(), txtCountry.getText());
		}
	}

	/**
	 * This method updates model used for the JList so that it displays what is
	 * currently in the contact list.
	 * 
	 * @author noahgoldsmith
	 */
	@SuppressWarnings("unchecked")
	public void updateModel() {
		model.clear();
		if (shownList == null) {
			shownList = "Contact List";
		}
		for (int i = 0; i < Main.getSize(shownList); i++) {
			model.addElement(Main.getPersonAtIndex(i, shownList));
			list.setModel(model);
		}
	}

	/**
	 * This method updates the all text fields in the GUI so that they display
	 * the data held in the current person object. The current person object is
	 * the object currently selected in the JList.
	 * 
	 * @author noahgoldsmith
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