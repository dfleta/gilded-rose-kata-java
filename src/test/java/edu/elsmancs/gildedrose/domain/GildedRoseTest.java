package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GildedRoseTest {

    private GildedRose shop = null;
    private NormalItem normal = null;
    private AgedBrie brie = null;

    @Before
    public void setupInventario() {
       shop = new GildedRose();
       normal = new NormalItem("+5 Dexterity Vest", 10, 20);
       brie = new AgedBrie("Aged Brie", 2, 0);
    }

    @Test
    public void toStringTest() {
        shop = new GildedRose();
        shop.addItem(brie);
        brie = new AgedBrie("Aged Brie", 10, 10);
        shop.addItem(brie);
        System.out.println("toString() GildedRose test:");
        System.out.println(shop.toString());
    }

    @Test
    public void addItemTest() {
        shop.addItem(normal);
        shop.addItem(brie);
        assertEquals(2, shop.inventory().size(), 0);
        // nuevo Java 9 metodo factoria estatico para crear unmodifiable lists List.of()
        List<NormalItem> items = List.of(normal, brie);
        assertArrayEquals(items.toArray(), shop.inventory().toArray());

        System.out.println("GildedRose addItem test:");
        System.out.println(shop.toString());
    }

    @Test
    public void updateQuality() {
        shop.addItem(normal);
        shop.addItem(brie);
        assertEquals(2, shop.inventory().size(), 0);
        System.out.println("Dia 0:" + '\n' + shop.toString());
        shop.updateQuality();
        assertEquals(19, shop.inventory().get(0).getQuality(), 0);
        assertEquals(1, shop.inventory().get(1).getQuality(), 0);
        System.out.println("Dia 1:" + '\n' + shop.toString());
    }
}
