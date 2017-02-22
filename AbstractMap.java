import java.util.Iterator;

/**
 * An abstract base class to ease the implementation of the Map interface.
 *
 * The base class provides three means of support:
 * 1) It provides an isEmpty implementation based upon the abstract size() method.
 * 2) It defines a protected MapEntry class as a concrete implementation of the
 *    entry interface
 */
public abstract class AbstractMap<K,V> implements Map<K,V> {

  /**
   * Tests whether the map is empty.
   * @return true if the map is empty, false otherwise
   */
  @Override
  public boolean isEmpty() { return size() == 0; }

  /**
   * A concrete implementation of the Entry interface to be used
   * within a Map implementation.
   */
  protected static class MapEntry<K,V> implements Entry<K,V> {
    private K k;  /// key
    private V v;  /// value

    /**
     * Construct a map entry
     * @param key Key
     * @param value Value
     */
    public MapEntry(K key, V value) {
      k = key;
      v = value;
    }

    /**
     * Returns the key stored in this entry.
     * @return the entry's key
     */
    public K getKey() { return k; }
    /**
     * Returns the value stored in this entry.
     * @return the entry's value
     */
    public V getValue() { return v; }

    /**
     * Set the key
     * @param key Key
     */
    protected void setKey(K key) { k = key; }
    /**
     * Set the value and return the old value
     * @param value Value
     * @return Old value
     */
    protected V setValue(V value) {
      V old = v;
      v = value;
      return old;
    }

    /**
     * Determine equality of entry and object
     * @param e Object
     * @return Equality between entry and object
     */
    @SuppressWarnings("unchecked")
    public boolean equals(Object e) {
      if(e instanceof Entry) {
        return equals((Entry<K, V>)e);
      }
      return false;
    }
    /**
     * Determine equality of two entries
     * @param e Entry
     * @return Equality between two entries
     */
    public boolean equals(Entry<K, V> e) {
      return k.equals(e.getKey()) && v.equals(e.getValue());
    }
    /**
     * Give a string representation to help debugging
     * @return String representation
     */
    public String toString() { return "<" + k + ", " + v + ">"; }
  }
}
