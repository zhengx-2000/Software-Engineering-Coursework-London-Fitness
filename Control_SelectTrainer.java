import java.util.ArrayList;

public class Control_SelectTrainer {

    private ArrayList<Entity_Trainer> trainerSelectList = new ArrayList<Entity_Trainer>();//包含被删选后的教练信息
    
    //构造器，从GUI传入类型名字
    public Control_SelectTrainer(String selectItem, ArrayList<Entity_Trainer> trainerList) {
        for(Entity_Trainer i : trainerList) {
            if(i.getAimType1().equals(selectItem)||i.getAimType2().equals(selectItem)) {
                trainerSelectList.add(i);
            }
        }
    }

    ArrayList<Entity_Trainer> getTrainerSelectList() {
        return trainerSelectList;
    }
}
