package sec01.exam16;

public class StringLengthExample {

	public static void main(String[] args) {

		String ssn = "7306241230123";
		int length = ssn.length();
		// length와 length() 혼동 주의
		if (length == 13) {
			System.out.println("주민번호 자리수 맞음");
		} else {
			System.out.println("주민번호 자리수 틀림");
		}

	}

}
