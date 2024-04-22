package Vegpackage;

/*
 * accessmodifier class classname{}
 */
public class Firstclass {

/*
 methods: 
 1.method without parameter/arguments
 2.method with parameter/arguments
 
 3.method without return type
 4.method with return type
 *
 *syntax : accessmodifier returntype methodname(parameter/argument){}
 */ 
//1.method without parameter returntype methodname(parameter/argument){}
	public void Printname () 
	{
		System.out.println("technology"); // method implementation
	}
	
	public void add()
	{
		int a =20;
		int b =20;
		int c =a+b;
		System.out.println(c);
	}
	
	//method with parameter and with out return type
	public void sub(int a, int b)
	{
		int c =a-b;
		System.out.println(c);
	}
	
	public int mul(int a, int b)
	{
	 int c =a*b;
	 return c;
	}
	
	public void div(int a, int b)
	{
		int c =mul(a,b);
		int d =c/b;
		System.out.println(d);
	}
	
	/*public void printname()
	  {
	  system.out.print("sunil");
	  }*/
	
	public static void main(String[] args)
	{
	  System.out.println("sunil");
	  System.out.println("technology");
	  
	  System.out.print("sunil");
	  //System.out.println("technology");
	  System.out.println("tambaram");
	  
	  System.out.print("sunil");
	  /*System.out.println("technology");
	  System.out.println("tambaram");*/
	  
	//syntax : classname objectname = new classname();
	  Firstclass FC =new Firstclass();// instantiation 
	  FC.Printname(); //method call
	  FC.add();
	  FC.sub(15,6);
	  FC.div(4,10);
	}
}