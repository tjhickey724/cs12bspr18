public class DrawTest{
  public static void main(String[] args){
    Drawable x = new Drawer1();
  }

  static class Drawer1 implements Drawable{
    void draw(Graphics g) {
                   g.setColor(Color.RED);
                   g.fillRect(10,10,100,100);
              }
  }

}
