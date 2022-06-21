package com.PilotProgram;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Screen {
	static BufferedImage screenFullImage = null;

	private static Rectangle captureRect = new Rectangle(176, 1255, 241, 5);

	public static Rectangle getCaptureRect() {
		return captureRect;
	}

	public static void setCaptureRect() {
		captureRect = new Rectangle(Config.getX(), Config.getY(), Config.getLength(), Config.getWidth());
	}

	public static void setCaptureRectGUI(int x, int y, int length, int width) {
		captureRect = new Rectangle(x, y, length, width);
	}

	public static BufferedImage getBufferedImage() {
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		BufferedImage screenFullImage = robot.createScreenCapture(getCaptureRect());
		return screenFullImage;
	}

	public static int countHealthApex() {
		screenFullImage = getBufferedImage();
		int countHealth = 0;

		for (int j = 0; j < (screenFullImage.getWidth()); j++) {
			int c = screenFullImage.getRGB(j, 1);

			int red = (c & 0xff0000) >> 16;
			int green = (c & 0xff00) >> 8;
			int blue = c & 0xff;

			if (red >= Config.getR() && green >= Config.getG() && blue >= Config.getB()) {
				countHealth++;
			}

		}

		return countHealth;
	}

	public static int countHealthApexY() {
		screenFullImage = Screen.getBufferedImage();
		int countHealthY = 0;

		for (int k = 0; k < (screenFullImage.getHeight()); k++) {
			int c = screenFullImage.getRGB(1, k);

			int blue = c & 0xff;
			int green = (c & 0xff00) >> 8;
			int red = (c & 0xff0000) >> 16;

			if (red >= Config.getR() && green >= Config.getG() && blue >= Config.getB()) {
				countHealthY++;
			}
		}

		return countHealthY;

	}

	public static int countHealthD2() {
		screenFullImage = getBufferedImage();
		int countHealth = 0;

		for (int j = 0; j < (screenFullImage.getWidth()); j++) {
			int c = screenFullImage.getRGB(j, 1);

			int red = (c & 0xff0000) >> 16;
			int green = (c & 0xff00) >> 8;
			int blue = c & 0xff;

			if (red >= Config.getR() && green >= Config.getG() && blue >= Config.getB()) {
				countHealth++;
			}

		}

		return countHealth;
	}

	public static int countHealthValhiem() {
		screenFullImage = getBufferedImage();
		int countHealth = 0;

		for (int j = 0; j < (screenFullImage.getWidth()); j++) {
			int c = screenFullImage.getRGB(j, 1);

			int red = (c & 0xff0000) >> 16;
			int green = (c & 0xff00) >> 8;
			int blue = c & 0xff;

			if (red >= Config.getR() && green <= Config.getG() && blue <= Config.getB()) {
				countHealth++;
			}

		}

		return countHealth;
	}
	public static int countScoreFifa() throws Exception {
		screenFullImage = getBufferedImage();
		int countGoals = 0;

		System.out.println(OCR.getOCR(screenFullImage).length());
		String doneOCR = OCR.getOCR(screenFullImage).substring(2, 3);
		boolean result = doneOCR.matches("[0-9]+");
		if (result && (OCR.getOCR(screenFullImage).length()) == 5) {
			countGoals = Integer.valueOf(doneOCR);
		}
		// System.out.println(countGoals);
		return countGoals;
	}
	public static int countHealthMinecraft() {
		screenFullImage = getBufferedImage();
		int countHealth = 0;

		for (int j = 0; j < (screenFullImage.getWidth()); j++) {
			for(int k = 0; k <(screenFullImage.getHeight()); k ++) {
			int c = screenFullImage.getRGB(j, k);

			int red = (c & 0xff0000) >> 16;
			int green = (c & 0xff00) >> 8;
			int blue = c & 0xff;
			//System.out.println(red + "   " + green + "   " + blue);
			if (red >= Config.getR() && green <= Config.getG() && blue <= Config.getB()) {
				countHealth++;
			}

		}
	}

		return countHealth;
	}

}
