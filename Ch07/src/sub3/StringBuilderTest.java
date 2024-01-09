package sub3;
/*
 * 날짜 : 2024-01-09
 * 이름 : 이가희
 * 내용 : StringBuilder class 실습
 */
public class StringBuilderTest {

	public static void main(String[] args) {
//		String 불변성 (immutable)
		String str = "Hello";
		System.out.println("str 객체 주소 : "+ System.identityHashCode(str));
		
		str+=" World";
		System.out.println("str 객체 주소 : "+System.identityHashCode(str));
		
		System.out.println("str : "+str);
		
//		String immutable 단전을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb객체 주소 : "+ System.identityHashCode(sb));
		sb.append(" Wolrd");
		System.out.println("sb객체 주소 : "+System.identityHashCode(sb));
		
		System.out.println("sb : "+sb);
	}
}
