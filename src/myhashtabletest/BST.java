package myhashtabletest;

// Custom Binary Search Tree (BST) implementation
public class BST<K extends Comparable<K>, V> {
    // Node class for BST
    static class Node<K, V> {
        K key;             // Key
        V value;           // Value
        Node<K, V> left;   // Left child
        Node<K, V> right;  // Right child

        // Constructor
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V> root; // Root of the tree

    // Method to insert key-value pair
    public void insert(K key, V value) {
        root = insertRec(root, key, value); // Start recursive insert
    }

    // Recursive helper for insert
    private Node<K, V> insertRec(Node<K, V> node, K key, V value) {
        if (node == null) {
            return new Node<>(key, value); // Create new node if null
        }
        if (key.compareTo(node.key) < 0) {
            node.left = insertRec(node.left, key, value); // Insert in left subtree
        } else if (key.compareTo(node.key) > 0) {
            node.right = insertRec(node.right, key, value); // Insert in right subtree
        } else {
            node.value = value; // Update value if key already exists
        }
        return node;
    }

    // Method to search by key
    public V search(K key) {
        Node<K, V> node = searchRec(root, key); // Start recursive search
        return node == null ? null : node.value;
    }

    // Recursive helper for search
    private Node<K, V> searchRec(Node<K, V> node, K key) {
        if (node == null || node.key.equals(key)) {
            return node; // Return node if found or null
        }
        if (key.compareTo(node.key) < 0) {
            return searchRec(node.left, key); // Search left
        }
        return searchRec(node.right, key); // Search right
    }
}

/*
Overall:
This code defines a basic Binary Search Tree (BST) structure.
It supports operations: insert(key, value) and search(key).
*/
