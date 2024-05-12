import java.util.HashSet;
public class Hash_Set {
    public static void main(String[] args) {
        // Create a HashSet to store student IDs
        HashSet<String> studentIDs = new HashSet<>();

        // Add student IDs to the HashSet
        studentIDs.add("S001");
        studentIDs.add("S002");
        studentIDs.add("S003");
        studentIDs.add("S002"); // Duplicate ID (ignored by HashSet)

        // Display the unique student IDs
        for (String id : studentIDs) {
            System.out.println("Student ID: " + id);
        }
    }
}
