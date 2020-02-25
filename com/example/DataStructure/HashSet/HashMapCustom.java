package com.example.DataStructure.HashSet;


class HashMapCustom<K,V>{
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
	
	public void put(K newKey, V newValue) {
		if(newKey==null)
			return;
		int hash = hash(newKey);
		
		Entry<K,V> newEntry = new Entry<>(newKey,newValue,null);
		
		if(table[hash]==null)
			table[hash] = newEntry;
		else {
			
			Entry<K,V> previous=null;
			Entry<K,V> current = table[hash];
			while(current !=null) {
				if(current.key.equals(newKey)) {
					if(previous==null) {
						newEntry.next = current.next;
						table[hash]= newEntry;
						return;
					}
					else {
						newEntry.next = current.next;
						previous.next= newEntry;
						return;
					}
				}
				previous = current;
				current = current.next;
			}
			previous.next=newEntry;
		}
	}
	
	public V get(K key) {
		int hash = hash(key);
		if(table[hash]==null) {
			return null;
		}else {
			Entry<K,V> temp = table[hash];
			while(temp!=null) {
				if(temp.key.equals(key))
					return temp.value;
				temp = temp.next;
			}
			return null;
		}
	}
	
	public boolean remove(K key) {
		int hash = hash(key);
		if(table[hash]==null)
			return false;
		else {
			Entry<K,V> previous  = null;
			Entry<K,V> current = table[hash];
			
			while(current!=null) {
				if(current.key.equals(key)) {
					if(previous==null) {
						table[hash]= table[hash].next;
						return true;
					}else {
						previous.next=current.next;
						return true;
					}
				}
				previous = current;
				current = current.next;
			}
			return false;
		}
	}
	
	 public K contains(K key){
	        int hash = hash(key);
	        if(table[hash] == null){
	         return null;
	        }else{
	         Entry<K,V> temp = table[hash];
	         while(temp!= null){
	             if(temp.key.equals(key))
	                 return key;
	             temp = temp.next; //return value corresponding to key.
	         }         
	         return null;   //returns null if key is not found.
	        }
	    }
	
	private int hash(K key) {
		System.out.println("Key:"+key+" hash:"+(Math.abs(key.hashCode()) % capacity));
		return Math.abs(key.hashCode()) % capacity; 
	}
	
	public void display(){
	       
	       for(int i=0;i<capacity;i++){
	           if(table[i]!=null){
	                  Entry<K, V> entry=table[i];
	                  while(entry!=null){
	                        System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
	                        entry=entry.next;
	                  }
	           }
	       }             
	    
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapCustomA<Integer, Integer> hashMapCustom = new HashMapCustomA<Integer, Integer>();
        hashMapCustom.put(21, 12);
        hashMapCustom.put(25, 121);
        hashMapCustom.put(30, 151);
        hashMapCustom.put(33, 15);
        hashMapCustom.put(35, 89);
        hashMapCustom.put(21, 99);
        System.out.println("value corresponding to key 21="
                     + hashMapCustom.get(21));
        System.out.println("value corresponding to key 51="
                     + hashMapCustom.get(51));

        System.out.print("Displaying : ");
        hashMapCustom.display();
        
        System.out.println("\n\n21 removed: "+hashMapCustom.remove(21));
        System.out.println("22 removed: "+hashMapCustom.remove(22));
            
        System.out.print("Displaying HashSetCustom: ");
        hashMapCustom.display();
        
	}

}