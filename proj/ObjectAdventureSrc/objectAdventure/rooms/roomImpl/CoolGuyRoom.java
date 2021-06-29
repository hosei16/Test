package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;
import objectAdventure.items.itemImpl.Sunglasses;

public class CoolGuyRoom extends NormalRoom {
    /**
     * Constructor for just a normal room. (Other types of rooms may exist: secret, etc.)
     *
     * @param roomId the numeric ID of the room.
     */
    public CoolGuyRoom() {
        super(27);

        super.setDescription("There's a guy already in this room... a cool guy..");

        super.itemList.add(new Sunglasses());
    }

    @Override
    public String getRoomAuthor() {
        return "Kwabena Ampofo";
    }
}
