package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class BackstageTest {

    @Test
    public void crearBackstage() {

        Backstage pass = new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", pass.getName());
        assertEquals(15, pass.getSell_in(), 0);
        assertEquals(20, pass.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        Backstage pass = new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        System.out.println("toString() Backstage test");
        System.out.println(pass.toString());
    }

    @Test
    public void updateQualityOverTEN() {
        Backstage pass = new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        pass.updateQuality();
        assertEquals(14, pass.getSell_in(), 0);
        assertEquals(21, pass.getQuality(), 0);
    }

    @Test
    public void updateQualityOverFIVE() {

        Backstage pass = new Backstage("Backstage passes to a TAFKAL80ETC concert", 6, 20);
        pass.updateQuality();
        assertEquals(5, pass.getSell_in(), 0);
        assertEquals(22, pass.getQuality(), 0);    
    }

    @Test
    public void updateQualityOverZERO() {

        Backstage pass = new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        pass.updateQuality();
        assertEquals(4, pass.getSell_in(), 0);
        assertEquals(23, pass.getQuality(), 0);
    }

    @Test
    public void updateQualityPassExpired() {

        Backstage pass = new Backstage("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        pass.updateQuality();
        assertEquals(-1, pass.getSell_in(), 0);
        assertEquals(0, pass.getQuality(), 0);
    }
}
