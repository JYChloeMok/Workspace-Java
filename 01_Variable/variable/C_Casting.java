package com.kh.variable;

// #2 July, 05
public class C_Casting { // Casting 클래스 시작
	
	// ★★★★★형변환 (Type Casting) : 자료형을 바꾸는 개념★★★★★
	// ★★★★★중요!★★★★★ 자바에서 값을 처리하는 규칙
	/* 		1. = (대입연산자)를 기준으로 왼쪽, 오른쪽이 같은 자료형이어야 한다 (1번이 제일중요)
	 * 		   => 같은 자료형에 해당하는 리터럴값만 대입할 수 있음
	 * 		   => 자료형이 다를 경우? == 값을 바꿔서 대입해야함
	 * 
	 * 		2. 같은 자료형들끼리만 연산이 가능함
	 * 		   => 자료형이 다른데 연산이 하고싶다?? => 둘 중에 하나를 "형변환"해서 나머지 하나와 동일하게 만들어야만 함
	 * 
	 * 		3. 연산의 결과물도 반드시 같은 자료형이어야 한다
	 * 		   ex) 1 + 1 = 2(정수), 1.1 + 1.1 = 2.2(실수)
	 * 
	 * [ 표현법 ] (바꿀자료형)값
	 * 형변환 연산자, cast연산자
	 * 
	 * 형변환의 종류
	 * 		1. 자동형변환 (Promotion) : 자동으로 형변환이 진행됨
	 *								작은 크기의 자료형 -> 큰 크기의 자료형
	 *								내가 형변환을 할 필요가 없음 (크기, 즉 수의 표현범위만 다름)
	 * 
	 * 		2. 강제형변환 (Type Casting) : 자동형변환이 이루어지지 않는 경우에 진행
	 * 								       직접 내가 형변환을 해야할 때!! => ()을 통해서 진행
	 */
	
	
	
	// 자동형변환 : 작은 바이트 -> 큰 바이트
	public void autoCasting() { // autoCasting 메소드 시작
		
		// 1. int(4Byte, 정수) -> double(8Byte, 실수)로 형변환 해보기
		int i1 = 10;
		System.out.println(i1);
		double d1 = i1; /* 왼쪽 오른쪽 자료형 다름 (더블 공간에 인트공간이 들어가려 함)
						 * 왼쪽읽고, 오른쪽읽고, 대입연산자 읽는 중 오른쪽 읽을 때 형태가 실수가 되어야 다음단계(대입)가 일어남
						 * 컴파일러가 자동으로 (double)i1으로 실수형태로 바꿔줌 
						 */
		System.out.println(d1);
		System.out.println(i1);
		// 자동형변환 완료! int는 정수 double은 실수 d1 = 10 -> 10.0
		
		
		char ch = 'a';
		int iNum = ch;
		ch = (char) iNum;
		
		
		// 2. int(4Byte, 정수) -> long(8Byte, 정수)
		int i2 = 120;
		long l3 = /* (long) */i2; /* 사람 입장에선 똑같은 정수지만 컴퓨터 입장에서는 아님
		 						   * 자료형이 다르지만 변환 후 값손실 등 문제가 있을 가능성 없기때문에 컴퓨터가 자동으로 (long)붙여줌 */
		System.out.println(l3);
	
		
		// 3. long(8Byte, 정수) -> float(4Byte, 실수)
		// 특이케이스 (자동으로 형변환됨) : 정수가 실수에 담길 때 큰 사이즈의 정수가 작은 사이즈의 실수자료형에 대입될 수 있음
		//						 	4Byte float형이 long형보다 표현할 수 있는 값의 범위가 더 큼
		/* 롱형은 1, 2, 3, 4 ...		|		 플롯은(실수) 1	~~~~~~~	2 사이에 수많은 수가 있음
		 * 그래서 롱 보다 실수인 플롯이 표현범위가 더 큼  */
		/* i2 = l3; 에러발생 */
		long l4 = 1000L;
		float f5 = 14;
		System.out.println(f5);
		
		
		// 4. char(2Byte) <-> int(4Byte)
		char ch1= 'b';
		System.out.println(ch1);
		char ch2 = 98;
		System.out.println(ch2);
		int num = ch1;
		System.out.println(num);		
		
		System.out.println('b' + 2); // 100
		/* 연산 시도하려 하면 큰 자료형에 맞춰 변환시킴 */
		System.out.println('b' + "2"); // b2
		/* Stirng이 제일 셈 얘는 무엇과 연산하든 무조건 String으로 만들어줌 */
		System.out.println('b' + '2'); // 148
		/* 과거 문자끼리의 연산은 말이 안됨 -> 업데이트 후 -> 문자끼리 연산해라 하면 int형으로 바꾸어 연산해줌 */
		
		
		// Q. 생각해보기		
		System.out.println("-------------------------");
		System.out.println((char)2);			 // 문자표의 십진수 2번째 문자를 뜻함
		System.out.println((char)'2');			 // 문자 '2' 십진수는50
		System.out.println((char)'2' + (char)2); // 그러므로 52
	} // autoCasting 메소드 끝
		
	
	
	// 강제형변환 : 큰 바이트 -> 작은 바이트
	//		명시적 형변환이라고도 함
	//		(바꿀 자료형)값
	public void forceCasting() { // forceCasting 시작
			
		// 1. double(8Byte, 실수) -> float(4Byte, 실수)
		double d1 = 8.0;
		float f1 = (float)d1;
		System.out.println(f1);
			
		// 2. double(8Byte) -> int(4Byte)
		double d2 = 10.1231231244;
		int i1 = (int)d2;		// <- 강제 형변환
		System.out.println(i1);
		/* 소수점 뒷부분이 절삭, 데이터가 메모리상에서 손실되어버림 */
		/* => double에 넣는다고해도 돌아오지 않음 */
		double d3 = i1;
		System.out.println(d3);
		
		System.out.println((int)'2');
	} // forceCasting 끝
		
		
		
	public void otherPs() { // 번외메소드 시작
			
		/* 번외. byte와 short간의 연산 */
		/* -128 ~ 127 */
		/* 연산은 int형으로 이뤄짐 */
		byte b1 = 126;
		byte b2 = 2;
		System.out.println(b1 + b2);
		// 결과값은 int형 => CPU가 값을 처리하는 기본 크기가 int형 크기(4Byte)
		// 				int형보다 작은 자료형간의 연산은 int로 변환, int와 int를 연산해 int결과
		
		// 비교연산자 (==)
		// : 좌항과 우항의 값을 비교해서 결과값을 반환
		// : true, false
		
		System.out.println('a' == 'b'); // F
		System.out.println(2 == (int)'2'); // 정수2 == 50(문자2)?? F
		System.out.println((char)2 == (int)'2'); // ??문자 == 단일문자2? F
		System.out.println((int)'2' == '2'); // T
	} // 번외메소드 끝
	
}
