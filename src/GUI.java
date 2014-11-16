import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
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
	@SuppressWarnings("rawtypes")
	private JList list;
	@SuppressWarnings("rawtypes")
	private JComboBox comboSortBy;
	private JLabel lblSortBy;
	private JLabel lblSearchBy;
	private JButton btnPrintToConsole;
	private JButton btnToggleConsole;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JSeparator separator;

	/**
	 * This method constructs the GUI.
	 */
	public GUI() {
		initialize();
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

		JComboBox comboSearchBy = new JComboBox();
		comboSearchBy.setBounds(108, 53, 118, 27);
		comboSearchBy.setModel(new DefaultComboBoxModel(new String[] {
				"First Name", "Middle Initial", "Last Name", "Email", "Phone",
				"Address" }));
		frame.getContentPane().add(comboSearchBy);

		lblSortBy = new JLabel("Sort by:");
		lblSortBy.setBounds(10, 448, 61, 16);
		lblSortBy.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblSortBy);

		comboSortBy = new JComboBox();
		comboSortBy.setBounds(62, 444, 164, 27);
		comboSortBy.setModel(new DefaultComboBoxModel(new String[] {
				"First Name", "Last Name" }));
		frame.getContentPane().add(comboSortBy);

		txtFirstName = new JTextField();
		txtFirstName.setBounds(252, 16, 200, 28);
		txtFirstName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		txtFirstName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txtFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirstName.setText("First");
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);

		textMiddleInitial = new JTextField();
		textMiddleInitial.setBounds(451, 16, 47, 28);
		textMiddleInitial.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				null, null, null, null));
		textMiddleInitial.setText("M.I.");
		textMiddleInitial.setHorizontalAlignment(SwingConstants.CENTER);
		textMiddleInitial.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		textMiddleInitial.setColumns(10);
		frame.getContentPane().add(textMiddleInitial);

		textLastName = new JTextField();
		textLastName.setBounds(497, 16, 197, 28);
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

		btnSave = new JButton("Save");
		btnSave.setBounds(252, 342, 140, 50);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save button action here
			}
		});
		btnSave.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnSave.setForeground(new Color(0, 128, 0));
		frame.getContentPane().add(btnSave);

		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(252, 404, 140, 50);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cancel button action here
			}
		});
		btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnCancel.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(btnCancel);

		JLabel lblNotes = new JLabel("Notes:");
		lblNotes.setBounds(252, 200, 61, 16);
		lblNotes.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblNotes);

		btnPrintToConsole = new JButton("Print To Console");
		btnPrintToConsole.setBounds(403, 404, 140, 50);
		btnPrintToConsole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("test");
			}
		});
		btnPrintToConsole.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		frame.getContentPane().add(btnPrintToConsole);

		btnToggleConsole = new JButton("Toggle Console");
		btnToggleConsole.setBounds(403, 342, 140, 50);
		btnToggleConsole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				Console console = new Console("Console");
			}
		});
		btnToggleConsole.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		frame.getContentPane().add(btnToggleConsole);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(10, 92, 216, 340);
		frame.getContentPane().add(scrollPane);
		
				list = new JList();
				scrollPane.setViewportView(list);
				list.setModel(new AbstractListModel() {
					String[] values = new String[] {"First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last", "First MI Last"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				list.setBorder(null);
				
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				scrollPane_1.setBounds(325, 198, 369, 132);
				frame.getContentPane().add(scrollPane_1);
				
						txtpnNotes = new JTextPane();
						scrollPane_1.setViewportView(txtpnNotes);
						txtpnNotes
								.setText("NotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes\nNotesNotesNotesNotesNotesNotes");
						txtpnNotes.setBorder(null);
						
						scrollPane_2 = new JScrollPane();
						scrollPane_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
						scrollPane_2.setBounds(325, 132, 369, 54);
						frame.getContentPane().add(scrollPane_2);
						
								JTextPane textpnAddress = new JTextPane();
								scrollPane_2.setViewportView(textpnAddress);
								textpnAddress.setBorder(null);
								textpnAddress
										.setText("12345 El Monte Road\nLos Altos Hills, CA 94022\nUnited States");
								
								separator = new JSeparator();
								separator.setOrientation(SwingConstants.VERTICAL);
								separator.setBounds(234, 0, 12, 477);
								frame.getContentPane().add(separator);
								
								JButton btnExport = new JButton("Export");
								btnExport.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
								btnExport.setBounds(554, 404, 140, 50);
								frame.getContentPane().add(btnExport);
								
								JButton btnImport = new JButton("Import");
								btnImport.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
								btnImport.setBounds(554, 342, 140, 50);
								frame.getContentPane().add(btnImport);

	}

	class WindowEventHandler extends WindowAdapter {
		
		/**
		 * This method performs an action when the GUI window is closed.
		 */
		public void windowClosing(WindowEvent evt) {
			//Close action goes here
			System.exit(0);

		}

	}
}
