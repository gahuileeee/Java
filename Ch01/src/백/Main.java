package 백;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static int a;
	public static Deque<Integer> q= new ArrayDeque<>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer (br.readLine());
		BigInteger a= new BigInteger(st.nextToken());
		BigInteger b= new BigInteger(st.nextToken());
		BigInteger c= new BigInteger(st.nextToken());
		BigInteger k= new BigInteger("2");
		
		if(b.remainder(k)==new BigInteger("0")) {
			b=b.divide(k);
			String bb=String.valueOf(b);
			int ff=Integer.parseInt(bb);
			BigInteger aa= new BigInteger("1");
			for(int i=0; i<ff; i++) {
				aa=aa.multiply(a);
			}
			aa=aa.multiply(aa);
			System.out.println(aa);
			System.out.println(aa.remainder(c));
		}else {
			b=b.divide(k);
			String bb=String.valueOf(b);
			int ff=Integer.parseInt(bb);
			BigInteger aa= new BigInteger("1");
			for(int i=0; i<ff; i++) {
				aa=aa.multiply(a);
			}
			aa=aa.multiply(aa);
			aa=aa.multiply(a);
			
			System.out.println(aa.remainder(c));
		}
	}
}
