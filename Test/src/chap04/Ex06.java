package chap04;

public class Ex06 {

	public static void main(String[] args) {

		// *
		// **
		// ***
		// ****
		// ���
		// (for�� �̿�)

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if ((4 - j) < i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}