package htmlfactory;

import java.util.Random;

public class ContactWebsite extends Website{

    public ContactWebsite() {
        HTMLTitle = "Kontakty:";
        setHTMLTitle();
        contactBody();
        writeToFile();
        System.out.println(sb);
    }
    
    private void contactBody(){
        int index = sb.indexOf("<body>");
        sb.insert(index + 6, getContact());
    }

    private StringBuilder getContact() {
        String firstName[] = {"Tomasz", "Przemysław", "Kamil", "Jakus", "Adolf"};
        String lastName[] = {"Kamczyński", "Kowalski", "Nowak", "Dzwoniarz", "Becz"};
        String city[] = {"Będzin", "Sosnowiec", "Katowice", "Wojkowice", "Zagrzeb"};
        String adress[] = {"Wiejska 4", "Długa 92", "Bali 8", "Beczki 2", "Krzywa 112"};
    
        StringBuilder contact = new StringBuilder();
        Random r = new Random();
        int phoneNr = r.nextInt(888888888) + 111111111;
        
        contact.append(firstName[r.nextInt(5)] + "<br>" + lastName[r.nextInt(5)] + "<br>Nr Telefonu: " + phoneNr + "<br>" + city[r.nextInt(5)] + "<br>" + adress[r.nextInt(5)]);
        
        return contact;
    }
    
}
