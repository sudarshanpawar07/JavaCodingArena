package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class UserInteger implements Comparable<UserInteger> {
	private Integer ele;

	public UserInteger(Integer ele) {
		this.ele = ele;
	}

	@Override
	public String toString() {
		return ele + "";
	}

	@Override
	public int compareTo(UserInteger obj) {
		if (this.ele > obj.ele)
			return -1;
		else if (this.ele < obj.ele)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		ArrayList<UserInteger> list = new ArrayList<UserInteger>();
		for (int i = 1; i <= 10; i++)
			list.add(new UserInteger((int) (Math.random() * 1000)));
		System.out.println(list);
		System.out.println("\n------------------------------------\n");
		Collections.sort(list);
		System.out.println(list);
	}
}
