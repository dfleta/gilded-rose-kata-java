package edu.elsmancs.gildedrose.domain;

/**
 * Item 17: Minimize mutability
 * Ensure that the class can’t be extended.
 * Bloch, Joshua; Effective Java, Third Edition.
 */
final class Item {

    /** 
     * Item 17: Minimize mutability.
     * Bloch, Joshua; Effective Java, Third Edition.
     */
    private final String name;
    /** 
     * Item 61: Prefer primitive types to boxed primitives.
     * Bloch, Joshua; Effective Java, Third Edition.
    */
    private int sell_in = 0;
    private int quality = 0;

    Item(String name, int sell_in, int quality) {
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

    String getName() {
        return this.name;
    }

    int getSell_in() {
        return this.sell_in;
    }

    void setSell_in() {
        this.sell_in = this.getSell_in() - 1;
    }

    int getQuality() {
        return this.quality;
    }

    void setQuality(int value) {
        this.quality = value;
    }
}