package com.axica;

import java.util.Scanner;

import com.axica.controller.WordRevers;
import com.axica.util.Utility;

/**
 * 
 * 
 */
public class App {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String itemWolds = in.nextLine();
		System.out.println(" find itemSought is " + itemWolds);

		if (!itemWolds.equals("") || itemWolds != null)
			itemWolds = Utility.defaultWords;

		String[] words = Utility.getSplitWords(itemWolds, Utility.SEPARATOR);

		execution(  words);

	}

	/***
	 * 
	 * @param words
	 */
	public static void execution(String[] words) {

		WordRevers wr = null;
		if (words.length > 0) {
			wr = new WordRevers(words);
			wr.containsRevers();
		} else {
			wr = new WordRevers();
			wr.containsRevers();
		}

		if (wr != null && (!wr.getListFind().isEmpty())) {
			Utility.printResultWolds(wr.getListFind());
		}
	}

}
