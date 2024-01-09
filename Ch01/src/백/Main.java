package 백;
/*
 * 백준 숨바꼭질 3 13549
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static int [][] box;
	public static int [] arr;
	public static int[] x= {-1,1,0,0};
	public static int[] y= {0,0,1,-1};
	public static boolean [][] v;
	public static Deque<xy> q;
	public static int count;
	public static int subcount;
	
	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		box = new int [b][a];
		q= new ArrayDeque<>();
		v= new boolean [b][a];
		
		for(int i=0; i<b; i++) {
			st= new StringTokenizer(br.readLine());
			for(int j=0; j<a; j++) {
				int kk=Integer.parseInt(st.nextToken());
				box[i][j]=kk;
				if(kk==1) {
					q.add(new xy(i, j));
					v[i][j]=true;
				}
			}
		}
		count =0;
		subcount=q.size();
		if(subcount ==0) {
			System.out.println("-1");
			System.exit(0);
		}
		bfs(b, a);
		for(int i=0; i<b; i++) {
			for( int k=0; k<a; k++) {
				if(box[i][k]==0) {
					System.out.println("-1");
					System.exit(0);
				}
			}
		}
		
		System.out.println(count-1);
	} //main method 종료
	public static void bfs(int b, int a) {
		
		while(!q.isEmpty()) {
			xy p =q.poll();
			subcount--;
			for(int i=0; i<4; i++) {
				int nx= p.x + x[i];
				int ny= p.y + y[i];
				if(nx>=0 && nx<b && ny>=0 && ny<a) {
					if(v[nx][ny]==false && box[nx][ny]==0) {
						v[nx][ny]=true;
						box[nx][ny]=1;
						q.add(new xy(nx, ny));
					}
				}
			}
			if(subcount==0) {
				count++;
				subcount = q.size();
			}
		}
	}
	public static class xy{
		int x;
		int y;
		public xy(int x, int y) {
			this.x= x;
			this.y=y;
		}
	}
}