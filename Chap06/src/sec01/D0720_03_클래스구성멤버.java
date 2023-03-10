package sec01;

public class D0720_03_클래스구성멤버 {

	public static void main(String[] args) {

		// class의 구성멤버 -> 3가지
		// 1. 필드 (Field)
		// -> 객체의 데이터(속성)가 저장되는 곳
		// -> 선언 형태가 변수랑 비슷하지만, 변수라고 부르지는 않는다.
		// 변수와 필드의 차이점
		// 변수 : 생성자와 메소드 내에서만 사용되고 생성자, 메소드가 실행 종료되면 자동으로 소멸
		// 필드 : 생성자와 메소드 전체에서 사용되며, 객체가 소멸되지 않는 한 객체와 함께 존재

		// 2. 생성자 (Constructor) -> new 연산자로 호출되는 특별한 중괄호{} 블록
		// -> 객체를 생성 시 초기화하는 역할 담당
		// 필드를 초기화하거나 메소드를 호출해서 객체를 사용할 준비를 함
		// -> 메소드와 비슷하게 생겼지만 클래스 이름으로 되어있고 리턴타입이 없다.

		// 3. 메소드 (Method)
		// -> 객체의 동작에 해당하는 실행블록
		// 메소드를 호출하면 -> 중괄호 블록에 있는 모든 코드들이 일괄적으로 실행됨

//		public class 클래스명 {	// Car
//			
//			// 필드
//			타입 필드명;
//			
//			// 생성자
//			클래스명(){ ... }		// Car() {...}
//				-> 클래스 이름으로 되어있고 리턴타입이 없다.
//			
//			// 메소드
//			리턴타입 메소드명() { ... };
//			
//		}

	}

}
