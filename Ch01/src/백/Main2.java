package 백;
// 용액

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main2 {
	static int N;
	static int [] arr;
	static int tiny;
	static int [] a;
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N= Integer.parseInt(br.readLine());
		arr= new int[N];
		a = new int[2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		tiny = Integer.MAX_VALUE;
		search();
		System.out.println(a[0]+" "+a[1]);
		arr[0]=0;
		arr[1]=0;
		two();
		System.out.println(a[0]+" "+a[1]);
	}
	public static void search() {
		for(int i=0; i<N-1; i++) {
			for(int k=i+1; k<N; k++) {
				int c= Math.abs(arr[i]+arr[k]);
				if(c<tiny) {
					tiny=c;
					a[0]=arr[i];
					a[1]=arr[k];
				}
			}
		}
	}
	public static void two() {
		int start = 0;
		int end = N-1;
		
		while(start<=end) {
			int c= arr[start]+arr[end];
			if(Math.abs(c)<tiny) {
				tiny=c;
				a[0]=arr[start];
				a[0]=arr[end];
			}
			if(c<0) {
				start++;
			}else if(c>0){
				end--;
			}if(c==0) {
				break;
			}
		}
	}
}