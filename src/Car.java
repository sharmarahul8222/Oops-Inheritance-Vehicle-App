
public class Car extends Vehicle{
	
		
	private String type;
	private String colour;
	private int model;
	private int gears;
	private boolean isManual;
	private int currentGear; 

	public Car(String name, String type, String colour, int model, int gears, boolean isManual) {
		super(name);
		this.type=type;
		this.colour=colour;
		this.model=model;
		this.gears=gears;
		this.isManual=isManual;
		currentGear=1;
		
	}
	
	public void changeGear(int newGear) {
		this.currentGear=newGear;
		System.out.println("changeGear Method is called: Now Gear is changed to "+currentGear);
	}
	
	public void changeSpeed(int newSpeed) {
		move(newSpeed);
		System.out.println("currentSpeed method is called: Speed is "+newSpeed);
	}
	
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	
	
}
