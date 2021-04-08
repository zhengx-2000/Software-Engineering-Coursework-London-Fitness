import java.io.*;
import java.util.*;
import java.lang.*;

public class membershipMatch {

	String id;

    public void match (int membershipType, String userID){
        try{

            //String oldLines = reader.readLine();
            
            switch(membershipType){
                case 2:{
                    PrintWriter pw=null;
    
                    BufferedReader reader = new BufferedReader(new FileReader("SignUpLog.txt"));
                    String line = reader.readLine();
                    String oldLines = reader.readLine();
                    //System.out.println(line);
                    System.out.println("id: "+userID+" ,type: "+membershipType);
		                while (line != null) {
			                String[] dataParts = line.split(" "); // since your delimiter is " "
			                id = dataParts[0];
			                if(id.equals(userID)) {
                                StringBuffer bufNewLine = new StringBuffer(line);
                                bufNewLine.delete(line.length()-1,line.length());
                                bufNewLine.append("2");

                                pw = new PrintWriter(new FileWriter("SignUpLog1.txt"),true);
                                pw.println(bufNewLine);
                                pw.flush();
                                pw.close();
                        
                                System.out.println("id: "+userID+" ,new type: "+dataParts[5]+" ,buf: "+bufNewLine);
				            }
                            else{
                                StringBuffer bufOldLines = new StringBuffer(oldLines);
                                    //read next line
                                PrintWriter pw2=null;
                                pw2 = new PrintWriter(new FileWriter("SignUpLog2.txt"),true);
                                pw2.println(bufOldLines);
                                pw2.flush();
                                pw2.close();
			                    line = reader.readLine();
                                oldLines = reader.readLine();
                                }

			                }
                    break;
                    }
                    case 3:{
                        System.out.println("type: "+membershipType);
                        break;
                    }
                    case 4:{
                        System.out.println("type: "+membershipType);
                        break;
                    }
                }
                
        }catch (IOException e) {
			e.printStackTrace();
		}
        
    }  
}