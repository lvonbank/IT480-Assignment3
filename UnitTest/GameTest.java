package UnitTest;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import CoffeeMaker.Game;

public class GameTest {

	// Tests that check the Game
	@Test
	public void gameWin() {
		PlayerMock p = new PlayerMock();
		p.setDrink(true);
		Game g = new Game(p, new HouseMock());
		input();
		assertEquals(0,g.run());
	}
	@Test
	public void gameLose() {
		Game g = new Game(new PlayerMock(), new HouseMock());
		input();
		assertEquals(1,g.run());
	}
	
	// Gives console input to the program
	private void input(){
		ByteArrayInputStream in = new ByteArrayInputStream("D".getBytes());
		System.setIn(in);
	}
}
