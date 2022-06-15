package culminating;

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
