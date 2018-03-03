// first we import all of the classes we will use
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;


public class WindowDemo{
	public static void main(String[] args){

		JFrame window = new JFrame("GUI Test");
		JPanel content = new JPanel();
		JButton okButton = new JButton("OK");
		JButton cancelButton = new JButton("Cancel");
		JLabel title = new JLabel("component demo");

		content.setLayout(new FlowLayout());
		content.add(okButton);
		content.add(cancelButton);
		content.add(title);

		window.setContentPane(content);
		window.setSize(250,300);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
