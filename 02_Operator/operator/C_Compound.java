package com.kh.operator;

//#3_3 July, 05
public class C_Compound {


	/* 
	 * 복합 대입 연산자 : "=" 대입연산자
	 * 
	 * 다른 산술연산자와 대입연산자가 결합한 것
	 * => 자기 자신과 해당 산술연산을 한 뒤 그 결과를 자기자신에게 대입하는 용도
	 * 
	 * 산술연산자에
	 * +=
	 * -=
	 * *=
	 * /=
	 * %=
	 */
	
	/*
	 * ex) int a = 1;
	 * 		   a = a + 5;
	 *		기존에 존재하는 a라는 변수공간 값에 5를 더하고 그 결과값을 다시 a에 대입하겠다.
	 *		   a += 5;
	 *		둘이 똑같음. 작동도 속도도 같음. 그런데 사람 입장에선 더 간편함! 안쓸이유 없음! 끝!
	 * 
	 */
	
	
	public void method1() { // method1 시작
		
		int num = 12;
		System.out.println(num);
		
		/*
		 * num = num + 3;
		 * System.out.println("3을 증가시킨 num : " + num);
		 * ↑ 이 코드를 아래와같이 대체할 수 있다!
		 */
		
		num += 5;
		System.out.println("5 증가시킨 num : " + num);
		
		num -= 3;
		System.out.println("3 감소시킨 num : " + num);
		
		num *= 3;
		System.out.println("3배 증가시킨 num : " + num);
		
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num);
		
		num %= 5;
		System.out.println("num을 5으로 나눈 나머지 : " + num);
		
	} // method1 끝!
	
}
