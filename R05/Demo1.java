// first we import all of the classes we will use
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import java.awt.FlowLayout;
import java.awt.GridLayout;

/**
* This demo creates a telephone keyboard of buttons.
*/
public class Demo1{
	public static void main(String[] args){

    JFrame window = new JFrame("Demo1");
		JPanel content = new JPanel();
		content.setLayout(new GridLayout(0,3));
		for(int i=1; i<10; i++){
			JButton b = new JButton(""+i);
			content.add(b);
		}
		content.add(new JButton("*"));
		content.add(new JButton("0"));
		content.add(new JButton("#"));

		window.setContentPane(content);
		window.pack();
		//window.setSize(250,300);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
