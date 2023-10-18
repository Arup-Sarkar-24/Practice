package com.cisco.springcore.constructorinjection;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	public Person(String name, int personId , Certi certi) {
		this.name = name;
		this.personId= personId;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return  "Person name is : "+this.name + "\nPerson Id is : " + this.personId
				+"\nCertificate is : {"+this.certi.name+"}";
	}
	

}
