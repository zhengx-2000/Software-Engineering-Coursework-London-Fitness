import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class IDcheck{
	String ID;
	String PassWord;
	public IDcheck(String I,String P){
		this.ID=I;
		this.PassWord=P;
	}
	public int Check()throws Exception{
		int a=0;
		java.io.File file =new java.io.File("SignUpLog.txt");
		Scanner input=new Scanner(file);
		while(input.hasNextLine()){
			String id=input.next();
			String password=input.next();		
			if(id.equals(ID)&&password.equals(PassWord)) {
				a+=1;
				input.close();
				return a;
			}
		}
		input.close();
		return a;
	} 
}