package com.javaex.basic;

// 연산자 연습
public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithOper();
		intcDecOper();
		logicalOper();
		bitOper();
		conditionalOper();
	}
	// 산술연산자
	public static void arithOper() {
		// 사칙연산 : + - * /
		int a = 7;
		int b = 3;
		
		System.out.println("7/3 의 몫 " + (7/3));
		// int / int -> int (몫)
		System.out.println("7/3 의 나머지 " + (7%3));
		// 나머지 연산자 %
		
		//정확한 실수값 얻으려면 int -> float 변환
		System.out.println("7/3 실수 : " + ((float)a/(float)b));
		
		//만약 정수를 0으로 나누면? -> ArithmeticExeption
		//System.out.println("정수 나누기 0 " + (a/0));
		
		//실수를 0으로 나눈다
		System.out.println("실수/0 : " + (4.0/0));
		// 무한대에 산술연산 -> 무한대
		System.out.println("무한대의 산술 : " + (4.0/0 +10));
		// 연산 -> 계산할 수 없는 값(NaN -> Not a Number)
		System.out.println("0.0/0.0 : " + (0.0/0.0));
		// NaN 포함된 산술 연산 -> NaN(계산 불가)
		System.out.println("NaN 산술 : " + (0.0/0.0 + 20));
		// 유한수인지 확인
		System.out.println("유한수의 확인 : " + Double.isFinite(4.0/0));
		// NaN인지 확인
		System.out.println("NaN 확인 : " + Double.isNaN(0.0/0.0));
		
	}
	//증가 감소 연산자
	public static void intcDecOper() {
		//순서가 중요
		int a = 5; // a++
		int b = 5; // ++a
		
		// 후위연산자
		System.out.println(a); //5
		System.out.println(a++); //5 출력 후 +1
		System.out.println(a); //6
		
		//전위연산자
		System.out.println(b); //5
		System.out.println(++b); //5+1 하고 6출력
		System.out.println(b); //6
	}
	
	//비교, 논리 연산
	public static void logicalOper() {
		//비교 연산자 >, >=, <, <= , ==, !=
		//논리 연산자 &&(논리곱 AND), || (논리합 OR), !(논리부정 NOT)
		int n = 5;
		// n은 0초과, 10 미만인가?
		// 조건 1 : n > 0 이고 (AND)
		// 조건 2 : n < 10
		boolean b1 = n > 0;
		boolean b2 = n < 10;
		boolean r = b1 && b2;
		System.out.println("n>0 and n<10? " + r);
		//n은 0이하이거나, 10 이상인가?
		// 조건 1 : n <= 0(OR)
		// 조건 2 : n >= 10
		b1 = n <= 0;
		b2 = n >= 10;
		r = b1 || b2;
		System.out.println("n<=0 or n>=10?" + r);
		// !(논리부정) : 논리값을 뒤집는다(true <-> false)
		boolean notR = !r;
		System.out.println("논리부정 : " + notR);
	}
	
	//비트 연산자
	public static void bitOper() {
		// and(&), or(|), not(~)
		// 정수형 데이터를 비트 단위로 제어하는 연산자
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2; // bit and연산
		System.out.println(Integer.toBinaryString(result)); //0101
		result = b1 | b2; // bit or연산
		System.out.println(Integer.toBinaryString(result)); //1111
		result = ~b1; // bit not연산 0<->1
		System.out.println(Integer.toBinaryString(result)); //111...0010
		System.out.println(result); // 맨앞의 1을 -로 인식해서 -14
		//비트 시프트
		// >> : 비트 왼쪽으로 이동(2배수 곱), << 비트 오른쪽으로 이동(2배수 나눗셈)
		int val = 1;
		System.out.println(val);
		// 왼쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(val<<1));
		val = 0b100;
		// 오른쪽으로 2비트 이동
		System.out.println(Integer.toBinaryString(val>>2));
	}
	
	//3항 연산자
	public static void conditionalOper() {
		//논리 비교 ? 참일때 : 거짓일때
		// 간단한 값의 제어, 코드 가독성을 높일 수 있다.
		int a = 10;
		// a가 짝수면 "짝수", 아니면 "홀수" 문자열 반환
		String message = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println("a는 짝수입니까? " + message);
		int score = 60;
		// 점수가 80 이상이면 Good
		// 점수가 50 이상이면 Pass
		// 그렇지 않으면 Fail
		message = score >= 80 ? "Good" :  score >=50 ? "Pass" : "Fail"; //중첩이 가능하긴 하지만 가독성이 떨어지기 때문에 추천 X, 복잡한 비교는 비교문으로 해결
		System.out.println("시험결과 : " + message);
	}
	
}
