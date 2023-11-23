package programElement;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

public class Merge {
	public static void main(String[] args) {
		
	
	try {

		Process process = Runtime.getRuntime().exec("cmd.exe");

		BufferedReader inputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

		BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
		String command = "start microsoft.windows.camera:";
		process.getOutputStream().write((command + "\n").getBytes());
		process.getOutputStream().flush();

		String line;
		while ((line = inputReader.readLine()) != null) {
			System.out.println(line);
		}

		while ((line = errorReader.readLine()) != null) {
			System.err.println(line);
		}
		

		//int exitCode = process.waitFor();
		//System.out.println("Command Prompt exited with code " + exitCode);
	} catch (IOException e) {
		e.printStackTrace();
	}
	Webcam webcam = Webcam. getDefault(); webcam.open();
	BufferedImage image = webcam.getImage();
	try {
		
		ImageIO.write(image, "JPG", new File("C:\\Users\\User\\Downloads\\selfie1.jpg"));
	} catch (IOException e) {
	
		e.printStackTrace();
	}
}

}

