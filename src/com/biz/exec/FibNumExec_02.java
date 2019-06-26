package com.biz.exec;

public class FibNumExec_02 {
	/*
	 * 피보나치 수열
	 * 앞에나온 2개의 숫자를 더해서 다음수를 만드는 수열
	 * 1 2 3 5 8 13 21 34 ... 순서로 이어지는 수열
	 */
	public static void main(String[] args) {
		/*
		 * 30단위까지의 피보나치 수열중
		 * 2보다 큰값 중에서 짝수의 리스트만 보여라
		 * 단, 시작하는 1,2는 그냥 보이기
		 */
		int num1 = 1;
		int num2 = 2;
		System.out.println(num1);
		System.out.println(num2);
		for(int i = 0 ; i< 30; i++) {
			int fnum = num1 + num2;
			if(fnum % 2==0) System.out.println(fnum);
			num1 = num2;
			num2 = fnum;
			
		}
		
	}
}
