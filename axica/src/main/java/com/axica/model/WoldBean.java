package com.axica.model;

import java.io.Serializable;

import com.axica.util.Utility;

public class WoldBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String word;
	private String revers;
	
	public WoldBean(){}
	
	public WoldBean(String word ){
		this.word = word;
		setRevers(Utility.reverseWord(word));
	}
	
	 
	
	public WoldBean(String word,String revers){
		this.word=word;
		this.revers= revers;
	}
	
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getRevers() {
		return revers;
	}
	public void setRevers(String revers) {
		this.revers = revers;
	}

}
