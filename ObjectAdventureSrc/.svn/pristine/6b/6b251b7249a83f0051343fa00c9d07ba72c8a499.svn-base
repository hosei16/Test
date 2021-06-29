package objectAdventure.items;

/**
 * Nothing to do with this yet (Mainly a placeholder for things that we do with an Item.
 *
 * @author Adam J. Conover, COSC436
 */
public class ItemInteraction {

    public static enum Verb {
        GET("Get"), DROP("Drop"), INSPECT("Inspect"), USE("Use");
        private final String commandString;

        Verb(String commandString) {
            this.commandString = commandString;
        }

        @Override
        public String toString() {
            return "Verb{" + "commandString=" + commandString + '}';
        }
    }

    protected Verb verb;
    protected Item item;

    public ItemInteraction(Verb verb, Item item) {
        this.verb = verb;
        this.item = item;
    }

}