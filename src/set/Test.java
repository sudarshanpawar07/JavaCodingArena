package set;

import java.util.Objects;

public class Test {
	int id;
	String name;
	float per;
	long contact;
	char gen;

	public Test() {
		super();

	}

	public Test(int id, String name, float per, long contact, char gen) {

		this.id = id;
		this.name = name;
		this.per = per;
		this.contact = contact;
		this.gen = gen;
	}

	@Override
	public int hashCode() {
		// return Objects.hash(contact, gen, id, name, per);
		return Integer.hashCode(id) + name.hashCode() + Float.hashCode(per) + Long.hashCode(contact)
				+ Character.hashCode(gen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		return contact == other.contact && gen == other.gen && id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(per) == Float.floatToIntBits(other.per);
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", per=" + per + ", contact=" + contact + ", gen=" + gen;
	}

}
