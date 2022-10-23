package Git_Algirism;

import java.util.Scanner;

public class ch01_1_Scanner_MAX {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력 해주세요 : ");
		int num1 = scan.nextInt();
		
		System.out.print("첫번째 숫자를 입력 해주세요 : ");
		int num2 = scan.nextInt();
		
		System.out.print("첫번째 숫자를 입력 해주세요 : ");
		int num3 = scan.nextInt();

		int max = num1;

		if(num2 > max) max = num2;
		if(num3 > max) max = num3;
		
			
		System.out.println("최대값 : " + max);
			
		
		
	}

}
