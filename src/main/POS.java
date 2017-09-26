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
        display.displayPrice("1.99");
    }
}
