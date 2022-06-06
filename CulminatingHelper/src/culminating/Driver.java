package culminating;

import java.awt.AWTException;
import java.util.Timer;
import java.util.TimerTask;

public class Driver {

	public static void main(String[] args) throws AWTException {
		Timer timer = new Timer();

		// run task every 1 second
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				if (ScreenCapture.damageTaken()) {
					System.out.println("Damage Taken");
					// servo does stuff
				} else {
					System.out.println("Damage not Taken");
					// servo does nothing
				}
			}
		}, 0, 1 * 1000); // x * 1000 = seconds
		// }, 0, ScreenCapture.getGameTimer());

	}
}