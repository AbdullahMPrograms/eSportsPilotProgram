package culminating;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Screen {

	private static Rectangle captureRect = new Rectangle(992, 140, 577, 5);

	public static Rectangle getCaptureRect() {

		return captureRect;
	}

	public static void setCaptureRect(int x, int y, int length, int width) {
		captureRect = new Rectangle(x, y, length, width);

	}

	public static BufferedImage getBufferedImage() {
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		getCaptureRect();

		BufferedImage screenFullImage = robot.createScreenCapture(getCaptureRect());
		return screenFullImage;
	}
}
