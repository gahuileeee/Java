package sub01;
/* 
 * 날짜 : 2024-01-02
 * 이름 : 이가희
 * 내용 : Java 클래스 실습
 */
public class ClassText {

	public static void main(String[]args) {


//		객체 생성 후 객체 초기화
		Car sonata = new Car();
		sonata.name= "소나타";
		sonata.color= "흰색";
		sonata.speed= 0;
		
//		객체 상호작용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
//		객체 생성과 동시에 초기화, 상호작용
		System.out.println();
		Car avante = new Car("아반태","검은색",0);
		avante.speedUp(80);
		avante.speedDown(20);
		avante.show();
		
//		Account 객체 생성/ 초기화/ 상호작용
		System.out.println();
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id="101-12-00112";
		kb.name="이가희";
		kb.balance= 10000;
		
		kb.deposit(40000);
		kb.withdraw(3000);
		kb.show();
	}
}
