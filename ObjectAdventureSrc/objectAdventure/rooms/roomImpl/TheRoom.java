package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.Knightpic;

import objectAdventure.rooms.NormalRoom;




public class TheRoom extends NormalRoom {
    private static final int Room_ID = 22;
    
    @Override 
   public String getRoomAuthor () {
    return "Joshua Shevitz";
} 
   public TheRoom() {
   super(Room_ID);
   
   super.setDescription("The room is a 20 by 30 foot room that feels damp with dew in the air "
           + " and smells like a forest in the early morning. "
           + "there is a picture hanging on the east wall. "
           + "there is a door along the North, West and South walls.");
   
   super.itemList.add(new Knightpic());
   }
   
}
