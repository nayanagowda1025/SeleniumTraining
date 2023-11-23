package programElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnapshotCommand {
	public static void main(String[] args) throws AWTException, InterruptedException {
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
		Thread.sleep(2000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
