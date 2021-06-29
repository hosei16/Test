package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.Radio;
import objectAdventure.rooms.NormalRoom;

public class Room20 extends NormalRoom {


    @Override
    public String getRoomAuthor() {
        return "Jeremy Hunat";
    }

    /**
     *
     */
    public Room20() {
        super(20);

        super.setDescription("This is Room 20");

        super.itemList.add(new Radio());
    }
}
