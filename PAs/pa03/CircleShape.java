package pa03;

import java.awt.Color;

import java.awt.Graphics;

/**
 * A simple class that holds the size, color, and location of a colored disk,
 * with a method for drawing the circle in a graphics context.  The circle
 * is drawn as a filled oval, with a black outline.
 *
 * It also holde the velocity vx and vy of the circle in terms of
 * the change in x and y respectively in pixels per second and has
 * code for updating its position after a specified amount of time.
 * We assume the circles are on a rectanular board which limits their movement
 */
public class CircleShape {
	  public static int boardWidth=500;
		public static int boardHeight=500;

    public double radius;     // The radius of the circle.
    public double x,y;       // The location of the center of the circle.
    public Color color;   // The color of the circle.
		protected double vx=20;
		protected double vy=10;

    /**
     * Create a CircleShape with a given location and radius and with a
     * randomly selected, semi-transparent color.
     * @param x   The x coordinate of the center.
     * @param y   The y coordinate of the center.
     * @param radius       The radius of the circle.
     */
    public CircleShape( double x, double y, int radius ) {
        this.x = x;
        this.y = y;
        this.radius = radius;

        this.color = new Color(200,200,200,100); // transparent light gray

    }

		/**
				create a circle with a random position and velocity and color and radius
		*/
		public CircleShape() {
			  this(0,0,10);
				this.x = (int)(500*Math.random());
				this.y = (int)(500*Math.random());
			  this.radius = 10 + (int)(40*Math.random());
				this.vx = (int)(50*Math.random()-25);
				this.vy = (int)(50*Math.random()-25);
		}

    /**
     * Draw the disk in graphics context g, with a black outline.
		 * Its posiion is given by doubles so we have to convert them to integers!
		 * Remember that the draw/fillOval methods take the upper left corner (u,v)
		 * and the width (w) and height (h) of the smallest box enclosing the oval.
     */
    public void draw( Graphics g ) {
				int u = (int)(x-radius);
				int v = (int)(y-radius);
				int w = (int)(2*radius);
				int h = w;
        g.setColor( color );
        g.fillOval( u,v,w,h );
        g.setColor( Color.BLACK );
        g.drawOval(u,v,w,h );
    }

		/**
		    update the position of the circleShape after dt seconds
				@param dt the number of seconds for the update (e.g. 0.02)
		*/
		public void update(double dt){
			// change the properties of the CircleShape after dt seconds have elapsed.
			this.x += dt*vx;  // for now they do not move
			this.y += dt*vy;

			this.keepOnBoard();
		}

		public String toString(){
			return "circle("+this.x+","+this.y+","+this.radius+")";
		}

		/**
			change the values of x,y,vx,vy to keep the circle on the board
		*/
		public void keepOnBoard(){
			if (this.x < this.radius) {
				// it went off the left edge! do something!
        this.vx = -this.vx;
				this.x = this.radius;

			}else if (this.x > CircleShape.boardWidth-this.radius) {
				// it went off the right edge! do something!
        this.vx = -this.vx;
				this.x = CircleShape.boardWidth-this.radius;
			}

			if (this.y < this.radius){
				// it went above the top edge!
        this.vy = -this.vy;
				this.y = this.radius;

			} else if (this.y > CircleShape.boardHeight-this.radius) {
				// it went below the bottom edge!
        this.vy = -this.vy;
				this.y = CircleShape.boardHeight-this.radius;
			}
		}
}
