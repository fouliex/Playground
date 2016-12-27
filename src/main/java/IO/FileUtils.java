package IO;

import java.io.File;
import java.io.IOException;

/**
 * Created by fouli on 12/26/2016.
 */

public class FileUtils {
    private File file;

    /**
     *  If file gets created it will return true and if the file is already present it would return false.
     * @param fileName
     *
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




}
