package com.kh.second;

public class Run {
//	HelloWorld�� ��쿡�� ���� Ŭ������ �޼ҵ� calling
//	runŬ���� ���ο���, �ܺ��� Ŭ������ calling
	
// Today's Subject : �ܺ� Ŭ������ �ִ� �޼ҵ带 ȣ���ϰ� ���� ���� ��� �ؾ� �ϴ°�?
/* 1. ȣ���� �޼ҵ尡 �����ϴ� Ŭ������ ����(new)�� ����� ��
 * 	[ ǥ���� ]
 * 	"Ŭ�����̸�" "Ŭ������ �뺯�� �̸�(��Ī.����)" = new Ŭ�����̸�();
 * 
 *	 �س��߿� ��� �ٷﺼ ��
 */
	
	
	public static void main(String[] args) { // ���θ޼ҵ� ����

		/* ���� Ŭ������ �����̸� method�־, Ÿ Ŭ������ �־  ��밡�� / ��� Ŭ���� ��� �޼ҵ����� ���� */
		MethodController mc = new MethodController();
		
		/* MethodA(); */
		/* . ���������� / �������ٿ����� */
		mc.methodA();
		mc.methodB();
		mc.methodC();
		
		
		
				
	} // ���θ޼ҵ� ��

}
