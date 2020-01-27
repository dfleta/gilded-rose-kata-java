package edu.elsmancs.gildedrose.domain;

public class NormalItem extends Item {

    public NormalItem(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getSell_in() {
        return super.getSell_in();
    }

    @Override
    public int getQuality() {
        return super.getQuality();
    }

    private void computeQuality(int value) {

        if (getQuality() + value > 50) {
            setQuality(50);
        }
        else if (getQuality() + value >= 0) {
            setQuality(getQuality() + value);
        }
        else {
            this.setQuality(0);
        }
    }

    public void updateQuality() {

        if (getSell_in() > 0) {
            computeQuality(-1);
        } else {
            computeQuality(-2);
        }
        setSell_in();
    }
}