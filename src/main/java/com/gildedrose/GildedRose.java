package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Aged Brie")  && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                 decreaseItemQuality(item);
            }

            else {
                    increaseItemQuality(item);
                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.sellIn < 11)
                                increaseItemQuality(item);
                        if (item.sellIn < 6)
                                increaseItemQuality(item);
                    }

            }

                decreaseSellIn( item);


            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                                decreaseItemQuality(item);
                    } else
                        item.quality = 0;

                } else
                        increaseItemQuality(item);
            }
        }
    }

    public Boolean checkIfSulfuras(Item item)
    {
        return  (item.name.equals("Sulfuras, Hand of Ragnaros"));
    }


    public void increaseItemQuality(Item item)
    {
        if(item.quality < 50)
            item.quality = item.quality + 1;
    }

    public void decreaseItemQuality(Item item)
    {
        if(checkIfSulfuras(item)) return;

            if(item.quality > 0 )
            item.quality = item.quality -1;
    }


    public void decreaseSellIn(Item item)
    {
        if(checkIfSulfuras(item)) return;

        item.sellIn = item.sellIn -1;
    }


}
