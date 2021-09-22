package HotelManagement;

import java.io.Serializable;
import java.util.ArrayList;


public class Singleroom implements Serializable {

    String guestName;
    String guestContact;
    ArrayList<Meals> meals = new ArrayList<>();

    Singleroom() {
        this.guestName="";
    }

    Singleroom(String guestName,String guestContact) {

        this.guestName = guestName;
        this.guestContact = guestContact;
    }
}