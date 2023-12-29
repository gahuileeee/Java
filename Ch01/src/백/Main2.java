package 백;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main2 {
	static Set<String> set = new HashSet<>();
	static StringBuffer sb = new StringBuffer();
	static String a;
	static int k;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a= br.readLine();
		k=a.length();
	}
	public static void methodA() {
		int p=1;
		while(p<=k) {
			for(int i=p ;i<a.length(); i++) {
				
			}
			p++;
		}
	}
}
