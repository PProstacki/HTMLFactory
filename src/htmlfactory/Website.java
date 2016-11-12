package htmlfactory;

import java.io.IOException;
import java.io.PrintWriter;

public class Website {
    protected WebsiteType type;
    String HTMLTitle = "";
    StringBuilder sb = new StringBuilder("");
    
    Website(){
        sb.append("<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"utf-8\">\n<title>\n</title>\n</head>\n<body>\n</body>\n</html>");
    }
    
    void writeToFile(){     //dodac entery do pliku
        try {
            PrintWriter pw = new PrintWriter("Strona_Internetowa.html");
            pw.write(sb.toString());
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
    
    void setHTMLTitle() {
        int index = sb.indexOf("<title>");
        sb.insert(index + 7, HTMLTitle);
    }
            
}
