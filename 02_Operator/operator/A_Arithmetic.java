package com.kh.operator;

// #3_1 July, 05
import java.util.Scanner;
public class A_Arithmetic { // A_Arithmetic 클래스 시작
	
	/* 
	 * 산술 연산자 => 이항 연산자, 우선순위가 일반 수학 산술과 동일
	 * 
	 * + : 덧셈
	 * - : 뺄셈
	 * * : 곱하기
	 * / : 나누기
	 * % : 모듈러(Modular) => 나눗셈에서의 나머지를 구함
	 * 
	 */
	
	
	
	public void method1() { // method1 시작
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println("num1 + num2 : " + num1 + num2);
		// "num1 + num2 : 103" (문자열과 num만남 -> 전부 문자열이 됨)
		// 13출력 원할 경우, (num1 + num2)묶어 우선순위 정해주면
		// int먼저 계산, 10 + 3 나옴
		// 묶지않고 연산하면 String(문자열)로 인식하기 때문에
		// "10" + "3" 결과값으로 "103"이 찍힘
		
		// System.out.println("num1 + num2 : " + num1 - num2); 말이 안됨
		// "num1 + num2 : num1"까지 문자열 인식했는데  int num2 빼라?
		// 문자열과 num1을 하나로 묶은 뒤 String형태에서 정수를 빼는 꼴이기때문에 빨간줄이 생김!
		// 뺄셈의 경우 괄호로 묶어야함
		
		System.out.println("num1 X num2 : " + num1 * num2);
		System.out.println("num1 / num2 : " + num1 / num2);
		System.out.println("num1 % num2 : " + num1 % num2);
		System.out.println("num1 X num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("num1 % num2 : " + (num1 % num2));
		// *, /, %는 우선순위가 +, -보다 높기때문에 묶지 않아도 먼저 연산
		// 단, 가독성을 위해 괄호를 사용하는 것을 권장
		
		// *에러발생 * 특이케이스 : 정수 0으로 나누려 할 때
		/* 								  첫 줄부터 아예 실행이 안되는건 아님 (한줄씩 실행이니까)
		 * int num3 = 0;				 <- 여기까지 실행 됨
		 * System.out.println(5 / num3); <- 이 행에서 에러나서 멈춘것뿐
		 * 정수를 0으로 나눌 순 없음
		 * ArithmeticException : /by zero
		 * p.s. 콘솔창 에러코드 저렇게뜸! 추후 exception파트에서
		 */ 
		
	}  // method1 끝
	
	
	
	public void presentToStudent() {
		
		// xxx의 나눔 프로젝트
		// 메소드명 : presentToStudent()
		// 입력받을값 : 1. 신청인원 수
		//			 2. 선물의 개수
		
		// 1인당 가질 수있는 선물의 개수 : 선물 개수 / 신청 인원 수
		// 남은 선물의 수 : 선물개수 % 신청 인원수
		
		// 출력 형식
		// 신청 인원 당 받을 수 있는 선물의 개수 : x개
		// 남는 선물의 개수 : x개
		
		// 스캐너 클래스 가져와서 생성
		
		Scanner getInfo = new Scanner(System.in);
		System.out.println("안녕하세요! 몇명에게 나눠줄건가요? (숫자만 입력) > ");
		
		int numberOfPeople = getInfo.nextInt();
		System.out.println("준비된 선물 개수를 입력해주세요. (숫자만 입력) > ");
		
		int numberOfgift = getInfo.nextInt();
		
		int giftPerPerson;
		giftPerPerson = (numberOfgift / numberOfPeople);
		int giftLeft;
		giftLeft = (numberOfgift % numberOfPeople);
	
		System.out.println("신청 인원 당 받을 수 있는 선물의 개수 : " + giftPerPerson);
		System.out.println("남은 선물의 개수 : " + giftLeft);
		
		/* 여기선 재사용 안할거니 변수선언 굳이 메모리낭비임 한번쓸거니 그냥 프린트해도 될듯
		 * System.out.println("학생 한 명당 가질 수 있는 선물의 개수 : " + (present / students));
		 * System.out.println("남는 선물의 개수 : " + (present % students));
		 * */
	}
	
	
	
}  // A_Arithmetic 클래스 끝

/* Q. 입출력 아이디 첫글자 소문자 대문자 같게 인식?
 * A. 메소드 체이닝을 사용해 간단하게 처리할 수 있음, 하는 방법은 String 클래스를 배울 때 자세하게 다룰 예정, 추후수업 
 */

