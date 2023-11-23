package programElement;

	import java.awt.AWTException;
	import java.awt.Rectangle;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;
	import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

	public class SnapshotUsingRobotClass {
	    public static void main(String[] args) {
	        try {
	            // Create a Robot instance
	            Robot robot = new Robot();

	            // Capture the entire screen
	            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	            BufferedImage screenCapture = robot.createScreenCapture(screenRect);
	            Webcam webcam = Webcam. getDefault(); webcam.open();
	            BufferedImage image = webcam.getImage();
	            // Specify the file path for the snapshot
	            String filePath = "C:\\Users\\User\\Downloads\\selfie.png";

	            // Save the captured image to a file
	            File outputFile = new File(filePath);
	            ImageIO.write(image, "png", outputFile);

	            System.out.println("Snapshot saved to " + filePath);
	        } catch (AWTException | IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

