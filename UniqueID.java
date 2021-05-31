import java.io.BufferedReader;
import java.io.*;
/**
 *	Title		:	UniqueID.java
 *	Description	:	This class is used to check whether the sign up ID is unique.
 *	@author		:	Yuheng Li
 *	@since		:	13/4/2021
 **/
public class UniqueID {

	String ID;
	String id;
	int a=0;

	/**
	 * A setter method for ID
	 * @param I ID input
	 */
	public UniqueID(String I){
		this.ID=I;
	}
	/**
	 * check the ID.
	 * @return whether the id is unique
	 **/
	public int Check(){
		try{
			BufferedReader reader = new BufferedReader(new FileReader("./file/SignUpLog.txt"));
			String line = reader.readLine();
			while (line != null) {
				String[] dataParts = line.split(" "); /*since your delimiter is "|"*/
				id=dataParts[0];
				line = reader.readLine();
				if(id.equals(ID)) {
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
