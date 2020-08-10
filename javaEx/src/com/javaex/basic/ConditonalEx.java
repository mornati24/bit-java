package com.javaex.basic;

import java.util.Scanner;

public class ConditonalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifElseEx();
		//ifElseEx2();
		//ifElseEx3();
		//switchEx();
		//switchEx2();
		//whileEx();
		//whileEx2();
		//whileEx3();
		dowhileEx();
	}
	
	public static void ifElseEx() {
		// Scanner로 점수를 입력
		// 점수가 60점 이상이면 "합격"
		// 그렇지 않으면 "불합격" 출력
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		//판별(의사결정)
		if(score >=60) {
			// 비교값이 true일때 실행
			System.out.println("합격");
		}
		else {
			// 비교값이 false일때 실행
			System.out.println("불합격");
		}
	}
	
	public static void ifElseEx2() {
		//정수 입력
		//0보다 크면 양수, 0이면 0, 0보다 작으면 음수 출력
		//if, else if, else
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력 : ");
		int num = scanner.nextInt();
		/*
		if (num > 0) 
			System.out.println("양수");
		else if (num == 0)
			System.out.println("0");
		else
			System.out.println("음수");
		scanner.close();
		*/
		
		//중첩 if : 1차로 필터링
		//  내부블럭 안쪽에서 2차로 조건 판별
		if (num == 0) {
			//0일떄
			System.out.println("0");
		}
		else {//0이 아닐때
			if (num >0) {
				//양수
				System.out.println("양수입니다");
			}
			else {
				System.out.println("음수입니다");
			}//음수
		}
		scanner.close();
	}
	
	public static void ifElseEx3() {
		// 과목 버호 입력
		//1 : R101, 2 : R202, 3 :R303, 4:R404, 나머지 관리자 문의
		Scanner scanner = new Scanner(System.in);
		System.out.print("1: C, 2: C++, 3: JAVA, 4: Python - 입력 : ");
		
		int code = scanner.nextInt();
		if(code == 1) {
			System.out.println("R101");
		}
		else if(code == 2) {
			System.out.println("R202");
		}
		else if(code == 3) {
			System.out.println("R303");
		}
		else if(code == 4) {
			System.out.println("R404");
		}
		else {
			System.out.println("관리자에게 문의");
		}
		
		scanner.close();
	}
	
	public static void switchEx() {
		// ifElseEx3와 동일한 내용을 switch로 작성
		//switch는 전달받은 변수의 값을 이용해서 흐름을 제어(==)
		Scanner scanner = new Scanner(System.in);
		System.out.print("1: C, 2: C++, 3: JAVA, 4: Python - 입력 : ");
		
		int code = scanner.nextInt();
		switch(code) { // switch는 변수의 값을 비교 흐름 제어
		case 1 : //code == 1
			System.out.println("R101");
			break;// case와 break는 세트다
		case 2 : //code == 2
			System.out.println("R202");
			break;// case와 break는 세트다
		case 3 : //code == 3
			System.out.println("R303");
			break;// case와 break는 세트다
		case 4 : //code == 4
			System.out.println("R404");
			break;// case와 break는 세트다
		default :
			System.out.println("관리자에 문의");
		}	
		scanner.close();
	}
	
	public static void switchEx2() {
		//월정보(정수) 입력
		// 1 3 5 7 8 10 12-> 31일
		// 2 -> 28일
		// 4 6 9 11 -> 30일
		Scanner scanner = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = scanner.nextInt();
		String days = "";
		
		switch(month) {
		case 1 :
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = "31일";
			break;
		
		case 2:
			days = "28일";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = "30일";
			break;
		default :
				days = "?";
		}
		System.out.println(days);
		scanner.close();
	}
	
	public static void whileEx() {
		//반복문을 사용, 1부터 100까지 숫자를 합산하여 출력
		int num = 1; // 시작값, 조건 비교
		int total = 0; // 합산 변수
		// while loop
		while (num <=100) { // num가 100이하인동안 반복
			total += num; // total = total + num;
			// 주의 : while문은 반복조건을 개발자가 직접 컨트롤 해줘야 한다.
			num ++; // 101이 됬을때 조건문 실행 X
		}
		System.out.println("합산값 : " + total);
	}
	
	public static void whileEx2() {
		//단수를 입력, 해당 단의 곱셈표를 출력
		Scanner scanner = new Scanner (System.in);
		System.out.print("단을 입력 : ");
		int dan = scanner.nextInt();
		//제어용 변수
		int i = 1;
		
		while (i <= 9) { // 9이하일 동안 반복
			System.out.println(dan + " * " + i + " = " + (dan * i));
			//종료를 위한 제어변수를 잘 제어
			i++;
		}
		scanner.close();
	}
	
	public static void whileEx3() {
		//while은 종료를 위한 제어변수를 잘 제어하여 무한루프를 빠지지 않게 해야한다
		//경우에 따라서 의도적으로 무한루프 사용
		while(true) {
			System.out.println("무한루프, ctrl C 로 종료");
		}
	}
	public static void dowhileEx() {
		//숫자를 입력받아서 합산
		//0을 입력받으면 반복을 종료
		int num = 0;
		int total = 0;// 합산 변수 
		Scanner scanner = new Scanner(System.in);
		//최소 1번을 실행해야 하는 반복 do while
		// or 반복 조건이 loop 문 내부에서 결정되는 경우 do while 
		do {//일단 실행
			System.out.print("정수입력. (0입력시 종료) :");
			num = scanner.nextInt();
			total += num;
		}
		while(num != 0);
			System.out.println("합산값 : " + total);
			scanner.close();
	}
	
}
