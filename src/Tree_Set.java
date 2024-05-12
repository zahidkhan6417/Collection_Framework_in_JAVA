import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        // Create a TreeSet of Event objects sorted by date
        TreeSet<Event> events = new TreeSet<>();

        // Add events to the TreeSet
        events.add(new Event("2024-05-15", "Meeting with clients"));
        events.add(new Event("2024-05-20", "Project deadline"));
        events.add(new Event("2024-05-10", "Team building activity"));

        // Display events sorted by date
        for (Event event : events) {
            System.out.println(event);
        }
    }
}

class Event implements Comparable<Event> {
    private String date;
    private String description;

    public Event(String date, String description) {
        this.date = date;
        this.description = description;
    }

    @Override
    public int compareTo(Event other) {
        return this.date.compareTo(other.date);
    }

    @Override
    public String toString() {
        return "Event on " + date + ": " + description;
    }
}
