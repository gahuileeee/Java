package 백;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {

		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st= new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int [] arr = new int [N+1];
			for(int i=0; i<M; i++) {
				 st= new StringTokenizer(br.readLine());
				 int a=Integer.parseInt(st.nextToken());
				 int b=Integer.parseInt(st.nextToken());
				 int c=Integer.parseInt(st.nextToken());
				 for(int k=a; k<=b; k++) {
					 arr[k]=c;
				 }
			}
			for(int i=1; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
}
