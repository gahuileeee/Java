package 백;
// 고냥이 16472
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main2 {

	static StringBuffer sb = new StringBuffer();
	static int N;
	static String A;
//	static ArrayList<Character> list = new ArrayList<>();
	static Map<Character, Integer> map = new HashMap<>();
	static int count;
	static boolean all;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		A = br.readLine();
		count=0;
		all=true;
		two();
		System.out.println(count);
	}
	public static void two() {
		int start=0;
		int end=1;
		map.put(A.charAt(0),0);
		map.put(A.charAt(1),0);
		String B="";
		B+=A.charAt(0)+""+A.charAt(1);
		end++;
		while(end<A.length()) {
			map.put(A.charAt(end), 0);
			if(map.size()<=N) {
				B+=A.charAt(end)+"";
				end++;
			}else {
				if(B.length()>count) {
					count=B.length();
				}
				char c= B.charAt(0);
				map.remove(c);
				while(true) {
					int m=0;
					for(int i=0; i<B.length();i++) {
						if(B.charAt(i)==c) {
							m=i;
						}
					}
					B+=A.charAt(end)+"";
					B=B.substring(m+1,B.length());
					break;
				}
				all=false;
				end++;
			}
			
		}
		if(all) {
			count=B.length();
		}
		
	}
}