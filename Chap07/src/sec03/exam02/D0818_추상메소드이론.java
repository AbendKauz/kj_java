package sec03.exam02;

public class D0818_추상메소드이론 {

	public static void main(String[] args) {

		// * 추상 클래스에는 추상 메소드를 만들 수 있음
		// -> 일반적인 클래스에는 추상 메소드를 만들 수 없음

		// * 추상 클래스를 만드는 이유
		// -> 실체 클래스에 공통적으로 가져야 할 필드, 메소드들을 정의해놓은 클래스
		// : 모든 실체들이 가지고 있는 메소드의 실행내용이 동일하다면
		// 추상 클래스에 메소드를 작성하는 것이 좋음
		// 다만, 메소드의 선언부분은 똑같은데, 실행 내용이 각각의 실체 클래스마다 달라야 한다면???

		// ex) 동물 클래스 -> 추상클래스로 만드는데
		// 모든 동물은 소리를 낸다는 가정하에 Animal이라는 추상클래스에 sound() 라는 메소드 정의
		// -> 어떤 소리를 내는지 코드를 작성하려면?
		// 동물은 다양한 소리를 내므로 추상 클래스에 통일적으로 작성을 할 수 없다.
		// 소리를 내는 코드 부분을 실체 클래스에 직접 작성해야 함
		// -> sound()라는 메소드를 작성해야 하지만 잊어버리고 작성하지 않을 경우
		// 모든 동물은 소리를 낸다는 가정이 깨짐

		// * 추상 메소드 선언
		// : 추상 메소드 설계 시 하위 클래스가 반드시 실행 내용을 채우도록 강제함
		// -> 추상메소드를 오버라이딩(재정의) 하지 않을 시 컴파일 에러 발생

		// * 추상 메소드 선언 방법
		// [public | protected] abstract 리턴타입 메소드이름(매개변수,...);
		// -> 메소드를 선언만 함, 실행하는 중괄호 블록은 없음

	}

}
