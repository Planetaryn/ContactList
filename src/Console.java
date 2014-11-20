import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

/**
 * Defines a reusable class Console. One object of class Console contains an
 * external graphical Java console.
 * 
 */
@SuppressWarnings("serial")
public class Console extends JFrame implements KeyListener {

	private JTextField prompt;
	private JTextArea log;

	private final PipedInputStream inPipe = new PipedInputStream();
	private final PipedInputStream outPipe = new PipedInputStream();

	private PrintWriter inWriter;

	/**
	 * This method constructs a new object of class Console.
	 * 
	 * @param title
	 */
	public Console(String title) {
		super(title);

		System.setIn(inPipe);

		try {
			System.setOut(new PrintStream(new PipedOutputStream(outPipe), true));
			inWriter = new PrintWriter(new PipedOutputStream(inPipe), true);
		} catch (IOException e) {
			System.out.println("Error: " + e);
			return;
		}

		JPanel p = new JPanel();
		p.setLayout(null);
		log = new JTextArea();
		log.setEditable(false);
		log.setBounds(10, 10, 345, 250);
		p.add(log);
		prompt = new JTextField();
		prompt.setBounds(10, 270, 356, 80);
		prompt.addKeyListener(this);
		p.add(prompt);

		getContentPane().add(p);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(392, 400);
		setLocationRelativeTo(null);

		(new SwingWorker<Void, String>() {
			protected Void doInBackground() throws Exception {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(outPipe);
				while (s.hasNextLine()) {
					String line = s.nextLine();
					publish(line);
				}
				return null;
			}

			@Override
			protected void process(java.util.List<String> chunks) {
				for (String line : chunks) {
					if (line.length() < 1)
						continue;
					log.append(line.trim() + "\n");
				}
			}
		}).execute();

	}

	/**
	 * This method records user input from the keyboard and prints it in the
	 * Console JTextField prompt.
	 */
	public void execute() {
		String text = prompt.getText();
		prompt.setText("");
		System.out.println(text);
		inWriter.print(text.trim().replaceAll("\r\n", ""));
	}

	/**
	 * This method executes the current line in the Console prompt when the user
	 * presses the enter key.
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			execute();
	}

	/**
	 * This method executes the current line in the Console prompt when the user
	 * releases the enter key. This method exists for cross platform redundancy.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			execute();
	}

	/**
	 * This method executes the current line in the Console prompt when the user
	 * presses then releases the enter key. This method exists for cross
	 * platform redundancy.
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			execute();
	}

	/**
	 * This method is called from the original application to initialize the
	 * Console.
	 * 
	 * @param title
	 */
	public static void setConsole(final String title) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Console(title);
				// System.out.println("somewhat");
			}
		});

	}

}