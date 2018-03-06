// first we import all of the classes we will use
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

/**
* This demo creates a telephone keyboard of buttons.
*/
public class Demo2a{
	public static void main(String[] args){

    JFrame window = new JFrame("Demo2a");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());

		JButton page_start = new JButton("PAGE_START");
		JButton line_start = new JButton("LINE_START");
		JButton center = new JButton("CENTER");
		JButton line_end = new JButton("LINE_END");
		JButton page_end = new JButton("PAGE_END");

		content.add(page_start,BorderLayout.PAGE_START);
		content.add(page_end,BorderLayout.PAGE_END);
		content.add(line_start,BorderLayout.LINE_START);
		content.add(center,BorderLayout.CENTER);
		content.add(line_end,BorderLayout.LINE_END);

		window.setContentPane(content);
		window.pack();
		//window.setSize(250,300);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
