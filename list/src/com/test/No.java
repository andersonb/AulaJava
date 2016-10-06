package com.test;

public class No {
	private int value;
	private No next;

	public No(){
		this.next = null;
	}
	
	public No(int value,No next){
		this.value = value;
		this.next = next;
	}
	
	public void setNext(No next){
		this.next = next;	
	}
	
	public No getNext(){
		return this.next;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public String toString(){
		return "" + value;
	}
}
