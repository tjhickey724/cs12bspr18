public class TestQuadratic {
  public static double[] quadraticRoots(double a, double b, double c){
    double d = b*b-4*a*c;
    if (d<0) {
      double[] result = {};
      return result;
    } else if (d==0){
      double[] result = {-b/(2*a)};
      return result;
    } else {
      double x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
      double x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
      double[] xs = {x1,x2};
      return xs;
    }
  }
}
