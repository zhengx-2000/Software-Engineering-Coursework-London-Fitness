
import java.util.ArrayList;

/**
 * Title : Control_SelectTrainer.java 
 * Description: This class is an control class which is used to select the trainers who are wanted by user.
 * 
 * @author : Mengqi Chen
 * @author : Xiao Zheng
 * @since  : 25/5/2021
 */
public class Control_SelectTrainer {
    
    /* An array to store the selected trainers' information. */
    private ArrayList<Entity_Trainer> trainerSelectList = new ArrayList<Entity_Trainer>();

    /**
	 * The constructor is to select the trainers who are wanted by user
     * @param selectItem is the Range of user selection
     * @param trainerList is a arrayList which stores all the information of trainers.
	 */
    public Control_SelectTrainer(String selectItem, ArrayList<Entity_Trainer> trainerList) {
        for(Entity_Trainer i : trainerList) {
            if(i.getAimType1().equals(selectItem)||i.getAimType2().equals(selectItem)) {
                trainerSelectList.add(i);
            }
        }
    }

    /**
	 * Get a arrayList which has class Entity_Trainer as elements and stores the information of trainers who are wanted by user.
	 * @return trainerSelectList
	 */
    ArrayList<Entity_Trainer> getTrainerSelectList() {
        return trainerSelectList;
    }
}
