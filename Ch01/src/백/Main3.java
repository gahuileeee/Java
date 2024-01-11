package 백;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

class fish{
	public int size;
	public int x;
	public int y;
	fish(int size, int x, int y){
		this.size=size;
		this.x=x;
		this.y=y;
	}
}

public class Main3 {
		static int map [][] ;
		static TreeMap<Integer, Integer> tree = new TreeMap<>();
		static StringBuffer sb = new StringBuffer();
		static  ArrayList<fish> list;
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			map = new int [N][N];
			list = new ArrayList<>();
			for(int i=0; i<N; i++) {
				StringTokenizer st =new StringTokenizer(br.readLine());
				for(int k=0; k<N; k++) {
					int c=Integer.parseInt(st.nextToken());
					if(c!=0&&c!=9) {
						if(tree.containsKey(c)) {
							int b =tree.get(c);
							b++;
							tree.put(c, b);
						}else {
							tree.put(c, 1);
						}
					}
					map[i][k]=Integer.parseInt(st.nextToken());
				}
			}
		}
		public static void methodA() {
			
		}

}