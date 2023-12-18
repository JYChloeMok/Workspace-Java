package com.kh.operator;

// import는 "해당 클래스를 사용할 클래스에만" 하면 됨
public class B_InDecrease {
	
	
	/*
	 * 증감연산자 : 단항연산자로서 한 번에 1씩 증가 (더하거나) 감소 (빼거나)하는 연산을 한다
	 * => 먼저 증감을 할건지, 나중에 증감을 할건지에 따라서 연산자의 위치가 달라진다
	 *
	 * [ 표현법 ]
	 * ++ : 값을 1씩만 증가시키는 연산자
	 * -- : 값을 1씩만 감소시키는 연산자
	 * 
	 * 연산자의 위치
	 * 전위 연산 : ++값, --값	=> 먼저 값을 증가시키고, 그 값을 처리
	 * 						   (처리는 개발자가 시킨 그 모든것. 어쨌든 무언가 일어나기 전에 값이 증가) 
	 * 후위 연산 : 값++, 값 --	=> 값을 처리하고 나서 증가하거나 감소하겠다
	 */
	/* Q. 전위연산 후위연산 나눠놓은 이유? -> 쓰는 상황이 다름, (특히 과거) 속도 등 차이남 (나중에 구글링해보기) */
	
	
	
	// 후위연산
	public void method1() { // method1 시작
		
		int num = 10;
		System.out.println("num : " + num); // 문자열 "num : 10"
		
		num++;
		/* 원래는 값을 증가시키려면 num = num + 1;해야하지만, 귀찮음 > ++로 대체
		 * num + 1과 같음
		 */
		
		System.out.println("num : " + num); // 문자열 "num : 11"
		
		num--;
		System.out.println("num : " + num); // 문자열 "num : 10"
		
		// 예시연습Q
		System.out.println("num : " + num++); // ? -> 10 // 10을 출력하는 것이 여기서는 값을 수행, 출력하고 1 증가 11됨
		System.out.println("num : " + num++); // ? -> 11 // 11을 출력, 그리고 1 증가
		System.out.println("num : " + num);	  // ? -> 12 // 12를 출력, 1 증가
		
	} // method1 끝
	
	
	// 후위연산 예	
	public void method2() {  // method2 시작
		
		
		int a = 10;		/* a = 10 상태				  		 */
		int b = a++;	/* b에 a가 먼저 대입되고, a가 1 증가됨 */
						/* a = 11상태, b는 10상태             */
		// 1번 : b라는 int형 변수 공간을 만듬
		// 2번 : a라는 변수공간의 리터럴 값을 가져옴
		// 3번 : 가져온 리터럴 값을 b라는 변수 공간에 대입
		// 4번 : a를 1 증가
		
		// b라는 변수에 a값을 먼저 대입하고(선 처리부분 ) -> a의 값을 증가시키겠다(후 연산)
		
		System.out.println("a : " + a); // 11
		System.out.println("a : " + b); // 10
		
		
		int c = 20;	// 20이 c에 대입
		int d = c--; // c(20)이 d에 대입 -> c(20)이 감소 19
		System.out.println("c : " + c); // 19
		System.out.println("d : " + d); // 20
		
		int num1 = 20;				// 21
		int result = num1++ * 3;	// 60이 대입되고, num1이 증가
		
		
	}  // method2 끝
	
	
	// 전위연산	
	public void method3() { // method3 시작
		
		int a = 10;		// 11
		int b = ++a;	// a는 여기서 이미 11이 됨, 그리고 b공간에 넣음
		System.out.println(a);
		System.out.println(b);
		
		int num1 = 20;
		int result2 = ++num1 * 3;
		System.out.println(num1);		// 21 
		System.out.println(result2);	// 63
	} // method3 끝

}
