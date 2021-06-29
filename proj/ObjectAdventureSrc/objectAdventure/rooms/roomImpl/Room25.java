package objectAdventure.rooms.roomImpl;
import objectAdventure.rooms.NormalRoom;
import objectAdventure.items.itemImpl.GlowingBook;

/**
 *
 * @author ehimareuiyoshioria
 */
public class Room25 extends NormalRoom {
     @Override
    public String getRoomAuthor(){
        return("Ehimare Uiyoshioria");
    }
        public Room25(){
    super(25);
    super.setDescription("You walk out into a forest and see a huge cathedral infront of you. You also see a glowing book on the ground");
    super.itemList.add(new GlowingBook());
    }


}