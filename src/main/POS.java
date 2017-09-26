package main;

/**
 * Created by bbutton on 9/26/17.
 */
public class POS {
    private Display display;

    public POS(Display display) {

        this.display = display;
    }

    public void scanItem(int itemCode) {
        PriceList priceList = new PriceList();
        String price = priceList.lookup(itemCode);

        display.displayPrice(price);
    }
}
