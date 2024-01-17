package 백;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Node2 {
	int idx;
	int cost;
	//생성자
	Node2(int idx, int cost){
		this.cost=cost;
		this.idx=idx;
	}
}

public class Main4{	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static int V;
	static int E;
	static boolean [] visit;
	static int dist [];
	static int start;
	static int end;
	static ArrayList<ArrayList<Node2>> graph;
	public static void main(String[] args) throws IOException {
		int [] arr = solution("banana");
		for(int a : arr) {
			System.out.print(a+" ");
		}
		st = new StringTokenizer(br.readLine());

	}
	public static int[] solution(String s) {
		int [] answer = new int [s.length()];
		TreeMap<Character, Integer> map = new TreeMap<>();
		for(int i=0; i<answer.length; i++) {
			char a =s.charAt(i);
			if(map.containsKey(a)) {
				int n=map.get(a);
				answer[i]=i-n;
				map.put(a, i);
			}else {
				map.put(a,i);
				answer[i]=-1;
			}
		}
		return answer;
	}
}
	


		

