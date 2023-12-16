// 키워드 or 예약어 = 특정 기능이 있는 단어들

/* 주석문
 * 주석은 프로그램 실행에 영향을 끼치지 않음
 * 코드를 작성한 후 코드를 이해하기쉽도록 하기위해 작성
 * 주석을 달아놓으면 유지보수 시간을 줄일 수 있음
 * (남이 쓴 코드 유지보수 하는 경우가 대다수인데 코드 읽는 시간 및 비용 절감)
*/

// 주석의 종류
// 1. 한 줄 주석 (//) : 주석 내용이 한 줄일 때 사용
// "//"다음부터 줄의 끝까지 모든 내용이 주석으로 간주
// 2. 여러 줄 주석 (/* ~ 내용 ~ */)
// /* ~~~ */ 사이의 모든 내용이 주석으로 간주
// 3. 예쁜주석 @param
// 줄 주석 : ctrl + /
// 블럭 주석 : ctrl+shift+/

/* 패키지 (package)
 * 
 * 하나의 패키지 안에 여러 클래스들이 존재할 수 있음
 * 단, 동일한 이름의 클래스는 존재할 수 없음
 * 
 * 모든 클래스들을 동일한 패키지안에 집어넣고 관리하면 관리가 힘들어지기 때문에
 * 클래스들을 용도에 맞게 구분해서 패키지에 보관하는것이 좋다.
 * 
 * 패키징 목적 : 관리
 * 
 * 권장사항
 * 패키지는 적어도 세단계 이상으로 만들어주는 것을 권장한다.
 * com.kh.first
 * com.회사이름.프로젝트이름, 팀이름, 카테고리명
 * (보편적으로 위와같고, 실제로 회사별로 네이밍컨벤션이 정해져있음)
 *
 */


package com.kh.first; // 패키지 선언부 : 현재 클래스 파일의 위치 (클래스파일의 실제 위치)

public class HelloWorld { // 클래스 영역 시작
	
	// 블록{ scope }은 중괄호로 묶은 부분을 말하며, 복합문을 구성하는 요소, 즉 종속된 문장이 다수 개일 때 '{'로 시작하고 '}'로 닫음
	
	// main method() : 타 언어에서 엔트리포인트, 프로그램의 시작점, 프로그램 당 최소 1개는 가지고 있어야한다 (JVM에게 읽기 시작하는 포인트 알려주는 것)
	// public static void main(String[] args){}
	// args부분은 다른것 적어도 괜찮지만 보편적으로 그러지 않음.(누가그럼) args씀 (arguments 약자).
	
	public static void main(String[] args) { // main method 영역 시작 / main은 반드시 클래스 바디안에 존재해야함
		
		// * Method = 타 언어에서의 함수
		//			  : 사전적으로는 기능을 의미, 하나의 기능 단위
		//			  : 하나의 클래스 안에 여러개의 메소드가 존재할 수 있음
		//			  : 메소드를 사용할 때 "호출"이라고 한다
		
		// 공백은 빈 칸, 탭, 빈 줄 등이 있으며, 이러한 공백은 소스코드를 보기좋게 하고 알아보기 쉽게 만드는데 사용한다
		// 즉, 프로그램을 구조화된 형태로 표현하는데 유용하다 (일반 글 쓰기의 들여쓰기와 단락나누기처럼)
		// 영역 별 tab키 이용해 들여쓰기로 구조를 보기쉽게, 어느 영역 소속 코드인지 표현함
		
		System.out.print("Hello World!"); // 얘는 출력문임 / 콘솔창 Hello World!
		// 마침표로 세미콜론
		// * 세미콜론 (;) : 논리적인 한 문장이 끝났다.
		// 걍참고) out은 필드 (표준출력도구)
		
		// ★ 무언가를 적었는데, 소괄호를 사용 = 거의 메소드
		// ex) 이 경우 우리가 print메소드를 호출한 것
		
		printMyName();
	}
	
	public static void printMyName() { // printMyName메소드 시작
		

		System.out.print("\n안녕하세요. 제 이름은 xxx입니다.");
		// 안녕하세요. 제 이름은 xxx입니다.
		
	} // 메소드 끝
	// ## 67줄에서 호출되어 실행되고, 이 포인트에서 호출이 끝나면 나를 부른 시점으로 다시 돌아감
	
	
	
	
	
	
	
	
	
	
	
	
} // HelloWorld클래스 영역이 끝남 
