import java.awt.Color;

public class ImageEditor1 {

	// METHODS REQUIRED FOR GREYSCALING
	public static double luminance(Color color) {
		// return a double that represents the luminance of color
		// this is the amount of R, G, B present(?) given by the
		// used formula

		// get the respective RGB values
		int red = color.getRed();
		int blue = color.getBlue();
		int green = color.getGreen();

		// luminance = perceived brightness
		double luminance = 0.299 * red + 0.587 * green + 0.114 * blue;
		return luminance;

	}

	public static Color toGrey(Color color) {
		// creating a new Color object whose RGB
		// values are all equal to the luminance of the input
		// color

		// need to insert (int) since otherwise with a double
		// as a parameter it would return a value of type long
		int newRGB = (int) Math.round(luminance(color));

		// since decimal number = more opaque color
		// grey colors are all given by the same amount of number for
		// RGB
		Color myNewColor = new Color(newRGB, newRGB, newRGB);
		return myNewColor;

	}

	public static Picture makeGreyscale(Picture pic) {
		for (int i = 0; i < pic.width(); i++) {
			for (int j = 0; j < pic.height(); j++) {
				// changes the color at a given pixel to the other
				// decided color
				pic.set(i, j, toGrey(pic.get(i, j)));
			}
		}
		return pic;
	}

	public static void main(String[] args) {
		Picture p = new Picture("lion1.jpg");// or use any other colour image
		Picture greyscale = makeGreyscale(p);
		greyscale.show();
	}
}
