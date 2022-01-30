package com.gildedrose;

public class NormalItem extends Item{

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    protected void increaseQuality() {
        if (this.quality < 50)
            this.quality = this.quality +1;
    }

    protected void decreaseQuality() {
        if (quality > 0)
            this.quality = this.quality -1;
    }

    protected void NormalUpdate()
    {
        decreaseQuality();
    }


    protected void updateSellIn() {
        this.sellIn = this.sellIn -1;
    }

    protected void updateIfSellInNegative()
    {
            decreaseQuality();
    }


    public void updateQuality()
    {
        NormalUpdate();
        updateSellIn();
        if(this.sellIn < 0)
            updateIfSellInNegative();
    }



}
