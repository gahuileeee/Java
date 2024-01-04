package sub8;

public class Cable implements Socket {
	
	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb= bulb;
	}
	
	@Override
	public void switchOff() {
		bulb.lightOn();
	}
	
	@Override
	public void switchOn() {
		bulb.lightOff();
	}
}
