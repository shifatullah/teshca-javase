package com.teshca.javase;

import com.teshca.javase.collection.*;

public class JavaSEApplication {

	public static void main(String[] args) {
		CollectionShowCase objCollectionShowCase = new CollectionShowCase();
		
		objCollectionShowCase.ArrayListShowCase();		
		
		objCollectionShowCase.LinkedListShowCase();
		
		
		
		System.out.println("Press any key to exit...");
		System.console().readLine();
	}

}
