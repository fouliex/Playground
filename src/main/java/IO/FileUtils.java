package IO;

import java.io.*;

/**
 * Created by fouli on 12/26/2016.
 */

public class FileUtils {
    private File file;

    /**
     * If file gets created it will return true and if the file is already present it would return false.
     *
     * @param fileName
     */
    public boolean createFile(String fileName) {
        file = new File(fileName);
        boolean isCreated = false;
        try {
            isCreated = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isCreated;
    }

    /**
     * Read a file in Java using FileInputStream and BufferedInputStream.
     * 1) Created a File instance by providing the full path of the file(which we will read) during File Object creation.
     * 2) Passed the file instance  to the FileInputStream which opens a connection to the actual file, the file named by the File object file in the file system.
     * 3) Passed the File InputStream instance to BufferedInputStream which creates a BufferedinputStream and saves its argument,the input stream in, for later use. An internal buffer array is created and stored in buf which the read operation gives good performance as the content is deadily available in the buffer.
     * 4) Used while loop to read the file. The Method available() is used  to check the end of the file as it returns 0 when the pointer reaches the end of the file.
     *
     * @param fileName
     */
    public void readFileWithBufferedInputStream(String fileName) {
        BufferedInputStream bufferedInputStream = null;
        FileInputStream fileInputStream = null;
        try {

            //FileInputStream to read the file
            fileInputStream = new FileInputStream(fileName);

            /* Passed the FileInputStream to BufferedInputStream
              for fast read using the buffer array */
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            /* available() method of BufferedInputStream
            return 0 when there are no more bytes present in the file to be read
             */
            while (bufferedInputStream.available() > 0) {
                System.out.print((char) bufferedInputStream.read());
            }

        } catch (FileNotFoundException e) {
            System.out.println("The specified file not found" + e);
        } catch (IOException e) {
            System.out.println("I/O Exception: " + e);
        } finally {
            try {
                if (bufferedInputStream != null && fileInputStream != null) {
                    fileInputStream.close();
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * readLine() reads a line of text.
     * read() reads a character of text. Since it returns an ASCII valuem it needs to be explicitly cast as char for reading the file contents.
     *
     * @param fileName
     */
    public void readFileWithBufferedReader(String fileName) {
        BufferedReader bufferedReader = null;
        BufferedReader bufferedReader1 = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));

            // One way of reading the file
            System.out.println("Reading the file using readline() method:");
            String contentLine = bufferedReader.readLine();
            while (contentLine != null) {
                System.out.println(contentLine);
                contentLine = bufferedReader.readLine();
            }

            //Second way of reading a file
            bufferedReader1 = new BufferedReader(new FileReader(fileName));
            System.out.println("Reading the file using read() method:");
            int num;
            char ch;
            while ((num = bufferedReader1.read()) != -1) {
                ch = (char) num;
                System.out.print(ch);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                bufferedReader1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public void writeFileWithFileOutputStream(String filename, String content) {
        FileOutputStream fileOutputStream = null;
        File file;

        try {
            file = new File(filename);
            fileOutputStream = new FileOutputStream(file);
            /**
             * This logic will check whether the file exists or not.
             * If the file is not found at the specified location it would create a new file.
             */
            if (!file.exists()) {
                this.createFile(filename);
            }

            /*
            String content cannot be directly written into a file. It needs to be converted into bytes
           */
            byte[] bytesArray = content.getBytes();
            fileOutputStream.write(bytesArray);
            fileOutputStream.flush();
            System.out.println("File Written Successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void writeFileWithBufferedWriter(String filename, String content) {
        BufferedWriter bufferedWriter = null;
        File file;
        try {
            file = new File(filename);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            bufferedWriter.flush();
            System.out.println("File written Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void appendFileWithFileWriterAndBufferedWriter(String filename, String content) {
        File file = new File(filename);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            //Here true is to append the content to file
            FileWriter fileWriter = new FileWriter(file, true);
            //BufferedWriter  writer give better performance
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            //Closing BufferedWriter Stream
            bufferedWriter.close();
            System.out.println("Data successfully appended at the end of file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public void appendFileWithPrintWriter(String filename,String content){
    try {


        File file = new File(filename);
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.println(content);

    } catch (IOException e) {
        e.printStackTrace();
    }
}

public void deleteFile(String filename ) {
    File file = new File(filename);
    if (file.delete()) {
        System.out.println(file.getName() + " is deleted!");
    } else {
        System.out.println("Delete failed: File didn't delete");
    }
}

    public static void main(String[] args) {
        String filename = "George.txt";
        FileUtils fileUtils = new FileUtils();
        //fileUtils.createFile("George.txt");
        //fileUtils.readFileWithBufferedInputStream("George.txt");
        fileUtils.readFileWithBufferedInputStream(filename);
        fileUtils.writeFileWithBufferedWriter(filename, "Salutfds George ca vas");
        fileUtils.appendFileWithFileWriterAndBufferedWriter(filename,"\nComment ca vas");
        fileUtils.readFileWithBufferedInputStream(filename);
    }



}
