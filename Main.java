import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		CircularLinkedList linkedlist = new CircularLinkedList();
		
		String input = keyboard.nextLine();
		input = input.replace("\"", "");
		
//		System.out.println(input);
		
		int index = input.indexOf("|");
		int howMany = Integer.parseInt(input.substring(index+2, index+3));
		int position = Integer.parseInt(input.substring(index+4, index+5));
		
//		System.out.println(howMany + "---" + position);
		
		String elementsOfList = input.substring(0, index);
		
//		System.out.println(elementsOfList);
		
		for(int i=0; i<(elementsOfList.length()); i+=2) {
			//System.out.println(elementsOfList.charAt(i) + "");
			linkedlist.add(Integer.parseInt(elementsOfList.charAt(i) + ""));
		}
		
		System.out.println(linkedlist.calculate(howMany, position));
		
//		System.out.println(linkedlist.toString());
		
	}
}
