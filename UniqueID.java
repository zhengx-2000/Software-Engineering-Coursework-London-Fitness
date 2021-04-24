import java.io.BufferedReader;
import java.io.*;
public class UniqueID {

	String ID;
	String id;
	int a=0;
	public UniqueID(String I){
		this.ID=I;
	}
	
	public int Check(){
		try{
			BufferedReader reader = new BufferedReader(new FileReader("SignUpLog.txt"));
			String line = reader.readLine();
			while (line != null) {
				String[] dataParts = line.split(" "); // since your delimiter is "|"
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
