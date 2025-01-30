package com.Banking_System;

public class Customer {
//  The private modifier ensures that this field can only be accessed within the Customer class.
    private int customerID;
    private String name;
    private String address;
    private String contact;

    // Defines a constructor for the Customer class.
    public Customer(int customerID, String name, String address, String contact) {
        this.customerID = customerID; //The this keyword refers to the current instance of the class.
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    // Getters and setters
    //These are accessor methods for each private field. They allow controlled access to the private variables
    public int getCustomerID() { 
    	return customerID; 
    }
    public void setCustomerID(int customerID) { 
    	this.customerID = customerID; 
    }
    public String getName() { 
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }
    public String getAddress() { 
    	return address; 
    }
    public void setAddress(String address) { 
    	this.address = address; 
    }
    public String getContact() { 
    	return contact; 
    }
    public void setContact(String contact) { 
    	this.contact = contact; 
    }

    @Override //This annotation indicates that the following method (toString) overrides a method from the superclass (Object)
    public String toString() {  //Overrides the toString method to provide a custom string representation of the Customer object.
        //Returns a string containing all the fields (customerID, name, address, contact) in a readable format.
    	return "Customer ID: " + customerID + ", Name: " + name + ", Address: " + address + ", Contact: " + contact;
    }
}

