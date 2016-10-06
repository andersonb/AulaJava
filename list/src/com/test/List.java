package com.test;

public class List implements IList{
	
	private No start;
	private int size = 0;
	
	public List(){
		this.start = null;
	}
	
	public void add(int value){
		No insert = new No(value,null);
		if(start == null){
			start = insert;
		}else{
			No e = start;
			while(e.getNext() != null){
				e = e.getNext();
			}
			e.setNext(insert);
		}
		size++;
	}
	
	public void print(){
		No e = start;
		while(e != null){
			System.out.print(e.toString() + ",");
			e = e.getNext();
		}
		System.out.println("\n");
	}
	
	
	public int get(int index){
		if(index < 0 || index >= size) throw new RuntimeException("Index: " + index +" size:" + size);
		No e = start;
		for(int i = 0; i < index; i++){
			e = e.getNext();
		}
		return e.getValue();
	}
	
	
	public void remove(int index){
		if(index < 0 || index >= size) throw new RuntimeException("Index: " + index +" size:" + size);
		No remove = start;
		No ant    = start;
		
		for(int i = 0; i < index; i++){
			ant = remove;
			remove = remove.getNext();
		}
		if(index != 0){
			ant.setNext(remove.getNext());
		}else{
			start = start.getNext();
		}
		size--;
	}
	
	public int getSize(){
		return size;
	}

}