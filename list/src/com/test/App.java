package com.test;

public class App{

	public static void main(String[] args){
		
		List lista = new List();
		
		lista.add(1);
		lista.add(55);
		lista.add(3);
		lista.add(4);
		
		lista.print();
		System.out.println("size " + lista.getSize()); 	
		
		System.out.println("get1 " + lista.get(0)); 	
		System.out.println("get1 " + lista.get(1)); 	
		System.out.println("get1 " + lista.get(2)); 	
		System.out.println("get1 " + lista.get(3)); 	
		//System.out.println("get1 " + lista.get(4)); 


		lista.remove(0);
		lista.print();
		lista.remove(0);
		lista.print();
		lista.remove(0);
		lista.print();
		lista.remove(0);
		lista.print();
		
		lista.remove(0);
		lista.print();
	}
}