import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TotalCharacters {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int charCount = 0;
        Scanner input=new Scanner(System.in);
        try {
            System.out.println("Sample input : filePath: ");
            String path=input.next();
            // Replace the file path with the actual path of the text file
            reader = new BufferedReader(new FileReader(path));

            int character = reader.read();

            while (character != -1) {
                charCount++;
                character = reader.read();
                System.out.print((char)character);
            }

            System.out.println("Total number of characters in the file are: " + charCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        input.close();
    }
}

