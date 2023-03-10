package sec02.exam04;

public class ChildExample {

	public static void main(String[] args) {

		// 자식 객체 생성
		Child child = new Child();

		// -> 부모 타입으로 자동타입 변환 : 부모타입 변수명 = 자식객체;
		Parent parent = child;

		// -> method1, method2, method3 를 호출
		// (호출 가능한 메소드 확인)
		parent.method1();
		parent.method2(); // 자식클래스에서 재정의한 메소드 호출
		// 예외) 메소드가 자식클래스에서 재정의되면
		// : 자식클래스의 메소드 호출

		// 부모타입으로 자동 타입변환 한 경우
		// : 부모클래스에 선언된 필드, 메소드만 접근 가능
		// ->method3 : 자식클래스에 선언된 메소드라서 접근 X
//		parent.method3();	// error

	}

}
