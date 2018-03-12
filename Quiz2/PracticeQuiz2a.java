import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PracticeQuiz2a {
	public static void main(String[] args){
		JFrame frame = new JFrame("PQ2a");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		JPanel lyftFees = new JPanel();
		content.add(new JLabel("PQ2a"),BorderLayout.PAGE_START);

		frame.add(content);
		frame.pack();
		frame.show(true);

	}
}
