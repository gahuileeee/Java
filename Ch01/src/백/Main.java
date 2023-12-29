package 백;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int [] brr;
	static StringBuffer sb = new StringBuffer();
	static int [] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int [M];
		brr = new int [N];
		st= new StringTokenizer(br.readLine());
		for(int i=0 ; i<N; i++)
		{
			brr[i]=Integer.parseInt(st.nextToken());
		} //입력 다 받음
		Arrays.sort(brr);
		methodA(0);
		System.out.println(sb.toString());
		
	}
	public static void methodA(int i) {
		int j;
		if(i==M) {
			for(i=0; i<M; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
	
		for(j=0; j<N; j++) {
			arr[i]=brr[j];
			if(promising(i, j)) {
				methodA(i+1);
			}
		}
	} // methodA 종료
	
	public static boolean promising(int i, int j) {
		if( i==0) return true;
		else if(arr[i-1]<brr[j]) return true;
		else return false;
	}
}
