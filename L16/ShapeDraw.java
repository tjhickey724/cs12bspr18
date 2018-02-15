import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *  A very simple drawing program that lets the user add shapes to a drawing
 *  area and drag them around.  An abstract Shape class is used to represent
 *  shapes in general, with subclasses to represent particular kinds of shape.
 *  (These are implemented as nested classes inside the main class.)  This
 *  program is an illustration of class hierarchy, inheritance, polymorphism,
 *  and abstract classes.  (Note that this program will fail if you add more
 *  than 500 shapes, since it uses an array of length 500 to store the shapes.)
 */
public class ShapeDraw extends JPanel {

    /**
     * A main routine that allows this class to be run as an application.
     * It simply opens a window displaying a ShapeDraw panel.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Really Simple ShapeDraw");
        window.setContentPane( new ShapeDraw() );
        window.setSize(150,150);

        window.setLocation(150,100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }


    /**
     * Set up the GUI, with a drawing area plus a row of controls below the
     * drawing area.  The controls include three buttons which are used
     * to add shapes to the drawing area and a menu that is used to select
     * the color of the shape when it is created.  The constructor also
     * sets up listeners to handle events from the controls.
     */
    public ShapeDraw() {

        setBackground(Color.LIGHT_GRAY);


				colorChoice = new JComboBox<String>();
				DrawingArea canvas = new DrawingArea(colorChoice);  // create the canvas

         // color choice menu
        colorChoice.addItem("Red");
        colorChoice.addItem("Green");
        colorChoice.addItem("Blue");
        colorChoice.addItem("Cyan");
        colorChoice.addItem("Magenta");
        colorChoice.addItem("Yellow");
        colorChoice.addItem("Black");
        colorChoice.addItem("White");
        colorChoice.addActionListener(canvas);




        JButton rectButton = new JButton("Rect");    // buttons for adding shapes
        rectButton.addActionListener(canvas);

        JButton ovalButton = new JButton("Oval");
        ovalButton.addActionListener(canvas);

        JButton roundRectButton = new JButton("RoundRect");
        roundRectButton.addActionListener(canvas);

        JPanel bottom = new JPanel();   // a Panel to hold the control buttons
        bottom.setLayout(new GridLayout(1,4,3,3));
        bottom.add(rectButton);
        bottom.add(ovalButton);
        bottom.add(roundRectButton);
        bottom.add(colorChoice);

        setLayout(new BorderLayout(3,3));
        add(canvas, BorderLayout.CENTER);              // add canvas and controls to the panel
        add(bottom, BorderLayout.SOUTH);

    } // end constructor

    JComboBox<String> colorChoice;  // The color selection menu

    //---- Nested class definitions ---
    //
    // The remainder of the ShapeDraw class consists of static nested class definitions.
    // These are just like regular classes, except that they are defined inside
    // another class (and hence have full names, when used outside this class, such
    // as ShapeDraw.ShapeCanvas).
}
