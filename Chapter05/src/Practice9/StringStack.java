package Practice9;

public class StringStack implements Stack{
	String[] stack;
	
	StringStack(int capacity){
		stack = new String [capacity];
	}
	
	@Override
	public int length() {
		int i = 0;
		while( (i < stack.length) && (stack[i] != null) ) {
			i ++;
		}
		return i;
	}
	@Override
	public int capacity() {
		return stack.length; 
	}
	public String pop() {
		int l = length() - 1;
		String popped = stack[l];
		stack[l] = null;
		
		return popped;
	}
	public boolean push(String val) {
		int l = length();
		int c = capacity() - 1;
		if(l > c) {
			System.out.println("스택이 꽉 차서 푸시 불가!");
			return false;
		}
		else {
			stack[l] = val;
			return true;
		}
	}
}
