package com.biz.exec;

public class Num3to5 {
	/*
	 * prob num: 배수 10보다 작은 자연수 중에서 3또는 5의 배수 3 5 6 9 이 수의 합은 23
	 * 
	 * 1000보다 작은 자연수 중에서 3또는 5의 배수를 모두 더하면
	 */
	public static void main(String[] args) {

		int sum = 0;
		while (true) {
			int num = 1;
			if (num > 1000)
				break;
			if ((num % 3) == 0 || (num % 5) == 0)
				sum += num;
			num++;
		}
		System.out.println("3또는 5의배수의 합 : " +sum);
	}
}
