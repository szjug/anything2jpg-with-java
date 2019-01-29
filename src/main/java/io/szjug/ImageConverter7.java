package io.szjug;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import javax.imageio.ImageIO;

// https://github.com/szjug/anything2jpg-with-java
public class ImageConverter7 {
    protected static Logger logger = LoggerFactory.getLogger(ImageConverter7.class);
 
    /**
     * Converts an image to another format.
     * Uses Java 7 try-with-resources to handle IOException.
     *
     * @param inputImagePath Path of the source image
     * @param outputImagePath Path of the destination image
     * @param formatName the format to be converted to, one of: jpeg, png, bmp, wbmp, gif
     * 			and if corresponding ImageIO modules are installed, then tiff and many more others
     * @return true if successful, false otherwise (IOException has happened)
     * @throws FileNotFoundException if inputImagePath or outputImagePath cannot be located
     */
    public static boolean convertFormat(String inputImagePath, String outputImagePath, String formatName)
            throws FileNotFoundException
    //IOException is handled
    {
        BufferedImage inputImage = null;
        try ( FileInputStream inputStream = new FileInputStream(inputImagePath) ) {
            // reads input image from file
            inputImage = ImageIO.read(inputStream);
        } catch (IOException e1) {
            logger.error("IOException {}", e1);
            return false;
        }
        try ( FileOutputStream outputStream = new FileOutputStream(outputImagePath) ) {
            // writes to the output image in specified format
            return ImageIO.write(inputImage, formatName, outputStream);
        } catch (IOException e2) {
            logger.error("IOException {}", e2);
            return false;
        }

    }
}