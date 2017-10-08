package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import CoffeeMaker.Room;

public class RoomTest {

	// Tests that check the Room
	@Test
	public void roomHasItemAllFalse() {
		Room testRoom = new Room(false,false,false,false,false);
		assertFalse(testRoom.hasItem());
	}
	@Test
	public void roomHasItemCoffeeTrue() {
		Room testRoom = new Room(true,false,false,false,false);
		assertTrue(testRoom.hasItem());
	}
	@Test
	public void roomHasItemCreamTrue() {
		Room testRoom = new Room(false,true,false,false,false);
		assertTrue(testRoom.hasItem());
	}
	@Test
	public void roomHasItemSugarTrue() {
		Room testRoom = new Room(false,false,true,false,false);
		assertTrue(testRoom.hasItem());
	}
	@Test
	public void roomHasItemAllTrue() {
		Room testRoom = new Room(true,true,true,false,false);
		assertTrue(testRoom.hasItem());
	}
	@Test
	public void roomHasSugerTrue() {
		Room testRoom = new Room(false,false,true,false,false);
		assertTrue(testRoom.hasSugar());
	}
	@Test
	public void roomHasCreamTrue() {
		Room testRoom = new Room(false,true,false,false,false);
		assertTrue(testRoom.hasCream());
	}
	@Test
	public void roomHasCoffeeTrue() {
		Room testRoom = new Room(true,false,false,false,false);
		assertTrue(testRoom.hasCoffee());
	}
	@Test
	public void roomNorthTrue() {
		Room testRoom = new Room(false,false,false,true,false);
		assertTrue(testRoom.northExit());
	}
	@Test
	public void roomNorthFalse() {
		Room testRoom = new Room(false,false,false,false,false);
		assertFalse(testRoom.northExit());
	}
	@Test
	public void roomSouthTrue() {
		Room testRoom = new Room(false,false,false,false,true);
		assertTrue(testRoom.southExit());
	}
	@Test
	public void roomSouthFalse() {
		Room testRoom = new Room(false,false,false,false,false);
		assertFalse(testRoom.southExit());
	}
	@Test
	public void roomGetDescription() {
		Room testRoom = new Room(false,false,false,false,false);
		assertNotNull(testRoom.getDescription());
	}
}
