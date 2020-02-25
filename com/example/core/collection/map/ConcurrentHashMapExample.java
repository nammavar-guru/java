package com.example.core.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		Map<Integer,String> chm = new ConcurrentHashMap(3);
		chm.put(1, "guru");
		chm.put(2, "Kumaresh");
		chm.put(3, "Nikhil");
		chm.put(4, "4");
		chm.put(5, "5");
		chm.put(6, "6");
		chm.put(7, "7");
		chm.put(8, "8");
		chm.put(9, "9");
		chm.put(10, "10");
		chm.put(11, "11");
		chm.put(12, "12");
		chm.put(13, "13");
		chm.put(14, "14");
		chm.put(15, "15");
		chm.put(16, "16");
		chm.put(17, "17");
		chm.put(18, "18");
		chm.put(19, "19");
		chm.put(20, "10");
		chm.put(21, "11");
		chm.put(22, "12");
		chm.put(23, "13");
		chm.put(24, "14");
		chm.put(25, "15");
		chm.put(26, "16");
		chm.put(27, "17");
		chm.put(28, "18");
		chm.put(29, "19");
		chm.put(30, "10");
		chm.put(31, "11");
		chm.put(32, "12");
		chm.put(33, "13");
		chm.put(34, "14");
		chm.put(35, "15");
		chm.put(36, "16");
		chm.put(37, "17");
		chm.put(38, "18");
		chm.put(39, "19");
		chm.put(40, "10");
		chm.put(41, "11");
		chm.put(42, "12");
		chm.put(43, "13");
		chm.put(44, "14");
		chm.put(45, "15");
		chm.put(46, "16");
		chm.put(47, "17");
		chm.put(48, "18");
		chm.put(49, "19");
		chm.put(50, "10");
		chm.put(51, "11");
		chm.put(52, "12");
		chm.put(53, "13");
		chm.put(54, "14");
		chm.put(55, "15");
		chm.put(56, "16");
		chm.put(57, "17");
		chm.put(58, "18");
		chm.put(59, "19");
		chm.put(60, "10");
		chm.put(61, "11");
		chm.put(62, "12");
		chm.put(63, "13");
		chm.put(64, "14");
		chm.put(65, "15");
		chm.put(66, "16");
		chm.put(67, "17");
		chm.put(68, "18");
		chm.put(69, "19");
		Iterator<Entry<Integer,String>> itr = chm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry entry = itr.next();
			System.out.println("Key: "+entry.getKey()+" Value:"+entry.getValue());
		}
	}

}
