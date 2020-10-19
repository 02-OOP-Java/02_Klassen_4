package com.cc.java;

public class Cat 
{
	// Fields
	public String name;
	public String furColor;
	public int age;
	
	/**
	 * @param name
	 * @param furColor
	 * @param age
	 */
	public Cat(String name, String furColor, int age) {
		this.name = name;
		this.furColor = furColor;
		this.age = age;
	}

	public void tellYourAge() {
		System.out.println("Alter: " + this.age);
	}
	
	public void tellYourFurColor() {
		System.out.println("Fellfarbe: " + this.furColor);
	}
	
	public void tellYourName() {
		System.out.println("Name: " + this.name);
	}

	public void tellYourAddress()
	{
		System.out.println("@: " + this);
	}
	
	
	
}
