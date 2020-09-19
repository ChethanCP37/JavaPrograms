package LearnJava;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Chethan");
		list.add("Putta");
		
		System.out.println(list);
		
		list.addFirst("Asha");
		list.addLast("Arsikere");

		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		list.add(0, "Bengaluru");
		System.out.println(list);
		
		list.add(2, "Third and 2nd index");
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(1));
		list.set(3, "first");
		System.out.println(list);
		
	}

}
