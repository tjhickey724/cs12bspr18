public class TestComplex{
  public static void main(String[] args){
    Complex z = new Complex(1,2);
    Complex z2 = new Complex(1,2);
    System.out.println("z==z2: "+ (z==z2));
    System.out.println("z.equals(z2): "+
         (z.equals(z2)));
    Complex w = new Complex(3,1);
    Complex r = new Complex(7);
    Complex u = Complex.add(z,w);
    Complex v = Complex.multiply(z,w);

    System.out.println("z="+z);
    System.out.println("z.re="+z.getReal());
    System.out.println("w="+w);
    System.out.println("r="+r);
    // r.setImag(1.1); // can't do this !!!
    System.out.println("r="+r);
    System.out.println("z+w="+u);
    System.out.println("z*w="+v);
  }
}
