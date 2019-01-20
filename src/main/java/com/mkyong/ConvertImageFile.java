package com.mkyong;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ConvertImageFile {

   public static void main(String[] args) {

	BufferedImage bufferedImage;
		
	try {
			
	  //read image file
	  bufferedImage = ImageIO.read(new File("javanullpointer.png"));

	  // create a blank, RGB, same width and height, and a white background
	  BufferedImage newBufferedImage = new BufferedImage(bufferedImage.getWidth(),
			bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
	  newBufferedImage.createGraphics().drawImage(bufferedImage, 0, 0, Color.WHITE, null);

	  // write to jpeg file
	  ImageIO.write(newBufferedImage, "jpg", new File("javanullpointer.jpg"));

	  System.out.println("Done");
			
	} catch (IOException e) {

	  e.printStackTrace();

	}

   }

}
