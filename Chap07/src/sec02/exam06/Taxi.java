package sec02.exam06;

public class Taxi extends Vehicle {

	// -> 메소드
	// run( ) : 부모 클래스의 run( ) 메소드 재정의
	// -----> 택시가 달립니다. 를 출력하는 메소드

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}
