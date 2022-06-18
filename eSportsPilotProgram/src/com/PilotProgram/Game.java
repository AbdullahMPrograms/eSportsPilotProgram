package com.PilotProgram;

import java.awt.image.BufferedImage;

public class Game {

	public static int countWhite() {
		BufferedImage screenFullImage = Screen.getBufferedImage();
		int countWhite = 0;

		for (int j = 0; j < (screenFullImage.getWidth()); j++) {
			int c = screenFullImage.getRGB(j, 1);

			int blue = c & 0xff;
			int green = (c & 0xff00) >> 8;
			int red = (c & 0xff0000) >> 16;

			// System.out.println("x: " + j + " red: " + red + " green: " + green + " blue:"
			// + blue);

			// if (red >= 240 && blue >= 230 && green >= 230) {
			if (red >= 100 && blue >= 100 && green >= 100) {
				countWhite++;
			}
		}

		// System.out.println(countWhite);
		return countWhite;
	}

	public static int countRed() {
		BufferedImage screenFullImage = Screen.getBufferedImage();
		int countRed = 0;

		for (int k = 0; k < (screenFullImage.getHeight()); k++) {
			int c = screenFullImage.getRGB(1, k);

			int blue = c & 0xff;
			int green = (c & 0xff00) >> 8;
			int red = (c & 0xff0000) >> 16;

			// System.out.println("y: " + k + " red: " + red + " green: " + green + " blue:"
			// + blue);

			if (red >= 150 && blue <= 100 && green <= 100) {
				countRed++;
			}
		}

		// System.out.println(countRed);
		return countRed;
	}

	public static int countRedD2() {
		BufferedImage screenFullImage = Screen.getBufferedImage();
		int countRed = 0;

		for (int j = 0; j < (94); j++) {
			int c = screenFullImage.getRGB(j, 1);

			int blue = c & 0xff;
			int green = (c & 0xff00) >> 8;
			int red = (c & 0xff0000) >> 16;

			// System.out.println("x: " + j + " red: " + red + " green: " + green + " blue:
			// " + blue);

			if (red >= 105 && red <= 209 && blue >= 50 && blue <= 60 && green >= 53 && green <= 63) {
				countRed++;
			}
		}

		// System.out.println(countRed);
		return countRed;
	}

	public static Boolean damageTaken() {
		boolean damageTaken = false;

		int max = 0;
		// run task every 1 second
		max = countWhite();
		if (max > countWhite()) {
			damageTaken = true;
			// servo does stuff
		} else {
			damageTaken = false;
			// servo does nothing
		}
		return damageTaken;
	}

}
