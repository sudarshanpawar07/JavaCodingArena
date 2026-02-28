package hashTable;

public class HashTabledriver {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.add(10);
		ht.add(20);
		ht.add(30);
		System.out.println(ht);
		ht.remove(20);
		System.out.println(ht);
		
	}

}
