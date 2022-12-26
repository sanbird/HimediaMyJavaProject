package test;

public class MySqlDao implements DataAccessObject {
	
	private void select_MySqlDao() {
		System.out.println("MySql DB에서 검색");
		
	}
	private void insert_MySqlDao() {
		System.out.println("MySql DB에 삽입");
		
	}
	private void update_MySqlDao() {
		System.out.println("MySql DB를 수정");
		
	}
	private void delete_MySqlDao() {
		System.out.println("MySql DB에서 삭제");
		
	}
	

	@Override
	public void select() {
		this.select_MySqlDao();
		
	}

	@Override
	public void insert() {
		this.insert_MySqlDao();
		
	}

	@Override
	public void update() {
		this.update_MySqlDao();
		
	}

	@Override
	public void delete() {
		this.delete_MySqlDao();
		
	}

}
