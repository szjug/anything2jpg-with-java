package net.codejava.graphic;

import java.io.FileNotFoundException;

import io.szjug.ImageConverter7;

public class TestImageConverter7 {

	public static void main(String[] args) throws FileNotFoundException {
		String inputImage = "PNG_transparency_demonstration_1.png";
		String oututImage = "PNG_transparency_demonstration_7.jpg";
		String formatName = "jpg";
		
		boolean result = ImageConverter7.convertFormat(inputImage, oututImage, formatName);
		if (result) {
			System.out.println("Image converted successfully.");
		} else {
			System.out.println("Could not convert image.");
		}
	}
}