package tests;

import main.PriceList;

/**
 * Created by bbutton on 9/26/17.
 */
public class MockPriceList implements PriceList {
    public String lookup(int itemCode) {
        String price = null;

        if(itemCode == 1)
            price = "1.99";
        else if (itemCode == 6) {
            price = "2.99";
        }

        return price;
    }
}
