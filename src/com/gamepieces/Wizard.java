package com.gamepieces;

import com.descriptions.HumanInterface;

public class Wizard extends Human implements HumanInterface {

	protected int mp = 15;
	protected boolean hasStaff = false;

	public Wizard(int location, int health, float xp, String name, String gender, int mp, boolean hasStaff) {
		super(location, health, xp, name, gender);
		this.mp = mp;
		this.hasStaff = hasStaff;
	}

	public Wizard() {
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public boolean isHasStaff() {
		return hasStaff;
	}

	public void setHasStaff(boolean hasStaff) {
		this.hasStaff = hasStaff;
	}

	@Override
	public void move() {
		System.out.println("Wizards disaprove of dancing.");
	}

	// @Override
	// public void takeATurn() {
	// // TODO Auto-generated method stub
	//
	// }

	@Override
	public void attack() {
		// TODO Auto-generated method stub

	}

	@Override
	public int whereAmI() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void eats() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleeps() {
		// TODO Auto-generated method stub
		
	}

}
