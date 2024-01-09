package sub6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

//		Date class
		Date  date = new Date();
		System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result =format.format(date);
		System.out.println(result);
		
//		Calendar class -> 추상 클래스임.
//		Calendar cal = new Calendar(); 생성자 생성 안됨.
		Calendar cal = Calendar.getInstance();
		int yy   =cal.get(Calendar.YEAR);
		int mm   =cal.get(Calendar.MONTH)+1; //month가 0부터 시작하기 때문에 1을 더해야함.
		int dd   =cal.get(Calendar.DATE);
		int hour =cal.get(Calendar.HOUR);
		int min  =cal.get(Calendar.MINUTE);
		int sec  =cal.get(Calendar.SECOND);
		System.out.printf("%d-%02d-%02d %d:%d:%02d",yy,mm,dd,hour,min,sec);
	}
}
