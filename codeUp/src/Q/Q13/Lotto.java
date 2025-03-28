package Q.Q13;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Lotto {
	Map<List<Integer>, String> lottoNumList = new LinkedHashMap<>();
	
	private Lotto() {
		
	}
	
	private static Lotto instance;
	
	public static Lotto getInstance() {
		if(instance == null) {
			instance = new Lotto();
		}
		return instance;
	}
	
	public void addToMap(List<Integer> list, String str) {
		lottoNumList.put(list, str);
	}
}
