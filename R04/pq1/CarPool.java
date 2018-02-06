package pq1;

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
