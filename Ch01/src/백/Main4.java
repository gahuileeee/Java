package 백;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main4  {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuffer sb= new StringBuffer();
		public static void main(String[] args) throws NumberFormatException, IOException {
			int a = Integer.parseInt(br.readLine());
			System.out.println(methodA(a));
		}
		public static int methodA(int a) {
			for(int i=0; i<=1000000; i++) {
				String b = String.valueOf(i);
				int c=Integer.parseInt(b);
				for(int k=0; k<b.length(); k++) {
					String bb = String.valueOf(b.charAt(k));
					c+=Integer.parseInt(bb);
				}
				if(c==a) {
					return Integer.parseInt(b);
				}
			}
			return 0;
		}
	}
		

