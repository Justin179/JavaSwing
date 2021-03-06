import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TextPanel extends JPanel {

	private TextArea textArea;
	
	public TextPanel() {
		textArea = new TextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(textArea),BorderLayout.CENTER);
	}
	
	public void appendText(String text) {
		textArea.append(text);
	}
}
