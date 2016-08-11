package com.gamepieces;

public class Human extends CharacterClass {

	protected String name = null;
	protected String gender = null;
	
	public Human(int location, int health, float xp, String name, String gender) {
		super(location, health, xp);
		this.name = name;
		this.gender = gender;
	}
	
	public Human() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void move() {
		System.out.println("Humans like to dance.");
	}

	@Override
	public void takeATurn() {
		System.out.println("Take A turn");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub

	}

	@Override
	public int whereAmI() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
} //class



