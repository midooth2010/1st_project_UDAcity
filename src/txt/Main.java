package txt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Main {
    public static void main(String[] args) throws IOException {
     // TxtReader textReader = new TxtReader();
      // textReader.exportfileToCSV();
       //textReader.printStudentData();
     // XMLReader2 xmlReader = new XMLReader2();
     // exportXmlToCSV();

        Scanner myObj = new Scanner(System.in); // C

        System.out.println("Enter Number ");

        String number = myObj.nextLine(); // Read user input
        //System.out.println("number is: " + number); // Output user input

        //JsonReader222.readFromJsonFile(number);
        JsonReader222.fromCsvFile(number);

    }
}