package com.PilotProgram;

public class Driver {

	public static void main(String[] args) throws Exception {
		Boolean loop = false;

		Game.setGameInfo();

		Config.readConfig();
		Screen.setCaptureRect();

		while (!loop) {
			if (Game.damageTaken()) {
				System.out.println("Damage Taken");
				// Haptics.activateHaptics();
			} else {
				System.out.println("Damage not Taken");
			}

		}

	}
}