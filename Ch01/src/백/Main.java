package 백;
/*
 * 백준 17144 미세먼지 안녕!
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static int R;
	public static int C;
	public static int T;
	public static int map [][] ;
	public static int minus;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		map=new int [R][C];
		for(int i=0; i<R; i++) {
			st= new StringTokenizer(br.readLine());
			for(int k=0; k<C; k++) {
				int c= Integer.parseInt(st.nextToken());
				if(c!=-1) {
					map[i][k]=c;	
				}else {
					map[i][k]=c;
					minus=i;
				}
				
			}
		}
	}
	public static void methodA(int time) {
		int tt=0;
		while(tt<time) {
			tt++;
		}
	}
}