package ba.bitcamp.exercise.HashMapAndaSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;



public class Hash {

	public static int hash(int num){
		return num / 10;
	}
	public static void main(String[] args) {
		String str;
		
		Map <Integer,LinkedList<Integer>> map = new HashMap <Integer, LinkedList<Integer>>();
		Random rand = new Random();
		for ( int i=0; i<100; i++){
			int num = rand.nextInt(100);
//			map.put(hash(num), num);    /* ne moze ovo
		}
		
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while ( iter.hasNext()){
			int key = iter.next();
			System.out.println(map.get(key));
		}
	}
}
