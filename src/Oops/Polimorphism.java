package Oops;

public class Polimorphism {
	int a,b;
	
	void m() {
		System.out.println(a+b);
		
	}
	void m(int c,double d) {
	double sum=c+d;
		System.out.println(sum);
	}
	
	void m(int s,int d ) {
	int mul=s*d;
	double div=s/d;
		System.out.println(mul + " "+div);
		
	}
	
	public static void main (String[] args) {
		Polimorphism a= new Polimorphism();
		a.m();
		a.m(100, 33.4);
		a.m(309, 388); 
		
		
	}
	
	

}
