package chap08;

public class MysqlDao implements DateAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("Mysql DB���� ����");
	}

	@Override
	public void update() {
		System.out.println("Mysql DB���� ����");
	}

	@Override
	public void delete() {
		System.out.println("Mysql DB���� ����");
	}

}