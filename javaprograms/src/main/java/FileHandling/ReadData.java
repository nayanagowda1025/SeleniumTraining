package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) {
		FileReader fr=null;
		try {
			 fr=new FileReader("c:/users/user/downloads/fileText.txt");
		    int ch=	fr.read();
		    while(ch!=-1) {
		    System.out.print((char)ch);
		    ch=fr.read();
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
