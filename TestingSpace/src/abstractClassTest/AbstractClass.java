package abstractClassTest;

public abstract class AbstractClass {
	static AbstractClass getInstance() {
		AbstractClass a = new GuhyeonClass();
		//a.x = 2;
		//a.y = 3;
		//a.s = "Hello";
		return a;
	}
	int x = 1;
	int y = 10;
	String s = "Hi";
	
	abstract void heukheuk();
	
	AbstractClass(){
		System.out.println("생성자 호출");
	}
}
