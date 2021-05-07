import java.io.*;
import java.util.ArrayList;
import java.io.IOException;
public class Control_WriteIntoFile {

    String fileName = "appointment.txt";
    public Control_WriteIntoFile (ArrayList<String> appointmentList){
        
        try {
            File file=new File(fileName);
            BufferedWriter bufw=new BufferedWriter(new FileWriter(file,true));   //创建FileWriter类对象//创建BufferedWriter对象
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
        } /*finally {
            if (bufw != null) {
                try {
                    bufw.close();
                } catch (IOException e1) {
                }
            }
        } */

        //userId 
    }
	public static void main(String[]args) throws IOException {
	     
    }
}
