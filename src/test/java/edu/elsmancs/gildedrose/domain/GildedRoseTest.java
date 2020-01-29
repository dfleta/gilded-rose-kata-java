package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void toStringTest() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        GildedRose shop = new GildedRose();
        shop.addItem(cheese);
        cheese = new AgedBrie("Aged Brie", 10, 10);
        shop.addItem(cheese);
        System.out.println(shop.toString());
    }   
}
