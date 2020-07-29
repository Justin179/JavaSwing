import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		// This method shouldbe used when an application thread needs to update the GUI
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				JFrame frame = new JFrame("Hello Swing");
				frame.setSize(600, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
				
			}
		});
		
		
	}

}
