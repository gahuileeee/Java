package 백;
//	마인크래프트 18111

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main2 {
	static int N;
	static int M;
	static int B;
	static int map [][] ;
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			st= new StringTokenizer(br.readLine());
			for(int k=0; k<M; k++) {
				map[i][k]=Integer.parseInt(st.nextToken());
			}
		}//map 입력 받음.
		
		
	}
}