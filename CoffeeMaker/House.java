package CoffeeMaker;
 
public class House 
{ 
  private int _numRooms = 6;
  private Room[] _rooms = new Room[_numRooms];
  private int _currentRoom = 0;
   
  public House() {
    generateRooms();
  }
   
  public String getCurrentRoomInfo() {
    return _rooms[_currentRoom].getDescription();
  }
  
  private void moveValid() {
	String error = "There is no door in that direction!";
    if (_currentRoom < 0){
      _currentRoom = 0;
      System.out.println(error);
    }
    else if (_currentRoom >= _numRooms){
      _currentRoom = _numRooms-1;
      System.out.println(error);
    }
  }
  
  public void moveNorth() {
    _currentRoom += 1;
    moveValid();
  }
   
  public void moveSouth() {
    _currentRoom -= 1;
    moveValid();
  }
  
  public void look(Player player) {
    Room room = _rooms[_currentRoom];
    if (room.hasItem()) {
      System.out.println("There might be something here...");
      if (room.hasCoffee()) {
        player.getCoffee();
      }
      if (room.hasCream()) {
        player.getCream();
      }
      if (room.hasSugar()) {
        player.getSugar();
      }
    } else {
      System.out.println("You don't see anything out of the ordinary.");
    }
  }
  
  private void generateRooms() {
    boolean northDoor = true;
    boolean southDoor = true;
    boolean hasCoffee = false;
    boolean hasCream = false;
    boolean hasSugar = false;
     
    for (int j = 0; j < _numRooms; j++) {
      if (j == 0) hasCream = true; else hasCream = false;
      if (j == 2) hasCoffee = true; else hasCoffee = false;
      if (j == _numRooms - 1) hasSugar = true; else { hasSugar = false;}
      if (j == 0) southDoor = false; else southDoor = true;
      if (j == _numRooms - 1) northDoor = false; else { northDoor = true;}
      _rooms[j] = new Room(hasCoffee, hasCream, hasSugar, northDoor, southDoor);
    }
  }
}
