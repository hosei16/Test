package objectAdventure.rooms;

import java.util.List;
import objectAdventure.items.Item;

/**
 * A general Interface to all rooms.
 *
 * @author Adam J. Conover, COSC436
 */
public interface Room {

    /**
     * Gets the room author information.
     * 
     * @return The Author of the room
     */
    public default String getRoomAuthor() {
        return "The author wishes to remain anonymous.";
    }

    /**
     * gets a description of the room.
     * @return Description of the room
     */
    public default String getDescription() {
        return "This room does not yet have a description.";
    }

    /**
     *
     * @return the Assigned ID of the room.
     */
    public Integer getRoomId();

    /**
     *
     * @return A list of any items found in the room
     */
    public List<Item> getItems();

    /**
     * Add a single item to the room.
     *
     * @param item The item to add to the room.
     */
    public void addItem(Item item);

    /**
     * Remove a single item from the room.
     *
     * @param item The item to add to the room.
     * @return true if the item was successfully removed from the room, false otherwise.
     */
    public boolean removeItem(Item item);
}
