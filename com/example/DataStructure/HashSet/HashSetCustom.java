package com.example.DataStructure.HashSet;

class HashSetCustom<E>{
	private HashMapCustomA <E,Object> hashmapCustom;
	
	public HashSetCustom() {
		hashmapCustom = new HashMapCustomA<>();
	}
	
	public void add(E obj) {
		hashmapCustom.put(obj, null);
	}
	
	public boolean contains(E obj) {
		return hashmapCustom.contains(obj)!=null?true:false;
	}
	
	public boolean remove(E obj) {
		return hashmapCustom.remove(obj);
	}
	
	public void display() {
		hashmapCustom.displaySet();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetCustom<Integer> hashSetCustom = new HashSetCustom<Integer>();
        hashSetCustom.add(21);
        hashSetCustom.add(25);
        hashSetCustom.add(30);
        hashSetCustom.add(33);
        hashSetCustom.add(35);
        hashSetCustom.add(21);
        hashSetCustom.display();
        
        System.out.println("\n\n21 removed: "+hashSetCustom.remove(21));
        System.out.println("22 removed: "+hashSetCustom.remove(22));
            
        System.out.print("Displaying HashSetCustom: ");
        hashSetCustom.display();
        
	}

}


class HashMapCustomA<K,V>{
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
	
	public HashMapCustomA() {
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
	
	public void displaySet(){
	       
	       for(int i=0;i<capacity;i++){
	           if(table[i]!=null){
	                  Entry<K, V> entry=table[i];
	                  while(entry!=null){
	                        System.out.print(entry.key+" ");
	                        entry=entry.next;
	                  }
	           }
	       }             
	    
	    }
	
}