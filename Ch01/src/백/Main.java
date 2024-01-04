package 백;
/*
 * 백준 9465 스티커
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int [][] arr;
	static int [] brr;
	static StringBuffer sb= new StringBuffer();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		for(int te=0; te<test; te++) {
			n = Integer.parseInt(br.readLine());
			arr= new int [2][n];
			for(int i=0; i<2; i++) {
				StringTokenizer st =new StringTokenizer(br.readLine());
				for(int k=0; k<n ; k++) {
					arr[i][k]= Integer.parseInt(st.nextToken());
				}
			} //배열 받음
			
			
		} //전체 test문 종료
		System.out.println(sb.toString());
	}
	public static void move() {
		
	}
	public static void dp() {
		
	}
}