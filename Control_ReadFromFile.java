//从Entity_Trainer文件中读取所有教练的信息，并且存入以Entity_Trainer类为变量的数组列表中
    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Control_ReadFromFile {

    //String fileName = "trainer.txt";
    //教练的数组列表,将会在select trainer 中用到
    private ArrayList<Entity_Trainer> trainerList = new ArrayList<Entity_Trainer>();//包含所有教练信息
    private Entity_Trainer trainer; 

    //构造器，从GUI传入文件名
    public Control_ReadFromFile(String fileName){
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;

           //读取所有的教练数据
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                //0是每一组教练信息的开头
                if(tempString.equals("0")){
                    trainer = new Entity_Trainer();//每次都创建一个新的实例类
                    trainer.setTrainerName(reader.readLine());      //教练名字
                    trainer.setAimType1(reader.readLine());          //类型1 Lose weight
                    trainer.setAimType2(reader.readLine());          //类型2 Shape and Fitness/null/""
                    trainer.setTrainerLicense(reader.readLine());   //教练执照
                    trainer.setTrainerIntro(reader.readLine());     //教练介绍
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

    ArrayList<Entity_Trainer> getTrainerList() {
        return trainerList;
    }

}
