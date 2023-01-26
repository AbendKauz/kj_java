package sec01;

public class D0720_02_클래스_객체 {

	public static void main(String[] args) {

		// 클래스
		// -> 자바의 설계도
		// = 객체를 만들기 위해서 field나 method를 정의하는 일종의 틀

		// 객체
		// -> 실제로 존재하는 것
		// 책상, 의자, 자동차 등 사물들이 곧 객체
		// = 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서
		// 자신의 속성을 가지며 식별 가능한 것

		// 인스턴스 -> 인스턴스화
		// -> class로부터 만들어진 객체를 그 class의 인스턴스라고 함
		// -> 객체가 메모리에 할당되어 실제 사용될 때 인스턴스라고 함

		// 클래스 -> 사용할 객체 생성 -> 객체이용
		// ----- ------------ ------
		// 설계도 인스턴스화 인스턴스
		// 인스턴스화 -> class로부터 객체를 만드는 과정

		// ex) 붕어빵 틀 --------------> 붕어빵
		// ------- ↓ -----
		// 클래스 인스턴스화(객체화) 객체(클래스의 인스턴스)
		//
		// => 객체가 메모리에 할당되어 실제 사용될 때 ---> 인스턴스

		// class로부터 객체 생성 -> new 연산자 사용

		// class명 변수;
		// 변수 = new class명();

		// ex) Scanner sc = new Scanner(System.in);
		// String str = new String("abc");
		// ------- -- ------------------
		// class명 변수 = new class명(매개값);

	}

}
