package com.coderscampus.arraylist;

public interface CustomList<T> {
	    boolean add(T item);
	    int getSize();
	    T get(int index);
	    
	    
	    void add(int index, T item);
	    T remove(int index);	

}




