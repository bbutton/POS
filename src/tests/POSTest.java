package tests;

import main.MockDisplay;
import main.POS;
import main.PriceList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by bbutton on 9/26/17.
 */
public class POSTest {
    @Test
    public void priceDisplayedWhenScanningSingleItem() {
        MockDisplay display = new MockDisplay();
        PriceList priceList = new MockPriceList();
        POS pos = new POS(display, priceList);

        int itemCode = 1;
        pos.scanItem(itemCode);

        assertEquals("1.99", display.getPrice());
    }

    @Test
    public void priceDisplayedWhenScanningDifferentItem() {
        MockDisplay display = new MockDisplay();
        PriceList priceList = new MockPriceList();
        POS pos = new POS(display, priceList);

        int itemCode = 6;
        pos.scanItem(itemCode);

        assertEquals("2.99", display.getPrice());
    }
}
