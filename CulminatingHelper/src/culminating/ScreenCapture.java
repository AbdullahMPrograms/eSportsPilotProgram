package culminating;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class ScreenCapture {

	private static Rectangle captureRect = new Rectangle(177, 1247, 238, 13);

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

	public static Boolean damageTaken() {
		BufferedImage screenFullImage = getBufferedImage();

		boolean damageTaken = false;
		int countRed = 0;

		for (int j = 0; j < (screenFullImage.getWidth()); j++) {

			// Color c = new Color(screenFullImage.getRGB(j, 1));
			int c = screenFullImage.getRGB(j, 1);

			int blue = c & 0xff;
			int green = (c & 0xff00) >> 8;
			int red = (c & 0xff0000) >> 16;

			// System.out.println("x: " + j);
			// System.out.println("red value: " + red);
			// System.out.println("green value: " + green);
			// System.out.println("blue value: " + blue);
			// System.out.println("");

			// countPixels
			// if(countPixels > countPixelsBefore)
			// Take Damage

			// if (c.getRed() >= getRGBValue()) {
			if (red >= 220 && blue <= 20 && green <= 20) {
				countRed++;

				// } else if (c.getRed() < getRGBValue()) {
			}
		}

		if (countRed >= 1) {
			damageTaken = true;
		} else {
			damageTaken = false;
		}

		System.out.println(countRed);
		return damageTaken;

	}

}
