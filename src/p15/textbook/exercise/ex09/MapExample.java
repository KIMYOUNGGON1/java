package p15.textbook.exercise.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			
			if (value > maxScore) {
				name = key;
				maxScore = value;
			}
			
			totalScore += value;
		}
		
		System.out.println("평균점수: " + ((double)totalScore / map.size()));
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);


		/*
		System.out.println("평균점수: " + avg(map));
		System.out.println("최고점수: " + maxValue(map));
		System.out.println("최고점수를 받은 아이디: " + bestId(map)); */
	}
/*
	private static String bestId(Map<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entrise = map.entrySet();
		int a = Integer.MIN_VALUE;
		String b = "";
		for (Map.Entry<String, Integer> entry : entrise) {
			if (entry.getValue() > a) {
				a += entry.getValue();
				if(entrise.equals(a)) {
					b = entry.getKey();
				}
			}
		}
		return b;
	}

	private static int maxValue(Map<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entrise = map.entrySet();
		int a = Integer.MIN_VALUE;
		for (Map.Entry<String, Integer> entry : entrise) {
			if (entry.getValue() > a) {
				a = entry.getValue();
			}
		}
		return a;
	}

	private static int avg(Map<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entrise = map.entrySet();
		int a = 0;
		for (Map.Entry<String, Integer> entry : entrise) {
			a += entry.getValue();
		}
		a /= entrise.size();

		return a;
	}
	*/
}
