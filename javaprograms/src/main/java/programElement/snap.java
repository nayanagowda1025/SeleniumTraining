package programElement;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

public class snap {
	public static void main(String[] args) {
		Webcam webcam = Webcam. getDefault(); webcam.open();
		if (webcam != null) {
		 
		BufferedImage image = webcam.getImage();
		try {
			
			ImageIO.write(image, "JPG", new File("C:\\Users\\User\\Downloads\\selfie1.jpg"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	

}
}
