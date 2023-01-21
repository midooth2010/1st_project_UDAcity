package txt;
//import backup.XmlReader;

//import backup.XMLreader3;

import javax.sql.rowset.spi.XmlReader;
import java.io.IOException;

import static txt.XMLReader2.*;

public class Main {
    public static void main(String[] args) throws IOException {
      TxtReader textReader = new TxtReader();
       textReader.exportfileToCSV();
        XMLReader2 xmlReader = new XMLReader2();
        exportXmlToCSV();










    }
}