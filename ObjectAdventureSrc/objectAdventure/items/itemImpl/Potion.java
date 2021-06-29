package objectAdventure.items.itemImpl;

import objectAdventure.items.Item;

/**
*
* @author Caroline Eilman
*/

public class Potion implements Item {
    @Override
    public String getItemDescription() {
        return "A glass bottle with a strange silver liquid inside. It looks like you could drink it.";
    }
}