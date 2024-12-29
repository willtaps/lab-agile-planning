public class CounterService {

    // Counter variable
    private int counter = 0;

    // Method to increment the counter
    public synchronized void increment() {
        counter++;
    }

    // Method to get the current counter value
    public synchronized int getValue() {
        return counter;
    }

    public static void main(String[] args) {
        CounterService service = new CounterService();

        // Example usage
        service.increment();
        service.increment();
        System.out.println("Current Counter Value: " + service.getValue()); // Should print 2
    }
}

