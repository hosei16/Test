package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;
import objectAdventure.items.itemImpl.MrFusion;
/**
 *  Test trunk change while editing branch
 *  Test branch change then merging back to trunk
 * @author David Leksen
 */
public class Room2 extends NormalRoom {

    @Override
    public String getRoomAuthor() {
        return "David Leksen";
    }

    public Room2() {
        super(2);
        super.setDescription("Workshop with various parts and tools for new inventions.");
        super.itemList.add(new MrFusion());

    }
}

