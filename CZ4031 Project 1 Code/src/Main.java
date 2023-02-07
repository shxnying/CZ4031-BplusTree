import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        System.out.println("Initial Commit");

        
        Scanner consoleScanner = new Scanner(System.in);
        System.out.print("Enter the name of the file to read: ");
        String filename = consoleScanner.nextLine();



        List<Record> data = TSVFileReader.readTSVFile(filename);
        for (Record record : data) {
            System.out.println("Key: " + record.getKey());
            System.out.print("Data: ");
            for (String field : record.getData()) {
                System.out.print(field + " ");
            }
            System.out.println();
        }
        
        
        consoleScanner.close();
  }

}