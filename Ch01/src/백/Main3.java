package 백;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class Main3 {
		static StringBuffer sb = new StringBuffer();
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a =Integer.parseInt(br.readLine());
			List<Integer> arr = new ArrayList<>();
			for(int i=0; i<a; i++) {
				arr.add(Integer.parseInt(br.readLine()));
			}
			Collections.sort(arr, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o1-o2;
				}
			});
			
			for(int c: arr) {
				sb.append(c+"\n");
			}
			
			System.out.println(sb);
		}

}

