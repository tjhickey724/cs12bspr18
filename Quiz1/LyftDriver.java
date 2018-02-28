public class LyftDriver{
  private double totalPay;
  private int numRides;
  private double distanceFee, pickupFee, timeFee;
  private String name;
  private int id;

  public LyftDriver(String name, int id,
      double p, double d, double t){
        this.name = name;
        this.id = id;
        this.distanceFee =d;
        this.pickupFee = p;
        this.timeFee = t;
  }

  public void completeRide(int passengerId, double distance, double time){
    numRides++;
    totalPay += pickupFee + distance*distanceFee + time*timeFee;
  }

  public String toString(){
    return "driver("+name+","+id+","+totalPay+","+numRides+")";
  }

  public double getTotalPay(){
    return totalPay;
  }

  public int getNumRides(){
    return numRides;
  }
}
