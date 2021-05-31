import java.io.BufferedReader;
import java.io.*;

/**
 *	Title		:	IDcheck.java
 *	Description	:	This class is used to check whether the ID matches the Password .
 *	@author		:	Yuheng Li
 *	@since		:	13/4/2021
 **/
public class IDcheck {
	String ID;
	String PassWord;
	String id;
	String ps;
	int a=0;

	/**
	 * A setter method.
	 * @param I ID
	 * @param P Password
	 */
	public IDcheck(String I,String P){
		this.ID=I;
		this.PassWord=P;
	}
	
/**
 *The method to check.
 *@return the int to index whether the ID matches the password.
 **/
	public int Check(){
		try{
			BufferedReader reader = new BufferedReader(new FileReader("./file/SignUpLog.txt"));
			String line = reader.readLine();
			while (line != null) {
				String[] dataParts = line.split(" "); /* since your delimiter is "|" */
				id=dataParts[0];
				ps=dataParts[2];

				/* read next line*/
				line = reader.readLine();
				if(id.equals(ID)&&ps.equals(PassWord)) {
					a+=1;
					return a;
				}
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		return 0;
		
	}
}


