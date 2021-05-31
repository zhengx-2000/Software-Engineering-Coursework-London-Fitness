
import java.io.*;
import java.util.ArrayList;

/**
 * Title 		: Control_WriteIntoFile.java
 * Description	: This class is an control class which is used to write users's appointment information into the file appointment.txt.
 * @author		: Mengqi Chen
 * @since     	: 25/5/2021
 */
public class Control_WriteIntoFile {

    /* Specifies the file name. */
    String fileName = "./file/appointment.txt";

    /**
	 * The constructor is to write users's appointment information into the file appointment.txt. 
     * The users's appointment information is stored in the appointmentList which is the passed parameter
     * @param appointmentList the list needed to be written
	 */
    public Control_WriteIntoFile (ArrayList<String> appointmentList){
        try {
            File file=new File(fileName);
            BufferedWriter bufw=new BufferedWriter(new FileWriter(file,true));
            for(int i=0;i<appointmentList.size();i++) {
                String line = appointmentList.get(i);
                bufw.write(line);
                bufw.write(" ");
                bufw.flush();
            }
            bufw.newLine();
            bufw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
