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
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		if(N==1) {
			System.out.println(1);
			System.exit(0);
		}
		A = br.readLine();
		count=0;
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
		while(end<=A.length()) {
			map.put(A.charAt(end), 0);
			if(map.size()<=N) {
				B+=A.charAt(end+1)+"";
				end++;
			}else {
				if(B.length()>count) {
					count=B.length();
				}
				char c= B.charAt(0);
				map.remove(c);
				while(true) {
					if(B.charAt(0)==c) {
						B=B.substring(1, B.length()-1);
					}else {
						break;
					}
				}
				end++;
			}
			
		}
		
	}
}