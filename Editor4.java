import java.awt.Color;

/**
 * Demonstrates the morphing operation featured by Runigram.java. 
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of a source image and the number of morphing steps (an int). 
 * the program morphs the source image into its grescaled version.
 */
public class Editor4 {
    public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
        Color[][] greyImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(greyImage);
		Runigram.morph(sourceImage, greyImage, n);
	}
}

