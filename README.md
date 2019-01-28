
Please raise issue if you know better or alternative ways to convert and process images using Java

# Convert jpeg, png, bmp, wbmp, and gif into jpg using Java (only )

`io.szjug.ImageConverter7` is enhancement over examples listed below.  
It uses only JDK ([jpeg, png, bmp, wbmp, and gif](https://docs.oracle.com/javase/8/docs/api/javax/imageio/package-summary.html)),  
[`tif` is supported since Java 9](https://docs.oracle.com/javase/9/docs/api/javax/imageio/package-summary.html)




png to jpg conversion is to be relatively easy
http://www.mkyong.com/java/convert-png-to-jpeg-image-file-in-java/

https://www.roseindia.net/java/example/java/swing/ConvertImageToFormats.shtml

https://www.codejava.net/java-se/graphics/convert-image-formats

Some theory:
- https://en.wikipedia.org/wiki/JPEG  
Magic number	`ff d8 ff`  
- https://en.wikipedia.org/wiki/Portable_Network_Graphics  
Magic number	`89 50 4e 47 0d 0a 1a 0a`  
- https://en.wikipedia.org/wiki/TIFF  
