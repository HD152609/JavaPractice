/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *    |_ MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author  		: kimjuchan
 * @version 			: 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();

		List<Music> list1 = new ArrayList<>();
		List<Music> list2 = new ArrayList<>();
		list1.add(new Music("팔레트","아이유"));
		map.put("발라드",list1);
		list2.add(new Music("I LUV IT","PSY"));
		list2.add(new Music("맞지?","언니쓰"));
		map.put("댄스",list2);
		System.out.println("--<<멜론 장르별 차트>>--");
		printMap(map);
		System.out.println();
		list2.set(1, new Music("SIGNAL","트와이스"));
		System.out.println("--<<댄스 2위 곡 변경>>--");
		printMap(map);
		System.out.println();
		
		System.out.println("--<<댄스 1위 곡 삭제>>--");
		list2.remove(0);
		printMap(map);
		System.out.println();
		System.out.println("--<<전체 리스트 삭제>>--");
		map.clear();
		printMap(map);
	}
	public static void printMap(Map<String,List<Music>> map){
		for(String key :map.keySet()){
			System.out.println("["+key+"]");
			int i=1;
			for(Music m:map.get(key) ){
				System.out.println(i+". "+m);
				i++;
			}
		}
		
	}
}
