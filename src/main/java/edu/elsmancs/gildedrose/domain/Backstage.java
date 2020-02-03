package edu.elsmancs.gildedrose.domain;

public class Backstage extends NormalItem {

    public Backstage(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        if (getSell_in() > 10) {
            computeQuality(1);
        }
        else if (getSell_in() > 5) {
            computeQuality(2);
        }
        else if (getSell_in() > 0) {
            computeQuality(3);
        }
        else {
            /** 
             * SRP: class Backstage should only have a reason to change
             * Changes in Backstage quality rules should be only reflected
             * in the class Backstage, not in NormalItem.
             */
            getItem().setQuality(0);
        }
        setSell_in();
    };
}