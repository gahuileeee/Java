package sub8;

/* 날짜 : 2024-01-04
 * 이름 : 이가희
 * 내용 : 인터페이스 실습
 */


	class Computer{
		public void boot() {
			System.out.println("시스템 부팅..");
		}
	}
	
	interface Internet{
		public void access();
	}
	interface Audio{
		public void access2();
	}
	class Tv extends Computer implements Internet,Audio{
		@Override
		public void access() {
			System.out.println("인터넷 접속..");
		}
		@Override
		public void access2() {
			System.out.println("오디오 시청..");
		}
		public void show() {
			System.out.println("Tv 시청..");
		}
	}


public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스 예제 1 - 표준화된 클래스 설계
			RemoteControl lg = new RemoteLG();
			lg.powerOn();
			lg.chUp();
			lg.soundDown();
			lg.powerOff();
			
			RemoteControl s = new RemoteSamsung();
			s.powerOn();
			s.chDown();
			s.soundDown();
			s.powerOff();
		
		// 인터페이스 예제 2 - 유연성 (결합도 완화)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		socket.switchOn();
		socket.switchOff();
		
		// 인터페이스 예제 3 - 다중 상속 효과
		Tv smartTv = new Tv();
		//Computer smartTv = new Tv(); boot 제외하고 되지 않음.
		smartTv.boot();
		smartTv.access();
		smartTv.access2();
		smartTv.show();
	}
}
