
public class Example {
	public static void main(String[] args) {
		int a= 10;
		int b= 0;
		int c;
		try {
			System.out.println("Example for exception handling");
			System.out.println("perform the action");
			c=a/b;
			
		}
		catch(ArithmeticException e){
			System.out.println("Solved the exception");
		}
		catch(Exception e)	{
			System.out.println("solved");
		}
		finally {
			System.out.println("this will be excuted in anycase");
			
			
		}
		System.out.println("this is how it works");
	}

}
