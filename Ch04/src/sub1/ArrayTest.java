package sub1;
/*
 *  날짜 : 2023-12-28
 *  이름 : 이가희
 *  내용 : 배열 실습하기
 */

public class ArrayTest {

	public static void main(String[] args) {
		// 배열
		int []  arr1 = {1,2,3,4,5};
		char [] arr2 = {'A','B','C'};
		String [] arr3 = {"서울","대전","대구","부산","광주"};
		// 원소 출력
		int k =0;
		for(int a : arr1) {
			System.out.println("arr1["+k+"] : "+ a);
			k++;
		}
		System.out.println();
		System.out.println("arr2[2] : "+arr2[2]);
		System.out.println("arr3[3] : "+arr3[3]);
		System.out.println();

		// 배열 길이
		System.out.println("arr1의 원소갯수: " +arr1.length);
		System.out.println("arr2의 원소갯수: " +arr2.length);
		System.out.println("arr3의 원소갯수: " +arr3.length);
		System.out.println();
		
		// 배열 반복문
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		for (int n : arr1) { // 향상된 for문
			System.out.print(n+" ");
		}
		System.out.println();
		for(char n : arr2) {
			System.out.print(n+" ");
		}
		System.out.println();
		for(String n : arr3) {
			System.out.print(n+" ");
		}
		System.out.println("\n");
		
		// 1차원
		int [] scores = {80, 60, 78, 62, 92};
//		배열의 이름을 지을 때엔 끝에 s를 붙여주는 것이 관례임.
		int total = 0;
		for(int a : scores ) {
			total +=a;
		}
		System.out.println("scores의 점수 총합 : "+total);
		System.out.println();
		
		// 2차원
		int [][] arr2d = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		System.out.println(arr2d[0][2]);
		System.out.println(arr2d[1][0]);
		System.out.println(arr2d[2][2]);
		System.out.println();
		
		for(int i=0; i<arr2d.length; i++) {
			for(int j=0; j<arr2d[i].length; j++) {
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		// 3차원
		int [][][] arr3d = {
				{{1, 2, 3},{4, 5, 6},{7, 8, 9}},
				{{10,11,12},{13,14,15},{16,17,18}},
				{{19,20,21},{22,23,24},{25,26,27}}
		};
		System.out.println(arr3d[0][1][1]); //5 출력
		System.out.println(arr3d[1][2][1]); // 17 출력
		System.out.println(arr3d[2][2][0]); //25 출력
		
		for(int i=0; i<arr3d.length; i++) {
			for(int j=0; j<arr3d[i].length; j++) {
				for(int p=0; p<arr3d[i][j].length; p++) {
	System.out.printf("arr3d[%d][%d]%d] : %d\n", i,j,p,arr3d[i][j][p]);
				}
			}
		}
	}
}
