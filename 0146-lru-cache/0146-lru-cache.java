// LRUCache class extends LinkedHashMap to leverage built-in ordering
// <Integer, Integer> → key-value pairs for the cache
class LRUCache extends LinkedHashMap<Integer, Integer> {

    // Maximum number of elements the cache can hold
    int capacity;

    // Constructor to initialize the cache
    public LRUCache(int capacity) {

        /*
         * super(capacity, 0.75f, true)
         *
         * capacity → initial capacity of the HashMap
         * 0.75f    → load factor (default value)
         * true     → accessOrder
         *            true  = entries ordered by access (LRU behavior)
         *            false = entries ordered by insertion
         */
        super(capacity, 0.75f, true);

        // Store the maximum capacity of the cache
        this.capacity = capacity;
    }

    // Returns the value associated with the key if present
    // Also marks the key as "recently used" because of accessOrder = true
    public int get(int key) {

        /*
         * super.get(key) returns:
         * - value if key exists
         * - null if key does not exist
         *
         * If null → return -1 as per problem requirement
         */
        return super.get(key) == null ? -1 : super.get(key);
    }

    // Inserts or updates a key-value pair in the cache
    public void put(int key, int value) {

        /*
         * super.put(key, value)
         * - Inserts the key if it does not exist
         * - Updates the value if key already exists
         * - Marks this entry as "recently used"
         */
        super.put(key, value);
    }

    // This method is automatically called after every put operation
    @Override
    public boolean removeEldestEntry(Map.Entry<Integer, Integer> e) {

        /*
         * size() > capacity
         * - If cache size exceeds the allowed capacity
         * - Return true → remove the least recently used entry
         * - Return false → keep all entries
         */
        return size() > capacity;
    }
}

/*
 * How the object is used:
 *
 * LRUCache obj = new LRUCache(capacity);
 * int value = obj.get(key);
 * obj.put(key, value);
 */
