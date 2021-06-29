package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.GameInstructions;
import objectAdventure.rooms.NormalRoom;

/**
 * A room for testing purposes.
 *
 * @author Adam J. Conover, COSC436
 */
public class SecretTestingRoom extends NormalRoom {

    private static final int ROOM_ID = 99;
    private static final String desc
            = "This is just a room for testing. "
            + "Nothing to see Here.";


    /**
     * Default Constructor
     */
    public SecretTestingRoom() {
        super(ROOM_ID);
        super.setDescription(desc);
        super.itemList.add(new GameInstructions());
    }
    
    @Override
    public String getRoomAuthor() {
        return "Adam J. Conover";
    }

}
