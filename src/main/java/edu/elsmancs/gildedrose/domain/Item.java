package edu.elsmancs.gildedrose.domain;

public class Item {

    private String name = "";
    private Integer sell_in = 0;
    private Integer quality = 0;

    public Item(String name, Integer sell_in, Integer quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name.toString() + this.sell_in.toString() + this.quality.toString();
    }

    public String getName() {
        return this.name;
    }

    public Integer getSell_in() {
        return this.sell_in;
    }

    public Integer getQuality() {
        return this.quality;
    }
}