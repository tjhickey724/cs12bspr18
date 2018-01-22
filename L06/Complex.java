public class Complex{
  private double re;
  private double im;

	/**
	create a complex number by specifying the real and imaginary parts
	*/
  public Complex(double re, double im){
    this.re = re;
    this.im = im;
  }

	/**
	create a complex number with no imaginary part, i.e. a real number in the complexes
		*/
  public Complex(double re){
		// inside a constructor the "this" variable acts as a constructor call!
		// usually we create one most general constructor, and then use this(....)
		// in all the other constructors.
		this(re,0);
  }

	/**
	the default constructor with no parameters, returns 0+0i
	*/
	public Complex(){
		// if you add any constructor, then the default constructor
		// no longer works and you have to define it explicitly if you want to use it
		this(0,0);
	}

  /**
  returns the real part of the complex number z
  called as  double r = z.getReal();
  */
  public double getReal(){
    return this.re;
  }
	/**
	returns the imaginary part of the complex number
	*/
	public double getImag(){
    return this.im;
  }
	/**
	returns the magnitude, r, of the complex number in polar coordinates
	*/
	public double getR(){
		return Math.sqrt(this.re*this.re + this.im*this.im);
	}
	/**
	returns the complex angle, theta, in polar coordinates
	*/
	public double getTheta(){
		return Math.atan2(this.im,this.re);
	}
  /**
  changes the real part of a complex number z
  called as z.setReal(1.1);
	if we always use this in our code, then we can easily switch
	representations without having to rewrite our public methods
  */
  private void setReal(double re){
    this.re = re;
  }
	/**
	changes the imaginary part of a complex number z
	*/
	private void setImag(double im){
    this.im=im;
  }


	/**
	returns a complex number given the polar coordinates r and theta
	*/
	public static Complex fromPolar(double r, double theta){
		// this is a Factory Method which creates a Complex number
		// given the polar coordinates of that number
		double re = r*Math.cos(theta);
		double im = r*Math.sin(theta);
		return new Complex(re,im);
	}

	/**
	tests to see if a Complex object z is equal to this object
	*/
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

	/**
  adds two complex numbers to get a complex number
  called as Complex w = Complex.add(u,v);
  */
  public static Complex subtract(Complex u, Complex v){
    Complex z = new Complex(u.re-v.re, u.im-v.im);
    return z;
  }

	/**
	multiplies two complex nunbers and returns the result
	*/
  public static Complex multiply(Complex u, Complex v){
    double real, imag;
    real = u.re*v.re - u.im*v.im;
    imag = u.re*v.im + u.im*v.re;
    Complex w = new Complex(real, imag);
    return w;
  }

	public static Complex conjugate(Complex u){
		return new Complex(u.getReal(),-u.getImag());
	}

	public static double norm(Complex u){
		return Math.sqrt(u.re*u.re + u.im*u.im);
	}

	/**
	divides two complex nunbers and returns the result
	It uses u/v = u*v1/(v*v1) = u*v1/d = u*v1*(1/d)
	where v1 is the complex conjugate of v and d = v*v1 is the norm
	*/
  public static Complex divide(Complex u, Complex v){
		Complex v1 = Complex.conjugate(v);
		Complex uv1 = Complex.multiply(u,v1);
		double d = Complex.norm(v);
		Complex dInv = new Complex(1/(d*d));
		return Complex.multiply(uv1,dInv);
  }

  /**
  returns a string representation of the objext z
  called as z.toString()
  */
  public String toString(){
    return this.re+"+"+this.im+"i";
  }
}
