
public class Parent {
	int eyes;
	int nose;
	int lips;
	int made;
	
	public Parent() {
		System.out.print("Parent\n");
		overriding();
	}
	
	public void overriding() {
		System.out.print("부모 클래스\n");
	}
	
	public void marrage() {
		made = 1990;
	}
}
