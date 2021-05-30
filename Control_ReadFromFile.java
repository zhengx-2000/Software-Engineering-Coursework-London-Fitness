
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Title 		: Control_ReadFromFile.java
 * Description	: This class is an control class which is used to read information from the file trainer.txt.
 * @author		: Mengqi Chen
 * @date      	: 25/5/2021
 */

public class Control_ReadFromFile {

    /* The classes associated with the trainers' information. */
    private ArrayList<Entity_Trainer> trainerList = new ArrayList<Entity_Trainer>();
    private Entity_Trainer trainer; 

    /*
	 * The constructor is to read file and store information to entity class Entity_Trainer 
     * and array list ArrayList<Entity_Trainer>
	 */
    public Control_ReadFromFile(String fileName){
        /* Read all trainers' information in the file which is passed by the constructor*/
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            
            /* Read in one line at a time until reaching the end of the file*/
            while ((tempString = reader.readLine()) != null) {
                
                /* 0 is the beginning of each group of coaching information*/            
                if(tempString.equals("0")){
                    trainer = new Entity_Trainer();
                    trainer.setTrainerName(reader.readLine());
                    trainer.setAimType1(reader.readLine());
                    trainer.setAimType2(reader.readLine());
                    trainer.setTrainerLicense(reader.readLine());
                    trainer.setTrainerIntro(reader.readLine());
                    trainerList.add(trainer);
                } 
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }          
    }

    /**
	 * Get a arrayList which has class Entity_Trainer as elements and stores all the information of trainers.
	 * @return trainerList
	 */
    ArrayList<Entity_Trainer> getTrainerList() {
        return trainerList;
    }

}
