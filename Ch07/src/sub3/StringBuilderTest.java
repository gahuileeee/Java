package sub3;
/*
 * ��¥ : 2024-01-09
 * �̸� : �̰���
 * ���� : StringBuilder class �ǽ�
 */
public class StringBuilderTest {

	public static void main(String[] args) {
//		String �Һ��� (immutable)
		String str = "Hello";
		System.out.println("str ��ü �ּ� : "+ System.identityHashCode(str));
		
		str+=" World";
		System.out.println("str ��ü �ּ� : "+System.identityHashCode(str));
		
		System.out.println("str : "+str);
		
//		String immutable ������ ������ StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb��ü �ּ� : "+ System.identityHashCode(sb));
		sb.append(" Wolrd");
		System.out.println("sb��ü �ּ� : "+System.identityHashCode(sb));
		
		System.out.println("sb : "+sb);
	}
}
