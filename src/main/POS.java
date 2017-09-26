package main;

/**
 * Created by bbutton on 9/26/17.
 */
public class POS {
    private Display display;
    private PriceList priceList;

    public POS(Display display, PriceList priceList) {

        this.display = display;
        this.priceList = priceList;
    }

    public void scanItem(int itemCode) {
        String price = priceList.lookup(itemCode);

        display.displayPrice(price);
    }
}
