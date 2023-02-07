package javaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;

public class CollectionsDemo {

	public static void main(String[] args) {


		ArrayList al=new ArrayList<>();

		al.add(85);

		al.add(34);
		al.add(98);
		al.add(34);
		al.add("vaira");
		al.add(true);
		al.add('H');
		System.out.println(al);
		ListIterator li = al.listIterator();
		System.out.println(li.nextIndex());
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("*****************Reverse*************");
		System.out.println(li.previousIndex());
		while(li.hasPrevious()) {
			if(li.previous().equals('H')) {
				li.set("Hi");
			}
		}
		li.add(45);
		System.out.println(al);
		ArrayList al2=new ArrayList<>();
		al2.add(2);
		al2.add(5);
		al2.add(2);
		al2.add(8);
		al2.add("bca");
		al2.add(false);
		al2.add('M');
		System.out.println(al2);
		al.addAll(3, al2);
		System.out.println(al);
		Object clone = al.clone();
		System.out.println(clone);
		boolean contains = al.contains(2);
		System.out.println(contains);
		boolean equals = al.equals(al2);
		System.out.println(equals);
		boolean k = al.containsAll(al2);
		System.out.println(k);
		Object object = al.get(5);
		System.out.println(object);
		Object remove = al.remove(2);
		System.out.println(remove);
		System.out.println(al);
	
		LinkedList ll=new LinkedList();
		ll.addAll(al);
		System.out.println(ll);
		ll.add(3, "moonu");
		System.out.println(ll);
		ll.addFirst(7);
		ll.addLast(77);
		System.out.println(ll);
		System.out.println("poll()  "+ll.poll());
		System.out.println("ll.pollFirst()  "+ll.pollFirst());
		System.out.println("ll.pollLast()  "+ll.pollLast());
		System.out.println("ll.pop()  "+ll.pop());
		
		
		System.out.println(ll);
		
		
		ll.offer(10);
		 ll.offerFirst(66);
		ll.offerLast(77);
		System.out.println(ll);
		
		System.out.println("ll.peek()  "+ll.peek());
		System.out.println("ll.peekFirst()  "+ll.peekFirst());
		System.out.println("	ll.peekLast();  "+	ll.peekLast());
		System.out.println(ll);
		
		
		
		
	

	}

}
