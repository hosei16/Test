package objectAdventure.structure;

import static java.lang.System.out;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;
import objectAdventure.creatures.DefaultPlayer;
import objectAdventure.items.Item;
import objectAdventure.rooms.Configuration_RoomList;
import objectAdventure.rooms.NoSuchRoomException;
import objectAdventure.rooms.Room;

/**
 * All of the "State Changes" of the game are routed through this class.
 *
 * @author Adam J. Conover, COSC436
 */
public class GameController {

    private final GameMap gameMap;
    private final Configuration_RoomList rooms;
    private final DefaultPlayer player;
    private int moveNumber;

    /**
     *
     * @param playerName The name of the player for use with this game controller.
     */
    public GameController(String playerName) {
        this.gameMap = GameMap.getMap();
        this.rooms = new Configuration_RoomList();
        this.player = new DefaultPlayer(playerName);
        this.player.setCurrentRoom(0);
        this.moveNumber = 1;
    }

    /**
     *
     * @return the Description of the room
     */
    public String getRoomDecription() {
        return getRoomDecription(getPlayer().getCurrentRoomId());
    }

    /**
     *
     * @param roomId the room to describe
     *
     * @return the description of the room
     */
    public String getRoomDecription(Integer roomId) {
        try {
            var theRoom = rooms.getRoom(roomId);
            var roomDescription = new StringBuilder();

            // Build room description.
            roomDescription.append(theRoom.getDescription()).append('\n');

            // Show the exists from the room
            roomDescription.append("You can see the exits to the: ");

            // Creates a comma delimied list of the exists 
            var directionList = gameMap.getExitConnections(roomId)
                    .keySet()
                    .stream()
                    .map(x -> x.toString())
                    .collect(joining(", "));

            roomDescription.append(directionList);

            return roomDescription.toString();
        } catch (NoSuchRoomException ex) {
            return ex.getMessage();
        }
    }

    /**
     * Increment the move number with every applicable move
     */
    public void incMoveNumber() {
        moveNumber++;
    }

    /**
     * Item descriptions for current room if room is not specified.
     */
    public String getItemDescriptions() {
        try {
            return getItemDescriptions(rooms.getRoom(getPlayer().getCurrentRoomId()));
        } catch (NoSuchRoomException e) {
            return "No items in a non-existant room.";
        }
    }

    /**
     * Player Inventory String.
     *
     * @return a comma delimited list of player inventory items.
     */
    public String getPlayerInventoryDescription() {
        List<Item> inv = player.getInventory();

        if (inv.size() > 0) {
            return inv.stream().map(Item::getItemDescription).collect(Collectors.joining(", "));
        } else {
            return "You are empty handed.";
        }
    }

    /**
     * Gets the item descriptions.
     *
     * @param theRoom the room with the items.
     * @return a string containing the item descriptions.
     */
    public String getItemDescriptions(Room theRoom) {
        StringBuilder roomDescription = new StringBuilder();

        // Add items to the description if they exist.
        if (!theRoom.getItems().isEmpty()) {
            theRoom.getItems().forEach(theItem
                    -> roomDescription.append(MessageFormat.format("\t{0}\n", theItem.getItemDescription()))
            );
        } else {
            roomDescription.append("\tNothing of interest.");
        }

        return roomDescription.toString();
    }

    /**
     *
     * @param dir The direction to move the player.
     */
    public void movePlayer(Direction dir) {
        Integer currentRoom = getPlayer().getCurrentRoomId();
        var exits = this.gameMap.getExitConnections(currentRoom);

        if (!exits.containsKey(dir)) {
            out.printf("Ouch... you ran right into a wall! (There is no exit to the %s.)\n", dir.toString());
        } else {
            final var newRoomId = exits.get(dir);
            if (gameMap.doesExist(newRoomId)) {
                getPlayer().setCurrentRoom(newRoomId);
            } else {
                out.printf(
                        "Sorry, A route to this room does not yet exist. "
                        + "The Game Map may need to be updated\n");
            }
        }

        incMoveNumber();
    }

    /**
     * Get a list of just the exit directions.
     *
     * @return a list of Direction Instances.
     */
    public List<Direction> getExitDirections() {
        var directionSet = GameMap.getMap()
                .getExitConnections(player.getCurrentRoomId())
                .keySet();

        return new ArrayList<>(directionSet);
    }

    /**
     * @return the player object
     */
    public DefaultPlayer getPlayer() {
        return player;
    }

    /**
     *
     * @return the current move number
     */
    public int getMoveNumber() {
        return moveNumber;
    }

    /**
     *
     * @param moveNumber sets the current move number
     */
    protected void setMoveNumber(int moveNumber) {
        this.moveNumber = moveNumber;
    }

    /**
     * TODO: Temporary pick up all items that are allowed to be obtaained. This is just a temporary
     * method to get the first item from the room.
     *
     * @return true if items were obtainable, false otherwise.
     */
    public boolean takeAllItemsFromRoom() {
        var room = rooms.getRoom(getPlayer().getCurrentRoomId());

        Set<Item> items = room.getItems().stream()
                .filter(Item::isTransferable)
                .collect(Collectors.toSet());

        // The room has an ite,
        for (var item : items) {
            player.addToInventory(item);
            room.removeItem(item);
        }

        return items.size() > 0;
    }

    /**
     * TODO: Temporary pick up all items that are allowed to be obtainable. This is just a temporary
     * method to get the first item from the room.
     *
     * @return true if items were dropable, false otherwise.
     */
    public boolean dropAllItemsToRoom() {
        var room = rooms.getRoom(getPlayer().getCurrentRoomId());

        Set<Item> items = player.getInventory().stream()
                .filter(Item::isTransferable)
                .collect(Collectors.toSet());

        // The room has an ite,
        for (var item : items) {
            player.removeFromInventory(item);
            room.addItem(item);
        }

        return items.size() > 0;
    }

    /**
     * This is really only for debugging purposes, so we can jump to any room. However, it could be
     * repurposed to allow teleportation... for example.
     *
     * @param roomId the new "current room" of the player.
     */
    public void DEBUG_JumpToRoom(Integer roomId) {
        getPlayer().setCurrentRoom(roomId);
    }

    /**
     * @return Debugging player info
     */
    public String getPlayerInfo() {
        return player.toString();
    }

    /**
     * @return Debugging Room Info
     */
    public String getRoomInfo() {
        try {
            var theRoom = rooms.getRoom(getPlayer().getCurrentRoomId());
            var roomDescription = new StringBuilder();

            roomDescription.append("Room ID: ")
                    .append(theRoom.getRoomId())
                    .append(", Room Author: ")
                    .append(theRoom.getRoomAuthor());

            return roomDescription.toString();

        } catch (NoSuchRoomException ex) {
            return ex.getMessage();
        }
    }

}
