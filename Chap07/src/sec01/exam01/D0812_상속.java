package sec01.exam01;

public class D0812_상속 {

	public static void main(String[] args) {

		// * 상속
		// -> 부모 클래스의 멤버(필드, 메소드)를 자식 클래스에게 물려주는 것
		// -> 부모클래스(상위클래스) / 자식클래스(하위클래스 or 파생클래스)

		// * 상속을 이용하면
		// -> 공통된 코드를 수정할 때
		// 부모클래스의 수정만 모든 자식 클래스의 코드도 수정되는 효과
		// : 코드의 중복성이 줄어듬 / 유지보수 시간 줄어듬

		// * 클래스 상속 받는 방법
		// -> 자식 클래스를 선언할 때 어떤 부모 클래스를 상속받을 것인지 결정
		// : extends 뒤에 부모클래스 기술

		// * 상속의 특징
		// 1. 여러개의 부모클래스 상속 X
		// 2. 부모클래스에서 private 접근제한을 갖는 필드, 메소드 => 상속제외
		// 3. 부모와 자식클래스가 다른 패키지에 있을 경우
		// -> default 접근제한을 가지는 필드, 메소드 => 상속제외

	}

}
