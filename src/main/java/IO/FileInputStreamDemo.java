package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by fouli on 4/1/2017.
 */
public class FileInputStreamDemo {

    private void writeToFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("myfile.text");

        FileOutputStream fileOutputStream = new FileOutputStream("myfile.txt");
        fileOutputStream.write("Hello George".getBytes(Charset.forName("UTF-8")));
    }
    private void readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("myfile.txt");
        int i;
        while((i = fileInputStream.read()) !=-1) {
            //System.out.print(i  + " ");
            System.out.print((char) i);
        }
        fileInputStream.close();
    }
    public static void main(String[] args) throws IOException {
       FileInputStreamDemo fileinputStreamDemo = new FileInputStreamDemo();
        fileinputStreamDemo.writeToFile();
    }
}
