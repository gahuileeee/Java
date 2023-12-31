package sub2;

public class DataTypeTest {
/*
 *	날짜: 2023/12/26 
 *	이름: 이가희 
 * 	내용: Ch02.Java 자료형 실습
 * 
 * 자료형 (DataType)
 * - 변수에 저장되는 데이터의 종류와 크기를 나타내는 키워드
 * - 자료형은 기본형과 참조형으로 구분
 */
	public static void main(String[] args) {
//		정수형
		byte num1 = 127;
		short num2 = 32767;
		int num3= 2147483647;
		long num4= 9223372036854775807L;
		System.out.println("num1 :" +num1);
		System.out.println("num2 :" +num2);
		System.out.println("num3 :" +num3);
		System.out.println("num4 :" +num4);
		System.out.println();
//		실수형
		float var1 = 0.123456789f;
		double var2 = 0.1234567789123456789;
		
		System.out.println("var1 : " +var1);
		System.out.println("var2 : " +var2);
		System.out.println();
		
//		논리형
		boolean  valu1 = true; //숫자로는 1
		boolean  valu2 = false; //숫자로는 0
		System.out.println("valu1 : "+ valu1);
		System.out.println("valu2 : " +valu2);
		System.out.println();
//		문자형
		char c1 = 'A';
		char c2 = '가';
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		System.out.println();
		
//		문자열
		String str1 ="A";
		String str2="가";
		String str3="Apple";
		String str4="가을";
		System.out.println("str1 : "+ str1);
		System.out.println("str2 : "+ str2);
		System.out.println("str3 : "+ str3);
		System.out.println("str4 : "+ str4);
	}

}
