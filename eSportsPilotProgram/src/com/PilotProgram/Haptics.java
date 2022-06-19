package com.PilotProgram;

import com.phidget22.Hub;
import com.phidget22.Phidget;
import com.phidget22.PhidgetException;

public class Haptics {

	public static void main(String[] args) throws Exception {
		try {
			Hub ch = new Hub();
			ch.open(Phidget.DEFAULT_TIMEOUT);

			ch.setPortPower(3, true);

			Thread.sleep(300);

			ch.setPortPower(3, false);

			ch.close();
		} catch (PhidgetException ex) {
			System.out.println("Failure: " + ex);
		}
	}

	public static void activateHaptics() throws Exception {
		try {
			Hub ch = new Hub();
			ch.open(Phidget.DEFAULT_TIMEOUT);

			ch.setPortPower(3, true);

			Thread.sleep(300);

			ch.setPortPower(3, false);

			ch.close();
		} catch (PhidgetException ex) {
			System.out.println("Failure: " + ex);
		}
	}

}