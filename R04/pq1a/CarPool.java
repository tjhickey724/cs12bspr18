package pq1a;

/**
The CarPool class represent a carpooling vehicle.
It has a constructor that allows you to create a Carpool by specifying
<ul>
<li> The name of the owner of the car, e.g. "Tim Hickey"</li>
<li> The pick up place, e.g. "Coolidge Corner"</li>
<li> The pick up time  e.g. "8 am"</li>
<li> The departure time, e.g. "5 pm"</li>
<li> The number of possible carpoolers e.g. 4</li>
</ul>
These values should be stored in private instance variables.
You should write the constructor to create a carpool object from this information,
e.g.
CarPool car = new CarPool("Tim Hickey","Coolidge Corner","8 am","5 pm", 4);

You should write the following instance methods:

toString() method which will produce the following String
representation for the object:
car.toString() -->
carpool(Tim Hickey leaves Coolidge Corner at 8 am returns 5 pm has 4 available seats)

addRider(k) --> which decreases the number of available seats by k

removeRider(k) --> which increases the number of available seats by k

getAvailableSeats() --> which returns the number of available getAvailableSeats

*/


public class CarPool{
	private String owner;
	private String origin;
	private String pickup;
	private String departure;
	private int spaces;
	private String[] riders;
	private int numRiders=0;

	public CarPool(String owner, String origin, String pickup, String departure, int spaces){
		this.owner = owner;
		this.origin = origin;
		this.pickup = pickup;
		this.departure = departure;
		this.spaces = spaces;
		this.riders = new String[spaces];
	}

	public void addRider(String s) throws Exception{
		if (spaces==0) throw new Exception("can't add rider to a full car");
		riders[numRiders]=s;
		numRiders++;
		spaces--;
	}

	public void removeRider(String s) throws Exception{
		if (numRiders==0) throw new Exception("can't remove rider from empty car");
		for(int i=0; i<numRiders; i++){
			if (riders[i].equals(s)){
				if(numRiders == 1){
					numRiders=0;
				}else {
					riders[i] = riders[numRiders-1];
					numRiders--;
				}
			}
		}
		spaces++;
	}

	public int getAvailableSeats(){
		return this.spaces;
	}

	private String[] getCurrentRiders(){
		String[] current = new String[numRiders];
		for(int i=0; i<numRiders; i++){
			current[i]=riders[i];
		}
		return current;
	}

	public String toString(){
		return
		    "carpool("+this.owner+ " leaves "+this.origin +
		    " at "+this.pickup+" returns "+this.departure+
				" has "+this.spaces+" available seats" +
				" riders are " + java.util.Arrays.toString(getCurrentRiders());
	}

}
