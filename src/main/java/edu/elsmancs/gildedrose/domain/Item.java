package edu.elsmancs.gildedrose.domain;

public class Item {

    private String name = "";
    /** 
     * Item 61: Prefer primitive types to boxed primitives
     * Bloch, Joshua; Effective Java, Third Edition.
    */
    protected int sell_in = 0;
    protected int quality = 0;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
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
        StringBuilder itemDescription = new StringBuilder();
        itemDescription.append("name=" + getName());
        itemDescription.append(", sell_in=" + getSell_in());
        itemDescription.append(", quality=" + getQuality());
        return itemDescription.toString();
    }

    public String getName() {
        return this.name;
    }

    public int getSell_in() {
        return this.sell_in;
    }

    public int getQuality() {
        return this.quality;
    }
}