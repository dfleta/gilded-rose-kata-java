package edu.elsmancs.gildedrose.domain;

public class Sulfuras extends NormalItem {

    public Sulfuras(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {};
}