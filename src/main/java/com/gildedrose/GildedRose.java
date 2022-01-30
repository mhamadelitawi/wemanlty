package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            if(item.name.equals("Sulfuras, Hand of Ragnaros"))
                continue;

            if (item.name.equals("Aged Brie")) {
                increaseItemQuality(item);
                decreaseSellIn(item);
                if (item.sellIn < 0)
                    increaseItemQuality(item);
                continue;
            }

            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                increaseItemQuality(item);
                if (item.sellIn < 11)
                    increaseItemQuality(item);
                if (item.sellIn < 6)
                    increaseItemQuality(item);

                decreaseSellIn(item);

                if (item.sellIn < 0)
                    item.quality = 0;
                continue;
            }

            decreaseItemQuality(item);
            decreaseSellIn(item);
            if (item.sellIn < 0)
                decreaseItemQuality(item);

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
