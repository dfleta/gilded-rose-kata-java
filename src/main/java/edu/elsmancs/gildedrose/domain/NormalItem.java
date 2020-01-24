package edu.elsmancs.gildedrose.domain;

public class NormalItem extends Item {

    public NormalItem(String name, Integer sell_in, Integer quality) {
        super(name, sell_in, quality);
    }

    public void setQuality(Integer value) {
        this.quality = value;
    }

    public void setSell_in() {
        this.sell_in = this.getSell_in() - 1;
    }

    public void computeQuality(Integer value) {

        if (this.getQuality() + value > 50) {
            this.setQuality(50);
        }
        else if (this.getQuality() + value >= 0) {
            this.setQuality(this.getQuality() + value);
        }
        else {
            this.setQuality(0);
        }
    }

    public void updateQuality() {
        
        if (this.getSell_in() > 0) {
            this.computeQuality(-1);
        } else {
            this.computeQuality(-2);
        }
        this.setSell_in();

    }
}