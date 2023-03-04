package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		String x = num1 + " x " + num2 + " = " + num1 * num2;

		return x;
	}

	public static int findBrokenEgg(List<String> eggs) {
		return 0;
	}

	public static boolean isPrime(int v) {
		boolean p = true;
			for (int i = 2; i < v; i++) {
				if (v % i == 0) {
					p=false;
				}
			}
			return p;
		}


	public static boolean isSquare(int v) {
		boolean p = false;

		if ((Math.sqrt(v)) == (int) (Math.sqrt(v)) || v == 1) {
			p = true;
		}

		return p;
	}

	public static boolean isCube(int v) {
		boolean p = false;

		if (Math.cbrt(v) == (int) (Math.cbrt(v)) || v== 1) {
			p = true;
		}

		return p;
	}
}
