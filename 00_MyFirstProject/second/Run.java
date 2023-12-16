package com.kh.second;

public class Run {
//	HelloWorld의 경우에는 내부 클래스의 메소드 calling
//	run클래스 내부에서, 외부의 클래스를 calling
	
// Today's Subject : 외부 클래스에 있는 메소드를 호출하고 싶을 때는 어떻게 해야 하는가?
/* 1. 호출할 메소드가 존재하는 클래스를 생성(new)을 해줘야 함
 * 	[ 표현법 ]
 * 	"클래스이름" "클래스를 대변할 이름(별칭.별명)" = new 클래스이름();
 * 
 *	 ※나중에 깊게 다뤄볼 것
 */
	
	
	public static void main(String[] args) { // 메인메소드 시작

		/* 여러 클래스에 같은이름 method있어도, 타 클래스에 있어도  사용가능 / 어느 클래스 어느 메소드인지 지정 */
		MethodController mc = new MethodController();
		
		/* MethodA(); */
		/* . 참조연산자 / 직접접근연산자 */
		mc.methodA();
		mc.methodB();
		mc.methodC();
		
		
		
				
	} // 메인메소드 끝

}
