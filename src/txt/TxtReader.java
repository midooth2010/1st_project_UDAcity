package txt;
import java.io.*;

public class TxtReader {
    public String [] readingTxtFile () throws IOException{
        File txtFile = new File("src/resources/student-data.txt");

        BufferedReader read = new BufferedReader(new FileReader(txtFile));
        String student ;
        String [] studentList = null;

        while ((student = read.readLine()) != null){
            student = student.replace("#",",");
            student = student.replace("$","\n");
            studentList = student.split("\n");
            System.out.println(student);
        }
        return studentList;


    }

    public void exportfileToCSV () throws IOException{
        String []studentList = readingTxtFile();
        File file = new File("src/resources/studens.csv");
        FileWriter fileWconverter = new FileWriter(file);

        for (String student : studentList){
            StringBuilder line = new StringBuilder();
            line.append(student);
            line.append("\n");
            fileWconverter.write(line.toString());
        }
        fileWconverter.close();


    }




}
