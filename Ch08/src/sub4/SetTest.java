package sub4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		
//		HashSet ����
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		
		System.out.println(set);
		
//		�ڷ� ������
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
