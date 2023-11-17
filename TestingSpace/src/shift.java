public class shift {
	public static void main(String[] args) {
		byte a = 1;
		byte b = (byte) (a<<7) ;
		byte c = -128;
		byte d = (byte) (c<<1) ;
		
		System.out.print(b+" "+d);
	}
}
