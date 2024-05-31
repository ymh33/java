package ch08_06;

public class DaoEx {
	public static void dbWork (DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		
	}

	public static void main(String[] args) {
		//DataAccessObject odao1 = new OracleDao();
		//dbWork(odao1);
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}
