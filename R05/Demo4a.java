// first we import all of the classes we will use
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

/**
* This demo creates a telephone keyboard of buttons.
*/
public class Demo4a{
	public static void main(String[] args){

    JFrame window = new JFrame("Demo4a");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());

		JLabel label1 = new JLabel("<html><h1>Translation Demo</h1></html>");
		label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		content.add(label1,BorderLayout.PAGE_START);


		JComboBox fromLang = new JComboBox(new String[]{"English","Chinese","Spanish"});
		JComboBox toLang = new JComboBox(new String[]{"English","Chinese","Spanish"});

		JPanel sidebar = new JPanel();
		JPanel leftbar = new JPanel();
		leftbar.setLayout(new GridLayout(0,2));
		leftbar.add(new JLabel("Translate From"));leftbar.add(fromLang);
		leftbar.add(new JLabel("Translate To"));leftbar.add(toLang);
		sidebar.add(leftbar);
		content.add(sidebar,BorderLayout.LINE_START);

		JPanel middle = new JPanel();
		middle.setLayout(new GridLayout(1,2));
		JTextArea fromText = new JTextArea(10,40);
		fromText.setBackground(new Color(250,240,220));

		JTextArea toText = new JTextArea(10,40);
		toText.setBackground(new Color(220,240,250));
		middle.add(fromText);
		middle.add(toText);

		content.add(middle,BorderLayout.CENTER);

		content.add(new JButton("<html><h1>Translate</h1></html>"),BorderLayout.PAGE_END);



		window.setContentPane(content);
		window.pack();
		//window.setSize(250,300);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
