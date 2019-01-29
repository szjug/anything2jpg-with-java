package io.szjug;

import java.io.FileNotFoundException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;

public class TestImageConverter7 {

	public static void main(String[] args) throws FileNotFoundException {
		Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName("JPEG");
		while (readers.hasNext()) {
		    System.out.println("reader: " + readers.next());
		}
		
		String inputImage = "PNG_transparency_demonstration_1.png";
		String oututImage = "PNG_transparency_demonstration_11.jpg";
		String formatName = "jpg";
		
		boolean result = ImageConverter7.convertFormat(inputImage, oututImage, formatName);
		if (result) {
			System.out.println("Image converted successfully.");
		} else {
			System.out.println("Could not convert image.");
		}
	}
}