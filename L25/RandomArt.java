import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A RandomArtPanel draws random pictures which might be taken to have
 * some vague resemblance to abstract art.  A new picture is produced every
 * four seconds.  There are three types of pictures:  random lines,
 * random circles, and random 3D rects.  The figures are drawn in
 * random colors on a background that is a random shade of gray.
 * A main() routine allows this class to be run as a program
 */
public class RandomArt extends JPanel {

    CircleInfo[] circles = new CircleInfo[20];


    public static void main(String[] args) {
        JFrame window = new JFrame("Random Art ??");
        RandomArt content = new RandomArt();
        window.setContentPane(content);
        window.setSize(400,400);
        window.setLocation(100,100);
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        window.setVisible(true);

        for(int i=0; i<20; i++){
          content.circles[i] = new CircleInfo(1000,1000);
        }
    }

    /**
     * A RepaintAction object calls the repaint method of this panel each
     * time its actionPerformed() method is called.  An object of this
     * type is used as an action listener for a Timer that generates an
     * ActionEvent every four seconds.  The result is that the panel is
     * redrawn every four seconds.
     */
    private class RepaintAction implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            repaint();  // Call the repaint() method in the panel class.
        }
    }

    /**
     * The constructor creates a timer with a delay time of four seconds
     * (4000 milliseconds), and with a RepaintAction object as its
     * ActionListener.  It also starts the timer running.
     */
    public RandomArt() {

      //  RepaintAction action = new RepaintAction();
      //  Timer timer = new Timer(4000, action);
      //  timer.start();
    }

    /**
     * The paintComponent() method fills the panel with a random shade of
     * gray and then draws one of three types of random "art".  The type
     * of art to be drawn is chosen at random.
     */
     public void paintComponent(Graphics g) {

       Color randomGray = Color.getHSBColor( 1.0F, 0.0F, 0.5F);
       g.setColor(randomGray);
       g.fillRect( 0, 0, getWidth(), getHeight() );

       for (int i=0; i<circles.length; i++){
         circles[i].draw(g);
       }
     }



    public static class CircleInfo
  {
      public int centerX;
      public int centerY;
      public int radius;
      public Color color;

      public CircleInfo(int screenWidth, int screenHeight)
      {
          this.centerX = (int)(screenWidth * Math.random());
          this.centerY = (int)(screenHeight * Math.random());
          this.radius = (int)(100.0+400.0*Math.random());
          this.color = Color.getHSBColor( (float)Math.random(), 1.0F, 1.0F);;
      }

      public void draw(Graphics g)
      {
          g.setColor(color);
          g.drawOval(centerX - radius, centerY - radius, radius, radius);
      }

  }

} // end class RandomArtPanel
