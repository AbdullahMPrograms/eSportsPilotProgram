package culminating;


public class Driver {

	public static void main(String[] args) throws Exception {
		int yo = 1;
		int max = 0;
		// run task every 1 second
		
		Servo.setServo();

		while (yo >= 0) {
			max = Game.countRedD2();

			// System.out.println(LocalTime.now());
			// System.out.println("Before: " + max);
			Thread.sleep(1000);
			// System.out.println("Current: " + Game.countRedD2());
			// System.out.println("");

			if (max > Game.countRedD2() && max != 0) {
				System.out.println("Damage Taken");
				Servo.activateServo();
				// servo does stuff
			} else {
				System.out.println("Damage not Taken");
				Servo.activateServo(); // for testing remove in final
				// servo does nothing
			}

		}

	}
}