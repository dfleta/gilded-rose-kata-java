package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.elsmancs.gildedrose.domain.AgedBrie;


public class AgedBrieTest {

    @Test
    public void crearAgedBrie() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        assertEquals("Aged Brie", cheese.getName());
        assertEquals(2, cheese.getSell_in(), 0);
        assertEquals(0, cheese.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        System.out.println(cheese.toString());
    }

    @Test
    public void updateQualitycheeseItem() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        cheese.updateQuality();
        assertEquals(1, cheese.getSell_in(), 0);
        assertEquals(1, cheese.getQuality(), 0);
    }

    @Test
    public void updateQualitycheeseItemSellInCERO() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 0, 0);
        cheese.updateQuality();
        assertEquals(-1, cheese.getSell_in(), 0);
        assertEquals(2, cheese.getQuality(), 0);    
    }

    @Test
    public void updateQualitycheeseItemBajoCERO() {

        AgedBrie cheese = new AgedBrie("Aged Brie", -1, 0);
        cheese.updateQuality();
        assertEquals(-2, cheese.getSell_in(), 0);
        assertEquals(2, cheese.getQuality(), 0);
    }
}
