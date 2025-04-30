package myhashtabletest;

public class Main {
    public static void main(String[] args) {
        // Hash Table Testing
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(i, "Name" + i);
            table.put(key, "Value" + i);
        }

        // Printing bucket sizes
        for (int i = 0; i < table.getCapacity(); i++) {
            System.out.println("Bucket " + i + ": " + table.getBucketSize(i) + " elements");
        }

        // Binary Search Tree Testing
        BST<Integer, String> bst = new BST<>();

        bst.insert(50, "Root Node");
        bst.insert(30, "Left Child");
        bst.insert(70, "Right Child");
        bst.insert(20, "Left Grandchild");
        bst.insert(40, "Right Grandchild");

        System.out.println("\nBST Search Results:");
        System.out.println("Key 50: " + bst.search(50));
        System.out.println("Key 30: " + bst.search(30));
        System.out.println("Key 100: " + bst.search(100)); // Not found
    }
}
