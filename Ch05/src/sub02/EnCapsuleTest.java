package sub02;


public class EnCapsuleTest {
	
	public static void main(String[]args) {
//		객체 생성
		Car avante = new Car();
		
//		avante.name="아반태";
//		avante.color="흰색";
//		avante.speed=10;
//		private 접근 제한자가 있어 직접적인 접근이 불가능

//		캡슐화된 속성에 대한 초기화는 생성자에서 수행
		Car sonata = new Car("소나타","흰색",10);
		sonata.setName("소나타");
		sonata.setColor("흰색");
		sonata.setSpeed(20);
		sonata.show();
		
		System.out.println();
		Account kb = new Account("국민은행", "123-10-1001","이가희",1000);
		kb.deposit(9000);
		kb.withdraw(200);
		kb.show();
	}
}
