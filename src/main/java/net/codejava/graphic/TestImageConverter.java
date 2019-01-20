package net.codejava.graphic;
 
import java.io.IOException;
 
public class TestImageConverter {
 
    public static void main(String[] args) {
        String inputImage = "javanullpointer2.jpg";
        String oututImage = "javanullpointer2.png";
        String formatName = "PNG";
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