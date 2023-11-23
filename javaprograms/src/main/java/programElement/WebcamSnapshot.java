package programElement;

	import org.opencv.core.Core;
	import org.opencv.core.Mat;
	import org.opencv.videoio.VideoCapture;
	import org.opencv.imgcodecs.Imgcodecs;

	public class WebcamSnapshot {
	    public static void main(String[] args) {
	        // Load the OpenCV native library
	       System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

	        // Create a VideoCapture object to access the webcam (0 represents the default webcam)
	        VideoCapture capture = new VideoCapture(0);

	        // Check if the webcam is opened successfully
	        if (!capture.isOpened()) {
	            System.out.println("Error: Could not open webcam.");
	            return;
	        }

	        // Create a Mat object to store the captured frame
	        Mat frame = new Mat();

	        // Capture a frame from the webcam
	        if (capture.read(frame)) {
	            // Define the file path where you want to save the snapshot
	            String outputPath = "C:\\Users\\User\\Downloads\\selfie.jpg";

	            // Save the captured frame as an image
	            Imgcodecs.imwrite(outputPath, frame);

	            System.out.println("Snapshot saved to " + outputPath);
	        } else {
	            System.out.println("Error: Could not capture a frame from the webcam.");
	        }

	        // Release the VideoCapture object and close the webcam
	        capture.release();
	    }
	}

