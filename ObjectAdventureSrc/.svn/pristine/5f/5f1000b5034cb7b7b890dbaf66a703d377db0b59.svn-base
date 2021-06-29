package objectAdventure.items.itemImpl;

import java.util.List;
import objectAdventure.items.Item;

public class GameInstructions implements Item {

     boolean isAnchored = false;
     
    /**
     * THIS IS JUST A SAMPLE.
     * 
     * @return The item description.
     */
    @Override
    public String getItemDescription() {
        return "A GameMap (Actual Image located at the root of the Game source folder).";
    }

    /** 
     * Item Can be picked up and moved.
     * 
     * @return  True
     */
    @Override
    public boolean isTransferable() {
        return !isAnchored;
    }

    @Override
    public List<String> getAliasList() {
        return List.of("Map","GameMap");               
    }

}
