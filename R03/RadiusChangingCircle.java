public class RadiusChangingCircle extends CircleShape{

  private double vr;

  public RadiusChangingCircle(){
    super();
  }

  public void update(double dt){
    // change the properties of the CircleShape after dt seconds have elapsed.
    this.x += dt*vx;  // for now they do not move
    this.y += dt*vy;
    this.radius += dt*vr;

    if  (this.radius <10) this.vr *= -1;
    else if (this.radius > 50) this.vr *= -1;

    this.keepOnBoard();
  }




}
