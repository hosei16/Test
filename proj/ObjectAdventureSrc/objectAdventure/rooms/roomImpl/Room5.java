/**
 *
 * @author Shiraz Binyamin
 */

package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.Pancake;
import objectAdventure.rooms.NormalRoom;

public class Room5 extends NormalRoom{
   public Room5(){
        super(5);
        super.setDescription("There is a fluffy pancake in the corner!");
        itemList.add(new Pancake());
    }

    @Override
    public String getRoomAuthor() {
        return "Shiraz Binyamin";
    }

}