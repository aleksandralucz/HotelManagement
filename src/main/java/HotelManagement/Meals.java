package HotelManagement;

import java.io.Serializable;

public class Meals implements Serializable {


    int itemNo;
    int quantity;
    float price;

    Meals(int itemNo, int quantity) {
        this.itemNo = itemNo;
        this.quantity = quantity;
        switch (itemNo) {
            case 1:
                price = quantity * 5;
                break;
            case 2:
                price = quantity * 7;
                break;
            case 3:
                price = quantity * 2;
                break;
            case 4:
                price = quantity * 22;
                break;
        }
    }
}
