package objectAdventure;

import java.util.Scanner;
import java.util.stream.Collectors;
import objectAdventure.structure.Direction;
import objectAdventure.structure.GameController;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * NOTE: The main Entry point to the program... More responsibility will be delegated to the rooms
 * and a separate command processor in a future iteration.
 *
 * @author Adam J. Conover, COSC436
 */
public class Main {

    /**
     * Main Method for game.
     * @param args Not Used
     */
    public static void main(String[] args) {
        var input = new Scanner(in);
        var controller = new GameController("Developer");

        displayGameState(controller);
        userInputLoop(controller, input);
    }

    /**
     * The main user input loop. This will eventually be refactored into a more universal "Command
     * processor". But for now, we are only dealing with movement, so the input is only compass
     * directions.
     *
     * @param controller The game controller used for the input loop.
     * @param input The Scanner source for the input.
     */
    private static void userInputLoop(GameController controller, Scanner input) {
        String inputLine;
        int currentRoomId = Integer.MIN_VALUE;
        
        do {
            // Show the room decription only on room changes.
            if (controller.getPlayer().getCurrentRoomId() != currentRoomId) {
                System.out.println(controller.getRoomDecription());
                currentRoomId = controller.getPlayer().getCurrentRoomId();
            }
            
            
            // Prompt the user.
            displayUserPrompt(controller);
            inputLine = input.nextLine().trim().toUpperCase();

            // Break out of the loop if the user is a quitter.
            if (inputLine.equals("Q")) {
                break;
            }

            // Process the Command.
            try {
                CommandProcessor.processCommand(inputLine, controller);
            } catch (CommandProcessor.UnknownCommandException ex) {
                System.out.printf("Command error %s\n", ex.getMessage());
            }

            // Finally, Display the current state of the game.
            System.out.println();
            displayGameState(controller);

        } while (!inputLine.equals("Q"));
    }

    /**
     * Display The user Prompt.
     *
     * @param controller The game controller.
     */
    static void displayUserPrompt(GameController controller) {
        // Build a string of the available exit directions.
        String exitDirections = controller
                .getExitDirections().stream()
                .map(Direction::getAbbreviation).map(String::valueOf)
                .collect(Collectors.joining(", "));

        // Display the user prompt
        out.printf("[%02d] Enter %s, or Q: ", controller.getMoveNumber(), exitDirections);
    }

    /**
     * Display the current info for the room and player.
     *
     * @param controller The game controller containing the game state information,
     */
    static void displayGameState(GameController controller) {
        out.println("DEBUG: " + controller.getRoomInfo());
        out.println("DEBUG: " + controller.getPlayerInfo());
        out.println();
    }
}
