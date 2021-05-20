import java.io.*;

/**
 * A control class which could read the ID from ID.txt
 * @author Xiao Zheng
 * @version 1.0
 * @since 5/7/2021
 */
public class GetID {
    /**
     * A simple method to get ID.
     * @return The ID stored in ID.txt
     */
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
