
public class Vehicle {
	
	private String name;
	private int currentSpeed;
		
	
	public Vehicle(String name) {
		super();
		this.name = name;
		this.currentSpeed = 0;
	}

	public void move(int speed) {
		currentSpeed= speed;
		System.out.println("Move method is called: Moving at speed "+currentSpeed);
	}
	
	public void stop() {
		this.currentSpeed=0;
		System.out.println("Now Vehicle is stop");
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	
	
}
