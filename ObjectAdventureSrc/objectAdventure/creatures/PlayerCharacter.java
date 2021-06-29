package objectAdventure.creatures;

import java.util.List;
import objectAdventure.items.Item;

/**
 *
 * @author Adam J. Conover, COSC436
 */
public interface PlayerCharacter {

    /**
     * @param item item to add to inventory
     */
    void addToInventory(Item item);

    /**
     * @return the currentRoom
     */
    int getCurrentRoomId();

    /**
     * @return the inventory
     */
    List<Item> getInventory();

    /**
     * @return the playerName
     */
    String getPlayerName();

    /**
     * @param item item to remove from inventory.
     */
    void removeFromInventory(Item item);

    /**
     * @param currentRoom the currentRoom to set
     */
    void setCurrentRoom(int currentRoom);

}
