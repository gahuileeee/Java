package sub2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

		public static void main(String[] args) {
//			�÷����� �⺻Ÿ���� ��� ���� Wrapper �������� �ֱ�
			Stack<Integer> stack = new Stack<>();
			Queue<Integer> que = new LinkedList<>();
			
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			
			que.offer(1);
			que.offer(2);
			que.offer(3);
			que.offer(4);
			que.offer(5);
	
			while(!stack.isEmpty()) {
				System.out.print(stack.pop()+" ");
			}
			System.out.println();
			while(!que.isEmpty()) {
				System.out.print(que.poll()+" ");
			}
			
		}
}
