package com.teshca.javase;

import com.teshca.javase.collection.*;

public class JavaSEApplication {

	public static void main(String[] args) {
		
		System.out.println("**************************************");
		System.out.println("******** COLLECTIONS SHOWCASE ********");
		System.out.println("**************************************");
		System.out.println("\n");
		
		CollectionShowCase objCollectionShowCase = new CollectionShowCase();		
		objCollectionShowCase.ArrayListShowCase();				
		objCollectionShowCase.LinkedListShowCase();
		objCollectionShowCase.HashSetShowCase();
		objCollectionShowCase.LinkedHashSetShowCase();
		objCollectionShowCase.TreeSetShowCase();
		objCollectionShowCase.PriorityQueueShowCase();
		objCollectionShowCase.ArrayDequeShowCase();
		objCollectionShowCase.EnumSetShowCase();		
		
		System.out.println("Press any key to exit...");
		System.console().readLine();
	}

}
