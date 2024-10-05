import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Step 1: Read the JSON data from a file
        String filePath = "C:\\Users\\Sunil\\Downloads\\data.json"; // Path to your JSON file
        
        try {
            // Read the contents of the JSON file into a string
            String jsonData = new String(Files.readAllBytes(Paths.get(filePath)));

            // Step 2: Parse the JSON into Java objects
            Data data = JSONParser.parseJSON(jsonData);

            // Step 3: Plot the data
            PlotGraph.createAndShowPlot(data.vitals);
        } catch (IOException e) {
            System.err.println("Error reading the JSON file: " + e.getMessage());
        }
    }
}

