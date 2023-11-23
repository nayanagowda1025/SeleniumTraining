package FileHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("c:/users/user/demo.txt");
			String str="nayana";
			try {
				fos.write(str.getBytes());
				System.out.println("written");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream fis=new FileInputStream("c:/users/user/demo.txt");
			try {
				int ch=	fis.read();
				while(ch!=-1) {
			
				System.out.print((char)ch);
				ch=fis.read();
			}
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		File file= new File("c:/users/user/new");
//		System.out.println(file.mkdirs());
//		System.out.println(file.exists());
//		System.out.println(file.delete());
//		FileWriter fw=null;
//       try {
//	   fw=new FileWriter("c:/users/user/downloads/fileText.txt");
//	  fw.write("hello");
//	  fw.flush();
//	  
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//       finally
//       {
//    	   try {
//			fw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//       }
	}

}
