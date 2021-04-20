import java.util.ArrayList;

public class SelectTrainer {
    
    static ArrayList<Trainer> select(String aimType){
        ArrayList<Trainer> arraylist = new ArrayList<Trainer>();
        for(Trainer i:ReadFromFile.trainerList) {
            if(i.getAimType1() == aimType || i.getAimType2() == aimType)
                arraylist.add(i);
        } 
        return arraylist;
    }
}