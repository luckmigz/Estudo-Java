package MedHeap;

public class Patient {
    private String name;
    private int priority;
    private int ticketNumber;

    public Patient(String name, int priority, int ticketNumber) {
        this.name = name;
        this.priority = priority;
        this.ticketNumber = ticketNumber;
    }

    public String getTicket() {
        return String.format("%d%03d", priority, ticketNumber);
    }

    public int getPriority() {
        return priority;
    }
}
