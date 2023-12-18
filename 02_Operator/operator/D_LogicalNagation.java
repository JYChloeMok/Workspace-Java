package com.kh.operator;

//#3_4 July, 05
public class D_LogicalNagation {
	
	/*
	 * 논리(값) 부정 연산자
	 * : 논리값(true, false)를 반대로 바꿔주는 연산자
	 * 
	 * [ 표현법 ] !논리값;
	 * 
	 */
	
	public void method1() { // method1()메소드 시작!
		
		System.out.println("true : " + true);
		System.out.println("!true : " + !true);
		
		// 말 그대로 기존 것 반전 역할, 반전 여러번 시킬 수 있음
		//보편적으로 변수로 사용하니 변수명 앞에 사용
		boolean isFlag = true;
		System.out.println(!isFlag);	// 한번반전 false
		System.out.println(!!isFlag);	// 두번반전 true
		System.out.println(!!!isFlag);	// 세번반전 false
		
		
	} // method1() 메소드 끝!
	
}
