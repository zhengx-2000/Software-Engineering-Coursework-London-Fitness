/**
 *	Title		:	IDcheck.java
 *	Description	:	This class is used to check whether the ID matches the Password .
 *	@author		:	Yuheng Li
 *	@date		:	13/4/2021
 **/
import java.io.BufferedReader;
import java.io.*;


public class IDcheck {
	String ID;
	String PassWord;
	String id;
	String ps;
	int a=0;
	public IDcheck(String I,String P){
		this.ID=I;
		this.PassWord=P;
	}
	
/**
 * The method to check.
 * @param no. 
 * @return the int to index whether the ID matches the password.
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


