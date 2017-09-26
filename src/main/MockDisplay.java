package main;

/**
 * Created by bbutton on 9/26/17.
 */
public class MockDisplay implements Display {
    private String price;

    public String getPrice() {
        return price;
    }

    @Override
    public void displayPrice(String price) {
        this.price = price;
    }
}
