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
	static int subin;
	static int dong;
	static int time;
	static Deque<Integer> q = new ArrayDeque<>();
	static Deque<Integer> p = new ArrayDeque<>();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		subin = Integer.parseInt(st.nextToken());
		dong = Integer.parseInt(st.nextToken());
		int a = Math.max(dong, subin);
		int b= Math.min(dong, subin);
		if(a==b) {
			System.out.println("0");
		}
		
		if(a!=0&&b!=0) {
			if(a%b==0&&a!=1&&b!=1) {
				System.out.println("0");
			}else {
				System.out.println(search());
			}
		}else {
			
		}
		
	}
	
	public static int search() {
		
		q.add(subin-1);
		q.add(subin+1);
		q.add(subin*2);
		while(!q.isEmpty()||!p.isEmpty()) {
			
			time++;
			while(!q.isEmpty()) {
				int a=q.pollFirst();
				if(a%dong==0||dong%a==0) {
					return time;
				}
				p.add(a+1);
				p.add(a-1);
				p.add(a*2);
			}
			
			time++;
		
			System.out.println();
			while(!p.isEmpty()) {
				int a= p.pollFirst();
				if(a%dong==0||dong%a==0) {
					return time;
				}
				q.add(a+1);
				q.add(a-1);
				q.add(a*2);
			}
		}
		return time;
	}
}