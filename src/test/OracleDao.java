package test;

public class OracleDao implements DataAccessObject {
	
	private void select_OracleDao() {
		System.out.println("Oracle DB에서 검색");
		
	}
	private void insert_OracleDao() {
		System.out.println("Oracle DB에 삽입");
		
	}
	private void update_OracleDao() {
		System.out.println("Oracle DB를 수정");
		
	}
	private void delete_OracleDao() {
		System.out.println("Oracle DB에서 삭제");
		
	}
	

	@Override
	public void select() {
		this.select_OracleDao();
		
	}

	@Override
	public void insert() {
		this.insert_OracleDao();
		
	}

	@Override
	public void update() {
		this.update_OracleDao();
		
	}

	@Override
	public void delete() {
		this.delete_OracleDao();
		
	}

}
