package com.kh.variable;
// #3 July, 04

import java.util.Scanner;

public class B_KeyboardInput { // 키보드인풋 클래스 시작
	
	// 내 프로젝트를 다른 곳에서 사용
	/* 집에서 작업물 키려니 에러, 해결법
	 * 		1. 형상관리도구 (Git처럼 / 지금은 skip)
	 * 		2. .java파일 보내고 메모장, 워드 등으로 열기
	 * 		3. 프로젝트에서 Export > General에 Archive file > 압축파일 생김
	 * 		   Import > Projects from folders and archive files > 압축파일 선택하고 열기
	 *		파일 빨간줄    : projects 우클릭 후 Build Path가서  JRE System Library버전 내껄로 수정
	 *		한글만 깨지면 : 설정에 text file encoding가서 UTF-8로 변경
	 */
	
	 // ★★★ 개발 할 때(특히 공유할 때, 소스파일 내보내거나 할 때 등) 무조건 주의 : 한글사용x > 한글 오류남
	/* 		공백 금지, 한글 금지, 특수문자금지(일부제외 전부 x)
	 * 		(파일명이나 경로에 있거나 하면 오류)
	 * 		악습관 들이면 최악의 경우 포맷
	 */
	
	// 키보드를 이용해서 사용자에게 입력값을 받아보자!
	/* 자바에서 이미 제공하고 있는 Scanner라는 클래스를 사용할 것!
	 * Scanner클래스에 존재하고 있는 메소드들을 호출해서 입력을 받자!
	 */
	
	
	
// #1 July, 05	
	// 입력받기 (사용자가 입력 가능 => 스캐너 클래스 import, 스캐너 클래스의 메소드를 사용)
	/*		1. import java.util.Scanner;로 스캐너 클래스 임포트
	 *		2. 스캐너클래스 자료형, new이용  생성
	 *		3. new 생성 시 Scanner의 괄호 ()안에 System.in을 넣어줌
	 *		p.s. System.out.println("입력 해주세요~"); 메세지 출력 필요
	 *			 System.in : 입력받는 값들을 바이트단위로 받아들이겠다 (p.s. 추후 자세히 배울것)
	 */
	
	// Q. 사용자의 인적사항을 입력받아서 출력해보자!
	/* 		1. 입력받고자 하는 내용을 먼저 질문해서 입력을 유도
	 *	    System.out.println("이름을 입력해주세요 > ");
	 * 		2. 입력받은 값으로 출력하려면 먼저 변수 생성해야함
	 */
	// 사용자가 입력한 값을 문자열로 받아오는 메소드 : nextLine(), next()
	/* 		이름은 무조건 문자열로밖에 받을 수 없으니 문자열 변수 생성, 이를위해 Scanner의 메소드 사용
	 */
	// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백문자 이전까지만 입력
	/* 		Buffer에 루 ' ' 잉 구 이렇게 루 공백문자 잉 구 한 글자씩 보관됨
	 * 		아래 핸드폰번호 입력받는 코드 에러났을 때 (버퍼 안비웠을 때)
	 *		System.out.println("핸드폰 번호를 입력해주세요 (-없이) > "); 까지는 잘 돌아간 것
	 */
	
	
	
	public void inputTest() { // inputTest()함수 시작
		
		// 상단 Scanner클래스 import => new로 생성 arg에 System.in
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요. > ");
		
		// ●이름		next()
		String name = sc.next();
		System.out.print(name + "님 안녕하세요!");
	
		// ●핸드폰 	nextInt()	nextDouble()
		System.out.println("핸드폰 번호를 입력해주세요 (-없이) > ");
		int phoneNumber = sc.nextInt();
		System.out.println(name + "님의 핸드폰 번호 : " + phoneNumber);
		/* 보통 웹사이트 앞의 0 빼고인식, 010으로 출력원하면 출력문 앞에 0 붙여줘도 됨																*/
		/* System.out.println(name + "님의 핸드폰 번호 : 0" + phoneNumber); 														*/
		
		// nextLine() : 사용자가 입력한 값 중 공백과 무관하게 한 문장을 다 읽어옴 개행문자를 만나기 전 까지
		// (버퍼에서 개행문자 만나기 전 까지는 다 읽음)
		// 이 지점에서 핸드폰-직장 사이 nextLine();을 호출해야 하는 이유
		// 버퍼에서 개행문자 이전까지의 모든 값을 가져온 후 "개행문자"를 비워주는 역할
		/* 		핸드폰번호 int치고 엔터를 치면 \n이 버퍼에 들어감  > \n는 개행문자 > 직장 실행안됨
		 * 		그러므로 sc.nextLine();호출해 버퍼를 비워줌 (개행문자 삭제)
		 * 		직장을 입력받을 수 있게됨
		 */
		
		// ● 직장
		sc.nextLine();	// 개행문자 지움
		System.out.println("직장이 어디세요? > ");
		String company = sc.nextLine();
		System.out.println("직장은 " + company + "입니다.");
		// nextLine()추가 안했을때 company는 빈 문자열로 출력됨
		
		// Buffer			|			RAM (공간,루잉구)
		// String 변수에 사용자 입력값 대입 시
		// 		사용자가 입력한 값이 메모리에 올라가기 전에 입력버퍼에 먼저 보관되고, 엔터를 치면 입력버퍼에 있는 값이 메모리에 올라감
		// 		문자열 한 글자씩 보관, 한 글자씩 올라감 ex) 루잉구 -> 루 보관, 잉 보관, 구 보관
	
	} // inputTest()함수 끝

	
} // 키보드인풋 클래스 끝
