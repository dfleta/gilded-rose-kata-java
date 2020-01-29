package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class SulfurasTest {

    @Test
    public void crearSulfuras() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        assertEquals("Sulfuras, Hand of Ragnaros", sulfuras.getName());
        assertEquals(0, sulfuras.getSell_in(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        System.out.println("Sulfuras toString() test");
        System.out.println(sulfuras.toString());
    }

    @Test
    public void updateQualitySulfurasItem() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        sulfuras.updateQuality();
        assertEquals(0, sulfuras.getSell_in(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }
}
