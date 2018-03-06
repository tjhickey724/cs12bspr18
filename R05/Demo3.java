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
public class Demo3{
	public static void main(String[] args){

    JFrame window = new JFrame("Demo3");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());

		JLabel label1 = new JLabel("<html><h1>Triangle Area Calculator</h1></html>");
		label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		content.add(label1,BorderLayout.PAGE_START);


		JPanel leftbar = new JPanel();
		leftbar.setLayout(new GridLayout(0,2));
		leftbar.add(new JLabel("side 1"));leftbar.add(new JTextField("3"));
		leftbar.add(new JLabel("side 2"));leftbar.add(new JTextField("4"));
		leftbar.add(new JLabel("side 3"));leftbar.add(new JTextField("5"));
		leftbar.add(new JButton("Calculate")); leftbar.add(new JButton("Clear"));
		leftbar.setBackground(Color.GREEN);
		content.add(leftbar,BorderLayout.CENTER);

		JLabel answer = new JLabel("<html><h1>The triangle with sides 3,4,5 has area 6</h1></html>");
		content.add(answer,BorderLayout.PAGE_END);


		window.setContentPane(content);
		window.pack();
		//window.setSize(250,300);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
