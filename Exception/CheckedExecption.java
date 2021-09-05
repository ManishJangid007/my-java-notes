package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader file = new FileReader("D:\Projects\Java Projects\Notes\src\Exception\a.text");
        BufferedReader fileInput = new BufferedReader(file)

        // print first 3 lines of file a.text
        for(int counter = 0; counter < 3; counter++) {
            System.out.println(fileInput.readLine());
        }
        fileInput.close();
        // throw new MyException();
    }
}