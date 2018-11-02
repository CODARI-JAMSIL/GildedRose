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
  Item[] items= new Item[]{};
  
  GildedRose gildedRose= new GildedRose(items);
  
  assertNotNull(gildedRose);
 }
 
 @Test
 public void Normal아이템_판매기간0_품질0_테스트() {
  Item[] items= new Item[]{new Item(NORMAL_ITEM, 0, 0)};
  GildedRose gildedRose= new GildedRose(items);
  
  gildedRose.updateQuality();
  
  assertEquals(NORMAL_ITEM, items[0].name);
  assertEquals(-1, items[0].sellIn);
  assertEquals(0, items[0].quality);
 }
 
 @Test
 public void Normal아이템_판매기간0_품질5_테스트() {
  Item[] items= new Item[]{new Item(NORMAL_ITEM, 0, 5)};
  GildedRose gildedRose= new GildedRose(items);
  
  gildedRose.updateQuality();
  
  assertEquals(NORMAL_ITEM, items[0].name);
  assertEquals(-1, items[0].sellIn);
  assertEquals(3, items[0].quality);
 }
 
 @Test
 public void Sulfuras아이템_판매기간0_품질5_테스트() {
  Item[] items= new Item[]{new Item(SULFURAS, 0, 5)};
  GildedRose gildedRose= new GildedRose(items);
  
  gildedRose.updateQuality();
  
  assertEquals(SULFURAS, items[0].name);
  assertEquals(0, items[0].sellIn);
  assertEquals(5, items[0].quality);
 }
 
 @Test
 public void AgedBrie아이템_판매기간0_품질0_테스트() {
  Item[] items= new Item[]{new Item(AGED_BRIE, 0, 0)};  
  GildedRose gildedRose= new GildedRose(items);
  
  gildedRose.updateQuality();
  
  assertEquals(AGED_BRIE, items[0].name);
  assertEquals(-1, items[0].sellIn);
  assertEquals(2, items[0].quality);
 }
 
 @Test
 public void BackstagePass아이템_판매기간0_품질0_테스트() {
	 // 같이 해보기
 }
 
 @Test
 public void BackstagePass아이템_판매기간0_품질51_테스트() {
	 
 }
 
 @Test
 public void BackstagePass아이템_판매기간15_품질0_테스트() {
	 
 }
 
 @Test
 public void Sulfuras아이템_판매기간1_품질5_테스트() {
	 
 }
 
 @Test
 public void AgedBrie아이템_판매기간0_품질55_테스트() {
	 
 }
 
 @Test
 public void BackstagePass아이템_판매기간0_품질49_테스트() {
	 
 }
 
 @Test
 public void GildedRose_Item_toString_테스트() {
  Item[] items= new Item[]{new Item(NORMAL_ITEM, 0, 0)};  
  GildedRose gildedRose= new GildedRose(items);
  
  String toString= items[0].toString();
  
  assertEquals("Normal Item, 0, 0", toString);
 }
}