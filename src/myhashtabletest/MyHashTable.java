package myhashtabletest;

// Custom implementation of a hash table
public class MyHashTable<K, V> {
    public int getCapacity() {
        return 0;
    }

    public V getBucketSize(int i) {
        return null;
    }

    // Node class to store key-value pairs
    public static class HashNode<K, V> {
        K key;        // Key
        V value;      // Value
        HashNode<K, V> next; // Pointer to the next node in the chain

        // Constructor for HashNode
        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final HashNode[] chainArray; // Array of chains (linked lists)
    private int M = 11;                  // Default number of chains (buckets)
    private int size;                    // Number of key-value pairs in the table

    // Constructor with default size
    public MyHashTable() {
        chainArray = new HashNode[M];
        size = 0;
    }

    // Constructor with custom number of buckets
    public MyHashTable(int M) {
        this.M = M;
        chainArray = new HashNode[M];
        size = 0;
    }

    // Hash function to map keys to bucket index
    private int hash(K key) {
        return Math.abs(key.hashCode()) % M;
    }

    // Method to add key-value pair
    public void put(K key, V value) {
        int bucketIndex = hash(key);         // Get bucket index
        HashNode<K, V> newNode = new HashNode<>(key, value); // Create new node

        // If bucket is empty, place new node directly
        if (chainArray[bucketIndex] == null) {
            chainArray[bucketIndex] = newNode;
        } else {
            // Else, add to the end of the chain
            HashNode current = chainArray[bucketIndex];
            while (current.next != null) {
                // If key already exists, update value
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current.next = newNode;
        }
        size++; // Increase size
    }

    // Method to get value by key
    public V get(K key) {
        int bucketIndex = hash(key);           // Get bucket index
        HashNode<K, V> current = chainArray[bucketIndex]; // Traverse chain
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;          // Return value if key matches
            }
            current = current.next;
        }
        return null; // Return null if not found
    }

    // Method to remove key-value pair
    public V remove(K key) {
        int bucketIndex = hash(key);           // Get bucket index
        HashNode<K, V> current = chainArray[bucketIndex];
        HashNode<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev != null) {
                    prev.next = current.next; // Bypass current node
                } else {
                    chainArray[bucketIndex] = current.next; // Remove head node
                }
                size--; // Decrease size
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        return null; // Return null if not found
    }

    // Method to get current size
    public int size() {
        return size;
    }

    // Getter to access chain array externally
    public HashNode[] getChainArray() {
        return chainArray;
    }
}

/*
Overall:
This code defines a basic Hash Table (MyHashTable) with chaining to resolve collisions.
It supports operations: put(key, value), get(key), remove(key) and tracks its size.
*/
