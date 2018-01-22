public class Complex{
  public double re;
  public double im;

  public Complex(double re, double im){
    this.re = re;
    this.im = im;
  }

  public Complex(double re){
    this.re = re;
    this.im = 0;
  }

  public static Complex add(Complex u, Complex v){
    Complex z = new Complex(u.re+v.re, u.im+v.im);
    return z;
  }

  public String toString(){
    return this.re+"+"+this.im+"i";
  }
}
