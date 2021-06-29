package objectAdventure.creatures;

import java.util.Collections;
import java.util.List;

public interface Creature {

    public String getCreaturesDescription();
       

    public default List<String> getAlias() {
        return Collections.unmodifiableList(List.of());
    }

}
