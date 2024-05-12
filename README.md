# Collection Framework in Java.
The Java Collections Framework provides a wide range of classes and interfaces for working with collections of objects efficiently. Some of the most used and important classes and interfaces in the Java Collections Framework include:

## Interfaces:
 1. Collection: The root interface for all collections in Java. Common subinterfaces include:
 2. List: Ordered collection allowing duplicate elements (e.g., ArrayList, LinkedList).
 3. Set: Collection that does not allow duplicate elements (e.g., HashSet, TreeSet).
 4. Queue: Collection designed for holding elements prior to processing (e.g., PriorityQueue, LinkedList).
 5. Map: Interface for mapping keys to values. Common implementations include:
    -> HashMap: Uses a hash table for key-value pairs.
    -> TreeMap: Uses a red-black tree for key-value pairs, sorted by keys.
    -> LinkedHashMap: Maintains insertion order or access order for key-value pairs.
## Classes:
    ArrayList: Implements the List interface using a dynamically resizable array. Efficient for random access but slower for insertions/deletions in the middle.

    LinkedList: Implements the List and Queue interfaces using a doubly linked list. Efficient for insertions/deletions but slower for random access.

    HashSet: Implements the Set interface using a hash table for storage. Provides constant-time performance for basic operations but does not guarantee the order of elements.

    TreeSet: Implements the Set interface using a red-black tree for storage. Elements are ordered based on their natural ordering or a custom comparator.

    HashMap: Implements the Map interface using a hash table for key-value pairs. Provides constant-time performance for basic operations but does not guarantee the order of elements.

    TreeMap: Implements the Map interface using a red-black tree for key-value pairs. Elements are sorted based on keys' natural ordering or a custom comparator.


# Thank You.
