package htmlfactory;

public class WebsiteFactory {

    public Website createWebsite(WebsiteType type) {

        if (WebsiteType.IMAGE.equals(type)) {
            return new ImageWebsite();
        } else if (WebsiteType.INFO.equals(type)) {
            return new InfoWebsite();
        } else if (WebsiteType.CONTACT.equals(type)) {
            return new ContactWebsite();
        } else if (WebsiteType.NEWS.equals(type)) {
            return new NewsWebsite();
        }
        return null;
    }
}
