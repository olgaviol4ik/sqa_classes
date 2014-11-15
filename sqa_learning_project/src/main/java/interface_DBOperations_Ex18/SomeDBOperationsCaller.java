package interface_DBOperations_Ex18;

public class SomeDBOperationsCaller {
	
	public static void main(String args[]){
		SomeDBOperations mySQL = new MySQLDBOperations();
		SomeDBOperations oracle = new OracleDBOperation();
		
		System.out.println(mySQL.update());
		System.out.println(oracle.update());
	}
	
}
