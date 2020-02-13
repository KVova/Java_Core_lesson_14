package volodymyr.task.max;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CodeForMenu {
	
	private Set<Commodity> comod = new LinkedHashSet<>();

	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input name");
		String name = scan.nextLine();
		System.out.println("Input length ");
		Integer length = scan.nextInt();
		System.out.println("Input width ");
		Integer width = scan.nextInt();
		System.out.println("Input weight ");
		Integer weight = scan.nextInt();
		
		comod.add(new Commodity(name, length, width, weight));
	}
	
	public void remove() {
		
		System.out.println("Enter data to remove : ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Input name");
		String name = scan.nextLine();
		System.out.println("Input length ");
		Integer length = scan.nextInt();
		System.out.println("Input width ");
		Integer width = scan.nextInt();
		System.out.println("Input weight ");
		Integer weight = scan.nextInt();
		
		Iterator<Commodity> iterator = comod.iterator();
		
		while(iterator.hasNext()) {
			Commodity chack = iterator.next();
				if(chack.getName().equalsIgnoreCase(name) 
					& chack.getLength()==length 
					& chack.getWeight()==weight
					& chack.getWidth()==width) {
				iterator.remove();
			}
		}	
	}
	
	public void change() {
		
		System.out.println("Enter data to change : ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Input name");
		String name = scan.nextLine();
		System.out.println("Input length ");
		Integer length = scan.nextInt();
		System.out.println("Input width ");
		Integer width = scan.nextInt();
		System.out.println("Input weight ");
		Integer weight = scan.nextInt();
		
		Iterator<Commodity> iterator = comod.iterator();
		
		while(iterator.hasNext()) {
			Commodity chack = iterator.next();
				if(chack.getName().equalsIgnoreCase(name)
					&chack.getLength()==length
					&chack.getWeight()==weight
					&chack.getWidth()==width) {
				
					System.out.println("Enter changed data : ");
					System.out.println("Input name ");
					chack.setName(scan.next());
					System.out.println("Input length ");
					chack.setLength(scan.nextInt());
					System.out.println("Input width ");
					chack.setWidth(scan.nextInt());
					System.out.println("Input weight ");
					chack.setWeight(scan.nextInt());
			}
		}
	}
	
	public void sortByName() {
		
		Set<Commodity> comod1 = new TreeSet<>(new CommodityNameComperator());
		comod1.addAll(comod);
		System.out.println("Before :");
		for (Commodity commodity : comod) {
			System.out.println(commodity);
		}
		System.out.println();
		System.out.println("After :");
		for (Commodity commodity : comod1) {
			System.out.println(commodity);
		}
		System.out.println();
	}
	
	public void sortByLength() {
		
		Set<Commodity> comod1 = new TreeSet<>(new CommodityLengthComperator());
		comod1.addAll(comod);
		System.out.println("Before :");
		for (Commodity commodity : comod) {
			System.out.println(commodity);
		}
		System.out.println();
		System.out.println("After :");
		for (Commodity commodity : comod1) {
			System.out.println(commodity);
		}
		System.out.println();
	}
	
	public void sortByWeight() {
		
		Set<Commodity> comod1 = new TreeSet<>(new CommodityWeightComperator());
		comod1.addAll(comod);
		System.out.println("Before :");
		for (Commodity commodity : comod) {
			System.out.println(commodity);
		}
		System.out.println();
		System.out.println("After :");
		for (Commodity commodity : comod1) {
			System.out.println(commodity);
		}
		System.out.println();
	}
	
	public void sortByWidth() {
		
		Set<Commodity> comod1 = new TreeSet<>(new CommodityWidthComperator());
		comod1.addAll(comod);
		System.out.println("Before :");
		for (Commodity commodity : comod) {
			System.out.println(commodity);
		}
		System.out.println();
		System.out.println("After :");
		for (Commodity commodity : comod1) {
			System.out.println(commodity);
		}
		System.out.println();
	}
	
	
	public void seeElement() {
		
		System.out.println("Enter element index: ");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		List<Commodity> list = new ArrayList<>();
		list.addAll(comod);
		System.out.println(list.get(i));
	}
	
}