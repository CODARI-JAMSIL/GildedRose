package com.gildedrose;

class GildedRose {
	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
	private static final String AGED_BRIE = "Aged Brie";
	static final int MAX_QUALITY = 50;
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			if (item.name.equals(AGED_BRIE)) {
				AgedBrieItem agedBrieItem= new AgedBrieItem(item);
				agedBrieItem.updateQuailityForAgedBrie();

			} else if (item.name.equals(BACKSTAGE_PASS)) {
				BackstagePassItem backstagePassItem= new BackstagePassItem(item);
				backstagePassItem.updateQualityForBackstagePass();

			} else if (item.name.equals(SULFURAS)) {
				SulfurasItem sulfurasItem= new SulfurasItem(item);
				sulfurasItem.updateQualityForSulfuras();
				
			} else {
				NormalItem normalItem= new NormalItem(item);
				normalItem.updateQualityForNormal();
			}

			if (item.name.equals(SULFURAS)) {
				//
			} else {
				item.sellIn = item.sellIn - 1;
			}
		}
	}
}