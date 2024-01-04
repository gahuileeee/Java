package 백;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main2 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		a=a/4;
		String b = "long ";
		for(int i=1; i<=a; i++) {
			
			if(i==a) {
				b+="int";
			}else {
				b+="long ";
			}
		}
		System.out.println(b);
	}
}
