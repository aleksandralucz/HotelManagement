package HotelManagement;

import java.io.Serializable;

public class Doubleroom extends Singleroom implements Serializable {
    String guestNameDouble;
    String guestContactDouble;

    Doubleroom() {
        this.guestName="";
        this.guestNameDouble="";
    }
    Doubleroom(String guestName,String guestContact, String guestNameDouble,String guestContactDouble) {

        this.guestName = guestName;
        this.guestContact = guestContact;
        this.guestContactDouble = guestContactDouble;
        this.guestContactDouble= guestNameDouble;
    }
}

