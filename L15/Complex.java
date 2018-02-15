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

	/**
	* returns the complex conjugate a-bi of the complex number a+bi
	*/
	public Complex conj(){
		return new Complex(this.re, -this.im);
	}

  public Complex add(Complex v){
    Complex z = new Complex(this.re+v.re, this.im+v.im);
    return z;
  }

	public Complex sub(Complex v){
		Complex z = new Complex(this.re-v.re, this.im-v.im);
		return z;
	}

  public Complex multiply(Complex v){
    double real, imag;
    real = this.re*v.re - this.im*v.im;
    imag = this.re*v.im + this.im*v.re;
    Complex w = new Complex(real, imag);
    return w;
  }

  public String toString(){
    return this.re+"+"+this.im+"i";
  }
}
