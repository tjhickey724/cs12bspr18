import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class R06a {
	public static void main(String[] args){
		JFrame frame = new JFrame("Robotic Boat");
		JPanel content = new JPanel();

		content.setLayout(new BorderLayout());

		JPanel header = new JPanel();
		header.add(new JLabel("<html><h1>Navigate the robotic boat!</h1></html>"));
		content.add(header,BorderLayout.PAGE_START);

		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3,3));
		center.add(new JButton("NW"));
		center.add(new JButton("N"));
		center.add(new JButton("NE"));
		center.add(new JButton("W"));
		center.add(new JButton("o"));
		center.add(new JButton("E"));
		center.add(new JButton("SW"));
		center.add(new JButton("S"));
		center.add(new JButton("SE"));
		content.add(center,BorderLayout.CENTER);

		JPanel right = new JPanel();
		right.setLayout(new GridLayout(0,1));
		right.add(new JButton("Go"));
		right.add(new JButton("Stop"));
		content.add(right,BorderLayout.LINE_END);

		JPanel footer = new JPanel();
		footer.add(new JLabel("Your name:"));
		footer.add(new JTextField("...enter your name in this textfield..."));
		content.add(footer,BorderLayout.PAGE_END);

		frame.setContentPane(content);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
