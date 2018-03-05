public class Real extends Complex{
  public Real(double r){
    //super(r,0);
    super();
    this.re=r;
    this.im=0;
  }

  public Real(){
    super();
  }

  public static void main(String[] args){
    Real x = new Real();
    System.out.println(x);
  }
}
