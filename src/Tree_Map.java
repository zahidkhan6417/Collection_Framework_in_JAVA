import java.util.TreeMap;
public class Tree_Map {
    public static void main(String[] args) {
        // Create a TreeMap to store word-definition pairs
        TreeMap<String, String> dictionary = new TreeMap<>();

        // Add words and definitions to the TreeMap
        dictionary.put("apple", "a round fruit with red or green skin and a whitish interior");
        dictionary.put("zebra", "an African wild horse with black-and-white stripes");

        // Display definitions sorted by word
        for (String word : dictionary.keySet()) {
            System.out.println(word + ": " + dictionary.get(word));
        }
    }
}
