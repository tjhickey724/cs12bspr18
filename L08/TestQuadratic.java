public class TestQuadratic {
  public static void main(String[] args){
    if (args.length!=3){
      System.out.println("Usage: java TestQuadratic a b c");
      return;
    }
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    double[] roots = quadraticRoots(a,b,c);
    System.out.println("the roots are");
    for (int i=0; i<roots.length; i++){
      System.out.println("x="+roots[i]);
    }
    System.out.println("bye");
  }

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
