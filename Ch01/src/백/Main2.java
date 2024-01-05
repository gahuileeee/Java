package 백;
/*
 * 최소 비용 구하기 1916
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	static int city;
	static int bus;
	static int map [][];
	static int start;
	static int end;
	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		city = Integer.parseInt(br.readLine());
		bus = Integer.parseInt(br.readLine());
		map = new int [city+1][city+1];
		for(int i=0; i<bus; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a =Integer.parseInt(st.nextToken());
			int b =Integer.parseInt(st.nextToken());
			int c =Integer.parseInt(st.nextToken());
			map[a][b]=c;
		} //일단 입력 다 받음.
		start = Integer.parseInt(br.readLine());
		end = Integer.parseInt(br.readLine());
	}
	public static void route() {
		
	}
}
