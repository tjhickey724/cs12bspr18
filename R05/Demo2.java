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
public class Demo2{
	public static void main(String[] args){

    JFrame window = new JFrame("Demo2");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());

		JLabel label1 = new JLabel("Demo 2 is cool");
		label1.setBackground(Color.YELLOW);
		content.add(label1,BorderLayout.PAGE_START);


		JPanel leftbar = new JPanel();
		leftbar.setLayout(new GridLayout(0,1));
		leftbar.add(new JButton("start"));
		leftbar.add(new JButton("pause"));
		leftbar.add(new JButton("resume"));
		leftbar.add(new JButton("stop"));
		leftbar.setBackground(Color.GREEN);
		content.add(leftbar,BorderLayout.LINE_START);

		JTextArea words = new JTextArea(4,50);
		content.add(words,BorderLayout.CENTER);
		words.setBackground(Color.YELLOW);


		window.setContentPane(content);
		window.pack();
		//window.setSize(250,300);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
