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
		/*String content[]= {"aaa","bbb","ccc"};        //定义字符串数组
		File file=new File("word.txt");               //创建文件对象
		 
		FileWriter fw = new FileWriter(file,true);    //创建FileWriter类对象
        BufferedWriter bufw=new BufferedWriter(fw);   //创建BufferedWriter对象
 
        for(int i=0;i<content.length;i++) {           //循环遍历数组

        	bufw.write(content[i]);                   //将字符串数组中的元素写入到文件中
            bufw.newLine();                           //换行
        }
        bufw.close();                                 //关闭BufferedWriter流
        fw.close();  
        */   
