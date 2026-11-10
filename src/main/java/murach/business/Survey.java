package murach.business;
import java.io.Serializable;
import java.util.Date;

public class Survey implements Serializable {
    private String referralSource;
    private boolean announcements;
    private boolean offer;
    private String contactVia;

    public Survey (String referralSource, boolean announcements, boolean offer, String contactVia) {
        this.referralSource = referralSource;
        this.announcements = announcements;
        this.offer = offer;
        this.contactVia = contactVia;
    }

    public String getReferralSource () {
        return this.referralSource;
    }

    public void setReferralSource (String referralSource) {
        this.referralSource = referralSource;
    }

    public boolean getAnnouncements () {
        return this.announcements;
    }

    public void setAnnouncements (boolean announcements) {
        this.announcements = announcements;
    }

    public boolean getOffer() {
        return this.offer;
    }

    public void setOffer(boolean offer) {
        this.offer = offer;
    }

    public String getContactVia () {
        return this.contactVia;
    }

    public void setContactVia (String contactVia) {
        this.contactVia = contactVia;
    }
}