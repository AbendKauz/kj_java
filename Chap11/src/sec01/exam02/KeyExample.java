package sec01.exam02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {

		// Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		// �ĺ�Ű new Key(1)�� "ȫ�浿"�� ����
		hashMap.put(new Key(1), "ȫ�浿");

		// �ĺ�Ű new Key(1)�� "ȫ�浿"�� �о��
		// -> number�ʵ尪�� ������ hashCode() �޼ҵ忡�� �����ϴ�
		// �ؽ��ڵ尡 �ٸ��Ƿ� �ٸ� �ĺ�Ű�� �ν�
		String value = hashMap.get(new Key(1));
		System.out.println(value);

		// -> ��ü�� ����񱳸� ���ؼ��� Object�� equals()�޼ҵ常 �������ϸ� �ȵ�
		// -> hashCode() �޼ҵ嵵 ������ �ؼ� ���������� ������ ��ü�� ���
		// ������ �ؽ��ڵ尡 ���ϵǵ��� �ؾ� ��
	}

}