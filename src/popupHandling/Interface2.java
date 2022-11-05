package popupHandling;

public interface Interface2 
{
	
	public void method1();
	public void method2();
	
	public default void  method3()
	{
		System.out.println("default method of interface2");
	}

}
