package sec01.exam01;

public class D0913_입출력스트림이론 {

	public static void main(String[] args) {

		// * 스트림
		// : 자바에서 데이터는 스트림을 통해 입출력이 됨
		// : 스트림은 단일 방향으로 연속적으로 흘러가는 것을 말함
		// -> 물이 높은 곳에서 낮은 곳으로 흐르듯이
		// 데이터는 출발지에서 도착지로 흘러간다는 뜻

		// : 프로그램이 출발지인지 도착지인지에 따라 사용하는 스트림의 종류가 달라짐
		// - 프로그램이 도착지이면 흘러온 데이터를 입력받아야 함 => 입력스트림 사용
		// - 프로그램이 출발지이면 데이터를 출력해야 함 => 출력스트림 사용

		// * 입출력 스트림
		// -> 스트림은 크게 바이트 기반 스트림, 문자 기반 스트림으로 분류

		// 1. 바이트 기반 스트림(주고받는 데이터가 바이트)
		// : 그림, 멀티미디어, 문자 등 모든 종류의 데이터를 읽고 출력할 때 사용
		// : InputStream, OutputStream은 바이트 기반 입출력 스트림의 최상위 클래스
		// -> 이들 클래스의 하위(자식)클래스는 모두 바이트 기반 입출력 스트림
		// 클래스 접미사로 InputStream 또는 OutputStream이 붙음

		// ex) 파일에서 바이트 데이터를 읽고 싶으면 -> FileInputStream
		// 파일로 바이트 데이터를 저장하고 싶으면 -> FileOutputStream
		// => 바이트 기반 스트림을 이용해서도 문자 데이터를 읽거나 저장 가능

		// 2. 문자 기반 스트림(주고받는 데이터가 문자)
		// : 문자 데이터만 읽고 출력할 수 있도록 특화되어있음
		// : Reader와 Writer는 문자 기반 입출력 스트림의 최상위 클래스
		// -> 이들 클래스의 하위(자식)클래스는 모두 문자 기반 입출력 스트림
		// 클래스 접미사로 Reader 또는 Writer가 붙음

		// ex) 문자 파일에서 문자 데이터를 읽고 싶다면 -> FileReader
		// 파일로 문자 데이터를 저장하고 싶다면 -> FileWriter

	}

}
