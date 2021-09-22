package HotelManagement;

import java.util.Scanner;

public class Hotel {
    static RoomStandard roomStandard = new RoomStandard();
    static Scanner sc = new Scanner(System.in);

    static void CustomerDetails(int i,int roomNumber){
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
            case 1:roomStandard.luxury_doubleroom[roomNumber]=new Doubleroom(guestName, guestContact, guestNameDouble, guestContactDouble);
                break;
            case 2:roomStandard.deluxe_doubleroom[roomNumber]=new Doubleroom(guestName, guestContact, guestNameDouble, guestContactDouble);
                break;
            case 3:roomStandard.luxury_singleroom[roomNumber]=new Singleroom(guestName, guestContact);
                break;
            case 4:roomStandard.deluxe_singleroom[roomNumber]=new Singleroom(guestName, guestContact);
                break;
            default:System.out.println("Wrong option");
                break;
        }
    }

    static void bookRoom(int i)
    {
        int j;
        int roomNumber;
        System.out.println("\nChoose room number from : ");
        switch (i) {
            case 1:
                for(j=0;j<roomStandard.luxury_doubleroom.length;j++)
                {
                    if(roomStandard.luxury_doubleroom[j]==null)
                    {
                        System.out.print(j+1+",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try{
                    roomNumber=sc.nextInt();
                    roomNumber--;
                    if(roomStandard.luxury_doubleroom[roomNumber]!=null)
                        throw new RoomAvailability();
                    CustomerDetails(i,roomNumber);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 2:
                for(j=0;j<roomStandard.deluxe_doubleroom.length;j++)
                {
                    if(roomStandard.deluxe_doubleroom[j]==null)
                    {
                        System.out.print(j+11+",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try{
                    roomNumber=sc.nextInt();
                    roomNumber=roomNumber-11;
                    if(roomStandard.deluxe_doubleroom[roomNumber]!=null)
                        throw new RoomAvailability();
                    CustomerDetails(i,roomNumber);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 3:
                for(j=0;j<roomStandard.luxury_singleroom.length;j++)
                {
                    if(roomStandard.luxury_singleroom[j]==null)
                    {
                        System.out.print(j+31+",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try{
                    roomNumber=sc.nextInt();
                    roomNumber=roomNumber-31;
                    if(roomStandard.luxury_singleroom[roomNumber]!=null)
                        throw new RoomAvailability();
                    CustomerDetails(i,roomNumber);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 4:
                for(j=0;j<roomStandard.deluxe_singleroom.length;j++)
                {
                    if(roomStandard.deluxe_singleroom[j]==null)
                    {
                        System.out.print(j+41+",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try{
                    roomNumber=sc.nextInt();
                    roomNumber=roomNumber-41;
                    if(roomStandard.deluxe_singleroom[roomNumber]!=null)
                        throw new RoomAvailability();
                    CustomerDetails(i,roomNumber);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println("Room Booked");
    }
    static void features(int i)
    {
        switch (i) {
            case 1:System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ");
                break;
            case 2:System.out.println("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000  ");
                break;
            case 3:System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2200  ");
                break;
            case 4:System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
    }

}
