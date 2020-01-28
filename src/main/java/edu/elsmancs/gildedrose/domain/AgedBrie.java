package edu.elsmancs.gildedrose.domain;

public class AgedBrie extends NormalItem {

    public AgedBrie(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {

        if (getSell_in() > 0) {
            computeQuality(1);
        } else {
            computeQuality(2);
        }
        setSell_in();
    }

}