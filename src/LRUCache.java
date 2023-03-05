public class LRUCache<K, V> implements Cache<K, V> {
    @SuppressWarnings({"FieldCanBeLocal", "unused"})
    private final int size;
    private int lookups;
    private int hits;

    public LRUCache(int size) {
        this.size = size;
        lookups = 0;
        hits = 0;
    }

    @Override
    public V lookUp(K key) {
        // TODO
        //  lookup key

        //noinspection ConstantValue
        if (true) { // TODO: replace with whether its a cache hit or miss
            hits++;
        }

        lookups++;

        return null; // TODO: replace with null if not found otherwise the value
    }

    @Override
    public void store(K key, V value) {
        // TODO
        //  if space is available just push to cache
        //  otherwise replace with least recently used entry in cache
    }

    @Override
    public double getHitRatio() {
        return (double) hits / lookups;
    }

    @Override
    public long getHits() {
        return hits;
    }

    @Override
    public long getMisses() {
        return lookups - hits;
    }

    @Override
    public long getNumberOfLookUps() {
        return lookups;
    }
}
