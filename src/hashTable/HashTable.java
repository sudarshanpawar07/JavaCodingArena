package hashTable;

import java.util.Arrays;

import linkedList.LinkedList;

class HashTable<V> {
	int listCount;
	int countOfElements;
	int initialCap;
	float loadFactor;
	LinkedList<V>[] ht;

	public HashTable() {
		initialCap = 16;
		loadFactor = 0.75f;
		ht = new LinkedList[initialCap];
	}

	public HashTable(int initial) {
		initialCap = initial;
		loadFactor = 0.75f;
		ht = new LinkedList[initialCap];
	}

	public HashTable(int initial, float loadFactor) {
		initialCap = initial;
		this.loadFactor = loadFactor;
		ht = new LinkedList[initialCap];
	}

	private int hashFunction(V val) {
		return val == null ? 0 : val.hashCode() % initialCap;
	}

	public boolean add(V val) {
		int index = hashFunction(val);
		if (ht[index] == null) {
			ht[index] = new LinkedList<V>();
			ht[index].add(val);
			listCount++;
			countOfElements++;
			return true;
		} else if (ht[index].contains(val)) {
			return false;
		} else {
			ht[index].add(val);
			countOfElements++;
			return true;
		}
	}

	public boolean remove(V val) {
		int index = hashFunction(val);
		if (ht[index] == null) {
			return false;
		} else {
			if (ht[index].remove(val)) {
				countOfElements--;
				return true;
			}
			return false;
		}
	}

	public String toString() {
		return Arrays.toString(ht);
	}
}
