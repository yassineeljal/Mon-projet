package Files;

import java.io.FileWriter;

public class Main2 {
    public static void main(String[] args) {
        // File paths
        String filePath = "src/files/example.txt";

        // Writing to a file
        try {
            FileWriter writer = new FileWriter(filePath, "src/");
            writer.write("Hello, world!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
