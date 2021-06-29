
package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.Rainbow;
import objectAdventure.rooms.NormalRoom;

public class Room27 extends NormalRoom{

    @Override
    public String getRoomAuthor() {

        return "Eniola Akinola";
    }

    public Room27() {
        // The room ID.
        super(27);

        //Description of the room
        super.setDescription("This has to be your happy place.");

        //Room Item
        super.itemList.add(new Rainbow());
    }


}
