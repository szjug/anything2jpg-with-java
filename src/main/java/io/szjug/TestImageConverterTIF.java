package io.szjug;

import java.io.FileNotFoundException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;

public class TestImageConverterTIF {

	public static void main(String[] args) throws FileNotFoundException {
		
		String inputImage = "263.tif";
		String oututImage = "263.jpg";
		String formatName = "jpg";
		
		boolean result = ImageConverter7.convertFormat(inputImage, oututImage, formatName);
		if (result) {
			System.out.println("Image converted successfully.");
		} else {
			System.out.println("Could not convert image.");
		}
	}
}