package programElement;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class Snap10 {

	public static void main(String[] args) {
		Process process = null;
		try {
			process = Runtime.getRuntime().exec("cmd.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedReader inputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

		BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
		String command = "start microsoft.windows.camera:";
	}
}
