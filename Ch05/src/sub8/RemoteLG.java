package sub8;

public class RemoteLG implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Lg - PowerOn..");
	}

	@Override
	public void powerOff() {
		System.out.println("Lg - PowerOff..");
	}

	@Override
	public void chUp() {
		System.out.println("Lg - chUp..");
	}

	@Override
	public void chDown() {
		System.out.println("Lg - chDown..");
	}

	@Override
	public void soundUp() {
		System.out.println("Lg - soundUp..");
	}

	@Override
	public void soundDown() {
		System.out.println("Lg - soundDown..");
	}

}
