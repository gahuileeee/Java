package 백;

class Fruit {
		String msg;
		public Fruit(String msg) {
			this.msg=msg;
		}
		
		public String getMassage() {
			return this.msg;
		}
	}
	
	class Apple extends Fruit{

		public Apple(String msg) {
			super(msg);
		}
		
	}
public class Main4  {
		public static void main(String[] args) {
			Apple e = new Apple("음수입니다");
			System.out.println(e.getMassage());
		}


	}
		

