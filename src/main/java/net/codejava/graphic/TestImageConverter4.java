package net.codejava.graphic;
 
import java.io.IOException;
 
public class TestImageConverter4 {
 
    public static void main(String[] args) {
        String inputImage = "javanullpointer.png";
        String oututImage = "javanullpointer4.jpg";
        String formatName = "JPG";
        try {
            boolean result = ImageConverter.convertFormat(inputImage,
                    oututImage, formatName);
            if (result) {
                System.out.println("Image converted successfully.");
            } else {
                System.out.println("Could not convert image.");
            }
        } catch (IOException ex) {
            System.out.println("Error during converting image.");
            ex.printStackTrace();
        }
    }
}