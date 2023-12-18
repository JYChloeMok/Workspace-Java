package com.kh.operator;

//July,05,#3_6  ~ July,06,#1
import java.util.Scanner;
public class F_Logical {
	
	
	/* 논리 연산자 : 두 개의 논리값을 연산하는 연산자
	 * 
	 * [ 표현법 ]
	 * 
	 * 논리값 논리연산자 논리값 => 결과값도 논리값
	 * 
	 * 종류
	 * 
	 * 1. AND연산자 : 논리값 && 논리값
	 * 		좌항과 우항의 값이 모두 true여야만 최종 결과가 true
	 * 
	 * 
	 * 2. OR연산자 : 논리값 || 논리값
	 * 		좌항과 우항의 값 중 하나라도 true이면 최종 결과가 true
	 * 
	 */
	
	
	// AND
	public void method1() {
		// Q. 사용자가 입력한 정수 값이 양수이고(이면서) 짝수 인지 확인해보세요!
		// ↓ 위의 질문을 해야할 작업 단위로 쪼개면
		/* 1. import와 new 스캐너
		 * 2. 변수공간에 입력값 초기화할 것임
		 * 3. 양수인지 (0 이상인지) 비교할것임
		 * 4. 짝수인지 (나머지값이 0인지) 비교할것
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 > ");	// 정수 입력값 받음
		int num = sc.nextInt();					// 변수에 초기화함
		
		System.out.println("0보다 큰가요? > " + (num > 0));
		System.out.println("2로나눈 나머지가 0인가요? > " + (num % 2 == 0));
		
		boolean result = (num > 0) && (num % 2 == 0);
		// 사용자가 입력한 정수가 0보다 큰가요?-> 0보다 크고, 사용자가 입력한 정수가 2로 나눴을 때 나머지가 0인가요?
		// &&의 의미 : ~~ 이면서, ~~이고, 그리고
		System.out.println("(num > 0) && (num % 2 == 0) > " + result);
	} // method1 끝
	
	
	
	public void method2() { // method2() 시작
		// Q. 사용자에게 정수값을 입력받아서 1이상 100이하인지 확인해보세요!

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 > ");
		// mis. ☆ 프린트 입력 유도 구문 꼭 넣기!! : run돌렸을 때 콘솔창에 문구가 떠 '사람이 인지할 수 있음'
		
		int num = sc.nextInt();
		// boolean result = (num > 0) && (num < 101);
		boolean result = (1 <= num) && (num <= 100);
		/* 자바에서는 1 <= num >= 100같은 복합연산자 지원 안하기때문에 하나씩 &&연산자로 비교해야함 */
 		
		System.out.println(result);
	} // method2() 끝
	

	// Q. ☆혹시 범위를 나타낼 때 (num > 0) && (num < 101)이라고는 잘 안쓰나요?
	//		compare with(1 <= num) && (num <= 100)
	// A. 1. num과 숫자의 순서의 경우(변수의 위치)
	//		센텐스에 따라 문맥의 흐름에 따라, 직관적으로 사람 입장에서 보이도록
	//		지금 예제에서는 (1 <= num)
	//    2. <, <= 사용 차이의 경우 : 보편적으로 '1이상 100이하'라고 주어지면 그 문장대로 따라감
	// 		 + 문화권 사고방식 차이(경향)도 존재
	
	
	// OR
	public void method3() { // method3() 메소드 시작
		// Q. 사용자가 입력한 값이 'A'또는 'a'인지 확인 해보세요!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("한 글자만 입력해주세요 > ");
		
		// char ch = sc.next(); => 에러발생, 문자열 중 문자하나 뽑아올 수 있는 메소드 사용필요
		char ch = sc.next().charAt(0);
		/* "안녕 나는 문자열이야" => RAM상의 칸칸칸
		 * => 칸마다 index 0, 1, 2, 3, 4, 5 단일문자가 있음
		 * index (순서) 알려줘야함
		 * p.s. 자바에서는 음수인덱스 제공 안함
		 */
		
		//Q. boolean result = 조건식! 만들어보세요
		//boolean result = (ch == 97); 안써도 됨 => 자동형변환, 단일문자의 경우 비교연산 가능하다!
		boolean result = (ch == 'a') || (ch == 'A');
		System.out.println("사용자가 입력한 글자는 소문자 a입니까?" + result);
		/* == 비교연산자는 피연산자 == 숫자
		 * 단일 문자의 경우 비교연산이 가능한가?? 가능하다!
		 * 왜? int형으로 자동형변환이 되기떄문에
		 * 
		 */
	} // method3() 메소드 끝
	
	
	
	//	    && : 두 개의 조건이 모두 true일 때 true
	/* true && true : true
	 * true && false : false
	 * false ** true : false
	 * false && false : false
	 *  
	 */
	
	//	    || : 두 개의 조건 중 하나라도 true일 경우
	/* true || true : true
	 * true || false : true
	 * false || ture : true
	 * false || false : false
	 * 
	 */
	
	
	public void mehtod4() { // method4() 시작
		// 앞을 연산해서 결과가 확실하면 뒤를 연산 안함
		
		int num = 10;
		boolean result = false && (num > 0);
		
		// Deadcode : 우항의 비교 연산은 아예 실행되지 않음
		/* 오류가 나는건 아니지만 굳이 결과값은 false일텐데 이건 왜있지?함												*/
		// tips. 이를 이용해 조금 더 효율적 코드 작성
		//		 ex) &&연산의 경우 보통 앞에 false확률이 높은 비교를 넣음 => 연산 횟수를 줄일 수 있음 
		
	} // method4() 끝

}
