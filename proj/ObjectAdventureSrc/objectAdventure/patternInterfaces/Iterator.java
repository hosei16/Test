package objectAdventure.patternInterfaces;

/**
 * @author Adam J. Conover
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
