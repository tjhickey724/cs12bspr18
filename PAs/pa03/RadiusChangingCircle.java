package pa03;


/**
 * RadiusChangingCircles are yellow circles which move at a constant velocity
 * on the board and bounce off the edges, but whose radius grows and shrinks.
*/
public class RadiusChangingCircle extends CircleShape{

  private double vr=1.0;

	/**
	 * create a radius changing circle and set the color to yellow
	 */
  public RadiusChangingCircle(){
    super();
		this.color = new java.awt.Color(0,0,255,100); // transparent blue
  }

	/**
	 * update the circle as usual, but also change the radius. If it gets too big,
	 * then start it shrinking, if it gets too small then start it growing.
	 */
  public void update(double dt){
    // change the properties of the CircleShape after dt seconds have elapsed.

		this.radius += dt*vr;

    if  (this.radius <10) this.vr *= -1;
    else if (this.radius > 50) this.vr *= -1;
		super.update(dt);
  }




}
