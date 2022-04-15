
public class T1 {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}
public static void main(String[] args) {
	validate(15);
	System.out.println("Rest of the program");
}
}
