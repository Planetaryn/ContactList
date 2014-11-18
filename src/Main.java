import java.awt.EventQueue;

/**
 * This class controls the operation of the contact list program. It has methods
 * which initialize the GUI and creates a new contact list or opens an existing
 * contact list.
 * 
 * @author noahgoldsmith
 */
public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			/**
			 * This method creates and opens a new GUI
			 */
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
					System.out.println("Program has compiled and is running");
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

/*
 * ---Paste of run from console---
 * 
 * Program has compiled and is running
 * 
 */
