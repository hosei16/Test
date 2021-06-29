/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.items.itemImpl.Projector;
import objectAdventure.rooms.NormalRoom;
import objectAdventure.creatures.creatureImpl.BlackPanther;

/**
 *
 * @author Olashupo Ajala
 */
public class TechRoom extends NormalRoom {
   private static final int ROOM_ID = 28;
   BlackPanther currentBlackPanther;
   String creaturesDescription;
    
    @Override
    public String getRoomAuthor() {
        return "Olashupo. S Ajala";
    }

    /**
     * Default Constructor
     */
    public TechRoom() {
        super(ROOM_ID);
        super.setDescription("A device with a low emmission of light rays used "
		              + "for better propagation of images "
		              + "with unrestricted amount of size."+currentBlackPanther.getCreaturesDescription());
        super.itemList.add(new Projector());
        
        currentBlackPanther = new BlackPanther();
        creaturesDescription = currentBlackPanther.getCreaturesDescription();
        
    }
    public String getCreaturesDescription(){
        return currentBlackPanther.getCreaturesDescription();
    }
}




