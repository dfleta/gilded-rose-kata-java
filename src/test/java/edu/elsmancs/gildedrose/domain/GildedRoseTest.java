package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GildedRoseTest {

    GildedRose shop = null;

    @Before
    public void setupInventario() {
       shop = new GildedRose();
    }

    @Test
    public void toStringTest() {
        shop = new GildedRose();
        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        shop.addItem(cheese);
        cheese = new AgedBrie("Aged Brie", 10, 10);
        shop.addItem(cheese);
        System.out.println("toString() GildedRose test:");
        System.out.println(shop.toString());
    }

    @Test
    public void addItemTest() {
        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        shop.addItem(normal);
        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        shop.addItem(cheese);
        assertEquals(2, shop.inventory().size(), 0);
        // nuevo Java 9 metodo factoria estatico para crear unmodifiable lists List.of()
        List<NormalItem> items = List.of(normal, cheese);
        assertArrayEquals(items.toArray(), shop.inventory().toArray());

        System.out.println("GildedRose addItem test:");
        System.out.println(shop.toString());
    }
}
