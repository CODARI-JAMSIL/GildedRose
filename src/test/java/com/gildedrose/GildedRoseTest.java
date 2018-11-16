package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

	public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	public static final String NORMAL_ITEM = "Normal Item";
	public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
	public static final String AGED_BRIE = "Aged Brie";

	@Test
	public void GildedRose_생성자_테스트() {

		// arrange (given)
		Item[] items = new Item[] {};

		// act (when)
		GildedRose gildedRose = new GildedRose(items);

		// assert (then)
		assertNotNull(gildedRose);
	}

	@Test
	public void Normal아이템_판매기간0_품질0_테스트() {

		// arrange (given)
		Item[] items = new Item[] { new Item(NORMAL_ITEM, 0, 0) };
		GildedRose gildedRose = new GildedRose(items);

		// act (when)
		gildedRose.updateQuality();

		// assert (then)
		assertEquals(NORMAL_ITEM, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void Normal아이템_판매기간0_품질5_테스트() {

		// arrange (given)
		Item[] items = new Item[] { new Item(NORMAL_ITEM, 0, 5) };
		GildedRose gildedRose = new GildedRose(items);

		// act (when)
		gildedRose.updateQuality();

		// assert (then)
		assertEquals(NORMAL_ITEM, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(3, items[0].quality);
	}

	@Test
	public void Sulfuras아이템_판매기간0_품질5_테스트() {

		// arrange (given)
		Item[] items = new Item[] { new Item(SULFURAS, 0, 5) };
		GildedRose gildedRose = new GildedRose(items);

		// act (when)
		gildedRose.updateQuality();

		// assert (then)
		assertEquals(SULFURAS, items[0].name);
		assertEquals(0, items[0].sellIn);
		assertEquals(5, items[0].quality);
	}

	@Test
	public void AgedBrie아이템_판매기간0_품질0_테스트() {

		// arrange (given)
		Item[] items = new Item[] { new Item(AGED_BRIE, 0, 0) };
		GildedRose gildedRose = new GildedRose(items);

		// act (when)
		gildedRose.updateQuality();

		// assert (then)
		assertEquals(AGED_BRIE, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(2, items[0].quality);
	}

	@Test
	public void BackstagePass아이템_판매기간0_품질0_테스트() {

		// arrange (given)
		Item[] items = new Item[] { new Item(BACKSTAGE_PASS, 0, 0) };
		GildedRose gildedRose = new GildedRose(items);

		// act (when)
		gildedRose.updateQuality();

		// assert (then)
		assertEquals(BACKSTAGE_PASS, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);

	}

	@Test
	public void BackstagePass아이템_판매기간0_품질51_테스트() {

		// 같이 해보기 1
		// arrange (given)
		Item[] items= new Item[] {new Item(BACKSTAGE_PASS, 0, 51) };
		GildedRose gildedRose= new GildedRose(items);
		
		
		// act (when)
		gildedRose.updateQuality();
		

		// assert (then)
		assertEquals(BACKSTAGE_PASS, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void BackstagePass아이템_판매기간15_품질0_테스트() {

		// 같이 해보기 1
		// arrange (given)
		Item[] items= new Item[] {new Item(BACKSTAGE_PASS, 15, 0) };
		GildedRose gildedRose= new GildedRose(items);
		
		
		// act (when)
		gildedRose.updateQuality();
		

		// assert (then)
		assertEquals(BACKSTAGE_PASS, items[0].name);
		assertEquals(14, items[0].sellIn);
		assertEquals(1, items[0].quality);
	}

	@Test
	public void Sulfuras아이템_판매기간_마이너스1_품질5_테스트() {

		// 같이 해보기 1
		// arrange (given)
		Item[] items= new Item[] {new Item(SULFURAS, -1, 5) };
		GildedRose gildedRose= new GildedRose(items);
		
		
		// act (when)
		gildedRose.updateQuality();
		

		// assert (then)
		assertEquals(SULFURAS, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(5, items[0].quality);
	} 

	@Test
	public void AgedBrie아이템_판매기간0_품질55_테스트() {

		// 같이 해보기 1
		// arrange (given)
		Item[] items= new Item[] {new Item(AGED_BRIE, 0, 55) };
		GildedRose gildedRose= new GildedRose(items);
		
		
		// act (when)
		gildedRose.updateQuality();
		

		// assert (then)
		assertEquals(AGED_BRIE, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(55, items[0].quality);

	}

	@Test
	public void BackstagePass아이템_판매기간0_품질49_테스트() {

		// arrange (given)
		Item[] items = new Item[] { new Item(BACKSTAGE_PASS, 0, 49) };
		GildedRose gildedRose = new GildedRose(items);

		// act (when)
		gildedRose.updateQuality();

		// assert (then)
		assertEquals(BACKSTAGE_PASS, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void AgedBrie아이템_판매기간2_품질0_테스트() {

		// arrange (given)
		Item[] items = new Item[] { new Item(AGED_BRIE, 2, 0) };
		GildedRose gildedRose = new GildedRose(items);

		// act (when)
		gildedRose.updateQuality();

		// assert (then)
		assertEquals(AGED_BRIE, items[0].name);
		assertEquals(1, items[0].sellIn);
		assertEquals(1, items[0].quality);
	}

	@Test
	public void Normal아이템_판매기간2_품질0_테스트() {

		// arrange (given)
		Item[] items = new Item[] { new Item(NORMAL_ITEM, 2, 0) };
		GildedRose gildedRose = new GildedRose(items);

		// act (when)
		gildedRose.updateQuality();

		// assert (then)
		assertEquals(NORMAL_ITEM, items[0].name);
		assertEquals(1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void GildedRose_Item_toString_테스트() {

		// arrange (given)
		Item[] items = new Item[] { new Item(NORMAL_ITEM, 0, 0) };
		GildedRose gildedRose = new GildedRose(items);

		// act (when)
		String toString = items[0].toString();

		// assert (then)
		assertEquals("Normal Item, 0, 0", toString);
	}
}