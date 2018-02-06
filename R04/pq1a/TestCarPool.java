package pq1a;

public class TestCarPool {
	static CarPool[] cars = new CarPool[100];
	static int numCars = 0;
	public static void main(String[] args) throws Exception{
		TestCarPool.initCars();
		System.out.println("\n\nInitial Cars");
		TestCarPool.printCars();

		System.out.println("\n\nLoad the Cars");
		TestCarPool.loadCars();
		TestCarPool.printCars();

		System.out.println("\n\nChange the Riders");
		TestCarPool.changeCars();
		TestCarPool.printCars();
	}

	public static void initCars(){
		TestCarPool.cars[0] = new CarPool("Tim Hickey","Coolidge Corner","8 am","5 pm",4);
		TestCarPool.cars[1] = new CarPool("Pito Salas","Lexington Center","10 am","6 pm",4);
		TestCarPool.cars[2] = new CarPool("Bruno Mars","Harvard Square","11 am","9 pm",2);
		TestCarPool.numCars=3;

	}

	public static void loadCars() throws Exception{
		cars[0].addRider("William Tarimo");
		cars[0].addRider("Qun Ju");
		cars[1].addRider("Donald Smith");
		cars[1].addRider("Jordan Pollack");
		cars[2].addRider("Anne Gudaitis");
	}

	public static void changeCars() throws Exception{
		cars[0].addRider("Maria Miara");
		cars[1].removeRider("Donald Smith");
		cars[2].removeRider("Anne Gudaitis");
	}

	public static void printCars(){
		for(int i=0; i<TestCarPool.numCars; i++){
			if (cars[i].getAvailableSeats()>0){
				System.out.printf("car #%d: %s\n",i,TestCarPool.cars[i]);
			}
		}

	}
}
