package objectAdventure.items.itemImpl;

import objectAdventure.items.Item;

/**
 * @author Matthew Kline
 */

public class TimeMachine implements Item {

	@Override public String getItemDescription() {
		return "A machine that tells time, what did you think it was?";
	}
	
	public String getTime() {
		return "Time to get a watch.";
	}
}
