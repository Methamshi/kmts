package Oops;

public class TypesOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TypesOfMethods abc=new TypesOfMethods();
//		abc.m1();
//        String aa=abc.m2();
//        System.out.println(aa);
//        
//        abc.m3("methamshi");
//        String bb=abc.m4("vamshi");
//        System.out.println(bb);
        TypesOfMethods abc=new TypesOfMethods(33,"vamshi", 'b');
        abc.m1();
        
        Polimorphism a= new Polimorphism();
        a.m();
        a.m(100, 330.5);
        a.m(300, 3990);
        
        Encapulation bv=new Encapulation();
        bv.setAcHldrNmae("kmts");
        bv.setAcountNo(202373247);
        bv.setAmount(3000000);
       System.out.println("account holder name = "+bv.getAcHldrNmae());
      
       System.out.println("Account Number = "+bv.getAcountNo());
      
       System.out.println("balance amount = "+bv.getAmount());
        
	}

}
