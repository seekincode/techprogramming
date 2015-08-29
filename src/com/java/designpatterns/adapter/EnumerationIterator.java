package com.java.designpatterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Adapter class to support Enumerator interface in the way Iterator interface works.
 * @author Praveen Singh
 */
public class EnumerationIterator implements Iterator {

	Enumeration enumer;
	
	public EnumerationIterator(Enumeration enumer) {
		this.enumer = enumer;
	}
	
	public boolean hasNext() {
		return enumer.hasMoreElements();
	}

	public Object next() {
		return enumer.nextElement();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}

