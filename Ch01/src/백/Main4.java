package 백;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

class pp{
	long a;
	int count;
	pp(long a, int count){
		this.a=a;
		this.count=count;
	}
}
public class Main4{	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static long A;
	static long B;
	static int [] arr;
	public static void main(String[] args) throws IOException {
		st =new StringTokenizer(br.readLine());
		A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());
		arr= new int[1000000001];
		
		int a=method();
		if(a!=-1) {
			System.out.println(a+1);
		}else {
			System.out.println(-1);
		}
	}
	public static int method() {
		Queue<pp> q = new ArrayDeque<>();
		q.add(new pp(A,0));
		while(!q.isEmpty()) {
			pp c= q.poll();
			pp nc = new pp (c.a*2,c.count+1);
			int b=1000000000;
			if(nc.a>b) {
				
			}else {
				if(arr[(int) nc.a]!=0) {
				}else {
					if(nc.a==B) {
						return nc.count;
					}else {
						q.add(nc);
						arr[(int)nc.a]=1;
					}
				}
			}
			
			try {long an =Long.parseLong(c.a+"1"); 
			pp nw = new pp(an,c.count+1);
			if(nw.a>b) {
			}else {
				if(arr[(int) nw.a]!=0) {
				}else {
					if(nw.a==B) {
						return nw.count;
					}else {
						q.add(nw);
						arr[(int)nw.a]=1;
					}
				}
			}
		
			}
			catch(Exception e) {
				
			}
		
		}
		return -1;
	}
}
	


		

