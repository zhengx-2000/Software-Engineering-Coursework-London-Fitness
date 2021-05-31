import java.io.File;
import java.io.RandomAccessFile;

/**
 * A Count txt line control class
 * @author Taowu Zhang
 * @version 5.0
 * @since 5/25/2021
 */ 

public class CountLine {
    /**
     * this method read txt lines
     * @param path the path of the file
     * @return the number of lines in the file
     */
    public static long readLine(String path) {
        long index = 0;
        try {
            RandomAccessFile file = new RandomAccessFile(new File(path), "r");
            while (null != file.readLine()) {
                index++;
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return index;
    }
}
