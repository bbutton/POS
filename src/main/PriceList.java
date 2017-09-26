package main;

/**
 * Created by bbutton on 9/26/17.
 */
public class PriceList {
    String lookup(int itemCode) {
        String price = null;

        if(itemCode == 1)
            price = "1.99";
        else if (itemCode == 6) {
            price = "2.99";
        }

        return price;
    }
}
