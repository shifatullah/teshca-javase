package com.teshca.javase.collection;

import java.util.*;

public class CollectionShowCase {

	public void ArrayListShowCase() {
		System.out.println("******** ArrayList ShowCase ********");		
		
		// Create ArrayList of String
		ArrayList<String> stringArrayList = new ArrayList<String>();		
		System.out.println("ArrayList created: " + stringArrayList + " - Size: " + stringArrayList.size());
		
		// Add three objects
		stringArrayList.add("One");
		stringArrayList.add("Two");
		stringArrayList.add("Four");		
		System.out.println("Added three objects: " + stringArrayList + " - Size: " + stringArrayList.size());
		
		// Add object at third position
		stringArrayList.add(2, "Three");
		System.out.println("Added object 'Three' at 3rd position: " + stringArrayList + " - Size: " + stringArrayList.size());
		
		// Remove second object
		stringArrayList.remove("Two");
		System.out.println("Removed object 'Two': " + stringArrayList + " - Size: " + stringArrayList.size());
		
		// Remove object at 2nd position:
		stringArrayList.remove(1);
		System.out.println("Removed object at 2nd position: " + stringArrayList + " - Size: " + stringArrayList.size());
		
		
	}
	
	public void LinkedListShowCase() {
		System.out.println("******** LinkedList ShowCase ********");
		
		// Create LinkedList
		LinkedList<String> stringLinkedList = new LinkedList<String>();		
		System.out.println("LinkedList created: " + stringLinkedList + " - Size: " + stringLinkedList.size());

		// Add five objects
		stringLinkedList.add("Two");
		stringLinkedList.add("Three");
		stringLinkedList.add("Five");
		stringLinkedList.add("Six");
		stringLinkedList.add("Eight");
		System.out.println("Added five objects using add() i.e. add(\"Two\"): " + stringLinkedList + " - Size: " + stringLinkedList.size());
		
		// Add object at first position
		stringLinkedList.addFirst("One");
		System.out.println("Added object 'One' using addFirst(\"One\"): " + stringLinkedList + " - Size: " + stringLinkedList.size());
		
		// Add object at last position
		stringLinkedList.addLast("Nine");
		System.out.println("Added object 'Nine' using addLast(\"Four\"): " + stringLinkedList + " - Size: " + stringLinkedList.size());
		
		// Add object at 4th position
		stringLinkedList.add(3, "Four*");
		System.out.println("Added object 'Four*' at 4th position using add(3, \"Four*\"): " + stringLinkedList + " - Size: " + stringLinkedList.size());
		
		// Remove last object
		stringLinkedList.removeLast();
		System.out.println("Removed last object using removeLast(): " + stringLinkedList + " - Size: " + stringLinkedList.size());
		
		// Remove first object
		stringLinkedList.removeFirst();
		System.out.println("Removed first object using removeFirst(): " + stringLinkedList + " - Size: " + stringLinkedList.size());
		
		// Get 3rd object
		String _3rd = stringLinkedList.get(2);
		System.out.println("Get 3rd object using get(2): " + _3rd);
		
		// Change 3rd object value
		stringLinkedList.set(2, "Four");
		System.out.println("Set 3rd object to 'Four' using set(2, \"Four\"): " + stringLinkedList.get(2));
	}
	
	public void HashSetShowCase() {
		System.out.println("******** HashSet ShowCase ********");
		
		// Create HashSet
		HashSet<String> stringHashSet = new HashSet<String>();		
		System.out.println("HashSet created: " + stringHashSet + " - Size: " + stringHashSet.size());

		// Add four objects HashSet
		stringHashSet.add("Two");
		stringHashSet.add("Three");
		stringHashSet.add("Five");
		stringHashSet.add("Nine");
		System.out.println("Added four objects in HashSet: " + stringHashSet + " - Size: " + stringHashSet.size());
	}
	
	public void LinkedHashSetShowCase() {
		System.out.println("******** LinkedHashSet ShowCase ********");
		
		// Create LinkedHashSet
		LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<String>();		
		System.out.println("LinkedHashSet created: " + stringLinkedHashSet + " - Size: " + stringLinkedHashSet.size());

		// Add four objects LinkedHashSet
		stringLinkedHashSet.add("Two");
		stringLinkedHashSet.add("Three");
		stringLinkedHashSet.add("Five");
		stringLinkedHashSet.add("Nine");
		System.out.println("Added four objects in LinkedHashSet: " + stringLinkedHashSet + " - Size: " + stringLinkedHashSet.size());
	}
	
	public void TreeSetShowCase() {
		System.out.println("******** TreeSet ShowCase ********");
		
		// Create TreeSet
		TreeSet<String> stringTreeSet = new TreeSet<String>();		
		System.out.println("TreeSet created: " + stringTreeSet + " - Size: " + stringTreeSet.size());

		// Add four objects TreeSet
		stringTreeSet.add("Two");
		stringTreeSet.add("Three");
		stringTreeSet.add("Five");
		stringTreeSet.add("Nine");
		System.out.println("Added four objects in TreeSet: " + stringTreeSet + " - Size: " + stringTreeSet.size());
	}
	
	public void PriorityQueueShowCase() {
		System.out.println("******** PriorityQueue ShowCase ********");
		
		// Create PriorityQueue
		PriorityQueue<String> stringPriorityQueue = new PriorityQueue<String>();		
		System.out.println("PriorityQueue created: " + stringPriorityQueue + " - Size: " + stringPriorityQueue.size());

		// Add four objects PriorityQueue
		stringPriorityQueue.add("Two");
		stringPriorityQueue.add("Three");
		stringPriorityQueue.add("Five");
		stringPriorityQueue.add("Nine");
		System.out.println("Added four objects in PriorityQueue: " + stringPriorityQueue + " - Size: " + stringPriorityQueue.size());
		
		// Poll
		String pollObject = stringPriorityQueue.poll();
		System.out.println("After poll() call on PriorityQueue: " + stringPriorityQueue + " poll object is: " + pollObject + " - Size: " + stringPriorityQueue.size());
		
		// Offer
		boolean offerResult = stringPriorityQueue.offer("Ten");
		System.out.println("After offer(\"Ten\") call on PriorityQueue: " + stringPriorityQueue + " offer() returned: " + offerResult + " - Size: " + stringPriorityQueue.size());
	}
	
	public void ArrayDequeShowCase() {
		System.out.println("******** ArrayDeque ShowCase ********");
		
		// Create ArrayDeque
		ArrayDeque<String> stringArrayDeque = new ArrayDeque<String>();		
		System.out.println("ArrayDeque created: " + stringArrayDeque + " - Size: " + stringArrayDeque.size());

		// Add four objects ArrayDeque
		stringArrayDeque.add("Two");
		stringArrayDeque.add("Three");
		stringArrayDeque.add("Five");
		stringArrayDeque.add("Nine");
		System.out.println("Added four objects in ArrayDeque: " + stringArrayDeque + " - Size: " + stringArrayDeque.size());
		
		// Poll
		String pollObject = stringArrayDeque.poll();
		System.out.println("After poll() call on ArrayDeque: " + stringArrayDeque + " poll object is: " + pollObject + " - Size: " + stringArrayDeque.size());
		
		// Push
		stringArrayDeque.push("Ten");
		System.out.println("After push(\"Ten\") call on ArrayDeque: " + stringArrayDeque + " - Size: " + stringArrayDeque.size());
	}
	
	enum days {  
		  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
		}
	
	public void EnumSetShowCase() {
		System.out.println("******** EnumSet ShowCase ********");
		
		// Create EnumSet
		Set<days> enumSet = EnumSet.of(days.TUESDAY, days.THURSDAY); 		
		System.out.println("EnumSet created: " + enumSet + " - Size: " + enumSet.size());			
	}
}
