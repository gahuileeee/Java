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
	public static int[] x = {0,0,1,-1};
	public static int[] y = {1,-1,0,0};
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
		methodA(T);
		System.out.println(count());
		
	}
	public static void methodA(int time) {
		int tt=0;
		while(tt<time) {
//			확산부터 시켜보자
			diffusion();
			moveA();
			moveB();
			tt++;
		}
	}
	
	public static void check() {
		for(int i=0; i<R; i++) {
			for(int k=0; k<C; k++) {
				System.out.print(map[i][k]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void diffusion() {
		int [][] nmap = new int [R][C];
		for(int i=0; i<R; i++) {
			for(int k=0; k<C; k++) {
				if(map[i][k]!=0&&map[i][k]!=-1) {
					int count =0;
					int amount = map[i][k];
					for(int p=0; p<4; p++) {
						int nx= i+x[p];
						int ny= k + y[p];
						if(nx>=0&&nx<R&&ny>=0&&ny<C) {
						
							if(map[nx][ny]!=-1) {
								nmap[nx][ny]+=amount/5;	
								count++;
							}
						}
					}
					nmap[i][k]=nmap[i][k] -(amount/5)*count;
				}
			}
		}
		for(int i=0; i<R; i++) {
			for(int k=0; k<C; k++) {
				map[i][k]+=nmap[i][k];
			}
		}
	}
	public static void moveA() {
//		공기청정기는 (minus-1,0 ) (minus,0)에 있음.
//		옆으로 움직여 보자
		int k=map[minus-1][1];
		map[minus-1][1]=0;
		int c=0;
		for(int i=2; i<C; i++) {
			c=map[minus-1][i];
			map[minus-1][i]=k;
			k=c;
		}
		for(int i=minus-2; i>=0; i--) {
			c= map[i][C-1];
			map[i][C-1]= k;
			k=c;
		}
		for(int i=C-2; i>=0; i--) {
			c=map[0][i];
			map[0][i]=k;
			k=c;
		}
		
		for(int i=1; i<minus-1; i++) {
			c=map[i][0];
			map[i][0]=k;
			k=c;
		}
	}
	
	public static void moveB() {
//		공기청정기는 (minus-1,0 ) (minus,0)에 있음.
//		옆으로 움직여 보자
		int k=map[minus][1];
		map[minus][1]=0;
		int c=0;
		for(int i=2; i<C; i++) {
			c=map[minus][i];
			map[minus][i]=k;
			k=c;
		}
		//
		for(int i=minus+1; i<R; i++) {
			c=map[i][C-1];
			map[i][C-1]=k;
			k=c;
		}
		
		for(int i=C-2; i>=0; i--) {
			c=map[R-1][i];
			map[R-1][i]=k;
			k=c;
		}
		
		for(int i=R-2; i>minus; i--) {
			c= map[i][0];
			map[i][0]= k;
			k=c;
		}

		
		
	}
	
	
	public static int count() {
		int sum=0;
		for(int i=0 ;i<R ; i++) {
			for(int k=0; k<C; k++) {
				if(map[i][k]!=-1) sum+=map[i][k];
			}
		}
		return sum;
	}
}