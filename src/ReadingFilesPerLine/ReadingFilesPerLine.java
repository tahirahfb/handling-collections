package ReadingFilesPerLine;

import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingFilesPerLine {
    
    public static List<String> read(String file){
        
        List<String> rows = new ArrayList<>();
            try {
                Files.lines(Paths.get("src/ReadingFilesPerLine/presidents.txt")).forEach(row -> rows.add(row));
                rows.forEach(System.out::println);
        }   catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
            return rows;
}
    public static void main(String args[]){

      read("src/ReadingFilesPerLine/presidents.txt");
    }
}
