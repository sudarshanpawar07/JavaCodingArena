package Collection;

public class Test<E> {
	E ele;

	public Test() {

	}

	public Test(E ele) {
		super();
		this.ele = ele;
	}

	@Override
	public String toString() {
		return ele + "";
	}

	public void add(E ele1, E ele2) {
		if (ele1 instanceof Integer && ele2 instanceof Integer) {
			int i1 = (Integer) ele1;
			int i2 = (Integer) ele2;
			System.out.println(i1 + i2);
		} else if (ele1 instanceof Integer && ele2 instanceof Integer) {
			double d1 = (Double) ele1;
			double d2 = (Double) ele2;
			System.out.println(d1 + d2);
		}
	}

}
