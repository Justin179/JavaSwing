import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		// This method shouldbe used when an application thread needs to update the GUI
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				new MainFrame();
				
				
				
			}
		});
		
		
	}

}
