package com.gildedrose;

import java.util.Locale;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public static NormalItem convertToNormalItem(Item item)
    {
        if(item.name.toLowerCase().contains("sulfuras"))
            return new Sulfuras(item.name, item.sellIn, item.quality);

        if(item.name.toLowerCase().contains("aged brie"))
            return new AgedBrie(item.name, item.sellIn, item.quality);

        if(item.name.toLowerCase().contains("backstage passes"))
            return new BackStagePasses(item.name, item.sellIn, item.quality);

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


//            if(item.name.equals("Sulfuras, Hand of Ragnaros"))
//                continue;
//
//            if (item.name.equals("Aged Brie")) {
//                increaseItemQuality(item);
//                decreaseSellIn(item);
//                if (item.sellIn < 0)
//                    increaseItemQuality(item);
//                continue;
//            }

          //  if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                increaseItemQuality(item);
//                if (item.sellIn < 11)
//                    increaseItemQuality(item);
//                if (item.sellIn < 6)
//                    increaseItemQuality(item);
//
//                decreaseSellIn(item);
//
//                if (item.sellIn < 0)
//                    item.quality = 0;
//                continue;
        //    }

//            decreaseItemQuality(item);
//            decreaseSellIn(item);
//            if (item.sellIn < 0)
//                decreaseItemQuality(item);

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
