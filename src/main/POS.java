package main;

/**
 * Created by bbutton on 9/26/17.
 */
public class POS {
    private MockDisplay display;

    public POS(MockDisplay display) {

        this.display = display;
    }

    public void scanItem(int itemCode) {
        if(itemCode == 1)
            display.displayPrice("1.99");
        else if(itemCode == 6) {
            display.displayPrice("2.99");
        }
    }
}
