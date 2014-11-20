import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 * Uses buffering, and abstract base classes.
 */
public class DiskReadWrite {

	public static void main(String[] args) {
		// create a Serializable List
		ArrayList<String> quarks = new ArrayList<String>();
		quarks.add("up");
		quarks.add("down");

		// serialize the List
		try (OutputStream file = new FileOutputStream("quarks.ser");
				OutputStream buffer = new BufferedOutputStream(file);
				ObjectOutput output = new ObjectOutputStream(buffer);) {
			output.writeObject(quarks);
		} catch (IOException ex) {
			fLogger.log(Level.SEVERE, "Cannot perform output.", ex);
		}

		// deserialize the quarks.ser file
		try (InputStream file = new FileInputStream("quarks.ser");
				InputStream buffer = new BufferedInputStream(file);
				ObjectInput input = new ObjectInputStream(buffer);) {
			// deserialize the List
			List<String> recoveredQuarks = (List<String>) input.readObject();
			// display its data
			for (String quark : recoveredQuarks) {
				System.out.println("Recovered Quark: " + quark);
			}
		} catch (ClassNotFoundException ex) {
			fLogger.log(Level.SEVERE, "Cannot perform input. Class not found.",
					ex);
		} catch (IOException ex) {
			fLogger.log(Level.SEVERE, "Cannot perform input.", ex);
		}
	}

	// PRIVATE

	private static final Logger fLogger = Logger.getLogger(DiskReadWrite.class
			.getName());;
}
