package IntermediatoryOperation;

import java.util.ArrayList;
import java.util.List;

public class Mapdemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(569);
		list.add(101);
		list.add(172);
		
		list.stream().map((i)->(i*2)).forEach((i)->System.out.println(i));
		
		
		List<String> names=new ArrayList<String>();
		names.add("BangloRe");
		names.add("muMbai");
		names.add("delhi");
		names.add("HydrAbaD");
		names.stream()
		.map((i)->(new StringBuffer(
				i.toUpperCase())
				.reverse()))
				.forEach((i)->System.out.println(i));
		
		
		
	}
}
