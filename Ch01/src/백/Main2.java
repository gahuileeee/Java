package 백;
/*
 * 평범한 배낭 12865
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

class xy {
	int x;
	int y;
	xy(int x, int y){
		this.x=x;
		this.y=y;
	}
}
public class Main2 {
	static int N;
	static int K;
	static xy arr [];
	static int sum [];
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N= Integer.parseInt(st.nextToken());
		K= Integer.parseInt(st.nextToken());
		arr = new xy [N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int a =Integer.parseInt(st.nextToken());
			int b =Integer.parseInt(st.nextToken());
			arr[i]=new xy(a,b);
		}
	
	}
	
	public static void dp() {
		
	}
}