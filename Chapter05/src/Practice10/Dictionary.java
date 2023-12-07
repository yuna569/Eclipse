package Practice10;

public class Dictionary extends PairMap {
	Dictionary(int l){
		keyArray = new String[l];
		valueArray = new String[l];
	}
	
	@Override
	String get(String key) {
		int i;
		for (i = 0; i < length(); i++) {
			if ( keyArray[i].equals(key) ) {
				break;
			}
		}
		return valueArray[i];
	}
	@Override
	void put(String key, String value) {
		int index = length();
		boolean inArray = false;
		for (int i = 0; i < length(); i++) {
			if ( keyArray[i].equals(key) ) {
				valueArray[i] = value;
				inArray = true;
				break;
			}
		}
		if(!inArray) {
			keyArray[index] = key;
			valueArray[index] = value;
		}
		
	}
	
	@Override
	String delete(String key) {
		int i;
		int l = length();
		
		for (i = 0; i < l; i++) {
			if ( keyArray[i].equals(key) ) {
				break;
			}
		}
		
		String value = valueArray[i];
		
		for (int j = i; j < l - 1; j++) {
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		
		keyArray[l-1] = null;
		valueArray[l-1] = null;
		
		return value;
		
	}
	
	@Override
	int length() {
		int i = 0;
		while( ( i < keyArray.length ) && ( keyArray[i] != null) ) {
			i++;
		}
		
		return i;
	}
	
	void printValue() {
		for (int i = 0; i < 10 ; i++) {
			System.out.print(valueArray[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	void printKey() {
		for (int i = 0; i < 10 ; i++) {
			System.out.print(keyArray[i] + " ");
		}
		System.out.println();
	}
	
	void printDic() {
		printKey();
		printValue();
	}
}
