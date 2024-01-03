package sub4;
/* 
 * 날짜: 2024/01/03
 * 이름: 이가희
 * 내용: Java 상속 실습
 */

public class InheritanceTest {

	public static void main(String[] args) {
		// Car 상속 객체 생성
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(80);
		sonata.speedTurbo();
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0,0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		StockAccount kb = new StockAccount("국민은행", "352-1357-9551-03", "홍길동", 100000, "삼성전자", 2000, 1);
		kb.deposit(1000000);
		kb.buy(10,500);
		kb.sell(5, 500);
		kb.show();
	}

}
