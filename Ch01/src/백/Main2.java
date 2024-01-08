package 백;
/*
 * 미로 탐색 2178
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
class xy{
	 int x;
	 int y;
	 xy(int x, int y){
		 this.x=x;
		 this.y=y;
	 }
}
public class Main2 {
	static int mx [] = {1,-1,0,0};
	static int my [] = {0,0,-1,1};
	static int N;
	static int M;
	static int map [][] ;
	static int v [][];
	static int count=0;
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N= Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		map = new int [N][M];
		v= new int [N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int k=0; k<M; k++) {
				map[i][k]=Integer.parseInt(st.nextToken());
			}
		}
		methodA();
		System.out.println(count);
	}
	public static void methodA() {
		Deque<xy> q= new ArrayDeque<>();
		Deque<xy> p= new ArrayDeque<>();
		q.add(new xy(0,0));
		v[0][0]=1;
		while(!q.isEmpty()||!p.isEmpty()) {
			count++;
		while(!q.isEmpty()) {
			xy a= q.poll();
			for(int i=0; i<4; i++) {
				int nx= a.x+mx[i];
				int ny= a.y+my[i];
				if(nx>=0&&nx<N&&ny>=0&&ny<M) {
					if(map[nx][ny]==1&&v[nx][ny]==0) {
						if(nx==N-1&&ny==M-1) {
							return;
						}
						v[nx][ny]=1;
						p.add(new xy(nx,ny));
					}
				}
			}
		}
		count++;
		while(!p.isEmpty()) {
			xy a= p.poll();
			for(int i=0; i<4; i++) {
				int nx= a.x+mx[i];
				int ny= a.y+my[i];
				if(nx>=0&&nx<N&&ny>=0&&ny<M) {
					if(map[nx][ny]==1&&v[nx][ny]==0) {
						if(nx==N-1&&ny==M-1) {
							return;
						}
						v[nx][ny]=1;
						q.add(new xy(nx,ny));
					}
				}
			}
		}
		}
		
	}
}