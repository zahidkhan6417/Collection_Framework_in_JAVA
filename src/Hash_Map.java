import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        // Create a HashMap to store contacts
        HashMap<String, Contact> addressBook = new HashMap<>();

        // Add contacts to the HashMap
        addressBook.put("John Doe", new Contact("123-456-7890", "john.doe@example.com"));
        addressBook.put("Jane Smith", new Contact("987-654-3210", "jane.smith@example.com"));

        // Retrieve and display contact information
        Contact johnDoe = addressBook.get("John Doe");
        if (johnDoe != null) {
            System.out.println("Contact: " + johnDoe);
        }
    }
}

class Contact {
    private String phoneNumber;
    private String email;

    public Contact(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Phone: " + phoneNumber + ", Email: " + email;
    }
}
