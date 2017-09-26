package tests;

import main.Display;
import main.POS;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by bbutton on 9/26/17.
 */
public class POSTest {
    @Test
    public void priceDisplayedWhenScanningSingleItem() {
        Display display = new Display();
        POS pos = new POS(display);

        int itemCode = 1;
        pos.scanItem(itemCode);

        assertEquals("1.99", display.getPrice());
    }

    @Test
    public void priceDisplayedWhenScanningDifferentItem() {
        Display display = new Display();
        POS pos = new POS(display);

        int itemCode = 6;
        pos.scanItem(itemCode);

        assertEquals("2.99", display.getPrice());
    }
}
