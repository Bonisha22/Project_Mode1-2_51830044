package com.custapp.model.persistence;

public class CustomerNotFoundException extends RuntimeException{

	public CustomerNotFoundException (String message){
		super(message);
	}

}
