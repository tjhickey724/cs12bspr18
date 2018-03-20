import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradingDemo {
	public static void main(String[] args){
		JFrame frame = new JFrame("GradingDemo");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		JPanel lyftFees = new JPanel();
		content.add(new JLabel("<html><h1>Grading Demo</h1></html>"),BorderLayout.PAGE_START);

		JPanel left = new JPanel();
		left.setLayout(new GridLayout(0,1));
		left.add(new JButton("A"));
		left.add(new JButton("B"));
		left.add(new JButton("C"));
		left.add(new JButton("D"));
		left.add(new JButton("E"));
		content.add(left,BorderLayout.LINE_START);

		JPanel right = new JPanel();
		right.setLayout(new GridLayout(0,2));
		right.add(new JLabel("correctness/10"));right.add(new JTextField("10"));
		right.add(new JLabel("indentation/5"));right.add(new JTextField("1"));
		right.add(new JLabel("comments/5"));right.add(new JTextField("2"));
		content.add(right,BorderLayout.LINE_END);

		JPanel bottom = new JPanel();
		bottom.setLayout(new FlowLayout());
		bottom.add(new JTextArea("Rubric goes here.\n"+
		   "Number of points for each mistake....\n"));
		content.add(bottom,BorderLayout.PAGE_END);

		JPanel center = new JPanel();
		JTextArea a = new JTextArea();
		JTextArea b = new JTextArea();
		a.setBackground(new Color(255,255,0));
		b.setBackground(new Color(200,200,255));

		center.setLayout(new GridLayout(1,2));

		center.add(a);
		center.add(b);
		content.add(center,BorderLayout.CENTER);

		frame.setContentPane(content);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show(true);


	}
}
