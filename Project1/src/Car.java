
public class Car {
	private String color;
	 private String model;
	 //private boolean insurance;
	 private double speed;
	 private String status;
	 
	 public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/*
     public String getCarID() {
			return carID;
		}
	 public void CarID(String carID ) {
			this.carID =  carID ;
		}
	 */

	public void programmedTest() {
		
	}
	 public String getDisplayDescription()
	 {
		 return "The car is a"+" "+color+" "+model ;
	
	 }
	 public void display(){
		 System.out.println("the car is "+ status );
		 
	 }
	 public void displayspeed(){
		 System.out.println("the car is going "+ speed+ " mph.");
	 }
	 public void displaystop(){
		 System.out.println("the car has "+ status);
	 }
//	 public Car (String color,String model,Double speed,String status)
//		{
//			 this.color= color;
//			 this.model=model;
//			 this.speed=speed;
//			 this.status=status;
//		}
	 
}
