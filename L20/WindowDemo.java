// first we import all of the classes we will use
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import java.awt.FlowLayout;
import java.awt.GridLayout;


public class WindowDemo{
	public static void main(String[] args){

    JFrame window = new JFrame("GUI Test");
		JPanel content = new JPanel();
		JButton okButton = new JButton("OK");
		JButton cancelButton = new JButton("Cancel");
		JLabel title = new JLabel("component demo");
		JButton ahaButton = new JButton("aha");
		JButton moneyButton = new JButton("money");
		JButton assetsButton = new JButton("assets");
		JLabel subtitle = new JLabel("EMPEROROF HAN");
		JLabel subsubtitle = new JLabel("yung emperor");
    JTextArea paragraph = new JTextArea(5,40);
    JTextArea intro = new JTextArea("this is some text\n\n I am using to demo JTA");
    JTextField name = new JTextField("Enter your name here...");
    String[] languages= {"English","Spanish","Chinese","French","Japanese"};
    javax.swing.JComboBox langDropdown =
       new javax.swing.JComboBox(languages);
    JPanel box2x2 = new JPanel();
    box2x2.setLayout(new GridLayout(2,2));
    box2x2.add(okButton);
    box2x2.add(cancelButton);
    box2x2.add(langDropdown);

		content.setLayout(new GridLayout(2,0));
    content.add(box2x2);

    content.add(paragraph);
    content.add(intro);
    content.add(name);
		content.add(title);
		content.add(ahaButton);
		content.add(moneyButton);
		content.add(assetsButton);
		content.add(subtitle);
		content.add(subsubtitle);


		window.setContentPane(content);
		window.setSize(250,300);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
