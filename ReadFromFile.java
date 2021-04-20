//从Trainer文件中读取所有教练的信息，并且存入以Trainer类为变量的数组列表中

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
import java.util.ArrayList;

public class ReadFromFile {

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    String fileName = "trainer.txt";
    //教练的数组列表,将会在select trainer 中用到
    static ArrayList<Trainer> trainerList = new ArrayList<Trainer>();
    static Trainer trainer = new Trainer();

    public static void readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;

           //读取所有的教练数据
            while ((tempString = reader.readLine()) != null) { // 一次读入一行，直到读入null为文件结束
                //0是每一组教练信息的开头
                if(tempString.equals("0")){
                    trainer.setTrainerName(reader.readLine());      //教练名字
                    trainer.setAimType1(reader.readLine());          //类型1 Lose weight
                    trainer.setAimType2(reader.readLine());          //类型2 Shape and Fitness/null/""
                    trainer.setTrainerLicense(reader.readLine());   //教练执照
                    trainer.setTrainerIntro(reader.readLine());     //教练介绍
                    trainerList.add(trainer);
                }
            
            
                
                /* 
                public class SelectTrainer(){
                    ArrayList<Trainer> select(String type){
                        new ArrayList<Trainer> arraylist;
                        for(Trainer i:trainerList) {
                            if(i.intro1==type || i.intro2==type)
                                arraylist.add(i);
                        } 
                        return arraylist;
                    }
                }

                use:
                ArrayList<Trainer> selectedTrainer = SelectTrainer.select(foot);
                //println method
                
                */
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                line++;
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

    public static void main(String[] args) {
        String fileName = "trainer.txt";
        ReadFromFile.readFileByLines(fileName);
    }
}