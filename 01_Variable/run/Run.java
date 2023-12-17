package com.kh.run;
// #2_2 July, 04

import com.kh.variable.A_Variable; // import 패키지.패키지.패키지.클래스;
import com.kh.variable.C_Casting;

import com.kh.variable.B_KeyboardInput;
public class Run {
	
	public static void main(String[] args) {
		
		// Q. 주급출력 연습
		/* 출력 형식 " xxx : 『』"으로 주급출력하기  */
		System.out.println("『  루잉구의 주급 : " + 9620 * 8 * 5 + "원 』");

		int hourlyWage = 9620;
		int hour = 8;
		int day = 5;
		int weeklyPay = hourlyWage * hour * day;
		System.out.println("『  루잉구의 주급 : " + weeklyPay + "원 』");
		
		
		// 타 클래스 메소드 이용 (동일 패키지 vs 외부 패키지)
		/* 동일 패키지 : HelloWorld는 동일 패키지 내 이용이었음 											*/
		/* 외부 패키지 : 외부 패키지의 클래스 이용 시(그 클래스에 접근하려면) 경로를 지정해줘야함
		 *			(다른 패키지에 같은 이름 클래스들이 있어도 호출하기 원하는 class가 어떤 것인지 specific해짐)
		 *			그러므로 클래스 Import 해줘야함 (클래스Import의 의의.목적)
		 *			패키지 내에 import써줌 (패키지라인과 클래스라인 사이 그냥 클래스 하나 또  쓰는 느낌)				*/
		
		// ↓ 타 패키지의 A_Variable클래스에 접근 가능해진 모습
		A_Variable a = new A_Variable();
		//a.calPay();
		//a.declareVariable();
		//a.constant();
		
		/* 스택 오버플로우 실행문, a.bombA(); */
		
// #July, 05
		
		// import로 타 패키지 클래스에 접근, new생성, .연산자로 사용
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputTest();
		
		C_Casting c = new C_Casting();
		c.autoCasting();
		//c.forceCasting();
	}
}
// run(마지막 메인 실행)과 run as 다름
