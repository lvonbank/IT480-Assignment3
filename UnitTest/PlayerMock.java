package UnitTest;

import CoffeeMaker.Player;

public class PlayerMock extends Player{
	
	private boolean _drink = false;
	
	public PlayerMock(){
	}
	
	public boolean drink(){
		return _drink;
	}
	
	public void setDrink(boolean drink){
		_drink = drink;
	}
}
