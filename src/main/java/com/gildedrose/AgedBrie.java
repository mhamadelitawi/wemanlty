package com.gildedrose;

public class AgedBrie extends NormalItem{

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void NormalUpdate() {
        increaseQuality();
    }

    @Override
    protected void updateIfSellInNegative() {
        increaseQuality();
    }
}
