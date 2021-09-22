package HotelManagement;

import java.util.Scanner;

public class Hotel {
    static RoomStandard roomStandard = new RoomStandard();
    static Scanner sc = new Scanner(System.in);

    static void CustomerDetails(int i,int rn){
        String guestName, guestContact;
        String guestNameDouble = null, guestContactDouble=null;

        System.out.print("\nEnter customer name: ");
        guestName = sc.next();
        System.out.print("Enter contact number: ");
        guestContact=sc.next();
        if(i<3)
        {
            System.out.print("Enter second customer name: ");
            guestNameDouble= sc.next();
            System.out.print("Enter contact number: ");
            guestContactDouble=sc.next();

        }
        switch (i) {
            case 1:roomStandard.luxury_doubleroom[rn]=new Doubleroom(guestName, guestContact, guestNameDouble, guestContactDouble);
                break;
            case 2:roomStandard.deluxe_doubleroom[rn]=new Doubleroom(guestName, guestContact, guestNameDouble, guestContactDouble);
                break;
            case 3:roomStandard.luxury_singleroom[rn]=new Singleroom(guestName, guestContact);
                break;
            case 4:roomStandard.deluxe_singleroom[rn]=new Singleroom(guestName, guestContact);
                break;
            default:System.out.println("Wrong option");
                break;
        }
    }

    }
