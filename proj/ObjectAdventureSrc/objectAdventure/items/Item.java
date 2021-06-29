package objectAdventure.items;

import java.util.Collections;
import java.util.List;

/**
 * This is mainly just a placeholder for the moment, but items will have "functionality" in the
 * future.
 *
 * @author Adam J. Conover, COSC436
 */
public interface Item {

    /**
     * Generate the description of an item.
     *
     * @return A simple item description
     */
    public String getItemDescription();

    /**
     * Can the item be picked up and relocated.
     *
     * @return return true if the item can be moved.
     */
    public default boolean isTransferable() {
        return false;
    }

    /**
     * Short Names lists for use in picking up and removing items.
     *
     * @return A list containing the aliases (short names) for an item.
     */
    public default List<String> getAliasList() {
        return Collections.unmodifiableList(List.of());
    }
}
