package java_assg1;

public class test1 {

	static String firstName="ram";
	static String lastName="raghav";
	static int age=26;
	
	static {
		System.out.println("Print Variable using Static Block");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
	}
	
	static void getfirstName() {
		System.out.println("First Name : "+firstName);
	}
	
	static void getlastName() {
		System.out.println("Last Name : "+lastName);
	}
	
	static void getage() {
		System.out.println("Age : "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print Variable using Static Block");
		getfirstName();
		getlastName();
		getage();
		System.out.println("Print Variable using Static Block");
		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Age : "+age);
		
	}

}
