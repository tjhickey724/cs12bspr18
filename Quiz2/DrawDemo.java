import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawDemo {
	public static void main(String[] args){
		JFrame frame = new JFrame("DrawDemo");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		JPanel lyftFees = new JPanel();
		content.add(new JLabel("<html><h1>DrawDemo</h1></html>"),BorderLayout.PAGE_START);

		JPanel left = new JPanel();
		left.setLayout(new GridLayout(0,1));
		left.add(new JButton("line"));
		left.add(new JButton("oval"));
		left.add(new JButton("box"));
		content.add(left,BorderLayout.LINE_START);

		JPanel right = new JPanel();
		right.setLayout(new GridLayout(0,2));
		right.add(new JLabel("red:"));right.add(new JTextField("255"));
		right.add(new JLabel("green:"));right.add(new JTextField("255"));
		right.add(new JLabel("blue:"));right.add(new JTextField("255"));
		content.add(right,BorderLayout.LINE_END);

		JPanel bottom = new JPanel();
		bottom.setLayout(new FlowLayout());
		bottom.add(new JTextArea("We will have a canvas in the center.\n"+
		   "This space if for your notes about your drawing.\n"+
			 "There are three buttons on the left and three textfields on the right.\n"+
			 "This is a text area and the panel above has color (200,200,255)"));
		content.add(bottom,BorderLayout.PAGE_END);

		JPanel center = new JPanel();
		center.setBackground(new Color(200,200,255));
		content.add(center,BorderLayout.CENTER);

		frame.setContentPane(content);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show(true);
		

	}
}
