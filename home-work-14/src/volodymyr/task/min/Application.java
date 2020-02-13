package volodymyr.task.min;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		Set<Practice> spa = new LinkedHashSet<>();
		spa.add(new Practice("First test", 10));		
		spa.add(new Practice("Second test", 41));
		spa.add(new Practice("Third test", 12));
		spa.add(new Practice("Fourth test", 14));
		spa.add(new Practice("Fifth test", 144));
		
		for (Practice practice : spa) {
			System.out.println(practice);
		}
		
		System.out.println();
		
		spa.add(new Practice("Ala", 32));
		spa.add(new Practice("Fola", 32));
		
		List<Practice> lp = new ArrayList<>();
		lp.addAll(spa);
		lp.sort(new PracticeAllFildsComperator());
		
		for (Practice practice : lp) {
			System.out.println(practice);
		}
		
//		System.out.println();
//		
//		TreeSet<Practice> tp = new TreeSet<>(new PracticeAllFildsComperator());
//		tp.add(new Practice("First test", 10));		
//		tp.add(new Practice("Second test", 41));
//		tp.add(new Practice("Third test", 12));
//		tp.add(new Practice("Fourth test", 14));
//		tp.add(new Practice("Fifth test", 144));
//		
//		for (Practice practice : tp) {
//			System.out.println(practice);
//		}
		
		System.out.println();
		
		Set<Practice> tpa = new TreeSet<>();
		tpa.add(new Practice("First test", 10));		
		tpa.add(new Practice("Second test", 41));
		tpa.add(new Practice("Third test", 12));
		tpa.add(new Practice("Fourth test", 14));
		tpa.add(new Practice("Fifth test", 144));
		
		for (Practice practice : tpa) {
			System.out.println(practice);
		}
		
	}
	
}
