package 백;
/*
 * 나무 자르기 2805
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main2 {
	static int tree;
	static int M;
	static int [] arr;
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		tree = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr =new int [tree];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<tree; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
	}
}