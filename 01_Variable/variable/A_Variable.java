package com.kh.variable;
// #2_1 July, 04

public class A_Variable {

	public void calPay() {

		// 주제 : 변수를 사용하면 무엇이 좋은가?
		// ------------- ↓ 변수 사용 전 ↓ ------------- //

		// 주급 = 시급 * 근무시간 * 근무일수
		/* 예제) 주급 계산을 해주는 메소드 */
		System.out.println("--- 변수를 사용하기 전 ---");
		System.out.println("시급 : 9620원");
		System.out.println("근무시간 : 8시간");
		System.out.println("근무 일수 : 5일");

		// 자바에서 *기호는 값과 값을 곱할 때 사용
		// 자바에서 +기호는 값과 값을 붙일 때 사용
		/* ( )안에는 한가지 타입만 들어갈 수 있음
		 * 그러므로 +로 같은 괄호 내 써줌
		 * 어떤 것이든 +로 붙여주면 하나의 문자열이 됨 */

		/* System.out.println("루잉구 : "9620*8*5+"원"); */
		System.out.println("1루잉구 : " + 9620 * 8 * 5 + "원");
		System.out.println("2루꾸꾸 : " + 9620 * 8 * 5 + "원");
		System.out.println("3루삥삥 : " + 9620 * 8 * 5 + "원");

		// 추가변경사항 생김 ex)시급이 9920으로 인상된 경우
		System.out.println("1루잉구 : " + 9920 * 8 * 5 + "원");
		System.out.println("2루꾸꾸 : " + 9920 * 8 * 5 + "원");
		System.out.println("3루삥삥 : " + 9920 * 8 * 5 + "원");
		/* 하나하나 변경해야함, 반복입력 중 실수로 값을 잘못 입력할 수도 있음 */

		// 추가변경사항 생김 ex)하루 더 일하는 경우
		System.out.println("1루잉구 : " + 9920 * 8 * 6 + "원");
		System.out.println("2루꾸꾸 : " + 9920 * 8 * 6 + "원");
		System.out.println("3루삥삥 : " + 9920 * 8 * 6 + "원");
		/* 이런 식으로 하나하나 복붙하면서 고생 */
		
		
		
		// +tips 코딩할 때 중요한 것 = 남이 읽는다
		/* 명시성 위해 금액에 괄호 친다든가, 남이 본다는걸 항상 염두에 두고 가독성 좋게 작성 */
		System.out.println("1루잉구 : " + 9920 * 8 * 6 + "원");
		System.out.println("1루잉구 : " + (9920 * 8 * 6) + "원");
		
		
		
		// ------------- ↓ 변수 사용 후 ↓ ------------- //
		 /* 시급, 근무시간, 근무일수라는 값을 담을 공간
		  * 즉, 변수를 선언하고 그 안에 값을 담는다		*/
		
		// 공간에 값을 넣음
		int pay = 9620;
		int time = 8;
		int day = 6;
		
		// 변수 이름만 부르면 공간안에 담긴 값이 튀어나옴
		System.out.println("시급 : " + pay + "원");
		System.out.println("근무시간 : " + time + "시간");
		System.out.println("근무일수 : " + day + "일");
		System.out.println("루잉구 : " + pay * time * day + "원"); /* 이제 위의 상수(숫자)부분을 변수 이름으로 대체 가능 */
		
		
		 // 변수를 사용했을 때 장점
		/* 1. 단 한번  값을 기록하면서 필요할 때 마다 재사용이 가능 => 재사용성
		 * 2. 변수는 값에 의미를 부여하기 위해 사용 => 가독성이 높아짐
		 * (값만 써놓으면 이게 무슨 의미인지 불명확할 수 있는데, 값에 이름을 붙임으로서 의미가 생김, 사람이 읽는 언어가 됨)
		 * 
		 * 가독성과 재사용성이 높아지면 유지보수가 용이해짐
		 */
	} /* pay등 내가 선언한 변수는 여기까지만 살아있을 수 있음, {메소드블럭} 안, calPay블록이 끝나는 순간 얘는 사라짐 */
	
	
	
	public void declareVariable() { // declareVariable 영역 시작
		
		// 변수의 선언
		/* 변수 선언 방법
		 * 		* 변수타입(자료형) 변수이름;
		 * 		int pay;

		 * 같은 타입의 변수를 선언할 때는 한꺼번에 선언할 수 있음
		 * 		ex) int pay, day, time; > 그러나 가독성 안좋아 그냥 line별로 선언함
		 * 변수를 선언하고 난 뒤에 처음 값을 대입하는 것(initialization)을 초기화라고 함
		 * 초기화를 진행하여 대입한 값은 초기값이라고 함
		 */
		
		// (지역)변수
		/* System.out.println(pay); 변수는 {}중괄호 안에서 선언되고 사용됨  */
		
		
		// 변수 이름 짓기
		/* 식별자 (Indentifier)
		 * 		: 모든 이름을 식별자라 함
		 * 		클래스명, 메소드명, 변수명 등 사용자가 만들어서 이용하는 고유한 이름
		 * 
		 * - 식별자를 생성할 때 꼭 지켜야하는 규칙(안지키면 안만들어짐 error발생)
		 * 		: 1. 대소문자 구분하고 길이제한은 없음
		 *			ex) int pay;와 int pAy;는 다른 변수(다른 공간)로 인식
		 *		  2. 문자, 숫자, _, $ 사용가능 (한국어, 기타 다른 나라 글자 에러는 안남)
		 *		  3. 문자, _, $로만 시작할 수 있음
		 *			숫자로 시작할 수는 없음 (중간, 끝 모두 되지만 보편적으로 뒤에 붙임)
		 *		  4. 공백은 포함할 수 없음
		 *		  5. 키워드(예약어)는 식별자로 사용할 수 없음
		 * 
		 * - 식별자 이름 규칙 (개발자들의 약속) (name convention은 '언어마다 다름!')
		 *   (자바웹개발의 명명규칙도 추가적으로 있음, 나중에 다룰것)
		 *		: 1. 클래스 / 인터페이스 이름 규칙
		 *			- 명사, 형용사를 서술적으로 연결해서 사용
		 *			- 첫 글자를 '대문자'로 표기
		 *			- 연결된 단어들의 첫 글자도 대문자로 표기
		 *			ex) HelloWorld
		 *
		 *		  2. 변수 이름 규칙
		 *			- 명사적 의미를 갖게 만듬
		 *			- 첫 글자를 '소문자'로 표기
		 *			- 연결된 단어들은 대문자로 표기
		 *			ex) phoneNumber
		 *
		 *		  3. 메소드 이름 규칙
		 *			- 동사적 의미를 갖게 만듬
		 *			- 첫글자 '소문자'표기
		 *			- 연결된 단어들은 대문자로 표기
		 *			- 메소드명을 짓고나서 제일 뒤에 한쌍의 소괄호 "()"를 붙임
		 *			- 메소드명은 일반적으로 _를 사용하지 않음
		 *			  (클래스나 변수도 잘 사용하지 않지만 메소드는 정말 특별한 일이 있는게 아닌 이상 _사용 안함)
		 *			ex) calPay();, join();
		 *
		 *		  4. 상수 이름 규칙
		 *			- 문자를 대문자로 표기
		 *			- 단어와 단어는 _를 사용해 구분한다
		 *			ex) LOGIN_OK
		 */
		/* p.s 보통 회사마다 규칙이 있음, 팀마다, 프로젝트마다 등 변수이름 이렇게 지으라고 자료줌 */
		
		
		
		// ★★★변수의 자료형
		/* 컴퓨터에게 어떤 모양으로 쓸지 알려줄 수 있도록 자료형이 정해져있음 */
		
		//1. 논리형 자료형(논리값 : true, false)
		
		boolean isTrue; /* 선언, '여기는 논리값을 담아놓을 공간이다'라고 쓰는것 */
		isTrue = true; /* 값을 대입 */
		// 순서는 왼->오->대입연산자
		boolean isFalse;
		isFalse = false;	/* 초기화 */
		isFalse = true;		/* 대입 */
		// = 대입연산자
		// 왼쪽의 '공간'에 오른쪽의 '값'을 넣겠다
		// ** 코드를 읽을 때는 한 행씩
		// (;으로 한 줄이 끝나고 끝났기떄문에 = 그 일이 일어났기때문에 다음 줄 일이 일어남)
		// 코드는 연속적, 한줄 한줄 보는 습관 > 내가 어디를 모르는지도 알 수 있음
		
		// System.out.println(isTrue);
		/* boolean isTrue;
		 * 는 논리적으로 성립되지 않음 선언도 안됐는데 프린트하려 하기때문에 말이 안되는 문장
		 */
		boolean isFlag;
		
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("isFalse : " + isFalse);
		
		// 변수!! 는 초기화(initialize)를 진행하지 않으면 사용할 수 없음
		// System.out.println("isFlag : " + isFlag);
		/* 초기화가 안됐기때문에 사용불가 */
		
		/* 메소드 시작하는 곳에서 변수를 먼저 선언하는게 좋다 */
		
		
		
		// 2. 숫자형 자료형
		/* 정수형 4가지 유형이 있음
		 * 		정수형 예약어는 byte, short, int, long
		 * 		int형을 주로 사용하면 됨
		 * 		정수형의 기본형은 int고 long형을 사용할 때는 할당할 숫자 뒤에 "L"을 붙여야 함
		 * 
		 * 실수형에는 2가지 유형이 있음
		 *		float, double이라는 키워드를 사용하고 double을 사용함
		 *		float형은 사용하려면 할당할 숫자 뒤에 "F"를 붙여야 함
		 */
		// note. 스택 오버플로우 (프링글스 통 터짐) > 메모리 양은 한정되어있음
		/*	지금 사양으로도 이렇게 폭발하는데 옛날 메모리는 한계가 컸음 > 메모리 공간 관리 필요성 > 낭비되지 않아야함 > 자료형
			public void bombA() {
				System.out.println("안녕 나는 A야");
				bomB();
			}
			public void bomB() {
				System.out.println("안녕 나는 B야");
				bombA();
			}
		*/
		
		// 2_1. 정수형
		byte bNum = 1;	// 1Byte (표현범위 256개, -128 ~ 0 ~ 127)
		short sNum = 2;	// 2Byte
		int iNum = 3;	// 4Byte
		long lNum;		// 8바이트
		lNum = 4L; /* 뒤에 대문자 L 붙임 */
		
		// 2_2. 실수형
		float fNum = 2.22F;		// 4Byte
		double dNum = 3.333333; // 8Byte
		
		
		
		// 3. 문자형 자료형
		char ch; // 2Byte
		ch = 'c'; // 단일 문자에는 반드시 홑따옴표를 붙여줌
		
		
		// ------------- ↑ 여기까지가 기본자료형 primitive types ↑ ------------- //

		
		// 4. 문자열형 : 참조 자료형 reference type => 주소를 담는다
		/* 기본자료형일 수 없음 (왜냐면 크기를 얼마나 할당해 줘야할지 알 수 없음) */
		String str;   /* 이름이 대문자 시작, 클래스&인터페이스와 같은 형태 */
		str = "루잉구"; // 문자열형 같은 경우 반드시 쌍따옴표를 붙임 > 자세한 내용은 추후에
		
		
		
		// 1. 9개의 자료형을 선언함
		// 2. 9개의 값의 초기화를 진행함
		// 3. 9개의 값이 잘 들어갔는지 확인해보기!!
		// 출력 형식 == 변수이름 : xxx
		
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		
		
		
		// 출력문의 종류
		/* ** 프로그래밍에서 줄바꿈은 '개행한다'고 표현
		 * System.out.println();	출력 후 줄바꿈 => 개행해줌
		 * System.out.print();		출력해줌 => 개행하지 않음
		 * System.out.printf();		("출력하고자 하는 데이터의 형식"); => f는 format, 개행하지 않음
		 * 
		 * 한글 외에도 영어 / 일본어 / 한자를 알면 자료 서칭하기 좋음
		 */
		
		// 예시) System.out.printf();
		
		System.out.print("print" + "isTrue의 값은 " + isTrue + "입니다.");
		// isTrue의 값은 true입니다. 라는 형식으로 출력하고싶음
		/* System.out.printf("isTrue의 값은 %b입니다."); */
		/* %b써서 자리에 구멍을 뚫어둠 이 상태에선 출력 오류남 > 자리만 만들고 값을 안줬기떄문에 */
		System.out.printf("isTrue의 값은 %b입니다.", isTrue);
		/* 변수 타입에 따라 뚫어야하는 구멍 %b이 다름 */
		// => 구멍의 개수와 메꿀 변수의 개수와 순서, 종류가 명확해야 한다
		/* %b : true, false와 같은 논리형 변수를 담기위한 소켓
		 * %d : 정수는 decimal의 d사용, byte, short, int, long, 정수형 변수를 담기위한 구멍
		 * %f : float, double 실수형 변수르 담기위한 소켓
		 * %c, %C : char문자형 변수를 담기위한 소켓
		 * %s, %S : String문자열형 변수를 담기위한 소켓
		 */
		
		
		System.out.printf("개행 안해줌");
		// 개행 필요 시  println메소드사용 혹은 개행문자\n사용
		/* 원하는 위치에 System.out.println();을 추가
		 * 탈출문자(escape characters) 중 개행문자 \n사용 : System.out.printf("\n진짜?");
		 * p.s. 탭도 있음 \t : 탭을 넣어 탭만큼의 공백 만들어줌
		 */
		
		System.out.println(fNum);
		// 소수점 특정 자리까지  출력 원할 때 실수의 소켓 %f에 " %.자릿수f "로 자릿수 명시
		System.out.printf("fNum의 값은 %.2f입니다. \ndNum의 값은 %.1f입니다. \n", fNum, dNum);
		/* p.s. 실수자료형으로는 연산하면 안됨 (부동소수점 방식이라 오차발생) */
		/* \n은 다음꺼 인식안시켜줌
		System.out.println("개행을 위해서는 \\n을 사용합니다.");
		*/
	}
		
	
	
	// 상수 : 값을 변경하지 않을 변수
	public void constant() {
			
		int num = 10;
		System.out.println(num);
		num = 20;
		System.out.println(num);
		/* 몇천줄 이상의 긴 코드가 있어도 num값이 변하지 않았으면 좋겠을 때 사용 */
		//상수 활용 예시
		/* 1760년부터 올해의 년도까지를 계산하는 메소드
		 * [표현법] final 자료형 상수이름;
		 */
		final int START_YEAR = 1760;
		// 이 값을 고정할 것이므로, 그것이 상수 사용의 목적이므로, 상수는 선언 시 무조건 초기화
		/* 이 값은 재할당이 없을것 */
		/* 상수임을 표현하기 위해 모두 대문자로 쓰고 단어와 단어 사이에 언더바 넣음 */
		}
		
} // declareVariable 영역 끝
/* tips. ㅇㅇ영역 시작, ㅇㅇ영역 끝, 이런 식으로 코드블럭 시작 끝에 표시 레이블링 해두면 초보자일때 블럭 구분하기 좋음 */
