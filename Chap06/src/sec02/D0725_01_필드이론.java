package sec02;

public class D0725_01_필드이론 {

	public static void main(String[] args) {

		// 필드(멤버변수 or 전역변수)
		// -> 객체의 고유데이터, 객체가 가져야 할 부품, 객체의 현재상태 데이터 저장하는 곳

		// 선언위치에 따라 필드와 변수 구분
		// 변수 : 생성자 또는 메소드의 블록내부에서 정의

		// 필드 : 클래스 중괄호 내부
		// + 생성자, 메소드 중괄호 밖에서 정의
		// -> 멤버변수, 전역변수
		// 변수 선언과 같음 ( 타입 필드명 [= 초기값]; )
		// - 초기값은 주어질수도 있고, 생략도 가능
		// -- 생략 시 자동으로 기본 초기값 설정

		// 차이점
		// - 필드(전역변수, 멤버변수)
		// -> 프로그램이 실행되어 종료되기까지 메모리상에 계속 남음
		// => 클래스 내 모든 메소드에서 사용이 가능함
		// => 초기값을 주지 않았을 때 자동으로 초기값을 가짐
		// - 변수(지역변수, 로컬변수)
		// -> 메소드가 호출될 때 메모리에 공간을 할당받고 종료 시 해제

	}

}
