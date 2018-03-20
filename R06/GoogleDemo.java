import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GoogleDemo {
	public static void main(String[] args){
		JFrame frame = new JFrame("Grader");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		JPanel header = new JPanel();
		header.add(new JButton("About"));
		header.add(new JButton("Store"));
		header.add(new JButton("Gmail"));
		header.add(new JButton("Images"));
		content.add(header,BorderLayout.PAGE_START);

		JPanel center = new JPanel();
		center.setLayout(new GridLayout(2,1));
		center.add(new JTextArea("     Enter your search terms in this textarea!"));
		JPanel buttons = new JPanel();
		buttons.add(new JButton("Google Search"));
		buttons.add(new JButton("I'm feeling lucky!"));
		center.add(buttons);
		content.add(center,BorderLayout.CENTER);

		//JPanel bottom = new JPanel();
		//bottom.setLayout(new GridLayout(0,1));
		//bottom.add(new JTextField("This is a textfield"));
		//bottom.add(new JLabel("2018 Copyright All Rights Reserved"));
		content.add(new JLabel("2018 Copyright All Rights Reserved"),BorderLayout.PAGE_END);


		frame.setContentPane(content);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show(true);


	}
}
