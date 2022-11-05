package popupHandling;

public class ImplementClass1and2 implements Interface1,Interface2
{
	
	

	public void method1() 
	{
		System.out.println("interface method 1");
	
		
	}


	public void method2() 
	{
		System.out.println("interface method 2");
	
		
	}
	

	

	public static void main(String[] args) 
	{
		ImplementClass1and2 obj = new ImplementClass1and2();
		
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method3();
		
	
	}
	
}
