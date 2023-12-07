package Practice10;

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		
		dic.put("황기태", "자바");
		
		dic.printDic();
		
		dic.put("이재문", "파이썬");
		
		dic.printDic();
		
		dic.put("이재문", "C++");
		
		dic.printDic();
		
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		System.out.println();
		
		dic.delete("황기태");

		dic.printDic();
		
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		
	}

}
