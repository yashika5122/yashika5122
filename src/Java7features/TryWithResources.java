package Java7features;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {
    /* Before Java 7 all the connections needs to close explicitly like BufferFileReader or InputFileStream etc
     * But In java 7 no need to close the connection explicitly java will handle this*/

    //    Before 7
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("testing.txt");
            int c = fileInputStream.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        In java 7
        try(FileInputStream inputStream = new FileInputStream("testing.txt")){
            int c = inputStream.read();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
