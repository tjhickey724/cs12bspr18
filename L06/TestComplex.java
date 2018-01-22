public class TestComplex{
  public static void main(String[] args){
    Complex z = new Complex(5,5);
    Complex w = new Complex(1,2);
    Complex r = new Complex(5);
    Complex u = Complex.add(z,w);
    Complex v = Complex.multiply(z,w);
		Complex q = Complex.fromPolar(Math.sqrt(2),Math.PI/4);


    System.out.println("z="+z+" should be 5+5i");
    System.out.println("z.re="+z.getReal()+" should be 5");
    System.out.println("w="+w+" should be 1+2i");
    System.out.println("r="+r+" should be 5+0i");

		System.out.println("q="+q+" should be 1+i");
		System.out.println("q="+q.getReal()+ "+"+ q.getImag()+"i"+" should be 1+i");
		System.out.println("q=polar("+ q.getR() +","+  q.getTheta()  +")"+
		    "should be polar(1.414..., 0.785...)");

    System.out.println("z+w="+u+" should be 6+7i");
    System.out.println("z*w="+v+" should be -5 + 15i");
		System.out.println("z-w="+Complex.subtract(z,w)+" should be 4+3i");
		System.out.println("z/w="+Complex.divide(z,w)+ " should be 3-i");
		System.out.println("w'="+Complex.conjugate(w)+ " should be 1-2i");
		System.out.println("norm(w)="+Complex.norm(w)+ " should be sqrt(5)=2.236...");
  }
}
