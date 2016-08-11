package com.gameboard;

import com.gamepieces.*;

public class GameBoard {

	public static void main(String[] args) {

		Human aPerson = new Human();
		Wizard gandalf = new Wizard();

		aPerson.move();
		gandalf.move();

		System.out.println();

		aPerson.takeATurn();
		gandalf.takeATurn();
	}

}
