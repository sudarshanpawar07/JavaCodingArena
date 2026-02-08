package Collection;

import java.util.*;

public class LinkedHashsetExample {

	public static void main(String[] args) {
		String str = "HELLOHE";
		String[] arr = str.split("");
		List<String> list = Arrays.asList(arr);
		LinkedHashSet<String> set = new LinkedHashSet<String>(list);
		String unique = "";
		for (String ele : set) {
			if (Collections.frequency(list, ele) == 1) {
				unique = ele;
				break;
			}
		}
		System.out.println(unique != "" ? unique : "not found");

	}

}
