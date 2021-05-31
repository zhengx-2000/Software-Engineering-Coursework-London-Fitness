
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * A control class to identify whether the user is an VIP or not.
 * @author Yijue Zhang
 * @version 5.0
 */
public class panDuan {

	/**
	 * Constructor
	 */
		public panDuan(){

			String ID = new GetID().getID();
			String VIP;
			String id;

			try{
				Reader reader1 = new FileReader("./file/SignUpLog.txt");
				BufferedReader reader = new BufferedReader(reader1);
				String line;
		
				while((line = reader.readLine())!=null)
				{
					String[] dataParts = line.split(" "); // since your delimiter is " "
		
					id = dataParts[0];
		
					if (id.equals(ID)) {
						VIP = dataParts[5];
						
						//System.out.print(VIP);

						if (VIP.equals("0")) {
							//System.out.print("这里1");
							reader.close();
							reader1.close();
							new digitalWorkOutVideosPage_0();
							break;
						}else{
							//System.out.print("这里2");
							reader.close();
							reader1.close();
							new digitalWorkOutVideosPage();
							break;
						}
		
					}
		
				}
				//reader.close();
				//reader1.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		
		}

	/**
	 * A simple test main method.
	 * @param args nothing
	 */
	public static void main(String[] args) {
		new panDuan();
	}
	

}