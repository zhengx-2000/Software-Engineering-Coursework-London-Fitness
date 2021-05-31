import java.io.*;
import java.util.ArrayList;
import java.io.IOException;

/**
 * A control class for altering the Physical States
 * @author Taowu Zhang
 * @version 5.0
 * @since 5/25/2021
 */

public class alterPhysicalStates{
/**
 * this method write physical states information into txt
 * @param physicalStatesList the physical states of the user
 */
    public alterPhysicalStates(ArrayList<String> physicalStatesList){
        try {
            BufferedWriter bufwriter=new BufferedWriter(new FileWriter(new File("file/PhysicalStates.txt"),false));  
            for(int i=0;i<physicalStatesList.size();i++) {
                String line = physicalStatesList.get(i);
                bufwriter.write(line);
                bufwriter.write(" ");
                bufwriter.flush();
            }
            bufwriter.newLine();
            bufwriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

}



