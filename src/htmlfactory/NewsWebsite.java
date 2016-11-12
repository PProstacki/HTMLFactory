package htmlfactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class NewsWebsite extends Website{
    
    NewsWebsite(){
        HTMLTitle = "Wiadomosci:";
        setHTMLTitle();
        newsBody();
        writeToFile();
        System.out.println(sb);
    }
    
    private void newsBody(){
        int index = sb.indexOf("<body>");
        sb.insert(index + 6, getWords());
    }
    
    private StringBuilder getWords(){
        StringBuilder words = new StringBuilder();
        Random r = new Random();
        String headlines[] = {"Sport:", "Finanse", "Technologie:" , "Moda:"};
        int wordsJump;// = r.nextInt(10000)+1;
        int i = 1;
        
        try{
        BufferedReader br = null;
        
        for(int j = 0;j < 4;j++){
            br = new BufferedReader(new FileReader("slowa.txt"));
            wordsJump = r.nextInt(25000)+25000;
            words.append(headlines[j] + "<br>");
        do{
            if(i % wordsJump == 0){
            words.append(br.readLine() + " ");
            }
            
            ++i;
        }while(br.readLine() != null);
            words.append("<br><br>");
        }
        
        br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return words;
    }
}
