package org.cap.exceptions;

public class ProductExistException extends RuntimeException{
	public ProductExistException(String msg) {
		super(msg);
	}
}
