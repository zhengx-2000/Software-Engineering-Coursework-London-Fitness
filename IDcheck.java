import java.io.BufferedReader;
import java.io.*;


public class IDcheck {
	String ID;
	String PassWord;
	String id;
	String ps;
	int a=0;
	public IDcheck(String I,String P){
		this.ID=I;
		this.PassWord=P;
	}
	
	public int Check(){
		try{
			BufferedReader reader = new BufferedReader(new FileReader("./file/SignUpLog.txt"));
			String line = reader.readLine();
			while (line != null) {
				String[] dataParts = line.split(" "); // since your delimiter is "|"
				id=dataParts[0];
				ps=dataParts[2];

				// read next line
				line = reader.readLine();
				if(id.equals(ID)&&ps.equals(PassWord)) {
					a+=1;
					return a;
				}
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		return 0;
		
	}
}








	// Add getters and setters below
	

// public class IDcheck{
// 	String ID;
// 	String PassWord;
// 	public IDcheck(String I,String P){
// 		this.ID=I;
// 		this.PassWord=P;
// 	}
// 	public int Check()throws Exception{
// 		int a=0;
// 		java.io.File file =new java.io.File("SignUpLog.txt");
// 		Scanner input=new Scanner(file);
// 		while(input.hasNextLine()){
// 			String id=input.next();
// 			int sex=input.nextInt();
// 			String password=input.next();		
// 			if(id.equals(ID)&&password.equals(PassWord)) {
// 				a+=1;
// 				input.close();
// 				return a;
// 			}
// 		}
// 		input.close();
// 		return a;
// 	} 
//}

