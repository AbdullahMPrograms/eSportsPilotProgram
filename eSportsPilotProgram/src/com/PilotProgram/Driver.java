package com.PilotProgram;

public class Driver {

	public static void main(String[] args) throws Exception {
		Boolean loop = false;
		int max = 0;
		// run task every 1 second

		// Servo.setServo();

		Config.readConfig();
		System.out.println(Config.getX());
		System.out.println(Config.getY());
		System.out.println(Config.getLength());
		System.out.println(Config.getWidth());

		while (!loop) {
			max = Game.countWhite();

			// System.out.println(LocalTime.now());
			// System.out.println("Before: " + max);
			Thread.sleep(1000);
			// System.out.println("Current: " + Game.countRedD2());
			// System.out.println("");

			if (max > Game.countWhite() && max != 0 && Game.countWhite() != 0) {
				System.out.println("Damage Taken");
				// Servo.activateServo();
				// Haptics.activateHaptics();
				// servo does stuff
			} else {
				System.out.println("Damage not Taken");
				// Servo.activateServo();
				// Haptics.activateHaptics();
				// servo does nothing
			}

		}

	}
}