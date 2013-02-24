package info.archinnov.achilles.entity.type;

import java.util.List;

/**
 * WideMap
 * 
 * @author DuyHai DOAN
 * 
 */
public interface WideMap<K, V>
{
	/**
	 * Insert a new value with ttl
	 * 
	 * @param key
	 *            Search key. Can be a multi key
	 * @param value
	 *            Value
	 * @param ttl
	 *            Time to live in seconds
	 */
	public void insert(K key, V value, int ttl);

	/**
	 * Insert a new value
	 * 
	 * @param key
	 *            Search key. Can be a multi key
	 * @param value
	 *            Value
	 */
	public void insert(K key, V value);

	/**
	 * Find a value with a key
	 * 
	 * @param key
	 *            Search key. Can be a multi key
	 * @return value Found value or null
	 */
	public V get(K key);

	/**
	 * Find a range of key/value, bounds inclusive
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive. Should be less than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of key/value pairs to be fetched
	 * @return List of key/value pairs
	 */
	public List<KeyValue<K, V>> find(K start, K end, int count);

	/**
	 * Find a range of key/value, bounds exclusive
	 * 
	 * @param start
	 *            Start key, exclusive
	 * @param end
	 *            End key, exclusive. Should be less than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of key/value pairs to be fetched
	 * @return List of key/value pairs
	 */
	public List<KeyValue<K, V>> findBoundsExclusive(K start, K end, int count);

	/**
	 * Find a range of key/value, bounds inclusive, in reversed order
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive. Should be greater than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of key/value pairs to be fetched
	 * @return List of key/value pairs
	 */
	public List<KeyValue<K, V>> findReverse(K start, K end, int count);

	/**
	 * Find a range of key/value, bounds exclusive, in reversed order
	 * 
	 * @param start
	 *            Start key, exclusive
	 * @param end
	 *            End key, exclusive. Should be greater than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of key/value pairs to be fetched
	 * @return List of key/value pairs
	 */
	public List<KeyValue<K, V>> findReverseBoundsExclusive(K start, K end, int count);

	/**
	 * Find a range of key/value
	 * 
	 * @param start
	 *            Start key
	 * @param inclusiveStart
	 *            true = inclusive, false = exclusive
	 * @param end
	 *            End key. Should be less/greater than start key depending on the reverse flag
	 * @param inclusiveEnd
	 *            true = inclusive, false = exclusive
	 * @param reverse
	 *            true = descending order, false = ascending order
	 * @param count
	 *            Maximum number of key/value pairs to be fetched
	 * @return List of key/value pairs
	 */
	public List<KeyValue<K, V>> find(K start, boolean inclusiveStart, K end, boolean inclusiveEnd,
			boolean reverse, int count);

	/**
	 * Find first pair of key/value, normal order
	 * 
	 * @return First key/value pair
	 */
	public KeyValue<K, V> findFirst();

	/**
	 * Find maximum n first pairs of key/value, normal order
	 * 
	 * @return n first key/value pairs (or less)
	 */
	public List<KeyValue<K, V>> findFirst(int count);

	/**
	 * Find last pair of key/value, normal order
	 * 
	 * @return Last key/value pair
	 */
	public KeyValue<K, V> findLast();

	/**
	 * Find maximum n last pairs of key/value, normal order
	 * 
	 * @return n last key/value pairs (or less)
	 */
	public List<KeyValue<K, V>> findLast(int count);

	/**
	 * Find a range of value, bounds inclusive
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive. Should be less than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of values to be fetched
	 * @return List of values
	 */
	public List<V> findValues(K start, K end, int count);

	/**
	 * Find a range of value, bounds exclusive
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive. Should be less than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of values to be fetched
	 * @return List of values
	 */
	public List<V> findBoundsExclusiveValues(K start, K end, int count);

	/**
	 * Find a range of value, bounds inclusive, in reversed order
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive. Should be greater than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of values to be fetched
	 * @return List of values
	 */
	public List<V> findReverseValues(K start, K end, int count);

	/**
	 * Find a range of value, bounds exclusive, in reversed order
	 * 
	 * @param start
	 *            Start key, exclusive
	 * @param end
	 *            End key, exclusive. Should be greater than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of values to be fetched
	 * @return List of values
	 */
	public List<V> findReverseBoundsExclusiveValues(K start, K end, int count);

	/**
	 * Find a range of value
	 * 
	 * @param start
	 *            Start key
	 * @param inclusiveStart
	 *            true = inclusive, false = exclusive
	 * @param end
	 *            End key. Should be less/greater than start key depending on the reverse flag
	 * @param inclusiveEnd
	 *            true = inclusive, false = exclusive
	 * @param reverse
	 *            true = descending order, false = ascending order
	 * @param count
	 *            Maximum number of values to be fetched
	 * @return List of values
	 */
	public List<V> findValues(K start, boolean inclusiveStart, K end, boolean inclusiveEnd,
			boolean reverse, int count);

	/**
	 * Find first value, normal order
	 * 
	 * @return First value
	 */
	public V findFirstValue();

	/**
	 * Find maximum n first values, normal order
	 * 
	 * @return n first values (or less)
	 */
	public List<V> findFirstValues(int count);

	/**
	 * Find last value, normal order
	 * 
	 * @return Last value
	 */
	public V findLastValue();

	/**
	 * Find maximum n last values, normal order
	 * 
	 * @return n last values (or less)
	 */
	public List<V> findLastValues(int count);

	/**
	 * Find a range of key, bounds inclusive
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive. Should be less than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of keys to be fetched
	 * @return List of keys
	 */
	public List<K> findKeys(K start, K end, int count);

	/**
	 * Find a range of key, bounds exclusive
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive. Should be less than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of keys to be fetched
	 * @return List of keys
	 */
	public List<K> findBoundsExclusiveKeys(K start, K end, int count);

	/**
	 * Find a range of key, bounds inclusive, in reversed order
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive. Should be greater than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of keys to be fetched
	 * @return List of keys
	 */
	public List<K> findReverseKeys(K start, K end, int count);

	/**
	 * Find a range of key, bounds exclusive, in reversed order
	 * 
	 * @param start
	 *            Start key, exclusive
	 * @param end
	 *            End key, exclusive. Should be greater than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of keys to be fetched
	 * @return List of keys
	 */
	public List<K> findReverseBoundsExclusiveKeys(K start, K end, int count);

	/**
	 * Find a range of key
	 * 
	 * @param start
	 *            Start key
	 * @param inclusiveStart
	 *            true = inclusive, false = exclusive
	 * @param end
	 *            End key. Should be less/greater than start key depending on the reverse flag
	 * @param inclusiveEnd
	 *            true = inclusive, false = exclusive
	 * @param reverse
	 *            true = descending order, false = ascending order
	 * @param count
	 *            Maximum number of keys to be fetched
	 * @return List of keys
	 */
	public List<K> findKeys(K start, boolean inclusiveStart, K end, boolean inclusiveEnd,
			boolean reverse, int count);

	/**
	 * Find first key, normal order
	 * 
	 * @return First key
	 */
	public K findFirstKey();

	/**
	 * Find maximum n first keys, normal order
	 * 
	 * @return n first keys (or less)
	 */
	public List<K> findFirstKeys(int count);

	/**
	 * Find last key, normal order
	 * 
	 * @return Last key
	 */
	public K findLastKey();

	/**
	 * Find maximum n last keys, normal order
	 * 
	 * @return n last keys (or less)
	 */
	public List<K> findLastKeys(int count);

	/**
	 * Find a key/value iterator
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive. Should be less than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of keys to be fetched
	 * @return List of keys
	 */
	public KeyValueIterator<K, V> iterator(K start, K end, int count);

	/**
	 * Find a key/value iterator, bounds exclusive
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive. Should be less than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of keys to be fetched
	 * @return List of keys
	 */
	public KeyValueIterator<K, V> iteratorBoundsExclusive(K start, K end, int count);

	/**
	 * Find a key/value iterator, bounds inclusive, in reversed order
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive. Should be greater than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of keys to be fetched
	 * @return List of keys
	 */
	public KeyValueIterator<K, V> iteratorReverse(K start, K end, int count);

	/**
	 * Find a key/value iterator, bounds exclusive, in reversed order
	 * 
	 * @param start
	 *            Start key, exclusive
	 * @param end
	 *            End key, exclusive. Should be greater than start key with respect to the default comparator
	 * @param count
	 *            Maximum number of keys to be fetched
	 * @return List of keys
	 */
	public KeyValueIterator<K, V> iteratorReverseBoundsExclusive(K start, K end, int count);

	/**
	 * Find a key/value iterator
	 * 
	 * @param start
	 *            Start key
	 * @param inclusiveStart
	 *            true = inclusive, false = exclusive
	 * @param end
	 *            End key. Should be less/greater than start key depending on the reverse flag
	 * @param inclusiveEnd
	 *            true = inclusive, false = exclusive
	 * @param reverse
	 *            true = descending order, false = ascending order
	 * @param count
	 *            Maximum number of keys to be fetched
	 * @return List of keys
	 */
	public KeyValueIterator<K, V> iterator(K start, boolean inclusiveStart, K end,
			boolean inclusiveEnd, boolean reverse, int count);

	/**
	 * Remove a key/value pair by key
	 * 
	 * @param key
	 */
	public void remove(K key);

	/**
	 * Remove a rang of key/value pairs, bounds inclusive
	 * 
	 * @param start
	 *            Start key, inclusive
	 * @param end
	 *            End key, inclusive
	 */
	public void remove(K start, K end);

	/**
	 * Remove a rang of key/value pairs, bounds exclusive
	 * 
	 * @param start
	 *            Start key, exclusive
	 * @param end
	 *            End key, exclusive
	 */
	public void removeBoundsExclusive(K start, K end);

	/**
	 * Remove a rang of key/value pairs
	 * 
	 * @param start
	 *            Start key, exclusive
	 * @param inclusiveStart
	 *            true = inclusive, false = exclusive
	 * @param end
	 *            End key, exclusive
	 * @param inclusiveEnd
	 *            true = inclusive, false = exclusive
	 */
	public void remove(K start, boolean inclusiveStart, K end, boolean inclusiveEnd);

	/**
	 * Remove the first key/value pair
	 */
	public void removeFirst();

	/**
	 * Remove the n first key/value pairs
	 */
	public void removeFirst(int count);

	/**
	 * Remove the last key/value pair
	 */
	public void removeLast();

	/**
	 * Remove the n last key/value pairs
	 */
	public void removeLast(int count);
}
