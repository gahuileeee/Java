package sub4;
/* 
 * ��¥: 2024/01/03
 * �̸�: �̰���
 * ����: Java ��� �ǽ�
 */

public class InheritanceTest {

	public static void main(String[] args) {
		// Car ��� ��ü ����
		Sedan sonata = new Sedan("�ҳ�Ÿ","���",0,2000);
		sonata.speedUp(80);
		sonata.speedTurbo();
		sonata.show();
		
		Truck bongo = new Truck("����", "����", 0,0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		StockAccount kb = new StockAccount("��������", "352-1357-9551-03", "ȫ�浿", 100000, "�Ｚ����", 2000, 1);
		kb.deposit(1000000);
		kb.buy(10,500);
		kb.sell(5, 500);
		kb.show();
	}

}
