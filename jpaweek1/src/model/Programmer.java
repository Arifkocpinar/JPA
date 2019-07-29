package model;

abstract class Writer {    
	abstract void write() ;} 

class Author extends Writer {     
	@Override
	public void write() {         System.out.println("Writing book");     } }

public class Programmer extends Writer {   
	@Override
	public void write() {         System.out.println("asd book");     } 
	public static void main(String[] args) {         
		Writer w = new Author();         w.write();     } 
		
} 