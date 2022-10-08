import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        File directory = new File("Folder1/Folder2/Folder3");
        directory.mkdirs();

        File file1 = new File("Folder1/Folder2/Folder3/aFile1.txt");
        File file2 = new File("Folder1/Folder2/Folder3/aFile2.txt");
        File file3 = new File("Folder1/Folder2/Folder3/aFile3.txt");
        File file4 = new File("Folder1/Folder2/Folder3/bFile.txt");
        File file5 = new File("Folder1/Folder2/Folder3/cFile.txt");
        File file6 = new File("Folder1/Folder2/Folder3/cFile.txt");
        List<File> allFiles = new ArrayList<>();
        allFiles.add(file1);
        allFiles.add(file2);
        allFiles.add(file3);
        allFiles.add(file4);
        allFiles.add(file5);
        allFiles.add(file6);

        try {
            for (final File file : allFiles) {
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        allFiles.stream()
                .filter(file -> file.getName().startsWith("a"))
                .forEach(file -> System.out.println(file.getAbsolutePath()));

    }
}
