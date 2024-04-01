
public class TwoWheeler extends Scooter{

	public TwoWheeler(String name, String colour, int model, boolean isManual) {
		super(name, "TwoWheeler", colour, model, 4, isManual);
		
	}
	
	public void accelerate(int rate) {
		int newSpeed= getCurrentSpeed() + rate;
		
		/*
		*speed =0 : gear 1
		*speed =0 - 20 : gear 1
		*speed =20 - 40 : gear 2
		*speed =40 - 60 : gear 3
		*speed >60 : gear 4
		*/
		if(newSpeed == 0 ) {
			stop();
			changeGear(0);
		}else if(newSpeed >0 && newSpeed <=20) {
			changeGear(1);
		}else if(newSpeed >20 && newSpeed <=40) {
			changeGear(2);
		}else if(newSpeed >40 && newSpeed <=60) {
			changeGear(3);
		}else{
			changeGear(4);
		}
		
		if(newSpeed >0) {
			changeSpeed(newSpeed);
		}
	}
	
	

}
