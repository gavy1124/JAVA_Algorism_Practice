package Git_Algirism;

import java.util.Scanner;

public class ch01_2_For {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//연습문제 8  ( a ~ b 사이의 모든정수의합 (ab포함)
		
		int a = 0;
		int b = 0;
		int sum3 =0;
		System.out.print("첫번째 숫자를입력:");
		a = scan.nextInt();
		System.out.print("두번째 숫자를입력:");
		b = scan.nextInt();
		
		for (int i = a; i <= b; i++) {
			sum3 +=i;
			//System.out.println(i);
		}
		System.out.println("a ~ b 사이의 모든정수의합 : " + sum3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("---------------------------------------------------");
		//연습문제 7     ( 1~10)의합 = (1+10)*5 와 같다고함// 이를 가우스의 덧셈이라고함 //1부터 n까지의 정수합 작성
		int num = 1;
		int sum2 = 0;
		System.out.print("n값 입력 : ");
		num = 100; //scan.nextInt();
		for (int i = 1; i <= num; i++) {
			sum2+=i;
		}
		System.out.println("합계 : " + sum2);
		
		System.out.println("가우스합계 " + (1 + num) *(num/2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("1~n까지의 합을 구합니다.");
		System.out.println("n값 : ");
		int n = 1;//scan.nextInt();
		int sum = 0;
		int i = 1;
		while(i <= n) {
			//System.out.println(i);
			sum += i;
			i ++;
		}
		
		
//		for (int i = 1; i <= n; i++) {
//			sum += i;
//		}
		System.out.println("1~" + n + "까지의 합은 " + sum +" 입니다.");
		
	}

}
