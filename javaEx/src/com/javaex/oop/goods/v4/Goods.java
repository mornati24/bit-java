package com.javaex.oop.goods.v4;

//v4
//this
public class Goods {
	//필드 (속성)
	
	private String name;
	private int price;
	
	//생성자 오버로딩 : 생성자는 여러개 있을 수 있다.
	//생성자 1
	public Goods(String name) {
		System.out.println("생성자 1");
		this.name = name;
	}
	
	public Goods(String name, int price) {
		// 이미 일부의 정보를 초기화하는 생성자 있을시
		//this()로 호출, 나머지정보 초기화
		// 설정정보가 복잡할 경우, 코드 중복 줄이기
		//this.name = name;
		
		this(name);
		System.out.println("생성자 2");
		this.price = price;
	}
	// Getter / Setter
	// 은닉된 필드를 우회 접근하기 위한 메서드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		// this : 해당 인스턴스 자신을 가리키는
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//메서드
	public void showInfo() {
		 // 내부 필드의 정보를 출력
		System.out.printf("%s, 가격 %d원%n", name, price);
	}
}
