package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithmeticExceptionEx();
		//indexOutOfBoundEx();
		nullPointerExceptionEx();
	}
	
	private static void arithmeticExceptionEx() {
		//스캐너로부터 정수 하나를 입력
		//0으로 나눠 보자
		Scanner scanner = new Scanner(System.in);
		double result = 0;
		int num;
		
		System.out.print("정수를 입력하세요:");
		
		// 예외가 발생할 수 있는 영역 -> try
		try {
		num = scanner.nextInt();
		result = 100/ num;
		} catch(ArithmeticException e) {//윗 catch 구체적 예외
			// 메세지가 담겨 있다.
			System.err.println("예외 메세지 :" + e.getMessage());
		} catch(InputMismatchException e) {
			System.err.println("정수만 입력해주세요!");
			//예외 상황 전체를 확인하고자 한다면 
			e.printStackTrace();
		} catch(Exception e) {//아래 catch 일반적 예외
			//catch문의 마지막에는 Exception 객체로 남아있을지 모를 예외를 처리
			e.printStackTrace();
		}finally {
			//예외 유무 관계 없이 항상 마지막에 수행
			//자원 정리 작업 등에 활용
			System.out.println("Finally");
		}
		System.out.println("결과:" + result);
		scanner.close();
	}
	
	public static void indexOutOfBoundEx() {
		int[] intArray = new int[] {3, 6, 9};
		System.out.println("배열의 길이 :" + intArray.length);
		//*가장 마지막 인덱스 == length -1
		try {
			// 예외 가능 코드 블락
			System.out.println(intArray[3]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("예외메세지 : " + e.getMessage());
		}
		System.out.println("End of code");
		
	}
	//가장 흔히 발생하는 예외
	public static void nullPointerExceptionEx() {
		String s= "Hello"; // 참조 객체
		s = null; // 참조 해제
		try {
			//예외 가능 블록
		System.out.println(s.toUpperCase());
		}catch(NullPointerException e){
			System.err.println("예외메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End of Code");
	}
}
