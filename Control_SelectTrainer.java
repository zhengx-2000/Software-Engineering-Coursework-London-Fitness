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
/*    
    ArrayList<Entity_Trainer> select(String aimType, ArrayList<Entity_Trainer> trainerList){
        ArrayList<Entity_Trainer> arraylist = new ArrayList<Entity_Trainer>();
        for(Entity_Trainer i:trainerList) {
            if(i.getAimType1() == aimType || i.getAimType2() == aimType)
                arraylist.add(i);
        } 
        return arraylist;
    }
    public static void main(String[] args) {
        ArrayList<String> trainerInfoList = new ArrayList<String>();
        ArrayList<Entity_Trainer> selectedTrainer = Control_SelectTrainer.select("Lose weight");
        for(int i=0;i<=selectedTrainer.size();i++){
            String trainerInfo = selectedTrainer.get(i).getTrainerName() + "\n"+ 
            selectedTrainer.get(i).getTrainerLicense()+ "\n"+ selectedTrainer.get(i).getTrainerIntro();						
            trainerInfoList.add(trainerInfo);
        }
        System.out.println(trainerInfoList.get(0));
        //trainerTextArea2.setText(trainerInfoList.get(1));
        //trainerTextArea3.setText("Sam\nGood body\nhave licence in looing weight\n");					
        //trainerTextArea3.setText(trainerInfoList.get(2));
    }
}*/