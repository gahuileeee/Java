package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.141592653");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		String str1 = String.valueOf(value1);
		String str2 = String.valueOf(value2);
		String str3 = String.valueOf(value3);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
