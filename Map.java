/**
 * An interface for an associative collecction, i.e., a map, that contains
 * key/value entries.
 */
public interface Map<K,V> {

  /**
   * Returns the number of entries in the map.
   * @return number of entries in the map
   */
  int size();

  /**
   * Tests whether the map is empty.
   * @return true if the map is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Returns the value associated with the specified key, or null if no such
   * entry exists.
   * @param key  the key whose associated value is to be returned
   * @return the associated value, or null if no such entry exists
   */
  V get(K key);

  /**
   * Associates the given value with the given key. If an entry with
   * the key was already in the map, this replaces the previous value
   * with the new one and returns the old value. Otherwise, a new
   * entry is added and null is returned.
   * @param key    key with which the specified value is to be associated
   * @param value  value to be associated with the specified key
   * @return the previous value associated with the key (or null, if no such i
   *         entry)
   */
  V put(K key, V value);

  /**
   * Removes the entry with the specified key, if present, and returns
   * its associated value. Otherwise does nothing and returns null.
   * @param key  the key whose entry is to be removed from the map
   * @return the previous value associated with the removed key, or null if no
   *         such entry exists
   */
  V remove(K key);

  /**
   * Returns an iterable collection of all key-value entries of the map.
   *
   * @return iterable collection of the map's entries
   */
  Iterable<Entry<K,V>> entrySet();
}
