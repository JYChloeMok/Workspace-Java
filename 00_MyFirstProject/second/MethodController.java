package com.kh.second;

public class MethodController { // MethodController 클래스 영역 시작
	// 보통 제어, 기능과 관련된 클래스 이름 뒤에 Controller 붙임

	public void methodA() { // methodA 시작
		System.out.println("methodA 호출!");

	} // methodA 끝

	public void methodB() {
		System.out.println("methodB 호출!");

	}

	public void methodC() {
		System.out.println("methodC 호출!");

	}

} // 클래스 영역 끝

/*
 * Q. println말고 print 단축키? 따로 옵션에서 단축키 지정하는거 말고 기본으로는 없나?
 * Q. 키워드 vs 예약어? vs 명령어? 차이 키워드 = 예약어
 * Q. main이 메소드면 Strint[]가 인자? 그럼 내가 작성한 코드는 스트링 배열로 main에 들어오나? String은 뭐임?
 * Q. 논리적인 한 문장이 끝났다는 의미가? 변수도 ; 찍히니까 메모리에 쓰였다는 뜻? 선언만 해도 메모리에 저장되나?
 * 		"Hello World".toLowerCase().charAt(0);
		"Hello World".toLowerCase();
 */