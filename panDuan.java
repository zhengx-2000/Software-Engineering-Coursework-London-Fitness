
import java.io.*;
import java.util.*;
import java.lang.*;

public class panDuan {

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
						
						System.out.print(VIP);

						if (VIP.equals("0")) {
							System.out.print("这里1");
							reader1.close();
							reader.close();
							new digitalWorkOutVideosPage_0();
						}else{
							System.out.print("这里2");
							reader1.close();
							reader.close();
							new digitalWorkOutVideosPage();
		
						}
		
					}
		
				}
				reader1.close();
				reader.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		
		}
		
	

}