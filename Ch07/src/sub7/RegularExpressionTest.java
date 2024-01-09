package sub7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {
	
	public static void main(String[] args) {
		
		String pattern = "a[a-z]*";
		
		boolean r1 = Pattern.matches(pattern, "apple");
		boolean r2 = Pattern.matches(pattern, "banana");
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		// Á¤±ÔÇ¥Çö½Ä ÆĞÅÏ
		String[] patterns = {
			"[0-9]+",  	// ¼ıÀÚ 1°³ ÀÌ»ó
			"1[0-9]*", 	// 1·Î ½ÃÀÛÇÏ´Â ¼ıÀÚ 0°³ ÀÌ»ó
			"^[0-9]",  	// ¼ıÀÚ·Î ½ÃÀÛÇÏ´Â ¹®ÀÚ
			"[^0-9]",  	// ¼ıÀÚ°¡ ¾Æ´Ñ ¹®ÀÚ
			".",	   	// ¹®ÀÚ 1°³
			"[a-z]?",	// ¿µ¾î ¼Ò¹®ÀÚ 1°³
			"[a-z]*",	// ¿µ¾î ¼Ò¹®ÀÚ 0°³ ÀÌ»ó
			"[a-z]+",	// ¿µ¾î ¼Ò¹®ÀÚ 1°³ ÀÌ»ó
			"[A-Z]*",	// ¿µ¾î ´ë¹®ÀÚ 0°³ ÀÌ»ó
			"[°¡-ÆR]+",	// ÇÑ±Û 1ÀÚ ÀÌ»ó
			"^[0-9a-z]*",   // ¼ıÀÚ+¿µ¾î Á¶ÇÕ 0°³ ÀÌ»ó								
			"^[0-9°¡-ÆR]*",  // ¼ıÀÚ+ÇÑ±Û Á¶ÇÕ 0°³ ÀÌ»ó
			"^[A-Z][a-z]*", // ¿µ¾î ´ë¹®ÀÚ·Î ½ÃÀÛÇÏ´Â ¹®ÀÚ 0°³ ÀÌ»ó 
			"\\s",		// °ø¹é
			"\\S",		// °ø¹éÀÌ        ¾Æ´Ñ ¹®ÀÚ
			"\\d",		// ¼ıÀÚ
			"\\w",		// ¼ıÀÚ¿Í ¹®ÀÚ
			"\\W",		// Æ¯¼ö¹®ÀÚ
		};
		
		String[] words = {"apple", "123abc", "123456", "011ÇÑ±Û", "hello", "È«±æµ¿", "1", "Banana", "APPLE", "#"};
		
		for(String word : words) {
			
			System.out.print(word + " ¹®ÀÚ¿Í ÀÏÄ¡ÇÏ´Â ÆĞÅÏ : ");
			
			for(String ptt : patterns) {
				
				boolean result = Pattern.matches(ptt, word);
				
				if(result) {
					System.out.print(ptt + ", ");
				}
				
			}
			System.out.print("\n");
		}
		// ÀÚÁÖ »ç¿ëÇÏ´Â Á¤±ÔÇ¥Çö½Ä
				String input = "a101,È«±æµ¿,010-1234-1001,hong@gmail.com";

		        // ÆĞÅÏ Á¤ÀÇ
		        String ptt1 = "^[a-z][a-z0-9]{3,10}$"; // ¿µ¾î ¼Ò¹®ÀÚ 1ÀÚ·Î ½ÃÀÛÇÏ°í ¼Ò¹®ÀÚ, ¼ıÀÚ 3ÀÚ¸® ÀÌ»ó 10ÀÚ¸® ¹Ì¸¸
		        String ptt2 = "^[°¡-ÆR]*$";
		        String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})";
				String ptt4 = "(\\w+)@(\\w+).(\\w+)";

		        // ÆĞÅÏ ÄÄÆÄÀÏ
		        Pattern p1 = Pattern.compile(ptt1);
		        Pattern p2 = Pattern.compile(ptt2);
		        Pattern p3 = Pattern.compile(ptt3);
		        Pattern p4 = Pattern.compile(ptt4);

		        // Matcher »ı¼º
		        Matcher m1 = p1.matcher(input.split(",")[0]);
		        Matcher m2 = p2.matcher(input.split(",")[1]);
		        Matcher m3 = p3.matcher(input.split(",")[2]);
		        Matcher m4 = p4.matcher(input.split(",")[3]);

		        // ¾ÆÀÌµğ Ã£±â
		        System.out.print("¾ÆÀÌµğ : ");
		        while (m1.find()) {
		            System.out.println(m1.group());
		        }

		        // ÀÌ¸§ Ã£±â
		        System.out.print("ÀÌ¸§ : ");
		        while (m2.find()) {
		            System.out.println(m2.group());
		        }
		        
		        // ÈŞ´ëÆù Ã£±â
		        System.out.print("ÈŞ´ëÆù : ");
		        while (m3.find()) {
		            System.out.println(m3.group());
		        }
		        
		        // ÀÌ¸ŞÀÏ Ã£±â
		        System.out.print("ÀÌ¸ŞÀÏ : ");
		        while (m4.find()) {
		            System.out.println(m4.group());
		        }
		
	}
}