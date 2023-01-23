package txt;


import java.io.IOException;

import static txt.XMLReader2.*;

public class Main {
    public static void main(String[] args) throws IOException {
      TxtReader textReader = new TxtReader();
       textReader.exportfileToCSV();
       textReader.printStudentData();
      //  XMLReader2 xmlReader = new XMLReader2();
       // exportXmlToCSV();










    }
}