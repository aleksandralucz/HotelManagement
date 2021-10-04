package HotelManagement;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Booking {

    RoomStandard roomStandard;

    Booking(RoomStandard roomStandard) {
        this.roomStandard = roomStandard;
        @Override
        public void run () {
            try {
                FileOutputStream fout = new FileOutputStream("backup");
                ObjectOutputStream oos = new ObjectOutputStream(fout);
                oos.writeObject(roomStandard);
            } catch (Exception e) {
                System.out.println("Error in writing " + e);
            }

        }

    }
}