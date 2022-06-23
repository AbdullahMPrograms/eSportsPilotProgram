package com.PilotProgram;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Screen {
	static BufferedImage screenFullImage = null;

	private static Rectangle captureRect = new Rectangle(0, 0, 0, 0);

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

			// System.out.println("x: " + j + " Red: " + red + " Green: " + green + " Blue:
			// " + blue);

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

		for (int j = 0; j < (screenFullImage.getHeight()); j++) {
			int c = screenFullImage.getRGB(1, j);

			int red = (c & 0xff0000) >> 16;
			int green = (c & 0xff00) >> 8;
			int blue = c & 0xff;

			// System.out.println("x: " + j + " Red: " + red + " Green: " + green + " Blue:
			// " + blue);

			if (red >= Config.getR() && green <= Config.getG() && blue <= Config.getB()) {
				countHealth++;
			}

		}

		return countHealth;
	}

	public static int countHealthFortnite() throws Exception {
		screenFullImage = getBufferedImage();
		int countHealth = 0;

		for (int j = 0; j < (screenFullImage.getWidth()); j++) {
			int c = screenFullImage.getRGB(j, 1);

			int red = (c & 0xff0000) >> 16;
			int green = (c & 0xff00) >> 8;
			int blue = c & 0xff;

			if (red <= Config.getR() && green >= Config.getG() && blue <= Config.getB()) {
				countHealth++;
			}

		}

		return countHealth;
	}

	public static int countScoreFifa(int i) throws IOException {
		screenFullImage = getBufferedImage();
		int countGoals = 0;

		String doneOCR = OCR.getOCR(screenFullImage);
		//System.out.println(doneOCR);
		char temp = '0';
		if (doneOCR != null) {
			temp = doneOCR.charAt(0);
			doneOCR = String.valueOf(temp);

			if (doneOCR.equals("D")) {
				countGoals = 0;

			} else if (doneOCR.equals("0") || doneOCR.equals("1") || doneOCR.equals("2") || doneOCR.equals("3")
					|| doneOCR.equals("4") || doneOCR.equals("5") || doneOCR.equals("6") || doneOCR.equals("7")
					|| doneOCR.equals("8") || doneOCR.equals("9")) {
				countGoals = Integer.valueOf(doneOCR);

			} else {
				countGoals = i;
			}

		} else {
			countGoals = 1000;
		}
		return countGoals;
	}

	public static boolean isBarOpenFifa() {
		screenFullImage = Screen.getBufferedImage();
		int barCounter = 0;
		int textCounter = 0;

		for (int k = 0; k < (screenFullImage.getHeight()); k++) {
			int c = screenFullImage.getRGB(13, k);

			int blue = c & 0xff;
			int green = (c & 0xff00) >> 8;
			int red = (c & 0xff0000) >> 16;

			if (red >= Config.getR() && green <= Config.getG() && blue <= Config.getB()) {
				barCounter++;
			}
			if (red <= 70 && green <= 40 && blue <= 40) {
				textCounter++;
			}

		}
		//System.out.println(barCounter + "     " + textCounter);
		if (barCounter >= 13 && textCounter != 0) {
			//System.out.println("bar is open");
			return true;
		}
		return false;

	}

	public static int countHealthMinecraft() {
		screenFullImage = getBufferedImage();
		int countHealth = 0;

		for (int j = 0; j < (screenFullImage.getWidth()); j++) {
			for (int k = 0; k < (screenFullImage.getHeight()); k++) {
				int c = screenFullImage.getRGB(j, k);

				int red = (c & 0xff0000) >> 16;
				int green = (c & 0xff00) >> 8;
				int blue = c & 0xff;
				// System.out.println(red + " " + green + " " + blue);
				if (red >= Config.getR() && green <= Config.getG() && blue <= Config.getB()) {
					countHealth++;
				}

			}
		}

		return countHealth;
	}

}
