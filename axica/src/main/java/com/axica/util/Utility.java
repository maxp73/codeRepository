package com.axica.util;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

import com.axica.model.WoldBean;

/***
 * 
 * @author maxp
 *
 */
public class Utility {
	
	public static final  String defaultWords = "what he saw was not part of a trap just a ton of snow" ;
	public static final  String SEPARATOR = " ";

	/**
	 * 
	 * @param wokdsKey
	 * @return
	 */
	public  static String reverseWord(String wokdsKey){
	    String finalvalue = new StringBuilder(wokdsKey).reverse().toString();
	    return finalvalue;
    }
   
	/***
	 * 
	 * @param in
	 * @param separatorChar
	 * @return
	 */
	public  static String[] getSplitWords(Scanner in,String separatorChar){
	    String[] finalvalue = in.nextLine().split(separatorChar);;
	    return finalvalue;
    }
	
	/***
	 * 
	 * @param words
	 * @param separatorChar
	 * @return
	 */
	public  static String[] getSplitWords(String words, String separatorChar){
	    String[] finalvalue = words.split(separatorChar);;
	    return finalvalue;
    }
	
	/***
	 * 
	 * @param inputStr
	 * @param cSeparator
	 * @return
	 */
	public Stack<String> setUtilityModel(String inputStr, String cSeparator ) {
		Stack<String> myStack = new Stack<>();
		StringTokenizer st = new StringTokenizer(inputStr, cSeparator);
		while (st.hasMoreTokens()) {
		     myStack.push(st.nextToken());
		}
		return myStack;
	}
	
	/***
	 * 
	 * @param listFind
	 */
	public  static void  printResultWolds(List<WoldBean> listFind){
		for(WoldBean wb : listFind){
			System.out.println(" "+wb.getWord() + " "+wb.getRevers());
		}
    }
	
	 
}
