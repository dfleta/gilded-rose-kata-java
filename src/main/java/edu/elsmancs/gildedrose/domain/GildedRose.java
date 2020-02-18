package edu.elsmancs.gildedrose.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    private List<Updateable> inventory = new ArrayList<Updateable>();
   
    public List<Updateable> inventory() {
        return this.inventory;
    }

    public void addItem(Updateable item) {
        inventory().add(item);
    }

    public void updateQuality() {
        for (Updateable item : inventory()) {
            item.updateQuality();
        }
    }

    /**
     * Returns a brief description of the Item. 
     * The exact details of the representation are unspecified
     * and subject to change, but the following may be regarded
     * as typical.
     * [name=Sulfuras, sell_in=10, quality=20]"
     * 
     * Item 12: Always override toString
     * Item 63: Beware the performance of string concatenation
     * Bloch, Joshua; Effective Java, Third Edition.
     */
    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();
        for (Updateable item : inventory()) {
            representation.append(item.toString());
            representation.append('\n');
        }
        return representation.toString();
    }
}