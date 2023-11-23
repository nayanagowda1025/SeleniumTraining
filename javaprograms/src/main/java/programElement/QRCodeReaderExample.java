package programElement;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;

	public class QRCodeReaderExample {
	    public static void main(String[] args) throws ChecksumException, FormatException {
	        try {
	            // Load the QR code image
	            BufferedImage image = ImageIO.read(new File("C:\\Users\\User\\Downloads\\qrcode.png"));

	            // Create a BinaryBitmap from the image
	            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));

	            // Initialize the QRCodeReader
	            QRCodeReader reader = new QRCodeReader();

	            // Read the QR code
	            Result result = reader.decode(binaryBitmap);

	            // Print the text from the QR code
	            System.out.println("QR Code Text: " + result.getText());
	        } catch (IOException | NotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}


