public class TestComplex{
  public static void main(String[] args){
    Complex z = new Complex(1,2);
    Complex w = new Complex(3,1);
    Complex r = new Complex(7);
    Complex u = z.add(w);
    Complex v = z.multiply(w);
		Complex s = z.multiply(z.conj());
		Complex t = z.add(w).multiply(z.sub(w)).add(r.multiply(r));

    System.out.println("z="+z);
    System.out.println("w="+w);
    System.out.println("r="+r);
    System.out.println("z+w="+u);
    System.out.println("z*w="+v);
		System.out.println("z*conj(z)"+s);
		System.out.println("(z+w)*(z-w)+r*r="+t);
  }
}
