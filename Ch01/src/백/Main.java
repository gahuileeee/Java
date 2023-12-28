package 백;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static int N;
	public static int M; 
	public static int [] arr;
	public static int [][] brr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer (br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int [N+1];
		for(int i=1; i<arr.length; i++) {
			arr[i]=i;
		}
		brr = new int [N][M];
		
		}
	public static void backTraking() {
		int start =1;
		for(int i=1; i<=N; i++) {
			for(int k=1; k<=M; k++) {
				brr[i][k]= start;
			}
		}
	}
}
