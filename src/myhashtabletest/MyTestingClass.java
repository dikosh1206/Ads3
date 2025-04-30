package myhashtabletest;

// Class to create test objects to use as keys in MyHashTable
public class MyTestingClass {
    private final int id;       // Unique ID
    private final String name;  // Name field

    // Constructor
    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override hashCode method based on id and name
    @Override
    public int hashCode() {
        int hash = 17; // Start with a non-zero prime number
        hash = 31 * hash + id; // Include id
        hash = 31 * hash + (name == null ? 0 : name.hashCode()); // Include name if not null
        return hash;
    }

    // Override equals method to compare objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check type
        MyTestingClass other = (MyTestingClass) obj;
        return id == other.id && (name != null ? name.equals(other.name) : other.name == null);
    }

    // Override toString to easily print object
    @Override
    public String toString() {
        return "MyTestingClass{id=" + id + ", name='" + name + "'}";
    }
}

/*
Overall:
This class defines a simple object with fields id and name,
and overrides hashCode and equals so it can be used as a key in Hash Tables.
*/
