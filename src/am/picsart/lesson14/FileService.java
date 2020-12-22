package am.picsart.lesson14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileService {
    public static List<String> read(String path){
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("File dose not exist");
        }
    }
}
