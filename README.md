# MyHashTable and Binary Search Tree (BST) Project

This project implements two custom data structures:

- **MyHashTable**: A custom hash table with separate chaining for collision resolution.
- **BST**: A simple Binary Search Tree that supports insert and search operations.

Each data structure is fully implemented without using Java built-in collections (except `Iterator` if needed).

---

## Project Structure


---

## How to Run

1. Open the project in IntelliJ IDEA or any Java IDE.
2. Make sure all `.java` files are placed inside the `src/` directory (or in the same package).
3. Compile and run the `Main` class.

The program will:

- Insert 10,000 random elements into `MyHashTable`.
- Print the number of elements in each hash table bucket.
- (Optionally) Insert and search elements in the `BST` if extended.

---

## Files Explanation

| File | Description |
|:-----|:------------|
| `MyHashTable.java` | Contains a custom hash table implementation using separate chaining. Supports `put`, `get`, `remove`, and `size` operations. |
| `MyTestingClass.java` | A class with `id` and `name` fields. Overrides `hashCode()` and `equals()` to be usable as a key. |
| `BST.java` | Basic Binary Search Tree supporting insertion and search for key-value pairs. |
| `Main.java` | Test class that generates random test data and evaluates hash table bucket distribution. |

---

## Notes

- `MyHashTable` uses chaining with linked lists to handle collisions.
- `MyTestingClass` ensures that two objects are considered equal only if their `id` and `name` are the same.
- The code contains detailed English comments for educational purposes.



