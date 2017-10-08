package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import CoffeeMaker.Player;

public class PlayerTest {

	// Tests that check the Player
	@Test
	public void playerHasAllItemTrue() {
		Player testPlayer = new Player(true,true,true);
		assertTrue(testPlayer.hasAllItems());
	}
	@Test
	public void playerHasAllItemCoffeeTrue() {
		Player testPlayer = new Player(true,false,false);
		assertFalse(testPlayer.hasAllItems());
	}
	@Test
	public void playerHasAllItemCreamTrue() {
		Player testPlayer = new Player(false,true,false);
		assertFalse(testPlayer.hasAllItems());
	}
	@Test
	public void playerHasAllItemSugarTrue() {
		Player testPlayer = new Player(false,false,true);
		assertFalse(testPlayer.hasAllItems());
	}
	@Test
	public void playerDrinkFalse() {
		Player testPlayer = new Player();
		assertFalse(testPlayer.drink());
	}
	@Test
	public void playerDrinkTrue() {
		Player testPlayer = new Player(true,true,true);
		assertTrue(testPlayer.drink());
	}
	@Test
	public void playerDrinkCoffeeTrue() {
		Player testPlayer = new Player(true,false,false);
		assertFalse(testPlayer.drink());
	}
	@Test
	public void playerDrinkCreamTrue() {
		Player testPlayer = new Player(false,true,false);
		assertFalse(testPlayer.drink());
	}
	@Test
	public void playerDrinkSugarTrue() {
		Player testPlayer = new Player(false,false,true);
		assertFalse(testPlayer.drink());
	}
}
