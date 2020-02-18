package edu.elsmancs.gildedrose.inheritancetests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import edu.elsmancs.gildedrose.domain.NormalItem;
import edu.elsmancs.gildedrose.domain.AgedBrie;
import edu.elsmancs.gildedrose.domain.Sulfuras;
import edu.elsmancs.gildedrose.domain.GildedRose;


public class InheritanceTest {

    @Test
    public void toStringTest() {
        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        System.out.println("toString() inheritance test");
        System.out.println(normal.toString());
    }

    @Test
    public void updateQualityNormalItem() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        normal.updateQuality();
        assertEquals("+5 Dexterity Vest", normal.getName());
        assertEquals(9, normal.getSell_in(), 0);
        assertEquals(19, normal.getQuality(), 0);
    }

    @Test
    public void updateQualityNormalItemExpired() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 0, 20);
        normal.updateQuality();
        assertEquals(-1, normal.getSell_in(), 0);
        assertEquals(18, normal.getQuality(), 0);    
    }

    @Test
    public void qualityNormalItemMinZERO() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 0);
        normal.updateQuality();
        assertEquals(9, normal.getSell_in(), 0);
        assertEquals(0, normal.getQuality(), 0);
    }

    @Test
    public void crearAgedBrie() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        assertEquals("Aged Brie", cheese.getName());
        assertEquals(2, cheese.getSell_in(), 0);
        assertEquals(0, cheese.getQuality(), 0);
    }

    @Test
    public void updateQualityBrie() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        cheese.updateQuality();
        assertEquals(1, cheese.getSell_in(), 0);
        assertEquals(1, cheese.getQuality(), 0);
    }

    @Test
    public void gildedRoseAddItem() {
        GildedRose shop = new GildedRose();
        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        shop.addItem(normal);
        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        shop.addItem(cheese);
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        shop.addItem(sulfuras);
        assertEquals(3, shop.inventory().size(), 0);
        // nuevo Java 9 metodo factoria estatico para crear unmodifiable lists List.of()
        List<NormalItem> items = List.of(normal, cheese, sulfuras);
        assertArrayEquals(items.toArray(), shop.inventory().toArray());

        System.out.println("GildedRose addItem test:");
        System.out.println(shop.toString());
    }

    @Test
    public void updateQuality() {
        GildedRose shop = new GildedRose();
        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        AgedBrie brie = new AgedBrie("Aged Brie", 2, 0);
        shop.addItem(normal);
        shop.addItem(brie);
        assertEquals(2, shop.inventory().size(), 0);
        System.out.println("Dia 0:" + '\n' + shop.toString());
        shop.updateQuality();

        // Hay que cambiar la vista del objeto Updateable 
        // para tener acceso al metodo getQuality del
        // tipo NormalItem
        NormalItem item = (NormalItem) shop.inventory().get(0);
        assertEquals(19, item.getQuality(), 0);
        assertEquals(1,  ((NormalItem) (shop.inventory().get(1))).getQuality(), 0);
        System.out.println("Dia 1:" + '\n' + shop.toString());
    }
}
