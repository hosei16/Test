/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.Meteorite;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author Xiao Luo
 */
public class Room3 extends NormalRoom{
    public Room3(){
        super(3);
        this.setDescription("Seems empty ... save for a small rock.");
        itemList.add(new Meteorite());
    }

    @Override
    public String getRoomAuthor() {
        return "Xiao Luo";
    }

}