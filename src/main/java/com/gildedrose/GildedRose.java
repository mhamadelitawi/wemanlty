package com.gildedrose;

import java.util.Locale;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public static NormalItem convertToNormalItem(Item item)
    {
        String name = item.name.toLowerCase();
        if(name.contains("sulfuras"))
            return new Sulfuras(item.name, item.sellIn, item.quality);

        if(name.contains("aged brie"))
            return new AgedBrie(item.name, item.sellIn, item.quality);

        if(name.contains("backstage passes"))
            return new BackStagePasses(item.name, item.sellIn, item.quality);

        if(name.contains("conjured"))
            return new Conjured(item.name, item.sellIn, item.quality);

        return new NormalItem(item.name, item.sellIn, item.quality);
    }

    public void updateItemByNormalItem(Item item ,  NormalItem normalItem)
    {
        item.quality = normalItem.quality;
        item.sellIn = normalItem.sellIn;
    }

    public void updateQuality() {
        for (Item item : items) {

            NormalItem normalItem = GildedRose.convertToNormalItem(item);
            normalItem.updateQuality();
            updateItemByNormalItem(item ,  normalItem   );


        }
    }




    public void increaseItemQuality(Item item) {
        if (item.quality < 50)
            item.quality = item.quality + 1;
    }

    public void decreaseItemQuality(Item item) {
        if (item.quality > 0)
            item.quality = item.quality - 1;
    }


    public void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }


}
