import java.io.*;

public class membershipMatch {
	String id;
    public void match (int membershipType, String userID){
        try{
            //String oldLines = reader.readLine();
            switch(membershipType){
                case 1:{
                    PrintWriter pw1=null;
                    BufferedReader reader = new BufferedReader(new FileReader("./file/SignUpLog.txt"));
                    String line = reader.readLine();
                    System.out.println("id: "+userID+" ,type: "+membershipType);
                    pw1 = new PrintWriter(new FileWriter("./file/SignUpLog.txt"),true);
		                while (line != null) {
			                String[] dataParts = line.split(" "); // since your delimiter is " "
			                id = dataParts[0];
			                if(id.equals(userID)) {
                                StringBuffer bufNewLine = new StringBuffer(line);
                                bufNewLine.delete(line.length()-1,line.length());
                                bufNewLine.append("1");
                                pw1.println(bufNewLine);
                                pw1.flush();
                                line = reader.readLine();
                                System.out.println("id: "+userID+" ,new type: "+dataParts[5]+" ,buf: "+bufNewLine);
				            }
                            else{
                                pw1.println(line);
                                pw1.flush();
			                    line = reader.readLine();
                                }
			                }
                        reader.close();
                        pw1.close();
                        break;
                    }
                case 2:{
                    PrintWriter pw2=null;
                    BufferedReader reader = new BufferedReader(new FileReader("./file/SignUpLog.txt"));
                    String line = reader.readLine();
                    System.out.println("id: "+userID+" ,type: "+membershipType);
                    pw2 = new PrintWriter(new FileWriter("./file/SignUpLog.txt"),true);
		                while (line != null) {
			                String[] dataParts = line.split(" "); // since your delimiter is " "
			                id = dataParts[0];
			                if(id.equals(userID)) {
                                StringBuffer bufNewLine = new StringBuffer(line);
                                bufNewLine.delete(line.length()-1,line.length());
                                bufNewLine.append("2");
                                pw2.println(bufNewLine);
                                pw2.flush();
                                line = reader.readLine();
                                System.out.println("id: "+userID+" ,new type: "+dataParts[5]+" ,buf: "+bufNewLine);
				            }
                            else{
                                pw2.println(line);
                                pw2.flush();
			                    line = reader.readLine();
                                }

			                }
                        reader.close();
                        pw2.close();
                        break;
                    }
                    case 3:{
                        PrintWriter pw3=null;
                        BufferedReader reader = new BufferedReader(new FileReader("./file/SignUpLog.txt"));
                        String line = reader.readLine();
                        System.out.println("id: "+userID+" ,type: "+membershipType);
                        pw3 = new PrintWriter(new FileWriter("./file/SignUpLog.txt"),true);
		                    while (line != null) {
			                    String[] dataParts = line.split(" "); // since your delimiter is " "
			                    id = dataParts[0];
			                    if(id.equals(userID)) {
                                    StringBuffer bufNewLine = new StringBuffer(line);
                                    bufNewLine.delete(line.length()-1,line.length());
                                    bufNewLine.append("3");
                                    pw3.println(bufNewLine);
                                    pw3.flush();
                                    line = reader.readLine();
                                    System.out.println("id: "+userID+" ,new type: "+dataParts[5]+" ,buf: "+bufNewLine);
				            }
                                else{
                                    pw3.println(line);
                                    pw3.flush();
			                        line = reader.readLine();
                                }

			                }
                            reader.close();
                            pw3.close();
                        break;
                    }
                    case 4:{
                        PrintWriter pw4=null;
                        BufferedReader reader = new BufferedReader(new FileReader("./file/SignUpLog.txt"));
                        String line = reader.readLine();
                        System.out.println("id: "+userID+" ,type: "+membershipType);
                        pw4 = new PrintWriter(new FileWriter("./file/SignUpLog.txt"),true);
		                    while (line != null) {
			                    String[] dataParts = line.split(" "); // since your delimiter is " "
			                    id = dataParts[0];
			                    if(id.equals(userID)) {
                                    StringBuffer bufNewLine = new StringBuffer(line);
                                    bufNewLine.delete(line.length()-1,line.length());
                                    bufNewLine.append("4");
                                    pw4.println(bufNewLine);
                                    pw4.flush();
                                    line = reader.readLine();
                                    System.out.println("id: "+userID+" ,new type: "+dataParts[5]+" ,buf: "+bufNewLine);
				                }
                                else{
                                    pw4.println(line);
                                    pw4.flush();
			                        line = reader.readLine();
                                    }
			                    }
                            reader.close();
                            pw4.close();
                            break;
                    }
                }
                
        }catch (IOException e) {
			e.printStackTrace();
		}
        
    }  
}