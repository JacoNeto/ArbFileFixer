import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler {
	// Method to read content from a file
    public static String readFile(String filePath) throws IOException {
    	System.out.println(filePath);
        Path path = Paths.get(filePath);
        System.out.println(path.toString());
        List<String> lines = Files.readAllLines(path);
        StringBuilder content = new StringBuilder();

        for (String line : lines) {
            content.append(line).append("\n");
        }

        return content.toString();
    }

    // Method to write content to a file
    public static void writeFile(String filePath, String content) throws IOException {
        Path path = Paths.get(filePath);
        Files.write(path, content.getBytes());
    }
    
    static void getAllFiles(File curDir) {

        File[] filesList = curDir.listFiles();
        for(File f : filesList){
            if(f.isDirectory())
                getAllFiles(f);
            if(f.isFile()){
                System.out.println(f.getName());
            }
        }

    }
}
