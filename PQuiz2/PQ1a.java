import javax.swing.*;
import java.awt.*;

public class PQ1a {
	public static void main(String[] args){
		JFrame frame = new JFrame("PQ1a");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());

		JPanel headerbar = new JPanel();
		headerbar.setLayout(new BoxLayout(headerbar,BoxLayout.X_AXIS));

		JLabel header = new JLabel("PQ1a -- Demonstrating Layout Mastery     ");
		JComboBox<String> choices = new JComboBox<String>(new String[]{"animal","plant","bacteria","virus"});
    JLabel choiceL = new JLabel("Kingdom");
		headerbar.add(header);
		headerbar.add(choiceL);
		headerbar.add(choices);
		content.add(headerbar,BorderLayout.PAGE_START);



		JPanel center = new JPanel();
		center.setLayout(new GridLayout(2,2));
		center.add(new JButton("G"));
		center.add(new JButton("T"));
		center.add(new JButton("A"));
		center.add(new JButton("C"));
		content.add(center,BorderLayout.CENTER);

		JLabel result = new JLabel("Searching for : GGTATGCCACA");
		content.add(result,BorderLayout.PAGE_END);

		frame.setContentPane(content);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,200);
		frame.setVisible(true);

	}
}
