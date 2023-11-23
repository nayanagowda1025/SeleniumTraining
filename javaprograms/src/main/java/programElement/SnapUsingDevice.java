package programElement;

	import java.io.IOException;

	public class SnapUsingDevice {

	    public static void main(String[] args) {
	        try {
	            String deviceName = "/dev/TYSS-Nayana-H"; // Adjust the device name based on your system (Linux)
	            int width = 640; // Adjust the width as needed
	            int height = 480; // Adjust the height as needed

	            String outputFile = "C:\\Users\\User\\Downloads\\selfie1.jpg"; // Adjust the output file format as needed

	            String captureCommand = "v4l2-ctl --set-fmt-video=width=" + width + ",height=" + height + " --set-ctrl brightness=128 --set-ctrl contrast=32 --set-ctrl saturation=32 --set-ctrl sharpness=40 --set-ctrl gain=10 --set-ctrl exposure=2";
	            String captureImageCommand = "ffmpeg -f video4linux2 -i " + deviceName + " -vframes 1 " + outputFile;

	            // Execute the capture command to set webcam parameters
	            ProcessBuilder captureProcessBuilder = new ProcessBuilder("bash", "-c", captureCommand);
	            Process captureProcess = captureProcessBuilder.start();
	            captureProcess.waitFor();

	            // Capture the image using ffmpeg
	            ProcessBuilder imageCaptureProcessBuilder = new ProcessBuilder("bash", "-c", captureImageCommand);
	            Process imageCaptureProcess = imageCaptureProcessBuilder.start();
	            imageCaptureProcess.waitFor();

	            System.out.println("Selfie captured and saved as " + outputFile);
	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

