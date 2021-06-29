package objectAdventure.rooms;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import objectAdventure.rooms.roomImpl.*;

/**
 *
 * @author Adam J. Conover, COSC436
 */
public class Configuration_RoomList {

    private static final Logger LOG = Logger.getLogger(Configuration_RoomList.class.getName());

    private final Map<Integer, Room> roomList = new TreeMap<>();

    /**
     * Constructor to init all rooms
     */
    public Configuration_RoomList() {
        initRooms();
    }

    /**
     *
     * @param roomId the ID of the room to retrieve.
     *
     * @return The room object from the ID.
     * @throws NoSuchRoomException thrown if the room does not exist.
     */
    public Room getRoom(int roomId) throws NoSuchRoomException {

        final var room = roomList.get(roomId);
        if (room == null) {
            throw new NoSuchRoomException(roomId);
        } else {
            return room;
        }
    }

    /**
     * Add a Room Object to the map.
     *
     * @param room The room object being added to the map.
     */
    private void addRoom(Room room) {
        Integer roomId = room.getRoomId();

        if (roomId == null) {
            System.err.printf("Cannot add room %d. It has no ID!!!", roomId);
        } else {
            roomList.put(roomId, room);
            LOG.log(Level.CONFIG, "Added room {0}: {1}", new Object[]{roomId, room});
        }
    }


    /* ***************************************************************************** */
    // TODO: Add your room here once complete.
    private void initRooms() {
        addRoom(new StartRoom());
        addRoom(new EchoRoom());
        addRoom(new Room2());
        addRoom(new Room3());
        addRoom(new SecretTestingRoom());
        addRoom(new BoomBoomRoom());
        addRoom(new Room9());              
        addRoom(new ArtifactRoom());
       // addRoom(new SuperAwesomeRoomFive());
        addRoom(new RoomThirteen());      
        addRoom(new Room17());  
        addRoom(new Room20());  
        addRoom(new Room21());
        addRoom(new TheRoom());
        addRoom(new Room26());
        addRoom(new Room16());
        addRoom(new Room23());
        addRoom(new Room19());
        addRoom(new Room_31());
	 addRoom(new Room28());
        addRoom(new HauntedRoom());
        addRoom(new Program1());
        addRoom(new room4());
    }
}
