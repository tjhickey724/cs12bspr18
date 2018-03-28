import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 * A simple demonstration of MouseEvents.  Shapes are drawn
 * on a black background when the user clicks the panel.  If
 * the user Shift-clicks, the panel is cleared.  If the user
 * right-clicks the panel, a blue oval is drawn.  Otherwise,
 * when the user clicks, a red rectangle is drawn.  The contents of
 * the panel are not persistent.  For example, they might disappear
 * if the panel is resized.
 * This class has a main() routine to allow it to be run as an application.
 */
public class SimpleStamper extends JPanel implements MouseListener {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Stamper");
        SimpleStamper content = new SimpleStamper();
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120,70);
        window.setSize(400,300);
        window.setVisible(true);
    }

    // ----------------------------------------------------------------------

    /**
     * This constructor simply sets the background color of the panel to be black
     * and sets the panel to listen for mouse events on itself.
     */
    public SimpleStamper() {
        setBackground(Color.yellow);
        addMouseListener(this);
    }


    public void paintComponent(Graphics g){
      super.paintComponent(g);

      for(Shape s: shapes){
        s.draw(g);
      }
      /*
      for(int i=0; i<shapes.size(); i++){ }
      */

    }

    /**
     *  Since this panel has been set to listen for mouse events on itself,
     *  this method will be called when the user clicks the mouse on the panel.
     *  This method is part of the MouseListener interface.
     */
    public void mousePressed(MouseEvent evt) {

        int x = evt.getX();  // x-coordinate where user clicked.
        int y = evt.getY();  // y-coordinate where user clicked.

        if ( evt.isShiftDown() ) {
          shapes.clear();
        }else if ( evt.isAltDown() ) {
          Shape s = new Shape(x,y,Color.BLUE,"Oval");
          shapes.add(s);
        }else if ( evt.isControlDown() ) {
          Shape s = new Shape(x,y,Color.YELLOW,"Oval");
          shapes.add(s);
        }else if ( evt.isMetaDown() ) {
          Shape s = new Shape(x,y,Color.GREEN,"Oval");
          shapes.add(s);
        }else {
          Shape s = new Shape(x,y,Color.WHITE,"Rect");
          shapes.add(s);
        }
        repaint();
    } // end mousePressed();


    // The next four empty routines are required by the MouseListener interface.
    // They don't do anything in this class, so their definitions are empty.

    public void mouseEntered(MouseEvent evt) { }
    public void mouseExited(MouseEvent evt) { }
    public void mouseClicked(MouseEvent evt) { }
    public void mouseReleased(MouseEvent evt) { }

    class Shape{
          int x,y;
          Color c;
          String shape;
          Shape(int x,int y,Color c,String shape){
            this.x=x; this.y=y; this.c=c; this.shape=shape;
          }

          public void draw(Graphics g){
            if (shape.equals("Rect")){
              g.setColor(c);
              g.fillRect( x - 30, y - 15, 60, 30 );
              g.setColor(Color.BLACK);
              g.drawRect( x - 30, y - 15, 60, 30 );
            } else if (shape.equals("Oval")){
              g.setColor(c);
              g.fillOval( x - 30, y - 15, 60, 30 );
              g.setColor(Color.BLACK);
              g.drawOval( x - 30, y - 15, 60, 30 );
            }

      }
    }


} // end class SimpleStamper
