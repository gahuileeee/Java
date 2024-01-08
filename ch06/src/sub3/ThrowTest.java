package sub3;
/*
 * ��¥ : 2024-01-08
 * �̸� : �̰���
 * ���� : Java ���� �߻� ��Ű��
 */
class MinusException extends Exception{
	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception{
	public OverException(String msg) {
		super(msg);
	}
}

class Score{
	public void check(int score) throws MinusException, OverException {
		if(score<0) {
//			���� �߻���Ű��
			throw new MinusException("������ ������ �� �� �����ϴ�.");
		}else if(score>100) {
//			���� �߻���Ű��
			throw new OverException("������ 100���� �ʰ��� �� �����ϴ�.");
		}else {
			System.out.println("������ �̻� �����ϴ�.");
		}
	}
}
public class ThrowTest {

	
	public static void main(String[] args) {
		
		Score score = new Score();
		
		try {
//			score.check(-3);
//			score.check(102);
			score.check(92);
		}catch (MinusException | OverException e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ����...");
		
	}

}
