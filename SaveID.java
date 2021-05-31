import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *	Title		:	SaveID.java
 *	Description	:	This class is used to save the ID of the user sign in currently.
 *	@author		:	Yuheng Li
 *	@since  	:	13/4/2021
 **/
public class SaveID {
/**
 *write in the ID.
 *@param cbuf the ID of the log in user.
 **/
	public void write2file(String cbuf) {
		File file = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		
		try {
			file = new File("./file/ID.txt"); 
			
			os = new FileOutputStream(file, false);
			
			osw = new OutputStreamWriter(os);
			
			bw = new BufferedWriter(osw);
			
			bw.write(cbuf);
		} catch (FileNotFoundException e) {
			System.out.println("Can't find the file");
		} catch (IOException e) {
			System.out.println("Can't open the file");
		} finally {
				try {
					
					bw.close();
					osw.close();
					os.close();
					} catch (IOException e) {
						System.out.println("Can't open the file");
					}
			}	
	}
}