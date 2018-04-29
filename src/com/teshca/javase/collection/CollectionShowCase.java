package com.teshca.javase.collection;

import java.util.*;

public class CollectionShowCase {

	public void ArrayListShowCase() {
		System.out.println("ArrayList ShowCase");		
		
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
		System.out.println("LinkedList ShowCase");
		
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
}
