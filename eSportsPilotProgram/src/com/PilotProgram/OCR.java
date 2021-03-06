package com.PilotProgram;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OCR {

	public static String getOCR(BufferedImage i) throws IOException {
		Tesseract tesseract = new Tesseract();
		String text = "";
		try {

			tesseract.setDatapath("G:\\My Drive\\Eclipse\\Tess4J\\tessdata");
			File output = new File("bufferedimage\\bufferedimage.png");
			ImageIO.write(i, "png", output);

			text = tesseract.doOCR(output);
			// System.out.println(text);

		} catch (TesseractException e) {
			e.printStackTrace();
		}
		return text;
	}

}
