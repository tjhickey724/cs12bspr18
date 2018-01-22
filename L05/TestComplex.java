public class TestComplex{
  public static void main(String[] args){
    Complex z = new Complex(1,2);
    Complex w = new Complex(3,1);
    Complex r = new Complex(7);
    Complex u = Complex.add(z,w);
    Complex v = Complex.multiply(z,w);

    System.out.println("z="+z);
    System.out.println("w="+w);
    System.out.println("r="+r);
    System.out.println("z+w="+u);
    System.out.println("z*w="+v);
  }
}
