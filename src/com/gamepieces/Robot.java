package com.gamepieces;

public class Robot extends CharacterClass {

	protected String id = null;
	protected String type = null;

	public Robot(int location, int health, float xp, String id, String type) {
		super(location, health, xp);
		this.id = id;
		this.type = type;
	}

	public Robot() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void takeATurn() {
		// TODO Auto-generated method stub

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

}
