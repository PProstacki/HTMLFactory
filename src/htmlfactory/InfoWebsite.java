package htmlfactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class InfoWebsite extends Website{

    InfoWebsite(){
        HTMLTitle = "Informacje:";
        setHTMLTitle();
        infoBody();
        writeToFile();
        System.out.println(sb);
    }
    
    private void infoBody(){
        int index = sb.indexOf("<body>");
        sb.insert(index + 6, getWords());
    }
    
    private StringBuilder getWords(){
        StringBuilder words = new StringBuilder();
        Random r = new Random();
        int wordsJump = r.nextInt(10000)+1;
        int i = 1;
        
        try{
        BufferedReader br = new BufferedReader(new FileReader("slowa.txt"));
        
        do{
            if(i % wordsJump == 0){
            words.append(br.readLine() + " ");
            }
            
            ++i;
        }while(br.readLine() != null);
        
        br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return words;
    }
    
    
}
