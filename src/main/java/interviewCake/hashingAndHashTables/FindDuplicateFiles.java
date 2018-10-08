package interviewCake.hashingAndHashTables;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.io.File;

/**
 * Your friend copied a bunch of your files and put them in random places around your hard drive.
 * Write a method that return a list of all  duplicate files.Return a list of FilePaths objects
 * with vairables for the original an duplicate paths
 *
 * Created by George Fouche on 8/29/18.
 */
public class FindDuplicateFiles {

    public static class FilePaths{

        private Path duplicatePath;
        private Path originalPath;


        public FilePaths(Path duplicatePath, Path originalPath){
            this.duplicatePath = duplicatePath;
            this.originalPath = originalPath;
        }


        public Path getDubplicatePath() {
            return duplicatePath;
        }


        public Path getOriginalPath() {
            return originalPath;
        }


        @Override
        public String toString() {
            return String.format("(duplicate: %s, original: %s)", duplicatePath, originalPath);
        }
    }

    private static class FileInfo {

        long timeLastEdited;
        Path path;

        FileInfo(long timeLastEdited, Path path) {
            this.timeLastEdited = timeLastEdited;
            this.path = path;
        }
    }

    public static List<FilePaths> findDuplicateFiles(Path startingDirectory){
        Map<String, FileInfo> filesSeenAlready = new HashMap<>();
        Deque<Path> stack = new ArrayDeque<>();
        stack.push(startingDirectory);

        List<FilePaths> duplicates = new ArrayList<>();


        while (!stack.isEmpty()) {

            Path currentPath = stack.pop();
            File currentFile = currentPath.toFile();

            // if it's a directory,
            // put the contents in our stack
            if (currentFile.isDirectory()) {
                for (File file : currentFile.listFiles()) {
                    stack.push(file.toPath());
                }

                // if it's a file
            } else {

                // get its contents
                String fileContents = null;
                try {
                    byte[] encodedFile = Files.readAllBytes(currentPath);
                    fileContents = new String(encodedFile, "UTF-8");
                } catch (IOException e) {

                    // show error and skip this file
                    System.out.println(e);
                    continue;
                }

                // get its last edited time
                long currentLastEditedTime = currentFile.lastModified();

                // if we've seen it before
                if (filesSeenAlready.containsKey(fileContents)) {

                    FileInfo existingFileInfo = filesSeenAlready.get(fileContents);

                    if (currentLastEditedTime > existingFileInfo.timeLastEdited) {

                        // current file is the dupe!
                        duplicates.add(new FilePaths(currentPath, existingFileInfo.path));

                    } else {

                        // old file is the dupe!
                        duplicates.add(new FilePaths(existingFileInfo.path, currentPath));

                        // but also update filesSeenAlready to have the new file's info
                        filesSeenAlready.put(fileContents, new FileInfo(currentLastEditedTime, currentPath));
                    }

                    // if it's a new file, throw it in filesSeenAlready
                    // and record its path and last edited time,
                    // so we can tell later if it's a dupe
                } else {
                    filesSeenAlready.put(fileContents, new FileInfo(currentLastEditedTime, currentPath));
                }
            }
        }

        return duplicates;
    }



    public static void main(String[] args) {
    }

}
