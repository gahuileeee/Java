package sub1;

import java.util.Set;

public class FruitBox<T> {
	
//	private Apple fruit; 이 친구를 아래처럼 치환변수 타입으로 바꿈.
	 private T fruit; 
	public T getFruit() {
		return fruit;
	}
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
