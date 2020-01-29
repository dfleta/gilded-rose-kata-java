package edu.elsmancs.gildedrose.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    private List<NormalItem> inventory = new ArrayList<NormalItem>();
   
    public List<NormalItem> inventory() {
        return this.inventory;
    }

    public void addItem(NormalItem item) {
        inventory().add(item);
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
        for (NormalItem item : inventory()) {
            representation.append(item.toString());
            representation.append('\n');
        }
        return representation.toString();
    }
}