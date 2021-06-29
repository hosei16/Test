package objectAdventure.items.itemImpl;

import objectAdventure.items.Item;

import objectAdventure.items.ItemInteraction;

public class Knightpic implements Item {
    @Override 
    public String getItemDescription () {   
        return "a picture of a knight. He's wearing a Bucket helmet "
                + "with what appear to be deer antlers sticking out "
                + "of the top.  Words over his head read 'we are no "
                + "longer the knights who say NI!'";
    }    
}