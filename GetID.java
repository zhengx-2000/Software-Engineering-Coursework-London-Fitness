import java.io.*;
public class GetID {
    public String getID() {
        String fileName = "./file/ID.txt";
        String contents = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            contents = bufferedReader.readLine();
            bufferedReader.close();
            fileReader.close();
        }
        catch (IOException e) {
            System.out.println("Errors occured");
            System.exit(1);
        }
        return contents;
    }
}
