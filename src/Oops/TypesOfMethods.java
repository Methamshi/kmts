package Oops;

public class TypesOfMethods {
// No parameters and no return types
	int studentRN;
	String SName;
	char Sgrade;
	
	void m1() {
		
		System.out.println("Hi Good morning lets learns Java");
	System.out.println(studentRN +" "+ SName +" "+ Sgrade );
		
	}
	
	// no parameters and with return types
	
	 String m2(){
		return"day one learning";
	}
		
		// parameters and with no return types 
	void m3(int Stundent,String StudentName,char Sgread  ){
		//System.out.println("hi"+ "  "+);
	}
	
	
	// parameters and with return types
String m4(String Name) {
		return ("hello"+" "+Name);
	}
void m5(int id, String Name, char Grade) {
	studentRN=id;
	SName=Name;
	 Sgrade=Grade;
	
}
TypesOfMethods(int id, String Name, char Grade){
	studentRN=id;
	SName=Name;
	 Sgrade=Grade;
	
}

	
}
