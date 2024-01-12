package test4;
/*
 * 날짜 : 2024-01-12
 * 이름 : 이가희
 * 내용 : 자바 문자열 연습문제
 */
public class Test04 {
	public static void main(String[] args) {
		String fileName = "HelloWrold.java";
		
		int idx = fileName.length();
		String title =  fileName.substring(0,10);
		String ext = fileName.substring(11,15);
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String [] scores = strScores.split(", ");
		
		int total = 0;
		
		for(String score : scores) {
			total += Integer.parseInt(score);
		}
		System.out.println("strScores 총점 : "+total);
	}

}
