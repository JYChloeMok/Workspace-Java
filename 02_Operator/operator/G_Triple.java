package com.kh.operator;

import java.util.Scanner;
public class G_Triple {
	
	
	/* 삼항 연산자 : 피 연산자가 3개 => 값 3개와 연산자 1개로 이루어짐 (조건식 형식으로 쓰임)
	 * 대부분의 간단한 조건문의 경우 삼항연산자로 대체 가능
	 * 
	 * 조건문 : 결과값에 따라서 연산을 처리하는 방식
	 * 		   결과값이 참일 경우 첫 번째 식을 처리하고,
	 * 		   결과값이 거짓일 경우 두 번째 식을 처리하는 방식
	 * 
	 * [ 표현식 ]
	 * 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 * 
	 */
	
	
	public void method1() { // method1() 시작
		// Q. 사용자가 입력한 값이 양수인지 아닌지 판별 후 그에 맞는 결과 출력해보세요!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		
		// 출력할 것 : 10은 0보다 크다!!
		// 		   -7은 0보다 크지않다!!
		/* System.out.println(10		+	"은 0보다		크다!!");
		 * System.out.println(-7		+	"은 0보다		크지않다!!");
		 */
		System.out.println(num + "은 0보다 크다!!");
		System.out.println(num + "은 0보다 크지않다!!");
		
		String result1 = (num > 0) ? "크다" : "크지않다";
		// 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
		
		
		// 중첩해서 3항연산자 안에 3항연산자 사용 가능
		String result2 = (num > 0) ? "크다" : (num == 0) ? "크지도 작지도 않다" : "크지 않다";
		/* String result2 = (num > 0) ? "크다" 
		 * 				  : (num == 0) ? "크지도 작지도 않다" : "크지 않다";
		 * 길어지면 이런식으로 줄 띄움
		 */
	} // method1() 끝
	
	

	public void method2() { // method2() 시작
		// 사용자에게서 값을 입력받아 짝수 / 홀수를 판별해보자!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		// num % 2 != 0 ? "홀수"
		// num % 2 == 1 ? "홀수"
		// num % 2 == 0 ? "짝수"
		
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		// 10은(는) 짝수
		// 7은(는) 홀수
		
		System.out.println(num + "은(는)" + result);
	} // method2() 끝
	
	
	public void method3() { // method3() 시작
	// Q. 사용자에게 영문자를 하나 입력받아서 소문자인지/대문자인지 판별!
		
		Scanner sc = new Scanner(System.in);

		System.out.println("영문자를 하나 입력해주세요 >");
		int num = sc.next().charAt(0);			// 자동형변환
												// tips. 어짜피 비교연산자는 숫자이고, int와 char자동형변환 되니까 애초에 int로 받으면 효율적
												// 		 ch = 'a' ~ 'z'이거나 'A' ~ 'Z'니까  ch < 'a'로 비교
		
		String result = ('a' < num) && (num < 'z') ? "소문자입니다" : "대문자입니다";
		System.out.println(num + "는 " + result);
	} // method3() 끝
	
	
	public void method4() { // method4() 시작
		// Q. 문자 3개를 입력받아서 다 똑같다! 하나라도 다르면 다르다! 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 문자를 입력해주세요 > ");
		char one = sc.next().charAt(0);
		
		System.out.println("두번째 문자를 입력해주세요 > ");
		char two = sc.next().charAt(0);
		
		System.out.println("첫번째 문자를 입력해주세요 > ");
		char three = sc.next().charAt(0);
	} // method4() 끝
	
}
