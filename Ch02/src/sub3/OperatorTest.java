package sub3;

public class OperatorTest {
	/*
	 *  날짜: 2023/12/26
	 * 	이름: 이가희	
	 *  내용:  Ch02. Java 연산자 
	 *  
	 *  연산자(Operator)
	 *  - 변수의 데이터를 처리하기 위한 연산식
	 *  - 일반적으로 산술, 복합대입, 비교, 논리연산을 수행
	 */

	public static void main(String[] args) {
//		산술연산자
		int num1 =1;
		int num2 =2;
		int num3 =3;
		int num4 =4;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num2 * num3;
		int result4 = num4 / num2;
		int result5 = num4 % num3;

		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		System.out.println("result3 : "+ result3);
		System.out.println("result4 : "+ result4);
		System.out.println("result5 : "+ result5);
		System.out.println();
		
//		증감연산자
		int num =0;
		num++;
		++num;
		System.out.println("num : "+ num);
		num--;
		--num;
		System.out.println("num : " +num);
		System.out.println();
		
//		복합대입연산자
		int n1= 1, n2 = 2, n3 = 3, n4 = 4;
		n1 +=1;
		n2 -=2;
		n3 *=3;
		n4 /=4;
		System.out.println("n1 : "+ n1);
		System.out.println("n2 : "+ n2);
		System.out.println("n3 : "+ n3);
		System.out.println("n4 : "+ n4);
		System.out.println();
		
//		비교연산자
		int var1 =1;
//		변수가 선언이 되고 변수에 값을 대입하는 것을 초기화라고 한다.
//		지금은 변수 선언과 동시에 값을 초기화 한 것
		int var2 =2;
		boolean rs1 = var1> var2; //var1이 var2보다 크다
//		1>2 -> false 따라서 rs1에 false가 저장됨
		boolean rs2= var1 <var2; //var1이 var2보다 작다.
		boolean rs3= var1 >= var2; // var1이 var2보다 크거나 같다.
		boolean rs4= var1 <= var2; // var1이 var2보다 작거나 같다.
		boolean rs5= var1 == var2; // var1과 var2는 서로 같다.
		boolean rs6= var1 != var2; // var1과 var2는 서로 다르다.
		System.out.println("res1: "+ rs1);
		System.out.println("res2: "+ rs2);
		System.out.println("res3: "+ rs3);
		System.out.println("res4: "+ rs4);
		System.out.println("res5: "+ rs5);
		System.out.println("res6: "+ rs6);
		System.out.println();
		
//		논리연산자
		int var3 = 3;
		int var4 = 4;
		
		boolean res1= (var3 > 3) && (var4 >3); //AND 연산자. true true여야 true
		boolean res2= (var3 > 3) || (var4 >3); //OR 연산자. false false여야 false
		boolean res3= ! (var3 >var4);	//Not, 결과를 반대로 출력
		
		System.out.println("res1 : "+ res1);
		System.out.println("res2 : "+ res2);
		System.out.println("res3 : "+ res3);
		
	}

}
