package 백;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main4  {
	static PriorityQueue<Integer> q ;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuffer sb= new StringBuffer();
		public static void main(String[] args) throws NumberFormatException, IOException {
			
			q=new PriorityQueue<>(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					if(Math.abs(o1)==Math.abs(o2)) {
						return o1-o2;
					}else {
						return Math.abs(o1)-Math.abs(o2);
					}
				}
			});
			int time= Integer.parseInt(br.readLine());
			for(int i=0; i<time; i++) {
				methodA();
			}
			System.out.println(sb.toString());
		}

		public static void methodA() throws NumberFormatException, IOException {
			int a =Integer.parseInt(br.readLine());
			if(a!=0) {
				q.add(a);
			}else {
				if(q.isEmpty()) {
					sb.append("0\n");
				}else {
					sb.append(q.poll()+"\n");
				}
			}
		}
	}
		

