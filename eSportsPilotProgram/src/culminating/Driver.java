package culminating;

import java.awt.AWTException;

public class Driver {

	public static void main(String[] args) throws AWTException, InterruptedException {
		int yo = 1;
		// run task every 1 second

		while (yo >= 0) {
			yo = Game.countWhite();
			// System.out.println("Before: " + yo);
			Thread.sleep(1000);
			// System.out.println("Current: " + Game.countWhite());
			if (yo > Game.countWhite()) {
				System.out.println("Damage Taken");
				// servo does stuff
			} else {
				System.out.println("Damage not Taken");
				// servo does nothing
			}

		}

	}
}