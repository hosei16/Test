package objectAdventure.rooms.roomImpl;
import objectAdventure.items.itemImpl.FlimsySword;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author Justin Byers, COSC436
 */
public class Room16 extends NormalRoom {

    @Override
    public String getRoomAuthor() {
        return "Justin Byers";
    }

    /**
     * Constructor for the room, it must be constructed with an ID!!!
     */
    public Room16() {
        // The room ID must be set.
        super(16);

        super.setDescription("An empty room with table in center and a sword on it.");
		        
        //Room Item
        super.itemList.add(new FlimsySword());
    }



}
