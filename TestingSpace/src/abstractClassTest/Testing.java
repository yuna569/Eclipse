package abstractClassTest;

public class Testing {

	public static void main(String[] args) {
		AbstractClass a = AbstractClass.getInstance();
		
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a.s);

	}

}
