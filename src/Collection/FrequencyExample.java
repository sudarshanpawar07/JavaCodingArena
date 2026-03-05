package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyExample {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");

		Map<String, Integer> map = new HashMap<>();

		for (String item : list) {

			map.put(item, map.getOrDefault(item, 0) + 1);
		}

		System.out.println("Frequency Table: " + map);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
		}
	}
}
