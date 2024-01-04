package sub8;

public interface RemoteControl {
	// 오로지 추상 method만 선언함.
	public void powerOn();
	public void powerOff();
	
	// 인터페이스의 method는 어차피 추상 method이기 때문에 abstract 키워드 빼도 됨.
	public abstract void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();
	
}
