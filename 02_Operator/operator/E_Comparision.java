package com.kh.operator;

//#3_5 July, 05
public class E_Comparision {
	
	
	/*
	 * ★★★★ 비교 연산자 (관계 연산자)
	 * 
	 * 두 개의 값을 가지고 비교, 이항 연산자
	 * 비교 연산을 한 결과 -> 참인 경우 true, 거짓일 경우 false
	 * 특정 조건을 제시할 수 있는 조건문에서 사용될 예정!
	 * 
	 */
	
	/*
	 * 종류
	 * 1. 동등비교 : 일치함을 비교
	 * 	  a == b : a와 b가 일치합니까?
	 * 	  a != b : a와 b가 일치하지 않습니까? (불일치합니까?)
	 * 
	 * 2. 대소비교 : 크고 작음을 비교
	 * 	  a < b	 : a가 b보다 작습니까?
	 * 	  a > b  : a가 b보다 큽니까?
	 * 	  a <= b : a가 b보다 작거나 같습니까?
	 * 	  a >= b : a가 b보다 크거나 같습니까? 
	 * 
	 * 
	 * tips. 비교연산자는 의문문 형태로 생각하면 좋다
	 * 
	 */
	
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		System.out.println("a < b : " + (a < b));	  // 1. true
		// ()안치면 에러발생 이유 : 문자열이 만들어지는데 변수로 대소비교가 안되니까
		
		System.out.println("25 <= b : " + (25 <= b)); // 2. true
		
		System.out.println("a == b : " + (a == b));	  // 3. false
		
		boolean result = (a != b);
		System.out.println(result); 				  // 4. true
		// 공간 = ' ?????????? ';
		/*		이 공간에서 무슨 일이 일어나든, 값이 나옴
		 * 		그러므로 오른쪽에 있으면 무조건 '무슨 값이지?'라고 생각
		 * 		왼 공간, 오 값 ★★★★★
		 * 
		 */
		
		// 단일 비교보다 연산 등과 복합적으로 이용하는 경우가 훨씬 많음
		System.out.println("a - b < 0 :" + (a - b < 0)); // 5. true
		
		System.out.println("a가 짝수입니까? : " + (a % 2 == 0));
		System.out.println("b가 짝수가 아닙니까? : " + (b % 2 != 0));
		System.out.println("b가 짝수가 아닙니까? : " + (b % 2 == 1));
		
	} // method1 끝
	
}
