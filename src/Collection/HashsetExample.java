package Collection;

import java.util.*;

public class HashsetExample {

	public static void main(String[] args) {
		String str = "JIGDGdugdsgadsjhgasgasknlk";
		String[] arr = str.split("");
		List<String> list = Arrays.asList(arr);
		LinkedHashSet<String> set = new LinkedHashSet<String>(list);
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String ele : set) {
			int cnt = Collections.frequency(list, ele);
			map.put(ele, cnt);
		}
		System.out.println(map);
	}

}
