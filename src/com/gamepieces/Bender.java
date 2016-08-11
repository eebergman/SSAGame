package com.gamepieces;

import com.descriptions.RobotInterface;

public class Bender extends Robot implements RobotInterface {

	protected boolean hasStolenStuff = true;
	protected boolean canBend = false; // girders

	public Bender(int location, int health, float xp, String id, String type, boolean hasStolenStuff, boolean canBend) {
		super(location, health, xp, id, type);
		this.hasStolenStuff = hasStolenStuff;
		this.canBend = canBend;
	}

	public Bender() {
	}

	public boolean isHasStolenStuff() {
		return hasStolenStuff;
	}

	public void setHasStolenStuff(boolean hasStolenStuff) {
		this.hasStolenStuff = hasStolenStuff;
	}

	public boolean isCanBend() {
		return canBend;
	}

	public void setCanBend(boolean canBend) {
		this.canBend = canBend;
	}

	@Override
	public void powerDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public int refuel() {
		// TODO Auto-generated method stub
		return 0;
	}

}
