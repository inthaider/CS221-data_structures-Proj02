import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * Class to unit test an arbitrary map implementation
 */
public class TestMap {

  /**
   * Test get method of arbitrary map
   * @param c Supplier to create a map of specific type
   * @param <M> Specific map structure
   * @return Result of unit test
   */
  public static <M extends Map<Integer, String>>
    boolean TestGet(Supplier<M> c) {
      //TODO write unit test for get
      //Setup
      Map<Integer, String> map = c.get();
      //Execute
      //Test
      return false;
      //Empty teardown
    }

  /**
   * Test get method of arbitrary map
   * @param c Supplier to create a map of specific type
   * @param <M> Specific map structure
   * @return Result of unit test
   */
  public static <M extends Map<Integer, String>>
    boolean TestPut(Supplier<M> c) {
      //TODO write unit test for put
      //Setup
      Map<Integer, String> map = c.get();
      //Execute
      //Test
      return false;
      //Empty teardown
    }

  /**
   * Test get method of arbitrary map
   * @param c Supplier to create a map of specific type
   * @param <M> Specific map structure
   * @return Result of unit test
   */
  public static <M extends Map<Integer, String>>
    boolean TestRemove(Supplier<M> c) {
      //TODO write unit test for remove
      //Setup
      Map<Integer, String> map = c.get();
      //Execute
      //Test
      return false;
      //Empty teardown
    }

  /**
   * Class to hold test entries for comparison
   */
  private static class TestEntry<K, V> implements Entry<K, V> {
    private K key;   ///Key
    private V value; ///Value

    /**
     * Constructor
     * @param k Key
     * @param v Value
     */
    public TestEntry(K k, V v) {
      key = k;
      value = v;
    }

    /**
     * Returns the key stored in this entry.
     * @return the entry's key
     */
    public K getKey() {
      return key;
    }

    /**
     * Returns the value stored in this entry.
     * @return the entry's value
     */
    public V getValue() {
      return value;
    }

    /**
     * Returns equality of two entries
     * @param e Entry
     * @return Equality comparison of two entries
     */
    public boolean equals(Entry<K, V> e) {
      return key.equals(e.getKey()) && value.equals(e.getValue());
    }
  }

  /**
   * Test entrySet method of arbitrary map
   * @param c Supplier to create a map of specific type
   * @param <M> Specific map structure
   * @return Result of unit test
   */
  public static <M extends Map<Integer, String>>
    boolean TestEntrySet(Supplier<M> c) {
      //TODO write unit test for remove
      //Setup
      Map<Integer, String> map = c.get();
      //Execute
      //Test
      return false;
      //Empty teardown
    }

  /**
   * Test methods of arbitrary map
   * @param s Name of map data structure
   * @param c Supplier to create a map of specific type
   * @param <M> Specific map structure
   */
  public static <M extends Map<Integer, String>>
    void TestMap(String s, Supplier<M> c) {
      boolean succ = true;
      boolean res = true;

      System.out.println("Testing " + s);

      System.out.printf("Test %20s passed? ", "get()");
      succ = succ && (res = TestGet(c));
      System.out.printf("%10s\n", res);

      System.out.printf("Test %20s passed? ", "put()");
      succ = succ && (res = TestPut(c));
      System.out.printf("%10s\n", res);

      System.out.printf("Test %20s passed? ", "remove()");
      succ = succ && (res = TestRemove(c));
      System.out.printf("%10s\n", res);

      System.out.printf("Test %20s passed? ", "entrySet()");
      succ = succ && (res = TestEntrySet(c));
      System.out.printf("%10s\n", res);

      System.out.println("passed? " + succ);
    }

  public static void main(String args[]) {
    TestMap("UnsortedTableMap", UnsortedTableMap<Integer, String>::new);
    System.out.printf("\n\n");
    TestMap("SortedTableMap", SortedTableMap<Integer, String>::new);
    System.out.printf("\n\n");
    TestMap("ChainHashMap", ChainHashMap<Integer, String>::new);
    System.out.printf("\n\n");
    TestMap("ProbeHashMap", ProbeHashMap<Integer, String>::new);
    System.out.printf("\n\n");
    TestMap("TreeMap", TreeMap<Integer, String>::new);
  }
}
