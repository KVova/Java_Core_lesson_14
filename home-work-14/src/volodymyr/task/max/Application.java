package volodymyr.task.max;

import java.util.Scanner;

public class Application {
	
	static void menu(){
		System.out.println("Press 1 to add commodity");
		System.out.println("Press 2 to remove commodity");
		System.out.println("Press 3 to change commodity");
		System.out.println("Press 4 to sort by name");
		System.out.println("Press 5 to sort by length");
		System.out.println("Press 6 to sort by width");
		System.out.println("Press 7 to sort by weight");
		System.out.println("Press 8 to output i-th element");
		System.out.println("Press 9 to exit");
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CodeForMenu codeForMenu = new CodeForMenu();
		while (true) {
			menu();
			
			switch(scan.next()) {
			
				case "1" :
					codeForMenu.add();
					break;
			
				case "2" :
					codeForMenu.remove();
					break;
				
				case "3" :
					codeForMenu.change();
					break;
				
				case "4" :
					codeForMenu.sortByName();
					break;
					
				case "5" :
					codeForMenu.sortByLength();
					break;
					
				case "6" :
					codeForMenu.sortByWeight();
					break;
					
				case "7" :
					codeForMenu.sortByWidth();
					break;
					
				case "8" :
					codeForMenu.seeElement();
					break;
					
				case "9" :
					System.exit(0);
					
			}
		}

	}

}
