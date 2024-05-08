import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PicnicAnalyzer {

    public static int countWords(String fileName) {
        int count = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
        return count;
    }
}
