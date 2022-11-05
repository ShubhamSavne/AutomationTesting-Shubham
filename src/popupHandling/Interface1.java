package popupHandling;

public interface Interface1 extends Interface2
{
	
	
	public void method1();
	public void method2();
	
	public default void method3()
	{
		System.out.println("Default method interface1");
	}
	
	
	
	

}
