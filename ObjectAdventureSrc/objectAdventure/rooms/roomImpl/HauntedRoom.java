/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author Nathan
 */
public class HauntedRoom extends NormalRoom{
    
    public HauntedRoom() {
        super(1);

        super.setDescription("This room is haunted.");
    }


    @Override
    public String getRoomAuthor() {
        return "Nathan Cox";
    }
}
