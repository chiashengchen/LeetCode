package DataStruct;

import java.util.List;
import java.util.ArrayList;

public class HashTable<K, V> {
	private class Node {
		public K key;
		public V val;
		public Node(K key, V val) {
			this.key = key;
			this.val = val;
		}
	}
	private K key;
	private V val;
	int size = 100;
	List<Node>[] list = new ArrayList[size];
	
	public void put(K key, V val) {
		int index = HashFunc(key);
		if(list[index] == null)
			list[index] = new ArrayList<Node>();
		Node node = new Node(key, val);
		list[index].add(node);
	}
	
	public int get(K key) {
		int index = HashFunc(key);
		return 0;
	}
	
	private int HashFunc(K key) {
		return key.hashCode() % 100;
	}
}
