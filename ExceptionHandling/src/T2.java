
public class T2 {
	public static int divideNum(int a, int b) throws ArithmeticException{
		int div = a/b;
		return div;
	}
public static void main(String[] args) {
	T2 obj = new T2();
	try {
		System.out.println(obj.divideNum(99, 0));
	}
	catch(ArithmeticException e) {
		System.out.println("number can not be divided by zero");
	}
	System.out.println("Rest of the code");
}
}
