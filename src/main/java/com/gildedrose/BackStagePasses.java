package com.gildedrose;

public class BackStagePasses extends NormalItem {

    public BackStagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void NormalUpdate() {
        increaseQuality();
        if (sellIn < 11)
            increaseQuality();
        if (sellIn < 6)
            increaseQuality();
    }

    @Override
    protected void updateIfSellInNegative() {
        quality = 0;
    }
}
