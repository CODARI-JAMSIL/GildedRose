package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

	@Test
	public void test() {

		Item[] items = new Item[] {};
		GildedRose gildedRose = new GildedRose(items );
		
		gildedRose.updateQuality();
		
		assertEquals(0, items.length);
		
	}

}
