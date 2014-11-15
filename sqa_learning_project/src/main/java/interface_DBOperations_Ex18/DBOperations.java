package interface_DBOperations_Ex18;
//Write Interface DBOperations. It declares 4 methods, create, update, delete and read. 
//Implementing classes are MySQLDBOperation, OracleDBOperation which implement the DBOperations interface.
//Both these classes provides the implementation of all the 4 methods. 
//Now create an abstract class SomeDBOperations implements interface and provides the implementation of create method
//and leave other 3 methods as abstract.
//MySQLDBOP.. and Oracle DB operation should not have the implementation for create method. 

public interface DBOperations {
	
	int create();
	int update();
	int delete();
	String read();

}
