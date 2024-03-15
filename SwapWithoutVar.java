package new2;

public class SwapWithoutVar {

	public static void main(String[] args) {
		int a=45;
		int b=50;
		a= a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("new" +a);
		System.out.println(b);
	}

}
