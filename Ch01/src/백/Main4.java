package 백;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

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
		st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		start= Integer.parseInt(br.readLine());
		graph = new ArrayList<>();
		for(int i=0; i<V+1; i++) {
			graph.add(new ArrayList<Node2>());
		}
		for(int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			// a에서 b로 가는 가격 cost
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			int cost= Integer.parseInt(st.nextToken());
			graph.get(a).add(new Node2(b, cost));
		}
		visit = new boolean [V+1];
		dist = new int [V+1];
		for(int i=0; i<V+1; i++) {
			dist[i]= Integer.MAX_VALUE;
		}
		
		dist[start]=0;
		
		dijkstra();
		for (int i = 1; i < V + 1; i++) {
			if (dist[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			} else {
				System.out.println(dist[i]);
			}
		}
	}
	
	public static void dijkstra() {
		for(int i=0; i<V; i++) {
			int nodeValue = Integer.MAX_VALUE;
			int nodeIdx = 0;
			for(int j=1; j<V+1; j++) {
				if(!visit[j]&&dist[j]<nodeValue) {
					nodeValue = dist[j];
					nodeIdx=j;
				}
			}
			visit[nodeIdx]= true;
			for(int j=0; j<graph.get(nodeIdx).size(); j++) {
				Node2 adjNode = graph.get(nodeIdx).get(j);
				
				if(dist[adjNode.idx]>dist[nodeIdx]+adjNode.cost) {
					dist[adjNode.idx]=dist[nodeIdx] + adjNode.cost;
				}
			}
		}
	}
}
	


		

