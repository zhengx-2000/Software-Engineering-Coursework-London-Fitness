import java.io.*;

/**
 * the method of get the membership type of the current login user
 * @author Jingyuan Tang
 * @version 3.2
 * @since 5/23/2021
 */

public class membershipState {
    
     /**
     * Acquire the membership statement and pass to the membership GUI.
     * @return the type of VIP the user is
     **/
    public String state(){
        String userID = new GetID().getID();
        String id;
        int currentS = 0;
        String type = "";
        try{
            BufferedReader reader = new BufferedReader(new FileReader("./file/SignUpLog.txt"));
            String line = reader.readLine();
		    while (line != null) {
			    String[] dataParts = line.split(" "); // since your delimiter is " "
			    id = dataParts[0];
			        if(id.equals(userID)) {
                        currentS = Integer.parseInt(dataParts[5]);
                        line = reader.readLine();
				        }
                    else{
			            line = reader.readLine();
                        }
			        }
                    reader.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        switch (currentS){
            case 0:
            type ="non-member";
            break;
            case 2:
            type = "monthly";
            break;
            case 3:
            type ="quarterly";
            break;
            case 4:
            type = "yearly";
            break;
        }
            return type;
        }
         
}