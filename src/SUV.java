
public class SUV extends Car{

	public SUV(String name, String colour, int model, boolean isManual) {
		super(name, "SUV", colour, model, 5, isManual);
		
	}

	public void accelerate(int rate) {
		int newSpeed = getCurrentSpeed() +rate;
		
		/*
		*speed =0 : gear 1
		*speed =0 - 30 : gear 1
		*speed =30 - 50 : gear 2
		*speed =50 - 70 : gear 3
		*speed =70 - 100 : gear 4
		*speed > 100  : gear 5
		*/
		if(newSpeed == 0 ) {
			stop();
			changeGear(0);
		}else if(newSpeed > 0 && newSpeed <=30) {
			changeGear(1);
		}else if(newSpeed > 30 && newSpeed <=50) {
			changeGear(2);
		}else if(newSpeed > 50 && newSpeed <=70) {
			changeGear(3);
		}else if(newSpeed > 70 && newSpeed <=100) {
			changeGear(4);
		}else{
			changeGear(5);
		}
		
		if(newSpeed >0) {
			changeSpeed(newSpeed);
		}
		
	}
	

}
