import javax.swing.JFrame;

public class MainFrame extends JFrame{

	public MainFrame() {
		// 原始
//		JFrame frame = new JFrame("Hello Swing");
//		frame.setSize(600, 500);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
		
		// 繼承
		super("Hello Swing");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
}
