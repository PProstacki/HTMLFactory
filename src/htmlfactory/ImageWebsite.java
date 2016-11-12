package htmlfactory;

import java.util.Random;

public class ImageWebsite extends Website{
    String files[] = {"Bulldog.jpg", "Bulldog2.jpg", "Carnage.jpg", "Game.jpg", "Gory.jpg", "Gwiazdy.jpeg", "Kluski.jpg", "Trawa.jpg", "Trump.jpg", "Witcher.jpg"};
    boolean[] isImageShowed = new boolean[10];
    
    ImageWebsite(){
     HTMLTitle = "Zdjęcia:";
     setHTMLTitle();
     imageBody();
     writeToFile();
     System.out.println(sb);
     
    }
    
    private void imageBody(){
        int index = sb.indexOf("<body>");
        sb.insert(index + 6, getImages());
    }
    //<img src= \"" width=\"600px\" height=\"450px\">"

    private StringBuilder getImages(){
        StringBuilder images = new StringBuilder();
        Random r = new Random();
        int rng = 0;
        
        for(int i = 0;i < 10;i++){
            isImageShowed[i] = false;
        }
        
        for(int i = 0;i < 4;i++){
         do{
             rng = r.nextInt(10);
         }while(isImageShowed[rng] == true);
         isImageShowed[rng] = true;
         images.append("<img src= \"" + files[rng] + "\" width=\"650px\" height=\"450px\">");
        }
        
        return images;
    }
    
}
