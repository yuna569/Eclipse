
public class Test {

	public static void main(String[] args) {
		int x=2, y=10, z=0;
		
		z = x++*2+--y-5+x*(y%2);
		
		System.out.print(z);
	}
}
