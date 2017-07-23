package com.axica.controller;


import java.util.*;

import javax.rmi.CORBA.Util;

import com.axica.model.WoldBean;
import com.axica.util.Utility;

/***
 * 
 * @author maxp
 *
 */
public class WordRevers {
	
	 private List<WoldBean> listFind ;
	 private String[] words;
	 private List<String> woldsFinded = new ArrayList<String>();
	 private String dWords = Utility.defaultWords;
	 
	 /**
	  * 
	  * @param wordsF
	  */
	 public WordRevers(String[] wordsF){
		words = wordsF;
		listFind = new ArrayList<WoldBean>();
	 }
	 
	 
	 public WordRevers(){
			listFind = new ArrayList<WoldBean>();
			words = Utility.getSplitWords(dWords, Utility.SEPARATOR);
	 }
	
	
	 public void containsRevers() {
	   	 if(words.length>0) {
		   	 for (int j = 0; j <= words.length-1; j++) {
		   	       if(words[j].length()>1) {
			   		  if(containsRevers(words[j]))  {
			   			  woldsFinded.add(words[j]);
			   			  listFind.add(new WoldBean(words[j]));
			   		  }
			   	   }
		   	 }
		 }
	 }
	
	 /***
	  * 
	  * @param word
	  * @return
	  */
	 public boolean containsRevers(String word) {
		  boolean isIn = false;
		  String sb = Utility.reverseWord(word);
					 
		  if(word.length()>1 && words.length>0) {
				for (int j = 0; j <= words.length-1; j++) {
				  if(words[j].equals(sb) && !woldsFinded.contains(words[j])) return true;
				}
		  }
		  
		  return isIn;
	 }

	public List<WoldBean> getListFind() {
		return listFind;
	}

	public void setListFind(List<WoldBean> listFind) {
		this.listFind = listFind;
	}

	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		this.words = words;
	}
}
