
public class CarApp {
	public static void main(String[] args){
		
		Car myCar = new Car();
		Car yourCar = new Car();
		myCar.setStatus("Starting");
		myCar.setColor("red");
		myCar.setModel("porsche");
		myCar.setSpeed(50);
		
		System.out.println(myCar.getDisplayDescription());
	    myCar.display();
	    myCar.setStatus("accelerating");
	    myCar.display();
	    myCar.displayspeed();
	    myCar.setStatus("slowing down");
	    myCar.display();
		myCar.setStatus("stopped");
		myCar.displaystop();
		System.out.println();
		 yourCar.setStatus("Starting");
		 yourCar.setColor("blue");
		 yourCar.setModel("toyota");
		 yourCar.setSpeed(40);
			
			System.out.println(yourCar.getDisplayDescription());
			yourCar.display();
			yourCar.setStatus("accelerating");
			yourCar.display();
			yourCar.displayspeed();
			yourCar.setStatus("slowing down");
			yourCar.display();
			yourCar.setStatus("stopped");
			yourCar.displaystop();
			
		
		

}
}
