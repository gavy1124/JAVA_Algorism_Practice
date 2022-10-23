package Git_Algirism;

public class ch01_2_Multi_MAX {

	public static void main(String[] args) {

		// 예제
		System.out.println("maxMethod(3, 2, 1) : " + maxMethod3(3, 2, 1));

		// 연습문제 1번 ( 매겨변수 4개중 최대값 구하기)
		System.out.println("연습문제 1번 : " + maxMethod4(4, 5, 6, 7));
		// 연습문제 2번 ( 매겨변수 3개중 최소값 구하기)
		System.out.println("연습문제 2번 : " + minMethod3(5, 7, 8));
		// 연습문제 3번 ( 매겨변수 4개중 최소값 구하기)
		System.out.println("연습문제 3번 : " + minMethod4(5, 7, 8, 3));
		// 실습 1c-1
		System.out.println("실습문제 1c-1 : " + median(1, 2, 3));
	}

	static int median(int a, int b, int c) {
		if (a>=b)
			if(b>=c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b>c)
			return c;
		else 
			return b;

	}

	static int centerValue(int a, int b, int c) {
		int max = a;
		int min = b;
		int cen = 0;

		if (b > max)
			max = b;
		if (c > max)
			max = c; // max 구함

		if (a < min)
			min = a;
		if (c < min)
			min = c;

		cen = (a + b + c) - (max + min);

		int result = 0;
		return cen;
	}

	static int maxMethod3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		return max;

	}

	static int maxMethod4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
	}

	static int minMethod3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;

		return min;
	}

	static int minMethod4(int a, int b, int c, int d) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;

		return min;
	}

}