import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
/**
 *	Title		:	SignUpLog.java
 *	Description	:	This class is used to write the log up info into a file.
 *	@author		:	Yuheng Li
 *	@since		:	13/4/2021
 **/
public class SignUpLog {
/**
 * write the info.
 * @param cbuf the user's info.
 **/
	public void write2file(String cbuf) {
		File file = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			file = new File("./file/SignUpLog.txt"); 
			
			os = new FileOutputStream(file, true);
			
			osw = new OutputStreamWriter(os);
			
			bw = new BufferedWriter(osw);
			
			bw.write(cbuf);
		} catch (FileNotFoundException e) {
			System.out.println("Don't find file");
		} catch (IOException e) {
			System.out.println("Can't open file");
		} finally {
				try {
					
					bw.close();
					osw.close();
					os.close();
					} catch (IOException e) {
						System.out.println("error");
					}
			}	
	}
}
