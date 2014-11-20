import java.awt.EventQueue;

/**
 * 
 */

/**
 * @author noahgoldsmith
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIs window = new GUIs();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			/**
			 * This method opens the contact list. If it does not find an
			 * existing contact list, it creates a new one.
			 */
			@SuppressWarnings("unused")
			private void openList() {

			}

		});

	}
}
