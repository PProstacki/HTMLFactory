package htmlfactory;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HTMLFactory {

    public static void main(String[] args) {
        menu();

        try {
            Desktop.getDesktop().browse(new File("Strona_Internetowa.html").toURI());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    private static void menu(){
        Scanner sc = new Scanner(System.in);
        int siteNr = 0;
        WebsiteType type = null;
        
        do{
        System.out.println("Ktorą stronę chcesz utworzyć? [1-5]");
        System.out.println("1. Strona ze zdjęciami");
        System.out.println("2. Strona z informacjami");
        System.out.println("3. Strona z kontaktami");
        System.out.println("4. Strona z wiadomościami");
        System.out.println("5. Wyjście");
        System.out.print("Wybor: ");
        siteNr = sc.nextInt();
        System.out.println();
        }while(siteNr != 1 && siteNr != 2 && siteNr != 3 && siteNr != 4 && siteNr != 5);
        
        ObjectManager om = new ObjectManager(new WebsiteFactory());
        if(siteNr == 1){
            type = WebsiteType.IMAGE;
        }else if(siteNr == 2){
            type = WebsiteType.INFO;
        }else if(siteNr == 3){
            type = WebsiteType.CONTACT;
        }else if(siteNr == 4){
            type = WebsiteType.NEWS;
        }else if(siteNr == 5){
            System.exit(0);
        }
        
        om.doAction(type);        
    }
    
}
