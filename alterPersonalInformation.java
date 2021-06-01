import java.io.*;
import java.util.ArrayList;
import java.io.IOException;

/**
 * A control class for altering the Personal Information
 * @author Taowu Zhang
 * @version 5.0
 * @since 5/25/2021
 */
public class alterPersonalInformation{
    /**
     * Basic constructor.
     * @param personalInformationList the list of the information
     */
    public alterPersonalInformation(ArrayList<String> personalInformationList){
        try {
            /* Get user's ID */
            GetID getid = new GetID();
            String identity=getid.getID();

            /* Get updated personal information */
            String newline = personalInformationList.get(0)+" "+personalInformationList.get(1)+" "+personalInformationList.get(2)+" "+personalInformationList.get(3)+" "+personalInformationList.get(4);


            BufferedReader reader =new BufferedReader(new FileReader("file/SignUpLog.txt"));
            String iden=null;
            String gen=null;
            String pw=null;
            String phone=null;
            String em=null;
            String vip=null;

            PrintWriter printwriter = null;
            StringBuffer buff = new StringBuffer();
            BufferedReader bufreader = new BufferedReader(new FileReader("file/SignUpLog.txt"));
            for(String str=bufreader.readLine();str!=null;str=bufreader.readLine()) {
                if(str.contains(identity)){
                    String[] dataParts = str.split(" ");
                    iden = dataParts[0];
                    gen = dataParts[1];
                    pw = dataParts[2];
                    phone = dataParts[3];
                    em = dataParts[4];
                    vip = dataParts[5];
                    String target =iden+" "+gen+" "+pw+" "+phone+" "+em;
                    str=str.replace(target,newline);
                }  
                buff.append(str+"\n");
            }
            //System.out.print(buff);
            //System.out.print(buff.length());
            //System.out.print(buff.delete(buff.length()-1,buff.length()));
            printwriter=new PrintWriter(new FileWriter("file/SignUpLog.txt"),true);
            printwriter.println(buff);
            printwriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

}
