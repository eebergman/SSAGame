package com.gamepieces;

import com.descriptions.HumanInterface;

public class Archer extends Human implements HumanInterface{

	protected boolean hasBow = false;
	protected int numberOfArrows = 0;

	public Archer(int location, int health, float xp, String name, String gender, boolean hasBow, int numberOfArrows) {
		super(location, health, xp, name, gender);
		this.hasBow = hasBow;
		this.numberOfArrows = numberOfArrows;
	}

	public Archer() {
	}

	public boolean isHasBow() {
		return hasBow;
	}

	public void setHasBow(boolean hasBow) {
		this.hasBow = hasBow;
	}

	public int getNumberOfArrows() {
		return numberOfArrows;
	}

	public void setNumberOfArrows(int numberOfArrows) {
		this.numberOfArrows = numberOfArrows;
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

	@Override
	public void eats() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleeps() {
		// TODO Auto-generated method stub
		
	}

} // class
