package HotelManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        public static void main (String[]args){

            try {
                File f = new File("backup");
                if (f.exists()) {
                    FileInputStream fin = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fin);
                    Hotel.roomStandard = (RoomStandard) ois.readObject();
                }
                Scanner sc = new Scanner(System.in);
                int ch, ch2;
                char wish;
                x:
                do {

                    System.out.println("\nEnter your choice :\n1.Display room details\n2.Display room availability \n3.Book\n4.Order food\n5.Checkout\n6.Exit\n");
                    ch = sc.nextInt();
                    switch (ch) {

                    }

                    System.out.println("\nContinue : (y/n)");
                    wish = sc.next().charAt(0);
                    if (!(wish == 'y' || wish == 'Y' || wish == 'n' || wish == 'N')) {
                        System.out.println("Invalid Option");
                        System.out.println("\nContinue : (y/n)");
                        wish = sc.next().charAt(0);
                    }

                } while (wish == 'y' || wish == 'Y');

                Thread t = new Thread(String.valueOf(new Booking(Hotel.roomStandard)));
                t.start();
            } catch (Exception e) {
                System.out.println("Not a valid input");
            }
        }
    }