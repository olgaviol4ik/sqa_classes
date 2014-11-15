package exercises;

public class ExStaticNoneStatic {

	 private String name;
	 private String address;

	 public static void printName() {
	  //have to create the object first when calling none-static method from the static method.
	  ExStaticNoneStatic  Exsns = new ExStaticNoneStatic(); 

	  Exsns.getname();
	  // getname();// - this call gave me an error
	 }

	 public String getname() {
	  return name;

	 }

	 public void printAddress() {

	  getaddress();

	 }

	 public String getaddress() {
	  return address;

	 }

	}