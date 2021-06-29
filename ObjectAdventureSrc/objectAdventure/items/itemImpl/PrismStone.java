/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.items.itemImpl;
import objectAdventure.items.Item;
/**
 *
 * @author rriver10
 */
public class PrismStone implements Item{
    @Override
    public String getItemDescription(){
        return("A slightly heavy stone the size of a tennis ball emitting enough light to see 5 feet ahead of you. "
                + "You might find this useful in the near future.");
    }
}
