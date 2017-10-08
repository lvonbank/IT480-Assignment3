package UnitTest;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

import CoffeeMaker.House;

public class HouseTest {

	// Tests that check the House
	@Test
	public void houseGetCurrentRoomInfo() {
		House h = new House();
		assertNotNull(h.getCurrentRoomInfo());
	}
	@Test
	public void houseCurrentRoomMoveNorth() {
		House h = new House();
		h.moveNorth();
		assertEquals(currentRoom(h),1);
	}
	@Test
	public void houseCurrentRoomMoveSouth() {
		House h = new House();
		h.moveSouth();
		assertEquals(currentRoom(h),0);
	}
	
	// Obtains the private instance variable "_currentRoom"
	private int currentRoom(House h) {
		try
		{
			Field f = h.getClass().getDeclaredField("_currentRoom");
			f.setAccessible(true);
			return f.getInt(h);
		} 
		catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) 
		{
			e.printStackTrace();
		}
		return -1;
	}
}
