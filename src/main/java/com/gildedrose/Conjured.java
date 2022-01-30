package com.gildedrose;

public class Conjured extends NormalItem {
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void decreaseQuality() {
        super.decreaseQuality();
        super.decreaseQuality();
    }
}
