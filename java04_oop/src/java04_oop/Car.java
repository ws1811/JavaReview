package java04_oop;

public class Car {
	String model;
	int maxSpeed
	=200;
	String color;
	int speed;
	
	public Car() {	
		System.out.println("Car()생성자");
	}
	
	public Car(String model, String color) {
		this();
		this.model = model;
		this.color = color;
		System.out.println(this.model + "="+this.color + "=" +maxSpeed);
		
	}


	//break
	public void speedDown() {
		speed--;
		if(speed <0) speed = 0;
	}
	public void speedUp() {
		speed++;
		if(speed>maxSpeed)speed = maxSpeed;
				
	}
}
