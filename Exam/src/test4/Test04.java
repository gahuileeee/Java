package test4;
/*
 * ��¥ : 2024-01-12
 * �̸� : �̰���
 * ���� : �ڹ� ���ڿ� ��������
 */
public class Test04 {
	public static void main(String[] args) {
		String fileName = "HelloWrold.java";
		
		int idx = fileName.length();
		String title =  fileName.substring(0,10);
		String ext = fileName.substring(11,15);
		
		System.out.println("���ϸ� : "+title);
		System.out.println("Ȯ���� : "+ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String [] scores = strScores.split(", ");
		
		int total = 0;
		
		for(String score : scores) {
			total += Integer.parseInt(score);
		}
		System.out.println("strScores ���� : "+total);
	}

}
