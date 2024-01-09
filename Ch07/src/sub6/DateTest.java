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
		
//		Calendar class -> �߻� Ŭ������.
//		Calendar cal = new Calendar(); ������ ���� �ȵ�.
		Calendar cal = Calendar.getInstance();
		int yy   =cal.get(Calendar.YEAR);
		int mm   =cal.get(Calendar.MONTH)+1; //month�� 0���� �����ϱ� ������ 1�� ���ؾ���.
		int dd   =cal.get(Calendar.DATE);
		int hour =cal.get(Calendar.HOUR);
		int min  =cal.get(Calendar.MINUTE);
		int sec  =cal.get(Calendar.SECOND);
		System.out.printf("%d-%02d-%02d %d:%d:%02d",yy,mm,dd,hour,min,sec);
	}
}
