package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.Katana;
import objectAdventure.rooms.NormalRoom;

public class Room19 extends NormalRoom{

    @Override
    public String getRoomAuthor() {

        return "Rene Walcott-Taylor";
    }

    public Room19() {
        // The room ID.
        super(19);

        //Description of the room
        super.setDescription("At the center of the room lays a Katana which was once heald by a great samurai warrior.");

        //Room Item
        super.itemList.add(new Katana());
    }


}