package Practice09;

public class MyStack<T> implements IStack<T>{
	Object [] stack;
	
	MyStack(int size){
		stack = new Object [10];
	}
	T pop() {
		int l = stack.length;
		for (int i = 0; i < l; i++) {
			if (stack[i] == null) {
				break;
			}
		}
		
		
	}
	boolean push(T ob) {
		
	}
}

//나중에 할래 ㅋ