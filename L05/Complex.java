public class Complex{
  private double re;
  private double im;

  public Complex(double re, double im){
    this.re = re;
    this.im = im;
  }

  public Complex(double re){
    this.re = re;
    this.im = 0;
  }

  /**
  returns the real part of the complex number z
  called as  double r = z.getReal();
  */
  public double getReal(){
    return this.re;
  }
  public double getImag(){
    return this.im;
  }
  /**
  changes the real part of a complex number z
  called as z.setReal(1.1);
  */
  private void setReal(double re){
    this.re = re;
  }
  private void setImag(double im){
    this.im=im;
  }

  public boolean equals(Complex z){
     return (z.re==this.re) && (z.im==this.im);
  }

  /**
  adds two complex numbers to get a complex number
  called as Complex w = Complex.add(u,v);
  */
  public static Complex add(Complex u, Complex v){
    Complex z = new Complex(u.re+v.re, u.im+v.im);
    return z;
  }

  public static Complex multiply(Complex u, Complex v){
    double real, imag;
    real = u.re*v.re - u.im*v.im;
    imag = u.re*v.im + u.im*v.re;
    Complex w = new Complex(real, imag);
    return w;
  }

  /**
  returns a string representation of the objext z
  called as z.toString()
  */
  public String toString(){
    return this.re+"+"+this.im+"i";
  }
}
