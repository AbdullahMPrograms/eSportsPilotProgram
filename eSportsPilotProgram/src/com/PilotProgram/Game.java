package com.PilotProgram;

public class Game {
	static String gameInfo = null;
	static String gameName = null;

	public static void setGameInfo(String game, String res) {
		String gameRes = null;

		gameName = game;
		gameRes = res;

		gameInfo = "//" + gameName + "//" + gameRes;
	}

	public static String getGameName() {
		return gameName;
	}

	public static String getGameInfo() {
		return gameInfo;
	}

	public static Boolean damageTaken() throws Exception {
		boolean damageTaken = false;

		int max = 0;
		if (getGameName().equals("Apex")) {
			max = Screen.countHealthApex();
			Thread.sleep(1000);
			if (max > Screen.countHealthApex() && max != 0 && Screen.countHealthApex() != 0) {
				damageTaken = true;
			}
		}

		if (getGameName().equals("Destiny 2")) {
			max = Screen.countHealthD2();
			Thread.sleep(500);

			if (max > Screen.countHealthD2() && max != 0 && Screen.countHealthD2() != 0) {
				damageTaken = true;
			}
		}

		if (gameName.equals("Valhiem")) {
			max = Screen.countHealthValhiem();
			Thread.sleep(500);

			if (max > Screen.countHealthValhiem() && max != 0 && Screen.countHealthValhiem() != 0) {
				damageTaken = true;
			}
		}

		if (gameName.equals("Fortnite")) {
			max = Screen.countHealthFortnite();
			Thread.sleep(500);

			if (max > Screen.countHealthFortnite() && max != 0 && Screen.countHealthFortnite() != 0) {
				damageTaken = true;
			}
		}

		if (gameName.equals("Fifa")) {
			if (Screen.isBarOpenFifa()) {
				max = Screen.countScoreFifa(0);			
				Thread.sleep(1000);
				if (Screen.isBarOpenFifa() && max < Screen.countScoreFifa(max)) {
					damageTaken = true;
				}
			}else {
				Thread.sleep(500);
				}
			
		}

		if (gameName.equals("Minecraft")) {
			max = Screen.countHealthMinecraft();
			Thread.sleep(1000);

			if (max > Screen.countHealthMinecraft() && max != 0 && Screen.countHealthMinecraft() != 0) {
				damageTaken = true;
			}
		}

		return damageTaken;
	}
}
