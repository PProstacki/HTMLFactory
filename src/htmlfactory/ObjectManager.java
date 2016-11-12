package htmlfactory;

public class ObjectManager {
    private WebsiteFactory websiteFactory;
    
    ObjectManager(WebsiteFactory websiteFactory){
        this.websiteFactory = websiteFactory;
    }
    
    public void doAction(WebsiteType type){
        Website website = websiteFactory.createWebsite(type);
                
        
    }
    
}
