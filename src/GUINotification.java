import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class GUINotification extends JDialog {

	private JPanel contentPanel;
	private String firstLine = "";
	private String secondLine = "";

	/**
	 * Create the dialog box. Sets the first and second line of text using
	 * parameters.
	 * 
	 * @param newFirstLine
	 * @param newSecondLine
	 * @author noahgoldsmith
	 */
	public GUINotification(String newFirstLine, String newSecondLine) {
		firstLine = newFirstLine;
		secondLine = newSecondLine;
		initialize();
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setVisible(true);

	}

	/**
	 * This method initializes the new JPanel
	 * 
	 * @author noahgoldsmith
	 */
	public void initialize() {
		contentPanel = new JPanel();
		setBounds(100, 100, 450, 135);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblFirstLine = new JLabel(firstLine);
			lblFirstLine.setHorizontalAlignment(SwingConstants.CENTER);
			lblFirstLine.setBounds(6, 6, 437, 35);
			lblFirstLine.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
			contentPanel.add(lblFirstLine);
		}
		{
			JButton btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {

				/**
				 * This method closes the JPanel when the OK button is pressed.
				 * 
				 * @param e
				 * @author noahgoldsmith
				 */
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});

			JLabel lblSecondLine = new JLabel(secondLine);
			lblSecondLine.setHorizontalAlignment(SwingConstants.CENTER);
			lblSecondLine.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			lblSecondLine.setBounds(6, 39, 437, 25);
			contentPanel.add(lblSecondLine);
			btnOK.setBounds(155, 68, 140, 35);
			contentPanel.add(btnOK);
		}

	}
}
