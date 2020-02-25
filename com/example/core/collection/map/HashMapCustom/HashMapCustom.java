package com.example.core.collection.map.HashMapCustom;
// Storing in table index
//if collision, in the table index, we have linked list 
public class HashMapCustom<K,V> {
		private Entry<K,V>[] table;
		private int capacity =4;
		
		static class Entry<K,V>{
			K key;
			V value;
			Entry<K,V> next;
			
			public Entry(K key, V value, Entry<K, V> next) {
				this.key = key;
				this.value = value;
				this.next = next;
			}
		}
		
		public HashMapCustom() {
			table = new Entry[capacity];
		}
		
		 private int hash(K key){
		        return Math.abs(key.hashCode()) % capacity;
		    }
		 
		public void put(K newKey, V data) {
			if (newKey == null)
				 return;
			
			int index = hash(newKey);
		
			Entry<K,V> newEntry = new Entry<K,V>(newKey,data,null);
			
			
			if(table[index] == null) {
				table[index] = newEntry;
			}else {
				Entry<K,V> previous= null;
				Entry<K,V> current = table[index];
				
				while(current!=null) {
					if(current.key.equals(newKey)) {
						if(previous == null) {
							newEntry.next = current.next;
							table[index]= newEntry;
							return;
						} else {
							newEntry.next = current.next;
							previous.next = newEntry;
							return;
						}
					}
					previous=current;
		            current = current.next;
				}
				 previous.next = newEntry;
			}
		}
		
		
		public V get(K key) {
			int index = hash(key);
			if(table[index]==null)
				return null;
			else {
				Entry<K,V> temp = table[index];
				while(temp!=null) {
					if(temp.key.equals(key)) {
						return temp.value;
					}
					temp = temp.next;
				}
				return null;
				}//end else
		}//get end
		
		
		public void display() {
			for(int i=0;i<capacity;i++) {
				Entry<K,V> entry = table[i];
				while(entry!=null) {
					System.out.println("Key "+entry.key+" value:"+entry.value+" table index:"+i);
					entry=entry.next;
				}
			}
		}
}
