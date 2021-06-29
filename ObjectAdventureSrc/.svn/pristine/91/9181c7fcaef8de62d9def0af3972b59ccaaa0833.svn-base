package objectAdventure;

import static java.lang.System.out;
import objectAdventure.structure.Direction;
import objectAdventure.structure.GameController;

/**
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! NOTICE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * This will be converted to a "Chain of Responsibility Pattern" by invoking: 
 * ItemInteraction, CreatureInteraction, PlayerInteraction, and RoomInteraction.
 * 
 * Aside from Directions, all commands are two words (verb noun).
 *
 * @author Adam J. Conover.
 */
public class CommandProcessor {

    static void processCommand(String inputLine, GameController controller) throws UnknownCommandException {
        if (inputLine.startsWith("?") || inputLine.contains("HELP")) {
            System.out.println("Commands (so far):");
            System.out.println("SHOW ITEMS");
            System.out.println("SHOW ROOM");
            System.out.println("SHOW INVENTORY");
            System.out.println("GET ALL");
            System.out.println("GROP ALL");
            return;
        }

        // Process single character input.
        if (inputLine.length() == 1) {
            Character inputChar = inputLine.charAt(0);
            if (Direction.getAbbreviationList().contains(inputChar)) {
                // Get the Direction object from the user's input.
                Direction.fromLexeme(inputLine).ifPresentOrElse(
                        d -> controller.movePlayer(d),
                        () -> out.println("Not a valid direction"));
            }
        } else {
            // TEMPORARY COMMANDS BEFORE BEING BROKEN OFF INTO A BETTER COMMAND PROCESSOR USING A
            // CHAIN OF RESPONSIBILITY.

            // Split on the space.
            String[] command = inputLine.split("\\s+");
            if (command.length < 2) {
                throw new UnknownCommandException("Unknown Command: " + inputLine);
            }

            // Break apart the command, assuming "noun verb" format
            String verb = command[0];
            String noun = command[1];

            // TODO: Again... This is a TEMPORARY solution!!!
            switch (verb) {
                case "SHOW":
                    switch (noun) {
                        case "ITEMS":
                            System.out.println("You see:");
                            System.out.println(controller.getItemDescriptions());
                            break;
                        case "ROOM":
                            System.out.println(controller.getRoomDecription());
                            break;
                        case "INV":
                        case "INVENTORY":
                            System.out.println(controller.getPlayerInventoryDescription());
                            break;

                        default:
                            throw new UnknownCommandException(
                                    String.format("I don't see any %s to inspect.", noun));
                    }
                    break;

                case "GET":
                    switch (noun) {
                        case "ALL":
                            controller.takeAllItemsFromRoom();
                            break;
                        default:
                            throw new UnknownCommandException(String.format("I can't get: %s", noun));
                    }
                    break;

                case "DROP":
                    switch (noun) {
                        case "ALL":
                            controller.dropAllItemsToRoom();
                            break;
                        default:
                            throw new UnknownCommandException(String.format("I can't drop: %s", noun));
                    }
                    break;
            }

            controller.incMoveNumber();
        }
    }

    /**
     * Simple exception for Unknown Commands.
     */
    public static class UnknownCommandException extends RuntimeException {

        public UnknownCommandException(String inputLine) {
            super(inputLine);
        }
    }
}
