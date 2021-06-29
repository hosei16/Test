/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.items.itemImpl.ToiletPaper;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author dewbabyo
 */
public class Room_14 extends NormalRoom{
    @Override
    public String getRoomAuthor(){
    return("Henry Osei");
    }

    /**
     *
     */
    public Room_14(){
    //The room id
        super(14);
        super.setDescription("This is the most exquisit room in which you will enter");
        super.itemList.add(new ToiletPaper());

}
}